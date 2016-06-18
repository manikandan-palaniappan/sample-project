//eventCreateWarStart = { warName, stagingDir ->
//    def buildNumber = System.getenv('BUILD_NUMBER')
//    def newVersion = metadata.'app.version' + '.' + buildNumber
//    if(buildNumber) {
//        println("BuildNumber " +buildNumber)
//        println("newVersion " +newVersion)
//        
//        metadata.'app.version' = newVersion
//        metadata.'app.build.number' = buildNumber
//        metadata.persist()
//
//        ant.propertyfile(file:"${stagingDir}/WEB-INF/classes/application.properties") {
//            entry(key:'app.build.number', value: buildNumber)
//            entry(key:'app.version', value: newVersion)
//        }
//        
//        ant.manifest(file: "${stagingDir}/META-INF/MANIFEST.MF", mode: "update") {
//            attribute(name: "Build-Time", value: new Date())        
//            section(name: "Grails Application") {       
//                attribute(name: "Implementation-Build-Number", value: buildNumber)                
//            }
//        }
//    }
//}
