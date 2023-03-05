set KAFKA_HOME=C:\Abuthakir\Softwares\confluent-7.3.1
%KAFKA_HOME%\bin\windows\kafka-topics.bat --create --zookeeper localhost:2181 --topic hello-producer-topic --partitions 5 --replication-factor 3