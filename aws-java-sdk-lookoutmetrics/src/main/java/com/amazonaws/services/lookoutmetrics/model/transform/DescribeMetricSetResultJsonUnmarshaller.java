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
package com.amazonaws.services.lookoutmetrics.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.lookoutmetrics.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * DescribeMetricSetResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeMetricSetResultJsonUnmarshaller implements Unmarshaller<DescribeMetricSetResult, JsonUnmarshallerContext> {

    public DescribeMetricSetResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribeMetricSetResult describeMetricSetResult = new DescribeMetricSetResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return describeMetricSetResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("MetricSetArn", targetDepth)) {
                    context.nextToken();
                    describeMetricSetResult.setMetricSetArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("AnomalyDetectorArn", targetDepth)) {
                    context.nextToken();
                    describeMetricSetResult.setAnomalyDetectorArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("MetricSetName", targetDepth)) {
                    context.nextToken();
                    describeMetricSetResult.setMetricSetName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("MetricSetDescription", targetDepth)) {
                    context.nextToken();
                    describeMetricSetResult.setMetricSetDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreationTime", targetDepth)) {
                    context.nextToken();
                    describeMetricSetResult.setCreationTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("LastModificationTime", targetDepth)) {
                    context.nextToken();
                    describeMetricSetResult.setLastModificationTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("Offset", targetDepth)) {
                    context.nextToken();
                    describeMetricSetResult.setOffset(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("MetricList", targetDepth)) {
                    context.nextToken();
                    describeMetricSetResult.setMetricList(new ListUnmarshaller<Metric>(MetricJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("TimestampColumn", targetDepth)) {
                    context.nextToken();
                    describeMetricSetResult.setTimestampColumn(TimestampColumnJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("DimensionList", targetDepth)) {
                    context.nextToken();
                    describeMetricSetResult.setDimensionList(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("MetricSetFrequency", targetDepth)) {
                    context.nextToken();
                    describeMetricSetResult.setMetricSetFrequency(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Timezone", targetDepth)) {
                    context.nextToken();
                    describeMetricSetResult.setTimezone(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("MetricSource", targetDepth)) {
                    context.nextToken();
                    describeMetricSetResult.setMetricSource(MetricSourceJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return describeMetricSetResult;
    }

    private static DescribeMetricSetResultJsonUnmarshaller instance;

    public static DescribeMetricSetResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeMetricSetResultJsonUnmarshaller();
        return instance;
    }
}
