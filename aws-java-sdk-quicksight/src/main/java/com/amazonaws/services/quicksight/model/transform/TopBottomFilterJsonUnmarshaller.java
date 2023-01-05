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
 * TopBottomFilter JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TopBottomFilterJsonUnmarshaller implements Unmarshaller<TopBottomFilter, JsonUnmarshallerContext> {

    public TopBottomFilter unmarshall(JsonUnmarshallerContext context) throws Exception {
        TopBottomFilter topBottomFilter = new TopBottomFilter();

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
                    topBottomFilter.setFilterId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Column", targetDepth)) {
                    context.nextToken();
                    topBottomFilter.setColumn(ColumnIdentifierJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Limit", targetDepth)) {
                    context.nextToken();
                    topBottomFilter.setLimit(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("AggregationSortConfigurations", targetDepth)) {
                    context.nextToken();
                    topBottomFilter.setAggregationSortConfigurations(new ListUnmarshaller<AggregationSortConfiguration>(
                            AggregationSortConfigurationJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("TimeGranularity", targetDepth)) {
                    context.nextToken();
                    topBottomFilter.setTimeGranularity(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ParameterName", targetDepth)) {
                    context.nextToken();
                    topBottomFilter.setParameterName(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return topBottomFilter;
    }

    private static TopBottomFilterJsonUnmarshaller instance;

    public static TopBottomFilterJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new TopBottomFilterJsonUnmarshaller();
        return instance;
    }
}
