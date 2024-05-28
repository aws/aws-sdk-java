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
package com.amazonaws.services.codebuild.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.codebuild.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * BatchGetFleetsResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchGetFleetsResultJsonUnmarshaller implements Unmarshaller<BatchGetFleetsResult, JsonUnmarshallerContext> {

    public BatchGetFleetsResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        BatchGetFleetsResult batchGetFleetsResult = new BatchGetFleetsResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return batchGetFleetsResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("fleets", targetDepth)) {
                    context.nextToken();
                    batchGetFleetsResult.setFleets(new ListUnmarshaller<Fleet>(FleetJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("fleetsNotFound", targetDepth)) {
                    context.nextToken();
                    batchGetFleetsResult.setFleetsNotFound(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

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

        return batchGetFleetsResult;
    }

    private static BatchGetFleetsResultJsonUnmarshaller instance;

    public static BatchGetFleetsResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new BatchGetFleetsResultJsonUnmarshaller();
        return instance;
    }
}
