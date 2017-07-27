#!/bin/bash

echo "javac -classpath .:mysql-connector-java-5.0.8-bin.jar Validator.java" 
javac -classpath .:mysql-connector-java-5.0.8-bin.jar Validator.java 

echo "javac -classpath .:mysql-connector-java-5.0.8-bin.jar LoginWindow.java" 
javac -classpath .:mysql-connector-java-5.0.8-bin.jar LoginWindow.java 

echo "java -classpath .:mysql-connector-java-5.0.8-bin.jar LoginWindow.java" 
java -classpath .:mysql-connector-java-5.0.8-bin.jar LoginWindow.java 

echo "Running"
echo "java -classpath .:mysql-connector-java-5.0.8-bin.jar LoginWindow"
java -classpath .:mysql-connector-java-5.0.8-bin.jar LoginWindow
