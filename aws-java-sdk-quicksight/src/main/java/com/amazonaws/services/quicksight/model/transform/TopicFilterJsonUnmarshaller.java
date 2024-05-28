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
 * TopicFilter JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TopicFilterJsonUnmarshaller implements Unmarshaller<TopicFilter, JsonUnmarshallerContext> {

    public TopicFilter unmarshall(JsonUnmarshallerContext context) throws Exception {
        TopicFilter topicFilter = new TopicFilter();

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
                if (context.testExpression("FilterDescription", targetDepth)) {
                    context.nextToken();
                    topicFilter.setFilterDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("FilterClass", targetDepth)) {
                    context.nextToken();
                    topicFilter.setFilterClass(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("FilterName", targetDepth)) {
                    context.nextToken();
                    topicFilter.setFilterName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("FilterSynonyms", targetDepth)) {
                    context.nextToken();
                    topicFilter.setFilterSynonyms(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("OperandFieldName", targetDepth)) {
                    context.nextToken();
                    topicFilter.setOperandFieldName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("FilterType", targetDepth)) {
                    context.nextToken();
                    topicFilter.setFilterType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CategoryFilter", targetDepth)) {
                    context.nextToken();
                    topicFilter.setCategoryFilter(TopicCategoryFilterJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("NumericEqualityFilter", targetDepth)) {
                    context.nextToken();
                    topicFilter.setNumericEqualityFilter(TopicNumericEqualityFilterJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("NumericRangeFilter", targetDepth)) {
                    context.nextToken();
                    topicFilter.setNumericRangeFilter(TopicNumericRangeFilterJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("DateRangeFilter", targetDepth)) {
                    context.nextToken();
                    topicFilter.setDateRangeFilter(TopicDateRangeFilterJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("RelativeDateFilter", targetDepth)) {
                    context.nextToken();
                    topicFilter.setRelativeDateFilter(TopicRelativeDateFilterJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return topicFilter;
    }

    private static TopicFilterJsonUnmarshaller instance;

    public static TopicFilterJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new TopicFilterJsonUnmarshaller();
        return instance;
    }
}
