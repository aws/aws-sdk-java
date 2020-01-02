/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * GetProvisionedConcurrencyConfigResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetProvisionedConcurrencyConfigResultJsonUnmarshaller implements Unmarshaller<GetProvisionedConcurrencyConfigResult, JsonUnmarshallerContext> {

    public GetProvisionedConcurrencyConfigResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetProvisionedConcurrencyConfigResult getProvisionedConcurrencyConfigResult = new GetProvisionedConcurrencyConfigResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return getProvisionedConcurrencyConfigResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("RequestedProvisionedConcurrentExecutions", targetDepth)) {
                    context.nextToken();
                    getProvisionedConcurrencyConfigResult.setRequestedProvisionedConcurrentExecutions(context.getUnmarshaller(Integer.class)
                            .unmarshall(context));
                }
                if (context.testExpression("AvailableProvisionedConcurrentExecutions", targetDepth)) {
                    context.nextToken();
                    getProvisionedConcurrencyConfigResult.setAvailableProvisionedConcurrentExecutions(context.getUnmarshaller(Integer.class)
                            .unmarshall(context));
                }
                if (context.testExpression("AllocatedProvisionedConcurrentExecutions", targetDepth)) {
                    context.nextToken();
                    getProvisionedConcurrencyConfigResult.setAllocatedProvisionedConcurrentExecutions(context.getUnmarshaller(Integer.class)
                            .unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    context.nextToken();
                    getProvisionedConcurrencyConfigResult.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("StatusReason", targetDepth)) {
                    context.nextToken();
                    getProvisionedConcurrencyConfigResult.setStatusReason(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LastModified", targetDepth)) {
                    context.nextToken();
                    getProvisionedConcurrencyConfigResult.setLastModified(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return getProvisionedConcurrencyConfigResult;
    }

    private static GetProvisionedConcurrencyConfigResultJsonUnmarshaller instance;

    public static GetProvisionedConcurrencyConfigResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetProvisionedConcurrencyConfigResultJsonUnmarshaller();
        return instance;
    }
}
