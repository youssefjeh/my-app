@Library('jenkins-SL') 
def gv
pipeline {
  agent any
  tools {
    maven 'Maven'
  }
 /* parameters {
    choice(name: 'VERSION' , choices: ['1.1.0', '1.2.0' , '1.3.0'], description: '')
    booleanParam(name: 'executeTests' , defaultValue: true, description: '')
  } */
  
  stages {

    stage("init"){
        steps {
            script {
                gv = load "script.groovy"
            }
        }
    }
    
    stage("build Jar") {
      
      steps {
        script{
            //gv.buildJar()
            buildJar()
        }
      }
    }

    stage("build docker image") {
      
      steps {
        script{
          //  gv.buildImg()
          buildImg()
        }
      }
    }
    
    /*stage("test") {
      
      when {
        expression {
          params.excuteTests
        }
      }
      
      steps {
        script{
            gv.testApp()
        }
      }
    }*/
    
    stage("deploy to ACRhub") {
       /* input {
            message "Select env to deploy to"
            ok "Done"
            parameters {
                choice(name: 'ENV' , choices: ['dev', 'staging' , 'prod'], description: '')
            }
        }*/
      
      steps {
        script{
            // env.ENV = input message: "Select env to deploy to", ok "Done", parameters: [choice(name: 'ENV' , choices: ['dev', 'staging' , 'prod'], description: '')]
            deployApp()
           // echo "deploying to ${ENV}"
        }
      }
    }
  }
}

