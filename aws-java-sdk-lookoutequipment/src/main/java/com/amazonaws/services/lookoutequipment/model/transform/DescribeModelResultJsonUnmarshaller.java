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
package com.amazonaws.services.lookoutequipment.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.lookoutequipment.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * DescribeModelResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeModelResultJsonUnmarshaller implements Unmarshaller<DescribeModelResult, JsonUnmarshallerContext> {

    public DescribeModelResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribeModelResult describeModelResult = new DescribeModelResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return describeModelResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("ModelName", targetDepth)) {
                    context.nextToken();
                    describeModelResult.setModelName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ModelArn", targetDepth)) {
                    context.nextToken();
                    describeModelResult.setModelArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DatasetName", targetDepth)) {
                    context.nextToken();
                    describeModelResult.setDatasetName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DatasetArn", targetDepth)) {
                    context.nextToken();
                    describeModelResult.setDatasetArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Schema", targetDepth)) {
                    context.nextToken();
                    describeModelResult.setSchema(context.getUnmarshaller(String.class, JsonUnmarshallerContext.UnmarshallerType.JSON_VALUE)
                            .unmarshall(context));
                }
                if (context.testExpression("LabelsInputConfiguration", targetDepth)) {
                    context.nextToken();
                    describeModelResult.setLabelsInputConfiguration(LabelsInputConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("TrainingDataStartTime", targetDepth)) {
                    context.nextToken();
                    describeModelResult.setTrainingDataStartTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("TrainingDataEndTime", targetDepth)) {
                    context.nextToken();
                    describeModelResult.setTrainingDataEndTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("EvaluationDataStartTime", targetDepth)) {
                    context.nextToken();
                    describeModelResult.setEvaluationDataStartTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("EvaluationDataEndTime", targetDepth)) {
                    context.nextToken();
                    describeModelResult.setEvaluationDataEndTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("RoleArn", targetDepth)) {
                    context.nextToken();
                    describeModelResult.setRoleArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DataPreProcessingConfiguration", targetDepth)) {
                    context.nextToken();
                    describeModelResult.setDataPreProcessingConfiguration(DataPreProcessingConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    context.nextToken();
                    describeModelResult.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("TrainingExecutionStartTime", targetDepth)) {
                    context.nextToken();
                    describeModelResult.setTrainingExecutionStartTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("TrainingExecutionEndTime", targetDepth)) {
                    context.nextToken();
                    describeModelResult.setTrainingExecutionEndTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("FailedReason", targetDepth)) {
                    context.nextToken();
                    describeModelResult.setFailedReason(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ModelMetrics", targetDepth)) {
                    context.nextToken();
                    describeModelResult.setModelMetrics(context.getUnmarshaller(String.class, JsonUnmarshallerContext.UnmarshallerType.JSON_VALUE).unmarshall(
                            context));
                }
                if (context.testExpression("LastUpdatedTime", targetDepth)) {
                    context.nextToken();
                    describeModelResult.setLastUpdatedTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("CreatedAt", targetDepth)) {
                    context.nextToken();
                    describeModelResult.setCreatedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("ServerSideKmsKeyId", targetDepth)) {
                    context.nextToken();
                    describeModelResult.setServerSideKmsKeyId(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return describeModelResult;
    }

    private static DescribeModelResultJsonUnmarshaller instance;

    public static DescribeModelResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeModelResultJsonUnmarshaller();
        return instance;
    }
}
