package com.amazonaws.services.dynamodbv2.datamodeling;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.amazonaws.services.dynamodbv2.model.DeleteTableRequest;

/**
 * Unit tests for {@link DynamoDBMapper#generateDeleteTableRequest(Class)}.
 */
public class GenerateDeleteTableRequestTest {

    private static final String TABLE_PREFIX = "DEV-";
    private static final String TABLE_NAME = "OBJECTORMEXAMPLE";

    @Test
    public void tableNameNotOverriden_UsesTableNameAttributeInAnnotation() {
        DynamoDBMapper dynamoDBMapper = new DynamoDBMapper(null);
        DeleteTableRequest deleteTableRequest = dynamoDBMapper.generateDeleteTableRequest(ObjectORMExample.class);
        assertEquals(deleteTableRequest.getTableName(), TABLE_NAME);
    }

    @Test
    public void tableNameOverriddenInConfig_UsesPrefixedOverrideTableName() {
        DynamoDBMapperConfig.TableNameOverride tableNameOverride = DynamoDBMapperConfig.TableNameOverride
                .withTableNamePrefix(TABLE_PREFIX);
        DynamoDBMapperConfig config = new DynamoDBMapperConfig(tableNameOverride);
        DynamoDBMapper dynamoDBMapper = new DynamoDBMapper(null, config);

        DeleteTableRequest deleteTableRequest = dynamoDBMapper.generateDeleteTableRequest(ObjectORMExample.class);
        assertEquals(deleteTableRequest.getTableName(), TABLE_PREFIX.concat(TABLE_NAME));
    }

    @DynamoDBTable(tableName = TABLE_NAME)
    private static class ObjectORMExample {
    }
}
