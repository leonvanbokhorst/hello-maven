pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                sh '''
                    ./stages/build/maven-runner.sh mvn -B -DskipTests clean package
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
