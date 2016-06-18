eventCreateWarStart = { warName, stagingDir ->
    def buildNumber = System.getenv('BUILD_NUMBER')
    if(buildNumber) {
        ant.propertyfile(file:"${stagingDir}/WEB-INF/classes/application.properties") {
            entry(key:'build.number', value: buildNumber)
        }
    }
}
