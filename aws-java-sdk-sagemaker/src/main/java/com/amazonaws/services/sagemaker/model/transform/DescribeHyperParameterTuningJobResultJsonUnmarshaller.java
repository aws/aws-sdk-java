/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.sagemaker.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.sagemaker.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * DescribeHyperParameterTuningJobResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeHyperParameterTuningJobResultJsonUnmarshaller implements Unmarshaller<DescribeHyperParameterTuningJobResult, JsonUnmarshallerContext> {

    public DescribeHyperParameterTuningJobResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribeHyperParameterTuningJobResult describeHyperParameterTuningJobResult = new DescribeHyperParameterTuningJobResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return describeHyperParameterTuningJobResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("HyperParameterTuningJobName", targetDepth)) {
                    context.nextToken();
                    describeHyperParameterTuningJobResult.setHyperParameterTuningJobName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("HyperParameterTuningJobArn", targetDepth)) {
                    context.nextToken();
                    describeHyperParameterTuningJobResult.setHyperParameterTuningJobArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("HyperParameterTuningJobConfig", targetDepth)) {
                    context.nextToken();
                    describeHyperParameterTuningJobResult.setHyperParameterTuningJobConfig(HyperParameterTuningJobConfigJsonUnmarshaller.getInstance()
                            .unmarshall(context));
                }
                if (context.testExpression("TrainingJobDefinition", targetDepth)) {
                    context.nextToken();
                    describeHyperParameterTuningJobResult.setTrainingJobDefinition(HyperParameterTrainingJobDefinitionJsonUnmarshaller.getInstance()
                            .unmarshall(context));
                }
                if (context.testExpression("HyperParameterTuningJobStatus", targetDepth)) {
                    context.nextToken();
                    describeHyperParameterTuningJobResult.setHyperParameterTuningJobStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreationTime", targetDepth)) {
                    context.nextToken();
                    describeHyperParameterTuningJobResult.setCreationTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("HyperParameterTuningEndTime", targetDepth)) {
                    context.nextToken();
                    describeHyperParameterTuningJobResult.setHyperParameterTuningEndTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(
                            context));
                }
                if (context.testExpression("LastModifiedTime", targetDepth)) {
                    context.nextToken();
                    describeHyperParameterTuningJobResult.setLastModifiedTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("TrainingJobStatusCounters", targetDepth)) {
                    context.nextToken();
                    describeHyperParameterTuningJobResult.setTrainingJobStatusCounters(TrainingJobStatusCountersJsonUnmarshaller.getInstance().unmarshall(
                            context));
                }
                if (context.testExpression("ObjectiveStatusCounters", targetDepth)) {
                    context.nextToken();
                    describeHyperParameterTuningJobResult.setObjectiveStatusCounters(ObjectiveStatusCountersJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("BestTrainingJob", targetDepth)) {
                    context.nextToken();
                    describeHyperParameterTuningJobResult
                            .setBestTrainingJob(HyperParameterTrainingJobSummaryJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("OverallBestTrainingJob", targetDepth)) {
                    context.nextToken();
                    describeHyperParameterTuningJobResult.setOverallBestTrainingJob(HyperParameterTrainingJobSummaryJsonUnmarshaller.getInstance().unmarshall(
                            context));
                }
                if (context.testExpression("WarmStartConfig", targetDepth)) {
                    context.nextToken();
                    describeHyperParameterTuningJobResult.setWarmStartConfig(HyperParameterTuningJobWarmStartConfigJsonUnmarshaller.getInstance().unmarshall(
                            context));
                }
                if (context.testExpression("FailureReason", targetDepth)) {
                    context.nextToken();
                    describeHyperParameterTuningJobResult.setFailureReason(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return describeHyperParameterTuningJobResult;
    }

    private static DescribeHyperParameterTuningJobResultJsonUnmarshaller instance;

    public static DescribeHyperParameterTuningJobResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeHyperParameterTuningJobResultJsonUnmarshaller();
        return instance;
    }
}
