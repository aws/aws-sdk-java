/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * TimeRangeFilter JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TimeRangeFilterJsonUnmarshaller implements Unmarshaller<TimeRangeFilter, JsonUnmarshallerContext> {

    public TimeRangeFilter unmarshall(JsonUnmarshallerContext context) throws Exception {
        TimeRangeFilter timeRangeFilter = new TimeRangeFilter();

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
                if (context.testExpression("FilterId", targetDepth)) {
                    context.nextToken();
                    timeRangeFilter.setFilterId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Column", targetDepth)) {
                    context.nextToken();
                    timeRangeFilter.setColumn(ColumnIdentifierJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("IncludeMinimum", targetDepth)) {
                    context.nextToken();
                    timeRangeFilter.setIncludeMinimum(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("IncludeMaximum", targetDepth)) {
                    context.nextToken();
                    timeRangeFilter.setIncludeMaximum(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("RangeMinimumValue", targetDepth)) {
                    context.nextToken();
                    timeRangeFilter.setRangeMinimumValue(TimeRangeFilterValueJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("RangeMaximumValue", targetDepth)) {
                    context.nextToken();
                    timeRangeFilter.setRangeMaximumValue(TimeRangeFilterValueJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("NullOption", targetDepth)) {
                    context.nextToken();
                    timeRangeFilter.setNullOption(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ExcludePeriodConfiguration", targetDepth)) {
                    context.nextToken();
                    timeRangeFilter.setExcludePeriodConfiguration(ExcludePeriodConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("TimeGranularity", targetDepth)) {
                    context.nextToken();
                    timeRangeFilter.setTimeGranularity(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return timeRangeFilter;
    }

    private static TimeRangeFilterJsonUnmarshaller instance;

    public static TimeRangeFilterJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new TimeRangeFilterJsonUnmarshaller();
        return instance;
    }
}
