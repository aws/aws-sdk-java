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
package com.amazonaws.services.lookoutequipment.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.lookoutequipment.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * UpdateActiveModelVersionResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateActiveModelVersionResultJsonUnmarshaller implements Unmarshaller<UpdateActiveModelVersionResult, JsonUnmarshallerContext> {

    public UpdateActiveModelVersionResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        UpdateActiveModelVersionResult updateActiveModelVersionResult = new UpdateActiveModelVersionResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return updateActiveModelVersionResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("ModelName", targetDepth)) {
                    context.nextToken();
                    updateActiveModelVersionResult.setModelName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ModelArn", targetDepth)) {
                    context.nextToken();
                    updateActiveModelVersionResult.setModelArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CurrentActiveVersion", targetDepth)) {
                    context.nextToken();
                    updateActiveModelVersionResult.setCurrentActiveVersion(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("PreviousActiveVersion", targetDepth)) {
                    context.nextToken();
                    updateActiveModelVersionResult.setPreviousActiveVersion(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("CurrentActiveVersionArn", targetDepth)) {
                    context.nextToken();
                    updateActiveModelVersionResult.setCurrentActiveVersionArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PreviousActiveVersionArn", targetDepth)) {
                    context.nextToken();
                    updateActiveModelVersionResult.setPreviousActiveVersionArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return updateActiveModelVersionResult;
    }

    private static UpdateActiveModelVersionResultJsonUnmarshaller instance;

    public static UpdateActiveModelVersionResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new UpdateActiveModelVersionResultJsonUnmarshaller();
        return instance;
    }
}
