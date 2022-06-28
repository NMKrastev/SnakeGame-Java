pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                sh './mvnw clean compile'
            }
        }
        stage ('Test') {
            steps {
                sh './mvnw test'
            }
        }
        stage ('Publish') {
            steps {
                sh './mvnw package'
            }
        }
        stage ('Install') {
            steps {
                sh './mvnw install'
            }
        }
        /* stage ('Deploy') {
            steps {
                sh './mvnw deploy'
            }
        } */
    }
}