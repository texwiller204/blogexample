#! /bin/sh

mvn clean && mvn install  > tomcat-server.log && mvn tomcat7:run
