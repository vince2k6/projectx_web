FROM maven:3.5-jdk-8 as BUILD

COPY pom.xml .
COPY src src

RUN mvn clean install

FROM jboss/wildfly:10.1.0.Final

COPY --from=BUILD ./target/*.war /opt/jboss/wildfly/standalone/deployments/*.war

