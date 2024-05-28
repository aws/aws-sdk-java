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
package com.amazonaws.services.inspector2.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.inspector2.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * StopCisSessionMessage JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StopCisSessionMessageJsonUnmarshaller implements Unmarshaller<StopCisSessionMessage, JsonUnmarshallerContext> {

    public StopCisSessionMessage unmarshall(JsonUnmarshallerContext context) throws Exception {
        StopCisSessionMessage stopCisSessionMessage = new StopCisSessionMessage();

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
                if (context.testExpression("benchmarkProfile", targetDepth)) {
                    context.nextToken();
                    stopCisSessionMessage.setBenchmarkProfile(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("benchmarkVersion", targetDepth)) {
                    context.nextToken();
                    stopCisSessionMessage.setBenchmarkVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("computePlatform", targetDepth)) {
                    context.nextToken();
                    stopCisSessionMessage.setComputePlatform(ComputePlatformJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("progress", targetDepth)) {
                    context.nextToken();
                    stopCisSessionMessage.setProgress(StopCisMessageProgressJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("reason", targetDepth)) {
                    context.nextToken();
                    stopCisSessionMessage.setReason(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("status", targetDepth)) {
                    context.nextToken();
                    stopCisSessionMessage.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return stopCisSessionMessage;
    }

    private static StopCisSessionMessageJsonUnmarshaller instance;

    public static StopCisSessionMessageJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new StopCisSessionMessageJsonUnmarshaller();
        return instance;
    }
}
