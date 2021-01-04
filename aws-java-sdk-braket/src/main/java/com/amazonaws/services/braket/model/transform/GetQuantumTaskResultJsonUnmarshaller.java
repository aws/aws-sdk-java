/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.braket.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.braket.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * GetQuantumTaskResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetQuantumTaskResultJsonUnmarshaller implements Unmarshaller<GetQuantumTaskResult, JsonUnmarshallerContext> {

    public GetQuantumTaskResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetQuantumTaskResult getQuantumTaskResult = new GetQuantumTaskResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return getQuantumTaskResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("createdAt", targetDepth)) {
                    context.nextToken();
                    getQuantumTaskResult.setCreatedAt(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("deviceArn", targetDepth)) {
                    context.nextToken();
                    getQuantumTaskResult.setDeviceArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("deviceParameters", targetDepth)) {
                    context.nextToken();
                    getQuantumTaskResult.setDeviceParameters(context.getUnmarshaller(String.class, JsonUnmarshallerContext.UnmarshallerType.JSON_VALUE)
                            .unmarshall(context));
                }
                if (context.testExpression("endedAt", targetDepth)) {
                    context.nextToken();
                    getQuantumTaskResult.setEndedAt(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("failureReason", targetDepth)) {
                    context.nextToken();
                    getQuantumTaskResult.setFailureReason(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("outputS3Bucket", targetDepth)) {
                    context.nextToken();
                    getQuantumTaskResult.setOutputS3Bucket(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("outputS3Directory", targetDepth)) {
                    context.nextToken();
                    getQuantumTaskResult.setOutputS3Directory(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("quantumTaskArn", targetDepth)) {
                    context.nextToken();
                    getQuantumTaskResult.setQuantumTaskArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("shots", targetDepth)) {
                    context.nextToken();
                    getQuantumTaskResult.setShots(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("status", targetDepth)) {
                    context.nextToken();
                    getQuantumTaskResult.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("tags", targetDepth)) {
                    context.nextToken();
                    getQuantumTaskResult.setTags(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context
                            .getUnmarshaller(String.class)).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return getQuantumTaskResult;
    }

    private static GetQuantumTaskResultJsonUnmarshaller instance;

    public static GetQuantumTaskResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetQuantumTaskResultJsonUnmarshaller();
        return instance;
    }
}
