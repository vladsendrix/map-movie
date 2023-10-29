#!/bin/bash

mvn clean package
java -jar target/map-movie*.jar
