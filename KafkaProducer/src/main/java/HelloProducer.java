import guru.learningjournal.kafka.examples.AppConfigs;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.common.serialization.IntegerSerializer;
import org.apache.kafka.common.serialization.StringSerializer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Properties;

public class HelloProducer {
    private static final Logger logger = LogManager.getLogger();
    public static void main(String[] args) {
        logger.info("Creating Kafka producer");

        ////Step 1 - creating Java properties for Java configuration

        Properties props = new Properties();

        //Mandatory - simple string passed to Kafka server. It is used to track the source of the message
        props.put(ProducerConfig.CLIENT_ID_CONFIG, AppConfigs.applicationID);

        //Mandatory - comma separate list of host/port pairs. Producer will use this for establishing the initial connection to the Kafka cluster
        //For single node Kafka, can supply an individual host/port information
        //It is used for only initial connection. Once connected the Kafka producer will automatically query for the metadata and discover the full list of Kafka broker in the cluster
        //So no need to supply complete list of Kafka broker as a boostrap configuration
        //It is recommended to provide two to three broker address of a multimode cluster, so in case of failure it will try other borker
        props.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, AppConfigs.bootstrapServers);

        //Mandatory - class to serialize the key
        props.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, IntegerSerializer.class.getName());

        //Mandatory - class to serialize the value
        props.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());


        ////Step 2 - Creating instance of Kafka producer
        KafkaProducer<Integer, String> producer = new KafkaProducer<Integer, String>(props);

        logger.info("Start sending messages");

        ////Step 3 - Sending messages to Kafka
        for(int i=0; i< AppConfigs.numEvents; i++) {
            //Send method accept ProducerRecord record and send it to Kafka
            producer.send(new ProducerRecord<>(AppConfigs.topicName, i, "Simple Message" + i));
        }

        logger.info("Finished sending messages. Closing producer");
        ////Step 4 - Close the producer instance
        producer.close();

    }
}
