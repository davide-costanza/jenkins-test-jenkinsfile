pipeline {
  agent any
  
  stages {
     stage('Compile') {
       steps {
         sh './mvnw compile'
       }
    }
    stage("Unit test") {
      steps {
        sh "./mvnw test"
      }
    }
    stage("Code coverage") {
      steps {
        sh "./mvnw jacoco:report"
        publishHTML (target: [
          reportDir: 'target/site/jacoco',
          reportFiles: 'index.html',
          reportName: "JaCoCo Report"
        ])
      }
    }
    stage("Greetings") {
      steps {
         echo 'Build successfully completed!'
      }
    }
  }
}

