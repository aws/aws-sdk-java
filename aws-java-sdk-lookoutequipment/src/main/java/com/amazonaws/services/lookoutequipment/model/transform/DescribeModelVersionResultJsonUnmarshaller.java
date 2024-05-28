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
package com.amazonaws.services.lookoutequipment.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.lookoutequipment.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * DescribeModelVersionResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeModelVersionResultJsonUnmarshaller implements Unmarshaller<DescribeModelVersionResult, JsonUnmarshallerContext> {

    public DescribeModelVersionResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribeModelVersionResult describeModelVersionResult = new DescribeModelVersionResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return describeModelVersionResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("ModelName", targetDepth)) {
                    context.nextToken();
                    describeModelVersionResult.setModelName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ModelArn", targetDepth)) {
                    context.nextToken();
                    describeModelVersionResult.setModelArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ModelVersion", targetDepth)) {
                    context.nextToken();
                    describeModelVersionResult.setModelVersion(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("ModelVersionArn", targetDepth)) {
                    context.nextToken();
                    describeModelVersionResult.setModelVersionArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    context.nextToken();
                    describeModelVersionResult.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SourceType", targetDepth)) {
                    context.nextToken();
                    describeModelVersionResult.setSourceType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DatasetName", targetDepth)) {
                    context.nextToken();
                    describeModelVersionResult.setDatasetName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DatasetArn", targetDepth)) {
                    context.nextToken();
                    describeModelVersionResult.setDatasetArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Schema", targetDepth)) {
                    context.nextToken();
                    describeModelVersionResult.setSchema(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LabelsInputConfiguration", targetDepth)) {
                    context.nextToken();
                    describeModelVersionResult.setLabelsInputConfiguration(LabelsInputConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("TrainingDataStartTime", targetDepth)) {
                    context.nextToken();
                    describeModelVersionResult.setTrainingDataStartTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("TrainingDataEndTime", targetDepth)) {
                    context.nextToken();
                    describeModelVersionResult.setTrainingDataEndTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("EvaluationDataStartTime", targetDepth)) {
                    context.nextToken();
                    describeModelVersionResult.setEvaluationDataStartTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("EvaluationDataEndTime", targetDepth)) {
                    context.nextToken();
                    describeModelVersionResult.setEvaluationDataEndTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("RoleArn", targetDepth)) {
                    context.nextToken();
                    describeModelVersionResult.setRoleArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DataPreProcessingConfiguration", targetDepth)) {
                    context.nextToken();
                    describeModelVersionResult.setDataPreProcessingConfiguration(DataPreProcessingConfigurationJsonUnmarshaller.getInstance().unmarshall(
                            context));
                }
                if (context.testExpression("TrainingExecutionStartTime", targetDepth)) {
                    context.nextToken();
                    describeModelVersionResult.setTrainingExecutionStartTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("TrainingExecutionEndTime", targetDepth)) {
                    context.nextToken();
                    describeModelVersionResult.setTrainingExecutionEndTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("FailedReason", targetDepth)) {
                    context.nextToken();
                    describeModelVersionResult.setFailedReason(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ModelMetrics", targetDepth)) {
                    context.nextToken();
                    describeModelVersionResult.setModelMetrics(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LastUpdatedTime", targetDepth)) {
                    context.nextToken();
                    describeModelVersionResult.setLastUpdatedTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("CreatedAt", targetDepth)) {
                    context.nextToken();
                    describeModelVersionResult.setCreatedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("ServerSideKmsKeyId", targetDepth)) {
                    context.nextToken();
                    describeModelVersionResult.setServerSideKmsKeyId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("OffCondition", targetDepth)) {
                    context.nextToken();
                    describeModelVersionResult.setOffCondition(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SourceModelVersionArn", targetDepth)) {
                    context.nextToken();
                    describeModelVersionResult.setSourceModelVersionArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ImportJobStartTime", targetDepth)) {
                    context.nextToken();
                    describeModelVersionResult.setImportJobStartTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("ImportJobEndTime", targetDepth)) {
                    context.nextToken();
                    describeModelVersionResult.setImportJobEndTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("ImportedDataSizeInBytes", targetDepth)) {
                    context.nextToken();
                    describeModelVersionResult.setImportedDataSizeInBytes(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("PriorModelMetrics", targetDepth)) {
                    context.nextToken();
                    describeModelVersionResult.setPriorModelMetrics(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("RetrainingAvailableDataInDays", targetDepth)) {
                    context.nextToken();
                    describeModelVersionResult.setRetrainingAvailableDataInDays(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("AutoPromotionResult", targetDepth)) {
                    context.nextToken();
                    describeModelVersionResult.setAutoPromotionResult(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("AutoPromotionResultReason", targetDepth)) {
                    context.nextToken();
                    describeModelVersionResult.setAutoPromotionResultReason(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ModelDiagnosticsOutputConfiguration", targetDepth)) {
                    context.nextToken();
                    describeModelVersionResult.setModelDiagnosticsOutputConfiguration(ModelDiagnosticsOutputConfigurationJsonUnmarshaller.getInstance()
                            .unmarshall(context));
                }
                if (context.testExpression("ModelDiagnosticsResultsObject", targetDepth)) {
                    context.nextToken();
                    describeModelVersionResult.setModelDiagnosticsResultsObject(S3ObjectJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ModelQuality", targetDepth)) {
                    context.nextToken();
                    describeModelVersionResult.setModelQuality(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return describeModelVersionResult;
    }

    private static DescribeModelVersionResultJsonUnmarshaller instance;

    public static DescribeModelVersionResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeModelVersionResultJsonUnmarshaller();
        return instance;
    }
}
