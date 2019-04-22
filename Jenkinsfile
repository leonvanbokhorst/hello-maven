pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                sh '''
                    echo 'Building...'
                '''
            }
        }
        stage('Test') {
            steps {
                sh '''
                    echo 'Testing...'
                '''
            }
        }
        stage('Push') {
            steps {
                sh '''
                    echo 'Push it. Push it real good...'
                '''
            }
        }        
        stage('Deploy') {
            steps {
                sh '''
                    echo 'Deploying...'
                '''
            }
        }
    }
}
