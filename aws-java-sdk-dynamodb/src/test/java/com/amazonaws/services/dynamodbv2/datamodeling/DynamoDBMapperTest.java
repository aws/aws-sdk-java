package com.amazonaws.services.dynamodbv2.datamodeling;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import com.amazonaws.services.dynamodbv2.model.DeleteTableRequest;

public class DynamoDBMapperTest {

    @Test
    public void testGenerateDeleteTableRequest(){
        String prefix = "DEV-";
        final String tableName = "OBJECTORMEXAMPLE";

        DynamoDBMapperConfig.TableNameOverride tableNameOverride =
                DynamoDBMapperConfig.TableNameOverride.withTableNamePrefix(prefix);
        DynamoDBMapperConfig config = new DynamoDBMapperConfig(tableNameOverride);
        DynamoDBMapper dynamoDBMapper = new DynamoDBMapper(null, config);

        // Create the simplest table as possible for our test purposes only
        @DynamoDBTable(tableName = tableName)
        class ObjectORMExample{}

        // test
        DeleteTableRequest deleteTableRequest = dynamoDBMapper.generateDeleteTableRequest(ObjectORMExample.class);
        assertEquals(deleteTableRequest.getTableName(), prefix.concat(tableName));
    }

}
