pipeline {
    agent any

    tools {
        jdk 'JDK21'
    }

    stages {

        stage('checkout code') {

            steps {
                checkout scm
            }
        }

        stage('checkout java version') {
            steps {
                sh 'java --version'
            }
        }

        stage('run java application') {
            steps {
                sh 'java src/myapp.java'
            }
        }
    }

    post {
        success {
            echo 'java application execute successfully'
        }
        failure {
            echo 'pipeline failed'
        }
    }
}