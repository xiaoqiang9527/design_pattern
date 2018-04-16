node {
    def dockerDir="docker"
    def registry="scm.nicezhuanye.com:6555"
    def registryWithScheme="https://"+registry
    
    def imageBaseName="design_pattern"
    def imageFullName=registry+"/"+imageBaseName+":${env.BRANCH_NAME}"
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
        withNPM(npmrcConfig: 'e85049f5-4e7d-47e8-844c-ab97dece7371') {
          env.NODEJS_HOME = "${tool 'nodejs6.1.0'}"
          
        }
    }

    stage('Build image') {
        sh "cp  ${dockerDir}/"
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
