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
 * DescribeAutoPredictorResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeAutoPredictorResultJsonUnmarshaller implements Unmarshaller<DescribeAutoPredictorResult, JsonUnmarshallerContext> {

    public DescribeAutoPredictorResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribeAutoPredictorResult describeAutoPredictorResult = new DescribeAutoPredictorResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return describeAutoPredictorResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("PredictorArn", targetDepth)) {
                    context.nextToken();
                    describeAutoPredictorResult.setPredictorArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PredictorName", targetDepth)) {
                    context.nextToken();
                    describeAutoPredictorResult.setPredictorName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ForecastHorizon", targetDepth)) {
                    context.nextToken();
                    describeAutoPredictorResult.setForecastHorizon(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("ForecastTypes", targetDepth)) {
                    context.nextToken();
                    describeAutoPredictorResult.setForecastTypes(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("ForecastFrequency", targetDepth)) {
                    context.nextToken();
                    describeAutoPredictorResult.setForecastFrequency(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ForecastDimensions", targetDepth)) {
                    context.nextToken();
                    describeAutoPredictorResult.setForecastDimensions(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("DatasetImportJobArns", targetDepth)) {
                    context.nextToken();
                    describeAutoPredictorResult.setDatasetImportJobArns(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("DataConfig", targetDepth)) {
                    context.nextToken();
                    describeAutoPredictorResult.setDataConfig(DataConfigJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("EncryptionConfig", targetDepth)) {
                    context.nextToken();
                    describeAutoPredictorResult.setEncryptionConfig(EncryptionConfigJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ReferencePredictorSummary", targetDepth)) {
                    context.nextToken();
                    describeAutoPredictorResult.setReferencePredictorSummary(ReferencePredictorSummaryJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("EstimatedTimeRemainingInMinutes", targetDepth)) {
                    context.nextToken();
                    describeAutoPredictorResult.setEstimatedTimeRemainingInMinutes(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    context.nextToken();
                    describeAutoPredictorResult.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Message", targetDepth)) {
                    context.nextToken();
                    describeAutoPredictorResult.setMessage(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreationTime", targetDepth)) {
                    context.nextToken();
                    describeAutoPredictorResult.setCreationTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("LastModificationTime", targetDepth)) {
                    context.nextToken();
                    describeAutoPredictorResult.setLastModificationTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("OptimizationMetric", targetDepth)) {
                    context.nextToken();
                    describeAutoPredictorResult.setOptimizationMetric(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ExplainabilityInfo", targetDepth)) {
                    context.nextToken();
                    describeAutoPredictorResult.setExplainabilityInfo(ExplainabilityInfoJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("MonitorInfo", targetDepth)) {
                    context.nextToken();
                    describeAutoPredictorResult.setMonitorInfo(MonitorInfoJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("TimeAlignmentBoundary", targetDepth)) {
                    context.nextToken();
                    describeAutoPredictorResult.setTimeAlignmentBoundary(TimeAlignmentBoundaryJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return describeAutoPredictorResult;
    }

    private static DescribeAutoPredictorResultJsonUnmarshaller instance;

    public static DescribeAutoPredictorResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeAutoPredictorResultJsonUnmarshaller();
        return instance;
    }
}
