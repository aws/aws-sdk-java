/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.opensearchserverless.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.opensearchserverless.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * BatchGetCollectionResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchGetCollectionResultJsonUnmarshaller implements Unmarshaller<BatchGetCollectionResult, JsonUnmarshallerContext> {

    public BatchGetCollectionResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        BatchGetCollectionResult batchGetCollectionResult = new BatchGetCollectionResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return batchGetCollectionResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("collectionDetails", targetDepth)) {
                    context.nextToken();
                    batchGetCollectionResult.setCollectionDetails(new ListUnmarshaller<CollectionDetail>(CollectionDetailJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("collectionErrorDetails", targetDepth)) {
                    context.nextToken();
                    batchGetCollectionResult.setCollectionErrorDetails(new ListUnmarshaller<CollectionErrorDetail>(CollectionErrorDetailJsonUnmarshaller
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

        return batchGetCollectionResult;
    }

    private static BatchGetCollectionResultJsonUnmarshaller instance;

    public static BatchGetCollectionResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new BatchGetCollectionResultJsonUnmarshaller();
        return instance;
    }
}
