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
package com.amazonaws.services.health.model.transform;

import java.util.Map;
import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.health.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * EventFilter JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EventFilterJsonUnmarshaller implements Unmarshaller<EventFilter, JsonUnmarshallerContext> {

    public EventFilter unmarshall(JsonUnmarshallerContext context) throws Exception {
        EventFilter eventFilter = new EventFilter();

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
                if (context.testExpression("eventArns", targetDepth)) {
                    context.nextToken();
                    eventFilter.setEventArns(new ListUnmarshaller<String>(context.getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("eventTypeCodes", targetDepth)) {
                    context.nextToken();
                    eventFilter.setEventTypeCodes(new ListUnmarshaller<String>(context.getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("services", targetDepth)) {
                    context.nextToken();
                    eventFilter.setServices(new ListUnmarshaller<String>(context.getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("regions", targetDepth)) {
                    context.nextToken();
                    eventFilter.setRegions(new ListUnmarshaller<String>(context.getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("availabilityZones", targetDepth)) {
                    context.nextToken();
                    eventFilter.setAvailabilityZones(new ListUnmarshaller<String>(context.getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("startTimes", targetDepth)) {
                    context.nextToken();
                    eventFilter.setStartTimes(new ListUnmarshaller<DateTimeRange>(DateTimeRangeJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("endTimes", targetDepth)) {
                    context.nextToken();
                    eventFilter.setEndTimes(new ListUnmarshaller<DateTimeRange>(DateTimeRangeJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("lastUpdatedTimes", targetDepth)) {
                    context.nextToken();
                    eventFilter.setLastUpdatedTimes(new ListUnmarshaller<DateTimeRange>(DateTimeRangeJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("entityArns", targetDepth)) {
                    context.nextToken();
                    eventFilter.setEntityArns(new ListUnmarshaller<String>(context.getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("entityValues", targetDepth)) {
                    context.nextToken();
                    eventFilter.setEntityValues(new ListUnmarshaller<String>(context.getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("eventTypeCategories", targetDepth)) {
                    context.nextToken();
                    eventFilter.setEventTypeCategories(new ListUnmarshaller<String>(context.getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("tags", targetDepth)) {
                    context.nextToken();
                    eventFilter.setTags(new ListUnmarshaller<java.util.Map<String, String>>(new MapUnmarshaller<String, String>(context
                            .getUnmarshaller(String.class), context.getUnmarshaller(String.class))).unmarshall(context));
                }
                if (context.testExpression("eventStatusCodes", targetDepth)) {
                    context.nextToken();
                    eventFilter.setEventStatusCodes(new ListUnmarshaller<String>(context.getUnmarshaller(String.class)).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return eventFilter;
    }

    private static EventFilterJsonUnmarshaller instance;

    public static EventFilterJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new EventFilterJsonUnmarshaller();
        return instance;
    }
}
