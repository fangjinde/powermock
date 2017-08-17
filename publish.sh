#!/bin/bash
set -x
gradle :powermock-api:powermock-api-mockito2:uploadArchives
gradle :powermock-api:powermock-api-mockito-common:uploadArchives
gradle :powermock-api:powermock-api-support:uploadArchives
gradle :powermock-core:uploadArchives
gradle :powermock-reflect:uploadArchives
gradle :powermock-classloading:powermock-classloading-xstream:uploadArchives
gradle :powermock-classloading:powermock-classloading-base:uploadArchives
gradle :powermock-modules:powermock-module-testng:uploadArchives
gradle :powermock-modules:powermock-module-testng-common:uploadArchives
gradle :powermock-modules:powermock-module-junit4-rule:uploadArchives
gradle :powermock-modules:powermock-module-junit4-common:uploadArchives
gradle :powermock-modules:powermock-module-junit4:uploadArchives
