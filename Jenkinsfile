/*
pipeline{
  agent {
    docker{
       image "maven:3.6.0-jdk-13"
       label "docker"
    }
  }
  stages{
    stage('Build'){
      steps{
        sh 'mvn -version'
        sh 'mvn clean install'
      }
    }
  }
}
*/
pipeline{
    agent any
    tools{
        maven "3.8.3"
        docker "20.10.22"
    }
    
    stages{
        stage('stage 1'){
            steps{
                sh 'echo "gg"'
                sh 'mvn -version'
                //sh 'mvn clean install'
              sh 'docker version'
            }
        }
    }
}
