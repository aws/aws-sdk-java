package com.amazonaws.services.dynamodbv2.datamodeling;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.mockito.Mockito.verify;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapperConfig.SaveBehavior;
import com.amazonaws.services.dynamodbv2.model.TransactWriteItemsRequest;

@RunWith(MockitoJUnitRunner.class)
public class DynamoDBMapperTest {
    @Mock
    private AmazonDynamoDB mockAmazonDynamoDB;

    @InjectMocks
    private DynamoDBMapper sut;

    @Test
    public void shouldIncludeConditionWithSaveBehaviorPut() {
        // given
        SaveBehavior saveBehavior = SaveBehavior.PUT;

        // when
        TransactWriteItemsRequest capturedTransactWriteItemsRequest = doTransactionWriteAndCapture(saveBehavior);

        // then ensure there IS a condition expression
        assertNotNull(extractConditionExpression(capturedTransactWriteItemsRequest));
    }

    @Test
    public void shouldNotIncludeConditionWithSaveBehaviorClobber() {
        // given
        SaveBehavior saveBehavior = SaveBehavior.CLOBBER;

        // when
        TransactWriteItemsRequest capturedTransactWriteItemsRequest = doTransactionWriteAndCapture(saveBehavior);

        // then ensure there is NOT a condition expression
        assertNull(extractConditionExpression(capturedTransactWriteItemsRequest));
    }

    // =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-

    private TransactWriteItemsRequest doTransactionWriteAndCapture(SaveBehavior saveBehavior) {
        // setup a capture of the TransactWriteItemsRequest sent to AmazonDynamoDB
        ArgumentCaptor<TransactWriteItemsRequest> transactWriteItemsRequestCaptor = ArgumentCaptor.forClass(
                TransactWriteItemsRequest.class);

        // create a dummy request
        TransactionWriteRequest deleteStubItemRequest = new TransactionWriteRequest();
        deleteStubItemRequest.addDelete(createStubVersionedItem());

        // send the dummy request to the sut
        sut.transactionWrite(deleteStubItemRequest, DynamoDBMapperConfig.builder()
                                                                        .withSaveBehavior(saveBehavior)
                                                                        .build());

        // capture the TransactWriteItemsRequest sent to AmazonDynamoDB
        verify(mockAmazonDynamoDB).transactWriteItems(transactWriteItemsRequestCaptor.capture());

        return transactWriteItemsRequestCaptor.getValue();
    }

    private String extractConditionExpression(TransactWriteItemsRequest capturedTransactWriteItemsRequest) {
        return capturedTransactWriteItemsRequest.getTransactItems()
                                                .get(0)
                                                .getDelete()
                                                .getConditionExpression();
    }

    private StubVersionedItem createStubVersionedItem() {
        StubVersionedItem stubVersionedItem = new StubVersionedItem();

        stubVersionedItem.setHashKey("Dummy");

        return stubVersionedItem;
    }
}

@DynamoDBTable(tableName = "StubTableName")
class StubVersionedItem {
    @DynamoDBHashKey(attributeName = "StubTableHashKey")
    private String hashKey;

    @DynamoDBVersionAttribute
    private Long version;

    public String getHashKey() {
        return hashKey;
    }

    public void setHashKey(String dummyHashKey) {
        this.hashKey = dummyHashKey;
    }

    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }
}