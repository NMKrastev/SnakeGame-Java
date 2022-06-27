pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                sh script:'''
                    #!/bin/bash
                    ls
                    cd ./src
                    ls
                    javac SnakeGame.java
                   '''
            }
        }
        stage ('Run') {
            steps {
                sh script:'''
                    #!/bin/bash
                    cd ./src
                    java SnakeGame
                    '''
            }
        }
    }
}