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
package com.amazonaws.services.iot.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.iot.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * DescribeFleetMetricResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeFleetMetricResultJsonUnmarshaller implements Unmarshaller<DescribeFleetMetricResult, JsonUnmarshallerContext> {

    public DescribeFleetMetricResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribeFleetMetricResult describeFleetMetricResult = new DescribeFleetMetricResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return describeFleetMetricResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("metricName", targetDepth)) {
                    context.nextToken();
                    describeFleetMetricResult.setMetricName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("queryString", targetDepth)) {
                    context.nextToken();
                    describeFleetMetricResult.setQueryString(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("aggregationType", targetDepth)) {
                    context.nextToken();
                    describeFleetMetricResult.setAggregationType(AggregationTypeJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("period", targetDepth)) {
                    context.nextToken();
                    describeFleetMetricResult.setPeriod(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("aggregationField", targetDepth)) {
                    context.nextToken();
                    describeFleetMetricResult.setAggregationField(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("description", targetDepth)) {
                    context.nextToken();
                    describeFleetMetricResult.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("queryVersion", targetDepth)) {
                    context.nextToken();
                    describeFleetMetricResult.setQueryVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("indexName", targetDepth)) {
                    context.nextToken();
                    describeFleetMetricResult.setIndexName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("creationDate", targetDepth)) {
                    context.nextToken();
                    describeFleetMetricResult.setCreationDate(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("lastModifiedDate", targetDepth)) {
                    context.nextToken();
                    describeFleetMetricResult.setLastModifiedDate(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("unit", targetDepth)) {
                    context.nextToken();
                    describeFleetMetricResult.setUnit(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("version", targetDepth)) {
                    context.nextToken();
                    describeFleetMetricResult.setVersion(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("metricArn", targetDepth)) {
                    context.nextToken();
                    describeFleetMetricResult.setMetricArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return describeFleetMetricResult;
    }

    private static DescribeFleetMetricResultJsonUnmarshaller instance;

    public static DescribeFleetMetricResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeFleetMetricResultJsonUnmarshaller();
        return instance;
    }
}
