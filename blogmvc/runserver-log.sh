#! /bin/sh

mvn clean && mvn compile  > tomcat-server.log && mvn tomcat:run  