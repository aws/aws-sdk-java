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
package com.amazonaws.services.ioteventsdata.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.ioteventsdata.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * SnoozeAlarmActionRequest JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SnoozeAlarmActionRequestJsonUnmarshaller implements Unmarshaller<SnoozeAlarmActionRequest, JsonUnmarshallerContext> {

    public SnoozeAlarmActionRequest unmarshall(JsonUnmarshallerContext context) throws Exception {
        SnoozeAlarmActionRequest snoozeAlarmActionRequest = new SnoozeAlarmActionRequest();

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
                if (context.testExpression("requestId", targetDepth)) {
                    context.nextToken();
                    snoozeAlarmActionRequest.setRequestId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("alarmModelName", targetDepth)) {
                    context.nextToken();
                    snoozeAlarmActionRequest.setAlarmModelName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("keyValue", targetDepth)) {
                    context.nextToken();
                    snoozeAlarmActionRequest.setKeyValue(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("note", targetDepth)) {
                    context.nextToken();
                    snoozeAlarmActionRequest.setNote(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("snoozeDuration", targetDepth)) {
                    context.nextToken();
                    snoozeAlarmActionRequest.setSnoozeDuration(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return snoozeAlarmActionRequest;
    }

    private static SnoozeAlarmActionRequestJsonUnmarshaller instance;

    public static SnoozeAlarmActionRequestJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new SnoozeAlarmActionRequestJsonUnmarshaller();
        return instance;
    }
}
