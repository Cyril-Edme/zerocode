package org.jsmart.zerocode.integration.tests.kafka.produce.file;

import org.jsmart.zerocode.core.domain.JsonTestCase;
import org.jsmart.zerocode.core.domain.TargetEnv;
import org.jsmart.zerocode.core.runner.ZeroCodeUnitRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

@TargetEnv("kafka_servers/kafka_test_server.properties")
@RunWith(ZeroCodeUnitRunner.class)
public class KafkaProduceSyncFromFileJsonTest {

    @Test
    @JsonTestCase("kafka/produce/file_produce/test_kafka_produce_sync_from_file_json.json")
    public void testProduceAnd_syncFromFileJson() throws Exception {
    }

}
