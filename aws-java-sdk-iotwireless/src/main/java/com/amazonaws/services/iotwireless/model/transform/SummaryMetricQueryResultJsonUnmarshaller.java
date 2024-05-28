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
package com.amazonaws.services.iotwireless.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.iotwireless.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * SummaryMetricQueryResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SummaryMetricQueryResultJsonUnmarshaller implements Unmarshaller<SummaryMetricQueryResult, JsonUnmarshallerContext> {

    public SummaryMetricQueryResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        SummaryMetricQueryResult summaryMetricQueryResult = new SummaryMetricQueryResult();

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
                if (context.testExpression("QueryId", targetDepth)) {
                    context.nextToken();
                    summaryMetricQueryResult.setQueryId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("QueryStatus", targetDepth)) {
                    context.nextToken();
                    summaryMetricQueryResult.setQueryStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Error", targetDepth)) {
                    context.nextToken();
                    summaryMetricQueryResult.setError(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("MetricName", targetDepth)) {
                    context.nextToken();
                    summaryMetricQueryResult.setMetricName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Dimensions", targetDepth)) {
                    context.nextToken();
                    summaryMetricQueryResult.setDimensions(new ListUnmarshaller<Dimension>(DimensionJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("AggregationPeriod", targetDepth)) {
                    context.nextToken();
                    summaryMetricQueryResult.setAggregationPeriod(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("StartTimestamp", targetDepth)) {
                    context.nextToken();
                    summaryMetricQueryResult.setStartTimestamp(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("EndTimestamp", targetDepth)) {
                    context.nextToken();
                    summaryMetricQueryResult.setEndTimestamp(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("Timestamps", targetDepth)) {
                    context.nextToken();
                    summaryMetricQueryResult.setTimestamps(new ListUnmarshaller<java.util.Date>(DateJsonUnmarshallerFactory.getInstance("unixTimestamp"))

                    .unmarshall(context));
                }
                if (context.testExpression("Values", targetDepth)) {
                    context.nextToken();
                    summaryMetricQueryResult.setValues(new ListUnmarshaller<MetricQueryValue>(MetricQueryValueJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("Unit", targetDepth)) {
                    context.nextToken();
                    summaryMetricQueryResult.setUnit(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return summaryMetricQueryResult;
    }

    private static SummaryMetricQueryResultJsonUnmarshaller instance;

    public static SummaryMetricQueryResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new SummaryMetricQueryResultJsonUnmarshaller();
        return instance;
    }
}
