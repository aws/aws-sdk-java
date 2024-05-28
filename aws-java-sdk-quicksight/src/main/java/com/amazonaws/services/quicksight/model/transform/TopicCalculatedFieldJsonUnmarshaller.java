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
 * TopicCalculatedField JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TopicCalculatedFieldJsonUnmarshaller implements Unmarshaller<TopicCalculatedField, JsonUnmarshallerContext> {

    public TopicCalculatedField unmarshall(JsonUnmarshallerContext context) throws Exception {
        TopicCalculatedField topicCalculatedField = new TopicCalculatedField();

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
                if (context.testExpression("CalculatedFieldName", targetDepth)) {
                    context.nextToken();
                    topicCalculatedField.setCalculatedFieldName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CalculatedFieldDescription", targetDepth)) {
                    context.nextToken();
                    topicCalculatedField.setCalculatedFieldDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Expression", targetDepth)) {
                    context.nextToken();
                    topicCalculatedField.setExpression(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CalculatedFieldSynonyms", targetDepth)) {
                    context.nextToken();
                    topicCalculatedField.setCalculatedFieldSynonyms(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("IsIncludedInTopic", targetDepth)) {
                    context.nextToken();
                    topicCalculatedField.setIsIncludedInTopic(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("DisableIndexing", targetDepth)) {
                    context.nextToken();
                    topicCalculatedField.setDisableIndexing(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("ColumnDataRole", targetDepth)) {
                    context.nextToken();
                    topicCalculatedField.setColumnDataRole(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("TimeGranularity", targetDepth)) {
                    context.nextToken();
                    topicCalculatedField.setTimeGranularity(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DefaultFormatting", targetDepth)) {
                    context.nextToken();
                    topicCalculatedField.setDefaultFormatting(DefaultFormattingJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Aggregation", targetDepth)) {
                    context.nextToken();
                    topicCalculatedField.setAggregation(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ComparativeOrder", targetDepth)) {
                    context.nextToken();
                    topicCalculatedField.setComparativeOrder(ComparativeOrderJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("SemanticType", targetDepth)) {
                    context.nextToken();
                    topicCalculatedField.setSemanticType(SemanticTypeJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("AllowedAggregations", targetDepth)) {
                    context.nextToken();
                    topicCalculatedField.setAllowedAggregations(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("NotAllowedAggregations", targetDepth)) {
                    context.nextToken();
                    topicCalculatedField.setNotAllowedAggregations(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("NeverAggregateInFilter", targetDepth)) {
                    context.nextToken();
                    topicCalculatedField.setNeverAggregateInFilter(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("CellValueSynonyms", targetDepth)) {
                    context.nextToken();
                    topicCalculatedField.setCellValueSynonyms(new ListUnmarshaller<CellValueSynonym>(CellValueSynonymJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("NonAdditive", targetDepth)) {
                    context.nextToken();
                    topicCalculatedField.setNonAdditive(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return topicCalculatedField;
    }

    private static TopicCalculatedFieldJsonUnmarshaller instance;

    public static TopicCalculatedFieldJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new TopicCalculatedFieldJsonUnmarshaller();
        return instance;
    }
}
