def buildJar() {
     echo 'building Jar file...'
     sh 'mvn package'
}

def testApp() {
     echo 'testing app...'
}

def deployApp() {
     echo 'deploying app...'
     echo "deploying version ${params.VERSION}"
}

return this 
