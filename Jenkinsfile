pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                sh 'javac SnakeGame.java'
            }
        }
        stage ('Run') {
            steps {
                sh 'java SnakeGame'
            }
        }
    }
}