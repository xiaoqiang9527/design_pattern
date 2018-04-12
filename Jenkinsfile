node {
    def dockerDir="docker"
    def registry="scm.nicezhuanye.com:6555"
    def registryWithScheme="https://"+registry

    def imageBaseName="schoolresourceevaluation"
    def imageFullName=registry+"/"+imageBaseName+":${env.BUILD_ID}"
    def imageFullNameLatest=registry+"/"+imageBaseName+":latest"

    properties([
      pipelineTriggers([[$class: 'BitBucketTrigger'],
                        pollSCM('H/15 * * * *'),
                        snapshotDependencies()
                      ])
      ])

    stage('Clone repository') {
        checkout scm
    }

    stage('Build') {
        def TAG_NAME = binding.variables.get("TAG_NAME")
        if (TAG_NAME != null) {
          sh "echo tag $TAG_NAME"
        } else {
          sh "echo Non-tag build"
        }
        withMaven(
          jdk:'jdk1.8-oracle',
          maven:'InstalledMaven',
          globalMavenSettingsConfig: '56ecb4c7-2efd-496d-949d-9209eee1c6a6',
          ) {
            sh "mvn clean deploy -DskipTests"
        }
    }

    stage('Build image') {
        sh "cp target/*.war ${dockerDir}/"
        docker.withRegistry(registryWithScheme, 'jenkinsAtHQJLbitbucket') {
          sh "docker build ${dockerDir} -t ${imageFullName}"
          sh "docker tag ${imageFullName} ${imageFullNameLatest}"
        }
    }

    stage('Test image') {
    }

    stage('Push image') {
        sh "docker push ${imageFullName}"
        sh "docker push ${imageFullNameLatest}"
    }
}