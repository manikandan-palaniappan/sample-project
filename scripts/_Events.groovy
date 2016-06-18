eventCreateWarStart = { warName, stagingDir ->
    def buildNumber = System.getenv('BUILD_NUMBER')
    if(buildNumber) {
        println("BuildNumber " +buildNumber)
        ant.propertyfile(file:"${stagingDir}/WEB-INF/classes/application.properties") {
            entry(key:'build.number', value: buildNumber)
        }
    }
}
