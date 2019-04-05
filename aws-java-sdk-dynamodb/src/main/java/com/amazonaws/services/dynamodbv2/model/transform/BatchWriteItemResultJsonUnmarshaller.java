/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.dynamodbv2.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.dynamodbv2.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * BatchWriteItemResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchWriteItemResultJsonUnmarshaller implements Unmarshaller<BatchWriteItemResult, JsonUnmarshallerContext> {

    public BatchWriteItemResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        BatchWriteItemResult batchWriteItemResult = new BatchWriteItemResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return batchWriteItemResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("UnprocessedItems", targetDepth)) {
                    context.nextToken();
                    batchWriteItemResult.setUnprocessedItems(new MapUnmarshaller<String, java.util.List<WriteRequest>>(context.getUnmarshaller(String.class),
                            new ListUnmarshaller<WriteRequest>(WriteRequestJsonUnmarshaller.getInstance())).unmarshall(context));
                }
                if (context.testExpression("ItemCollectionMetrics", targetDepth)) {
                    context.nextToken();
                    batchWriteItemResult.setItemCollectionMetrics(new MapUnmarshaller<String, java.util.List<ItemCollectionMetrics>>(context
                            .getUnmarshaller(String.class), new ListUnmarshaller<ItemCollectionMetrics>(ItemCollectionMetricsJsonUnmarshaller.getInstance()))
                            .unmarshall(context));
                }
                if (context.testExpression("ConsumedCapacity", targetDepth)) {
                    context.nextToken();
                    batchWriteItemResult.setConsumedCapacity(new ListUnmarshaller<ConsumedCapacity>(ConsumedCapacityJsonUnmarshaller.getInstance())
                            .unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return batchWriteItemResult;
    }

    private static BatchWriteItemResultJsonUnmarshaller instance;

    public static BatchWriteItemResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new BatchWriteItemResultJsonUnmarshaller();
        return instance;
    }
}
