package com.amazonaws.services.dynamodbv2.datamodeling;

import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBAsyncClient;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClient;
import com.amazonaws.services.dynamodbv2.pojos.AtomicInteger;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Created by magrnw on 3/3/17.
 */
public class AtomicIntegerFunctionalTest {


    @Test
    public void testGenerateModelAtomicInteger() {
        DynamoDBMapperConfig config = DynamoDBMapperConfig.DEFAULT.merge(DynamoDBMapperConfig.DEFAULT);

        DynamoDBMapper mapper = new DynamoDBMapper(new AmazonDynamoDBAsyncClient());
        final DynamoDBMapperTableModel<AtomicInteger> model = mapper.getTableModel(AtomicInteger.class, config);

        System.out.println(model);
    }

}
