<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main"/>
		<title>Welcome to Grails</title>
		<style type="text/css" media="screen">
			#status {
                                background:orange;
				border: .2em solid #fff;
                                margin: 1%;
				padding: 0;
				width: 97.5%;
				float: left;
				-moz-box-shadow: 0px 0px 1.25em #ccc;
				-webkit-box-shadow: 0px 0px 1.25em #ccc;
				box-shadow: 0px 0px 1.25em #ccc;
				-moz-border-radius: 0.6em;
				-webkit-border-radius: 0.6em;
				border-radius: 0.6em;
			}
			.ie6 #status {
				display: inline; /* float double margin fix http://www.positioniseverything.net/explorer/doubled-margin.html */
			}

			#status ul {
				font-size: 0.9em;
				list-style-type: none;
				margin-bottom: 0.6em;
				padding: 0;
			}

			#status li {
				line-height: 1.3;
			}

			#status h1 {
				text-transform: uppercase;
				font-size: 1.1em;
				margin: 0 0 0.3em;
			}

			#page-body {
				margin-left: 10%;
                                margin-right: 10%;
                                width: 80%;
			}

			h2 {
				margin-top: 1em;
				margin-bottom: 0.3em;
				font-size: 1em;
			}

			p {
				line-height: 1.5;
				margin: 0.25em 0;
			}

			#controller-list ul {
				list-style-position: inside;
			}

			#controller-list li {
				line-height: 1.3;
				list-style-position: inside;
				margin: 0.25em 0;
			}

			@media screen and (max-width: 480px) {
				#status {
					display: none;
				}

				#page-body {
					margin: 0 1em 1em;
				}

				#page-body h1 {
					margin-top: 0;
				}
			}
		</style>
	</head>
	<body>
            <div id="status">
                <div id="page-body" role="main">
                    <img style="height:50%; width:86%; margin-left:7%; margin-right :7%; margin-top: 3%; margin-bottom: 3%" src="https://images6.alphacoders.com/346/346199.jpg" ></img>
                    <h1 style="font-family:sans-serif; font-weight:bold; font-size:30px; margin-left:15%">Welcome to Book store</h1>
                    <g:each var="c" in="${grailsApplication.controllerClasses.sort { it.fullName } }">
                        <li style="margin-left:25%" class="controller"><g:link controller="${c.logicalPropertyName}">${c.fullName}</g:link></li>
                    </g:each>
                </div>
            </div>
	</body>
</html>
