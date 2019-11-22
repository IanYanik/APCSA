@ECHO OFF
cd ./
java -cp test.jar JarTestFileOne
java -cp test.jar JarTestFileTwo
set /p DUMMY=Hit ENTER to continue...