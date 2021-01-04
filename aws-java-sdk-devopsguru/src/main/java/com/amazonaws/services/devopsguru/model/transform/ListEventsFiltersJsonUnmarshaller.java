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
package com.amazonaws.services.devopsguru.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.devopsguru.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * ListEventsFilters JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListEventsFiltersJsonUnmarshaller implements Unmarshaller<ListEventsFilters, JsonUnmarshallerContext> {

    public ListEventsFilters unmarshall(JsonUnmarshallerContext context) throws Exception {
        ListEventsFilters listEventsFilters = new ListEventsFilters();

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
                if (context.testExpression("InsightId", targetDepth)) {
                    context.nextToken();
                    listEventsFilters.setInsightId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EventTimeRange", targetDepth)) {
                    context.nextToken();
                    listEventsFilters.setEventTimeRange(EventTimeRangeJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("EventClass", targetDepth)) {
                    context.nextToken();
                    listEventsFilters.setEventClass(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EventSource", targetDepth)) {
                    context.nextToken();
                    listEventsFilters.setEventSource(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DataSource", targetDepth)) {
                    context.nextToken();
                    listEventsFilters.setDataSource(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ResourceCollection", targetDepth)) {
                    context.nextToken();
                    listEventsFilters.setResourceCollection(ResourceCollectionJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return listEventsFilters;
    }

    private static ListEventsFiltersJsonUnmarshaller instance;

    public static ListEventsFiltersJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ListEventsFiltersJsonUnmarshaller();
        return instance;
    }
}
