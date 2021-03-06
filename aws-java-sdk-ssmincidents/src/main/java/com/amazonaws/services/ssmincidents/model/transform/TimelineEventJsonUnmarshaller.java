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
package com.amazonaws.services.ssmincidents.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.ssmincidents.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * TimelineEvent JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TimelineEventJsonUnmarshaller implements Unmarshaller<TimelineEvent, JsonUnmarshallerContext> {

    public TimelineEvent unmarshall(JsonUnmarshallerContext context) throws Exception {
        TimelineEvent timelineEvent = new TimelineEvent();

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
                if (context.testExpression("eventData", targetDepth)) {
                    context.nextToken();
                    timelineEvent.setEventData(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("eventId", targetDepth)) {
                    context.nextToken();
                    timelineEvent.setEventId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("eventTime", targetDepth)) {
                    context.nextToken();
                    timelineEvent.setEventTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("eventType", targetDepth)) {
                    context.nextToken();
                    timelineEvent.setEventType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("eventUpdatedTime", targetDepth)) {
                    context.nextToken();
                    timelineEvent.setEventUpdatedTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("incidentRecordArn", targetDepth)) {
                    context.nextToken();
                    timelineEvent.setIncidentRecordArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return timelineEvent;
    }

    private static TimelineEventJsonUnmarshaller instance;

    public static TimelineEventJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new TimelineEventJsonUnmarshaller();
        return instance;
    }
}
