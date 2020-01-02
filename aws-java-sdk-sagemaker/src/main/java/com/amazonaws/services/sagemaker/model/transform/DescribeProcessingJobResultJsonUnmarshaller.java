/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * DescribeProcessingJobResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeProcessingJobResultJsonUnmarshaller implements Unmarshaller<DescribeProcessingJobResult, JsonUnmarshallerContext> {

    public DescribeProcessingJobResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribeProcessingJobResult describeProcessingJobResult = new DescribeProcessingJobResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return describeProcessingJobResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("ProcessingInputs", targetDepth)) {
                    context.nextToken();
                    describeProcessingJobResult.setProcessingInputs(new ListUnmarshaller<ProcessingInput>(ProcessingInputJsonUnmarshaller.getInstance())
                            .unmarshall(context));
                }
                if (context.testExpression("ProcessingOutputConfig", targetDepth)) {
                    context.nextToken();
                    describeProcessingJobResult.setProcessingOutputConfig(ProcessingOutputConfigJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ProcessingJobName", targetDepth)) {
                    context.nextToken();
                    describeProcessingJobResult.setProcessingJobName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ProcessingResources", targetDepth)) {
                    context.nextToken();
                    describeProcessingJobResult.setProcessingResources(ProcessingResourcesJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("StoppingCondition", targetDepth)) {
                    context.nextToken();
                    describeProcessingJobResult.setStoppingCondition(ProcessingStoppingConditionJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("AppSpecification", targetDepth)) {
                    context.nextToken();
                    describeProcessingJobResult.setAppSpecification(AppSpecificationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Environment", targetDepth)) {
                    context.nextToken();
                    describeProcessingJobResult.setEnvironment(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context
                            .getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("NetworkConfig", targetDepth)) {
                    context.nextToken();
                    describeProcessingJobResult.setNetworkConfig(NetworkConfigJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("RoleArn", targetDepth)) {
                    context.nextToken();
                    describeProcessingJobResult.setRoleArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ExperimentConfig", targetDepth)) {
                    context.nextToken();
                    describeProcessingJobResult.setExperimentConfig(ExperimentConfigJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ProcessingJobArn", targetDepth)) {
                    context.nextToken();
                    describeProcessingJobResult.setProcessingJobArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ProcessingJobStatus", targetDepth)) {
                    context.nextToken();
                    describeProcessingJobResult.setProcessingJobStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ExitMessage", targetDepth)) {
                    context.nextToken();
                    describeProcessingJobResult.setExitMessage(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("FailureReason", targetDepth)) {
                    context.nextToken();
                    describeProcessingJobResult.setFailureReason(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ProcessingEndTime", targetDepth)) {
                    context.nextToken();
                    describeProcessingJobResult.setProcessingEndTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("ProcessingStartTime", targetDepth)) {
                    context.nextToken();
                    describeProcessingJobResult.setProcessingStartTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("LastModifiedTime", targetDepth)) {
                    context.nextToken();
                    describeProcessingJobResult.setLastModifiedTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("CreationTime", targetDepth)) {
                    context.nextToken();
                    describeProcessingJobResult.setCreationTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("MonitoringScheduleArn", targetDepth)) {
                    context.nextToken();
                    describeProcessingJobResult.setMonitoringScheduleArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("AutoMLJobArn", targetDepth)) {
                    context.nextToken();
                    describeProcessingJobResult.setAutoMLJobArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("TrainingJobArn", targetDepth)) {
                    context.nextToken();
                    describeProcessingJobResult.setTrainingJobArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return describeProcessingJobResult;
    }

    private static DescribeProcessingJobResultJsonUnmarshaller instance;

    public static DescribeProcessingJobResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeProcessingJobResultJsonUnmarshaller();
        return instance;
    }
}
