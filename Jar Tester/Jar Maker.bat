@ECHO OFF
cd ./
jar cmf Manifest.mf it.jar Newer.class JarTestFileTwo.class
set /p DUMMY=Hit ENTER to continue...