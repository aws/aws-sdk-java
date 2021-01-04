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
package com.amazonaws.services.sagemaker.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.sagemaker.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * ProcessingJob JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ProcessingJobJsonUnmarshaller implements Unmarshaller<ProcessingJob, JsonUnmarshallerContext> {

    public ProcessingJob unmarshall(JsonUnmarshallerContext context) throws Exception {
        ProcessingJob processingJob = new ProcessingJob();

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
                if (context.testExpression("ProcessingInputs", targetDepth)) {
                    context.nextToken();
                    processingJob.setProcessingInputs(new ListUnmarshaller<ProcessingInput>(ProcessingInputJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("ProcessingOutputConfig", targetDepth)) {
                    context.nextToken();
                    processingJob.setProcessingOutputConfig(ProcessingOutputConfigJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ProcessingJobName", targetDepth)) {
                    context.nextToken();
                    processingJob.setProcessingJobName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ProcessingResources", targetDepth)) {
                    context.nextToken();
                    processingJob.setProcessingResources(ProcessingResourcesJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("StoppingCondition", targetDepth)) {
                    context.nextToken();
                    processingJob.setStoppingCondition(ProcessingStoppingConditionJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("AppSpecification", targetDepth)) {
                    context.nextToken();
                    processingJob.setAppSpecification(AppSpecificationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Environment", targetDepth)) {
                    context.nextToken();
                    processingJob.setEnvironment(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context
                            .getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("NetworkConfig", targetDepth)) {
                    context.nextToken();
                    processingJob.setNetworkConfig(NetworkConfigJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("RoleArn", targetDepth)) {
                    context.nextToken();
                    processingJob.setRoleArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ExperimentConfig", targetDepth)) {
                    context.nextToken();
                    processingJob.setExperimentConfig(ExperimentConfigJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ProcessingJobArn", targetDepth)) {
                    context.nextToken();
                    processingJob.setProcessingJobArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ProcessingJobStatus", targetDepth)) {
                    context.nextToken();
                    processingJob.setProcessingJobStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ExitMessage", targetDepth)) {
                    context.nextToken();
                    processingJob.setExitMessage(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("FailureReason", targetDepth)) {
                    context.nextToken();
                    processingJob.setFailureReason(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ProcessingEndTime", targetDepth)) {
                    context.nextToken();
                    processingJob.setProcessingEndTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("ProcessingStartTime", targetDepth)) {
                    context.nextToken();
                    processingJob.setProcessingStartTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("LastModifiedTime", targetDepth)) {
                    context.nextToken();
                    processingJob.setLastModifiedTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("CreationTime", targetDepth)) {
                    context.nextToken();
                    processingJob.setCreationTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("MonitoringScheduleArn", targetDepth)) {
                    context.nextToken();
                    processingJob.setMonitoringScheduleArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("AutoMLJobArn", targetDepth)) {
                    context.nextToken();
                    processingJob.setAutoMLJobArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("TrainingJobArn", targetDepth)) {
                    context.nextToken();
                    processingJob.setTrainingJobArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Tags", targetDepth)) {
                    context.nextToken();
                    processingJob.setTags(new ListUnmarshaller<Tag>(TagJsonUnmarshaller.getInstance())

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

        return processingJob;
    }

    private static ProcessingJobJsonUnmarshaller instance;

    public static ProcessingJobJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ProcessingJobJsonUnmarshaller();
        return instance;
    }
}
