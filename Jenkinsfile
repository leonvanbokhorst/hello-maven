pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                sh -x '''
                    echo
                    echo '****************************************'
                    echo '*** BUILD STAGE'
                    echo '****************************************'
                    echo
                    ./jenkins/build/mvn.sh mvn -B -DskipTests clean package
                '''
            }
        }
        stage('Test') {
            steps {
                sh '''
                    echo
                    echo '****************************************'
                    echo '*** TEST STAGE'
                    echo '****************************************'
                    echo
                '''
            }
        }
        stage('Push') {
            steps {
                sh '''
                    echo
                    echo '****************************************'
                    echo '*** PUSH STAGE'
                    echo '****************************************'
                    echo
                '''
            }
        }
        stage('Deploy') {
            steps {
                sh '''
                    echo
                    echo '****************************************'
                    echo '*** DEPLOY STAGE'
                    echo '****************************************'
                    echo
               '''
            }
        }
    }
}
