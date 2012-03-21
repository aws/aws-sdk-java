/*
 * Copyright 2010-2012 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.simpleworkflow.model.transform;

import java.util.Map;
import java.util.Map.Entry;

import com.amazonaws.services.simpleworkflow.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import org.codehaus.jackson.JsonToken;
import static org.codehaus.jackson.JsonToken.*;

/**
 * Activity Task Timed Out Event Attributes JSON Unmarshaller
 */
public class ActivityTaskTimedOutEventAttributesJsonUnmarshaller implements Unmarshaller<ActivityTaskTimedOutEventAttributes, JsonUnmarshallerContext> {

    

    public ActivityTaskTimedOutEventAttributes unmarshall(JsonUnmarshallerContext context) throws Exception {
        ActivityTaskTimedOutEventAttributes activityTaskTimedOutEventAttributes = new ActivityTaskTimedOutEventAttributes();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.currentToken;
        if (token == null) token = context.nextToken();

        while (true) {
            if (token == null) return activityTaskTimedOutEventAttributes;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("timeoutType", targetDepth)) {
                    context.nextToken();
                    activityTaskTimedOutEventAttributes.setTimeoutType(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("scheduledEventId", targetDepth)) {
                    context.nextToken();
                    activityTaskTimedOutEventAttributes.setScheduledEventId(LongJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("startedEventId", targetDepth)) {
                    context.nextToken();
                    activityTaskTimedOutEventAttributes.setStartedEventId(LongJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("details", targetDepth)) {
                    context.nextToken();
                    activityTaskTimedOutEventAttributes.setDetails(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getCurrentDepth() <= originalDepth) {
                    return activityTaskTimedOutEventAttributes;
                }
            }
            token = context.nextToken();
        }
    }

    private static ActivityTaskTimedOutEventAttributesJsonUnmarshaller instance;
    public static ActivityTaskTimedOutEventAttributesJsonUnmarshaller getInstance() {
        if (instance == null) instance = new ActivityTaskTimedOutEventAttributesJsonUnmarshaller();
        return instance;
    }
}
    