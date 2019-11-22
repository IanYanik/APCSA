@ECHO OFF
cd ./
jar cvf test.jar JarTestFileOne.class JarTestFileTwo.class
set /p DUMMY=Hit ENTER to continue...