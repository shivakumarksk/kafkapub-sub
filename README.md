# kafkapub-sub

This application is an example on how to publish POJO Objects from Database(In this case postgres) to the kafka topic.It uses SpringBoot KafkaTemplate.

Pre-requisites to run this application , 
--> you should have any RDBMS and respective configuration should be in place like datasource config.
-->Zookeeper server to run Kafka server.
-->Kafka server

This application uses Springboot,Spring-web,Spring-kafka teamplate, jackson-databind for JSON<-->POJO serialization.

# Steps

# * First we need to start Zookeeper server , go inside the downloaded kafka directory and then use the below command.

--> bin/zookeeper-server-start.sh config/zookeeper.properties

# * Start kafka server
--> bin/kafka-server-start.sh config/server.properties

# * Create a kafka topic
-->bin/kafka-topics.sh --create --zookeeper localhost:2181 --replication-factor 1 --partitions 1 --topic events-rest

# * Publish message using GET request 
--> http://localhost:8080/publish  (You will see the meesage 'Published message successfully' for this get request)

# * To see the published meesage from terminal use the below console consumer command.
--> bin/kafka-console-consumer.sh --bootstrap-server localhost:9092 --topic events-rest --from-beginning




