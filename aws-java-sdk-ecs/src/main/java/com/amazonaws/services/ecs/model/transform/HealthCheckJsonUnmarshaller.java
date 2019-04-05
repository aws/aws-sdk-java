/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ecs.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.ecs.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * HealthCheck JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class HealthCheckJsonUnmarshaller implements Unmarshaller<HealthCheck, JsonUnmarshallerContext> {

    public HealthCheck unmarshall(JsonUnmarshallerContext context) throws Exception {
        HealthCheck healthCheck = new HealthCheck();

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
                if (context.testExpression("command", targetDepth)) {
                    context.nextToken();
                    healthCheck.setCommand(new ListUnmarshaller<String>(context.getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("interval", targetDepth)) {
                    context.nextToken();
                    healthCheck.setInterval(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("timeout", targetDepth)) {
                    context.nextToken();
                    healthCheck.setTimeout(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("retries", targetDepth)) {
                    context.nextToken();
                    healthCheck.setRetries(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("startPeriod", targetDepth)) {
                    context.nextToken();
                    healthCheck.setStartPeriod(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return healthCheck;
    }

    private static HealthCheckJsonUnmarshaller instance;

    public static HealthCheckJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new HealthCheckJsonUnmarshaller();
        return instance;
    }
}
