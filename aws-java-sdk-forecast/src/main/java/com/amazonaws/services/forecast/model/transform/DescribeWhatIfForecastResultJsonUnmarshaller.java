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
package com.amazonaws.services.forecast.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.forecast.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * DescribeWhatIfForecastResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeWhatIfForecastResultJsonUnmarshaller implements Unmarshaller<DescribeWhatIfForecastResult, JsonUnmarshallerContext> {

    public DescribeWhatIfForecastResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribeWhatIfForecastResult describeWhatIfForecastResult = new DescribeWhatIfForecastResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return describeWhatIfForecastResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("WhatIfForecastName", targetDepth)) {
                    context.nextToken();
                    describeWhatIfForecastResult.setWhatIfForecastName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("WhatIfForecastArn", targetDepth)) {
                    context.nextToken();
                    describeWhatIfForecastResult.setWhatIfForecastArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("WhatIfAnalysisArn", targetDepth)) {
                    context.nextToken();
                    describeWhatIfForecastResult.setWhatIfAnalysisArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EstimatedTimeRemainingInMinutes", targetDepth)) {
                    context.nextToken();
                    describeWhatIfForecastResult.setEstimatedTimeRemainingInMinutes(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    context.nextToken();
                    describeWhatIfForecastResult.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Message", targetDepth)) {
                    context.nextToken();
                    describeWhatIfForecastResult.setMessage(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreationTime", targetDepth)) {
                    context.nextToken();
                    describeWhatIfForecastResult.setCreationTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("LastModificationTime", targetDepth)) {
                    context.nextToken();
                    describeWhatIfForecastResult.setLastModificationTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("TimeSeriesTransformations", targetDepth)) {
                    context.nextToken();
                    describeWhatIfForecastResult.setTimeSeriesTransformations(new ListUnmarshaller<TimeSeriesTransformation>(
                            TimeSeriesTransformationJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("TimeSeriesReplacementsDataSource", targetDepth)) {
                    context.nextToken();
                    describeWhatIfForecastResult.setTimeSeriesReplacementsDataSource(TimeSeriesReplacementsDataSourceJsonUnmarshaller.getInstance().unmarshall(
                            context));
                }
                if (context.testExpression("ForecastTypes", targetDepth)) {
                    context.nextToken();
                    describeWhatIfForecastResult.setForecastTypes(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return describeWhatIfForecastResult;
    }

    private static DescribeWhatIfForecastResultJsonUnmarshaller instance;

    public static DescribeWhatIfForecastResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeWhatIfForecastResultJsonUnmarshaller();
        return instance;
    }
}
