/*
 * Copyright 2010-2014 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.lambda.model.transform;

import java.util.Map;
import java.util.Map.Entry;

import com.amazonaws.services.lambda.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * Event Source Configuration JSON Unmarshaller
 */
public class EventSourceConfigurationJsonUnmarshaller implements Unmarshaller<EventSourceConfiguration, JsonUnmarshallerContext> {

    public EventSourceConfiguration unmarshall(JsonUnmarshallerContext context) throws Exception {
        EventSourceConfiguration eventSourceConfiguration = new EventSourceConfiguration();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null) token = context.nextToken();
        if (token == VALUE_NULL) return null;

        while (true) {
            if (token == null) break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("UUID", targetDepth)) {
                    context.nextToken();
                    eventSourceConfiguration.setUUID(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("BatchSize", targetDepth)) {
                    context.nextToken();
                    eventSourceConfiguration.setBatchSize(IntegerJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("EventSource", targetDepth)) {
                    context.nextToken();
                    eventSourceConfiguration.setEventSource(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("FunctionName", targetDepth)) {
                    context.nextToken();
                    eventSourceConfiguration.setFunctionName(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Parameters", targetDepth)) {
                    context.nextToken();
                    eventSourceConfiguration.setParameters(new MapUnmarshaller<String,String>(StringJsonUnmarshaller.getInstance(), StringJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("Role", targetDepth)) {
                    context.nextToken();
                    eventSourceConfiguration.setRole(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("LastModified", targetDepth)) {
                    context.nextToken();
                    eventSourceConfiguration.setLastModified(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("IsActive", targetDepth)) {
                    context.nextToken();
                    eventSourceConfiguration.setIsActive(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    context.nextToken();
                    eventSourceConfiguration.setStatus(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth) break;
                }
            }

            token = context.nextToken();
        }
        
        return eventSourceConfiguration;
    }

    private static EventSourceConfigurationJsonUnmarshaller instance;
    public static EventSourceConfigurationJsonUnmarshaller getInstance() {
        if (instance == null) instance = new EventSourceConfigurationJsonUnmarshaller();
        return instance;
    }
}
    