// Declarative pipeline
pipeline{
    agent any

    stages{
        stage("Build"){
            steps{
                echo("Build");
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