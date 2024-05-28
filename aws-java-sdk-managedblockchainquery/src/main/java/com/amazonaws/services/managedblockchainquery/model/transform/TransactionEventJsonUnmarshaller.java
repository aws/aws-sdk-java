/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.managedblockchainquery.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.managedblockchainquery.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * TransactionEvent JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TransactionEventJsonUnmarshaller implements Unmarshaller<TransactionEvent, JsonUnmarshallerContext> {

    public TransactionEvent unmarshall(JsonUnmarshallerContext context) throws Exception {
        TransactionEvent transactionEvent = new TransactionEvent();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return null;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("network", targetDepth)) {
                    context.nextToken();
                    transactionEvent.setNetwork(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("transactionHash", targetDepth)) {
                    context.nextToken();
                    transactionEvent.setTransactionHash(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("eventType", targetDepth)) {
                    context.nextToken();
                    transactionEvent.setEventType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("from", targetDepth)) {
                    context.nextToken();
                    transactionEvent.setFrom(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("to", targetDepth)) {
                    context.nextToken();
                    transactionEvent.setTo(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("value", targetDepth)) {
                    context.nextToken();
                    transactionEvent.setValue(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("contractAddress", targetDepth)) {
                    context.nextToken();
                    transactionEvent.setContractAddress(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("tokenId", targetDepth)) {
                    context.nextToken();
                    transactionEvent.setTokenId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("transactionId", targetDepth)) {
                    context.nextToken();
                    transactionEvent.setTransactionId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("voutIndex", targetDepth)) {
                    context.nextToken();
                    transactionEvent.setVoutIndex(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("voutSpent", targetDepth)) {
                    context.nextToken();
                    transactionEvent.setVoutSpent(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("spentVoutTransactionId", targetDepth)) {
                    context.nextToken();
                    transactionEvent.setSpentVoutTransactionId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("spentVoutTransactionHash", targetDepth)) {
                    context.nextToken();
                    transactionEvent.setSpentVoutTransactionHash(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("spentVoutIndex", targetDepth)) {
                    context.nextToken();
                    transactionEvent.setSpentVoutIndex(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("blockchainInstant", targetDepth)) {
                    context.nextToken();
                    transactionEvent.setBlockchainInstant(BlockchainInstantJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("confirmationStatus", targetDepth)) {
                    context.nextToken();
                    transactionEvent.setConfirmationStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return transactionEvent;
    }

    private static TransactionEventJsonUnmarshaller instance;

    public static TransactionEventJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new TransactionEventJsonUnmarshaller();
        return instance;
    }
}
