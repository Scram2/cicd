// Declarative pipeline
pipeline{
    agent any
    tools {
        maven 'Maven 3.3.9'
        jdk 'jdk11'
    }


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
//                 echo("Build");
                sh 'mvn -Dmaven.test.failure.ignore=true install'
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
        }
    }
}