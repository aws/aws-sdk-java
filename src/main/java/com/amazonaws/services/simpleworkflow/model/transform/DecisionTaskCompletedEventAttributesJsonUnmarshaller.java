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
 * Decision Task Completed Event Attributes JSON Unmarshaller
 */
public class DecisionTaskCompletedEventAttributesJsonUnmarshaller implements Unmarshaller<DecisionTaskCompletedEventAttributes, JsonUnmarshallerContext> {

    

    public DecisionTaskCompletedEventAttributes unmarshall(JsonUnmarshallerContext context) throws Exception {
        DecisionTaskCompletedEventAttributes decisionTaskCompletedEventAttributes = new DecisionTaskCompletedEventAttributes();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.currentToken;
        if (token == null) token = context.nextToken();

        while (true) {
            if (token == null) return decisionTaskCompletedEventAttributes;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("executionContext", targetDepth)) {
                    context.nextToken();
                    decisionTaskCompletedEventAttributes.setExecutionContext(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("scheduledEventId", targetDepth)) {
                    context.nextToken();
                    decisionTaskCompletedEventAttributes.setScheduledEventId(LongJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("startedEventId", targetDepth)) {
                    context.nextToken();
                    decisionTaskCompletedEventAttributes.setStartedEventId(LongJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getCurrentDepth() <= originalDepth) {
                    return decisionTaskCompletedEventAttributes;
                }
            }
            token = context.nextToken();
        }
    }

    private static DecisionTaskCompletedEventAttributesJsonUnmarshaller instance;
    public static DecisionTaskCompletedEventAttributesJsonUnmarshaller getInstance() {
        if (instance == null) instance = new DecisionTaskCompletedEventAttributesJsonUnmarshaller();
        return instance;
    }
}
    