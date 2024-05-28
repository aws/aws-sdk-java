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
package com.amazonaws.services.quicksight.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.quicksight.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * TopicRefreshSchedule JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TopicRefreshScheduleJsonUnmarshaller implements Unmarshaller<TopicRefreshSchedule, JsonUnmarshallerContext> {

    public TopicRefreshSchedule unmarshall(JsonUnmarshallerContext context) throws Exception {
        TopicRefreshSchedule topicRefreshSchedule = new TopicRefreshSchedule();

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
                if (context.testExpression("IsEnabled", targetDepth)) {
                    context.nextToken();
                    topicRefreshSchedule.setIsEnabled(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("BasedOnSpiceSchedule", targetDepth)) {
                    context.nextToken();
                    topicRefreshSchedule.setBasedOnSpiceSchedule(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("StartingAt", targetDepth)) {
                    context.nextToken();
                    topicRefreshSchedule.setStartingAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("Timezone", targetDepth)) {
                    context.nextToken();
                    topicRefreshSchedule.setTimezone(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("RepeatAt", targetDepth)) {
                    context.nextToken();
                    topicRefreshSchedule.setRepeatAt(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("TopicScheduleType", targetDepth)) {
                    context.nextToken();
                    topicRefreshSchedule.setTopicScheduleType(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return topicRefreshSchedule;
    }

    private static TopicRefreshScheduleJsonUnmarshaller instance;

    public static TopicRefreshScheduleJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new TopicRefreshScheduleJsonUnmarshaller();
        return instance;
    }
}
