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
 * BatchGetTokenBalanceResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchGetTokenBalanceResultJsonUnmarshaller implements Unmarshaller<BatchGetTokenBalanceResult, JsonUnmarshallerContext> {

    public BatchGetTokenBalanceResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        BatchGetTokenBalanceResult batchGetTokenBalanceResult = new BatchGetTokenBalanceResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return batchGetTokenBalanceResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("tokenBalances", targetDepth)) {
                    context.nextToken();
                    batchGetTokenBalanceResult.setTokenBalances(new ListUnmarshaller<BatchGetTokenBalanceOutputItem>(
                            BatchGetTokenBalanceOutputItemJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("errors", targetDepth)) {
                    context.nextToken();
                    batchGetTokenBalanceResult.setErrors(new ListUnmarshaller<BatchGetTokenBalanceErrorItem>(BatchGetTokenBalanceErrorItemJsonUnmarshaller
                            .getInstance())

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

        return batchGetTokenBalanceResult;
    }

    private static BatchGetTokenBalanceResultJsonUnmarshaller instance;

    public static BatchGetTokenBalanceResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new BatchGetTokenBalanceResultJsonUnmarshaller();
        return instance;
    }
}
