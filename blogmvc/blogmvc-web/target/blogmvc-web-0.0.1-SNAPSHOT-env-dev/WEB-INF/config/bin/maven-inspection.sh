#!/bin/sh
mvn clean install -e -U

mvn clean install -Dmaven.test.skip=true -X > install.log

mvn dependency:analyze analyzes
mvn dependency:analyze-dep-mgt > dep-mgt.txt
mvn dependency:analyze-only
mvn dependency:analyze-report > report.txt
mvn dependency:analyze-duplicate > duplicate.txt
mvn dependency:build-classpath > build-classpath.txt
