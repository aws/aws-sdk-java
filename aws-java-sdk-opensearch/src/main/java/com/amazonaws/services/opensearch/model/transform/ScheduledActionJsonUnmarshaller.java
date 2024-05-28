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
package com.amazonaws.services.opensearch.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.opensearch.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * ScheduledAction JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ScheduledActionJsonUnmarshaller implements Unmarshaller<ScheduledAction, JsonUnmarshallerContext> {

    public ScheduledAction unmarshall(JsonUnmarshallerContext context) throws Exception {
        ScheduledAction scheduledAction = new ScheduledAction();

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
                if (context.testExpression("Id", targetDepth)) {
                    context.nextToken();
                    scheduledAction.setId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Type", targetDepth)) {
                    context.nextToken();
                    scheduledAction.setType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Severity", targetDepth)) {
                    context.nextToken();
                    scheduledAction.setSeverity(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ScheduledTime", targetDepth)) {
                    context.nextToken();
                    scheduledAction.setScheduledTime(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("Description", targetDepth)) {
                    context.nextToken();
                    scheduledAction.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ScheduledBy", targetDepth)) {
                    context.nextToken();
                    scheduledAction.setScheduledBy(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    context.nextToken();
                    scheduledAction.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Mandatory", targetDepth)) {
                    context.nextToken();
                    scheduledAction.setMandatory(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("Cancellable", targetDepth)) {
                    context.nextToken();
                    scheduledAction.setCancellable(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return scheduledAction;
    }

    private static ScheduledActionJsonUnmarshaller instance;

    public static ScheduledActionJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ScheduledActionJsonUnmarshaller();
        return instance;
    }
}
