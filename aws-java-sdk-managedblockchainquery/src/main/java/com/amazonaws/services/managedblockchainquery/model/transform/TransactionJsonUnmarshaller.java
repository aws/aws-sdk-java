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
 * Transaction JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TransactionJsonUnmarshaller implements Unmarshaller<Transaction, JsonUnmarshallerContext> {

    public Transaction unmarshall(JsonUnmarshallerContext context) throws Exception {
        Transaction transaction = new Transaction();

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
                    transaction.setNetwork(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("blockHash", targetDepth)) {
                    context.nextToken();
                    transaction.setBlockHash(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("transactionHash", targetDepth)) {
                    context.nextToken();
                    transaction.setTransactionHash(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("blockNumber", targetDepth)) {
                    context.nextToken();
                    transaction.setBlockNumber(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("transactionTimestamp", targetDepth)) {
                    context.nextToken();
                    transaction.setTransactionTimestamp(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("transactionIndex", targetDepth)) {
                    context.nextToken();
                    transaction.setTransactionIndex(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("numberOfTransactions", targetDepth)) {
                    context.nextToken();
                    transaction.setNumberOfTransactions(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("to", targetDepth)) {
                    context.nextToken();
                    transaction.setTo(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("from", targetDepth)) {
                    context.nextToken();
                    transaction.setFrom(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("contractAddress", targetDepth)) {
                    context.nextToken();
                    transaction.setContractAddress(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("gasUsed", targetDepth)) {
                    context.nextToken();
                    transaction.setGasUsed(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("cumulativeGasUsed", targetDepth)) {
                    context.nextToken();
                    transaction.setCumulativeGasUsed(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("effectiveGasPrice", targetDepth)) {
                    context.nextToken();
                    transaction.setEffectiveGasPrice(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("signatureV", targetDepth)) {
                    context.nextToken();
                    transaction.setSignatureV(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("signatureR", targetDepth)) {
                    context.nextToken();
                    transaction.setSignatureR(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("signatureS", targetDepth)) {
                    context.nextToken();
                    transaction.setSignatureS(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("transactionFee", targetDepth)) {
                    context.nextToken();
                    transaction.setTransactionFee(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("transactionId", targetDepth)) {
                    context.nextToken();
                    transaction.setTransactionId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("confirmationStatus", targetDepth)) {
                    context.nextToken();
                    transaction.setConfirmationStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("executionStatus", targetDepth)) {
                    context.nextToken();
                    transaction.setExecutionStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return transaction;
    }

    private static TransactionJsonUnmarshaller instance;

    public static TransactionJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new TransactionJsonUnmarshaller();
        return instance;
    }
}
