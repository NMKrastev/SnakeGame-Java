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
            post {
                success {
                    echo 'TESTS PASSED'
                }
            }
        }
        stage ('Publish') {
            steps {
                sh './mvnw package'
            }
            post {
                success {
                    echo 'PACKAGE SUCCESSFUL'
                }
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