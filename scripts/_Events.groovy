eventCreateWarStart = { warName, stagingDir ->
    def buildNumber = System.getenv('BUILD_NUMBER')
    def newVersion = metadata.'app.version' + '-' + 123
    if(buildNumber) {
        println("BuildNumber " +buildNumber)
        println("newVersion " +newVersion)
        ant.propertyfile(file:"${stagingDir}/WEB-INF/classes/application.properties") {
            entry(key:'build.number', value: buildNumber)
            entry(key:'app.version', value: buildNumber)
        }
    }
}

//includeTargets << grailsScript("Init")
//
//target(main: "Append a string to the existing version number") {
//    depends(checkVersion, parseArguments)
//
//    def newVersion = metadata.'app.version' + '-' + 123
//    println("newVersion " +newVersion)
//    metadata.'app.version' = newVersion
//    metadata.persist()
//}
//
//setDefaultTarget(main)
