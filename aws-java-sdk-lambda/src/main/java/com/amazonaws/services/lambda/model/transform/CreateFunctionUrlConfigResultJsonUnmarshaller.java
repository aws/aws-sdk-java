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
package com.amazonaws.services.lambda.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.lambda.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * CreateFunctionUrlConfigResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateFunctionUrlConfigResultJsonUnmarshaller implements Unmarshaller<CreateFunctionUrlConfigResult, JsonUnmarshallerContext> {

    public CreateFunctionUrlConfigResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        CreateFunctionUrlConfigResult createFunctionUrlConfigResult = new CreateFunctionUrlConfigResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return createFunctionUrlConfigResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("FunctionUrl", targetDepth)) {
                    context.nextToken();
                    createFunctionUrlConfigResult.setFunctionUrl(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("FunctionArn", targetDepth)) {
                    context.nextToken();
                    createFunctionUrlConfigResult.setFunctionArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("AuthType", targetDepth)) {
                    context.nextToken();
                    createFunctionUrlConfigResult.setAuthType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Cors", targetDepth)) {
                    context.nextToken();
                    createFunctionUrlConfigResult.setCors(CorsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("CreationTime", targetDepth)) {
                    context.nextToken();
                    createFunctionUrlConfigResult.setCreationTime(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return createFunctionUrlConfigResult;
    }

    private static CreateFunctionUrlConfigResultJsonUnmarshaller instance;

    public static CreateFunctionUrlConfigResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CreateFunctionUrlConfigResultJsonUnmarshaller();
        return instance;
    }
}
