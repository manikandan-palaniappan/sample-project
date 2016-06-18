eventCreateWarStart = { warName, stagingDir ->
    def buildNumber = System.getenv('BUILD_NUMBER')
    if(buildNumber) {
        println("BuildNumber " +buildNumber)
        ant.propertyfile(file:"${stagingDir}/WEB-INF/classes/application.properties") {
            entry(key:'build.number', value: buildNumber)
        }
    }
}

includeTargets << grailsScript("Init")

target(main: "Append a string to the existing version number") {
    depends(checkVersion, parseArguments)

    def newVersion = metadata.'app.version' + '-' + 123
    metadata.'app.version' = newVersion
    metadata.persist()
}

setDefaultTarget(main)
