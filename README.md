# SimpleZeroMQSubscriber
A simple ZeroMQ subscriber, written in Java.  Run it on the command line to get a text stream of ZeroMQ messages.

Uses [Apache Maven](https://maven.apache.org) for build.  Tested on Java 8.

`$ mvn clean compile assembly:single` to build a JAR with all dependencies.

`$ java -jar SimpleZeroMQSubscriber/target/SimpleZeroMQSubscriber-0.0.1-SNAPSHOT-jar-with-dependencies.jar <port>` to listen.
