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
package com.amazonaws.services.bedrock.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.bedrock.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * GetProvisionedModelThroughputResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetProvisionedModelThroughputResultJsonUnmarshaller implements Unmarshaller<GetProvisionedModelThroughputResult, JsonUnmarshallerContext> {

    public GetProvisionedModelThroughputResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetProvisionedModelThroughputResult getProvisionedModelThroughputResult = new GetProvisionedModelThroughputResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return getProvisionedModelThroughputResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("modelUnits", targetDepth)) {
                    context.nextToken();
                    getProvisionedModelThroughputResult.setModelUnits(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("desiredModelUnits", targetDepth)) {
                    context.nextToken();
                    getProvisionedModelThroughputResult.setDesiredModelUnits(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("provisionedModelName", targetDepth)) {
                    context.nextToken();
                    getProvisionedModelThroughputResult.setProvisionedModelName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("provisionedModelArn", targetDepth)) {
                    context.nextToken();
                    getProvisionedModelThroughputResult.setProvisionedModelArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("modelArn", targetDepth)) {
                    context.nextToken();
                    getProvisionedModelThroughputResult.setModelArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("desiredModelArn", targetDepth)) {
                    context.nextToken();
                    getProvisionedModelThroughputResult.setDesiredModelArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("foundationModelArn", targetDepth)) {
                    context.nextToken();
                    getProvisionedModelThroughputResult.setFoundationModelArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("status", targetDepth)) {
                    context.nextToken();
                    getProvisionedModelThroughputResult.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("creationTime", targetDepth)) {
                    context.nextToken();
                    getProvisionedModelThroughputResult.setCreationTime(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("lastModifiedTime", targetDepth)) {
                    context.nextToken();
                    getProvisionedModelThroughputResult.setLastModifiedTime(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("failureMessage", targetDepth)) {
                    context.nextToken();
                    getProvisionedModelThroughputResult.setFailureMessage(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("commitmentDuration", targetDepth)) {
                    context.nextToken();
                    getProvisionedModelThroughputResult.setCommitmentDuration(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("commitmentExpirationTime", targetDepth)) {
                    context.nextToken();
                    getProvisionedModelThroughputResult.setCommitmentExpirationTime(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return getProvisionedModelThroughputResult;
    }

    private static GetProvisionedModelThroughputResultJsonUnmarshaller instance;

    public static GetProvisionedModelThroughputResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetProvisionedModelThroughputResultJsonUnmarshaller();
        return instance;
    }
}
