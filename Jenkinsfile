// Declarative pipeline
pipeline{
    agent any
//     tools {
//         maven "Maven 3.8.1"
//         jdk "jdk11"
//     }
    tools {
        maven "MAVEN"
        jdk "JDK"
    }
//     environment {
//             AWS_ACCESS_KEY_ID     = credentials('jenkins-aws-secret-key-id')
//             AWS_SECRET_ACCESS_KEY = credentials('jenkins-aws-secret-access-key')
//     }

    stages{
        stage ('Initialize') {
            steps {
                sh '''
                     echo "PATH = ${PATH}"
                     echo "M2_HOME = ${M2_HOME}"
                 '''
            }
        }

        stage("Build"){
            steps{
                 echo("Build");
                //sh 'mvn -Dmaven.test.failure.ignore=true install'
            }
        }
        stage("Testing"){
             steps{
                echo("Testing");
            }
        }
        stage("Continue?"){
            steps{
                input("Do you want to continue?")
            }
        }
        stage("Deploy - Test env 1"){
            steps{
               echo("Deploy_1");
            }
        }
        stage("Deploy - Test env 2"){
            steps{
               echo("Deploy_2");
            }
        }
        stage("Deploy - Test env 3"){
            steps{
               echo("Deploy_3");
            }
        }
        stage("Deploy - Prod"){
            steps{
               echo("Deploy_3");
            }
            post {
                            success {
                                archiveArtifacts 'target/*.jar'
                                sh 'aws configure set region us-east-1'
                                sh 'aws s3 cp ./target/calculator-0.0.1-SNAPSHOT.jar s3://YOUR-BUCKET-NAME/calculator.jar'
                                // bat 'aws configure set region us-east-1'
                                // bat 'aws s3 cp ./target/calculator-0.0.1-SNAPSHOT.jar s3://YOUR-BUCKET-NAME/calculator.jar'
                            }
                        }

        }
    }
}