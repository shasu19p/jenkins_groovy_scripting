def buildApp() {
    echo 'building the application...'
} 

def testApp() {
    if ( params.executeTests == true) {
        echo 'testing the application...'
    }
    // echo 'testing the application...'
} 

def deployApp() {
    echo 'deplying the application...'
    echo "deploying version ${params.VERSION}"
} 

return this
