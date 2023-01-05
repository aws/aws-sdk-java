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
package com.amazonaws.services.pipes.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.pipes.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * PipeTargetParameters JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PipeTargetParametersJsonUnmarshaller implements Unmarshaller<PipeTargetParameters, JsonUnmarshallerContext> {

    public PipeTargetParameters unmarshall(JsonUnmarshallerContext context) throws Exception {
        PipeTargetParameters pipeTargetParameters = new PipeTargetParameters();

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
                if (context.testExpression("BatchJobParameters", targetDepth)) {
                    context.nextToken();
                    pipeTargetParameters.setBatchJobParameters(PipeTargetBatchJobParametersJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("CloudWatchLogsParameters", targetDepth)) {
                    context.nextToken();
                    pipeTargetParameters.setCloudWatchLogsParameters(PipeTargetCloudWatchLogsParametersJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("EcsTaskParameters", targetDepth)) {
                    context.nextToken();
                    pipeTargetParameters.setEcsTaskParameters(PipeTargetEcsTaskParametersJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("EventBridgeEventBusParameters", targetDepth)) {
                    context.nextToken();
                    pipeTargetParameters.setEventBridgeEventBusParameters(PipeTargetEventBridgeEventBusParametersJsonUnmarshaller.getInstance().unmarshall(
                            context));
                }
                if (context.testExpression("HttpParameters", targetDepth)) {
                    context.nextToken();
                    pipeTargetParameters.setHttpParameters(PipeTargetHttpParametersJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("InputTemplate", targetDepth)) {
                    context.nextToken();
                    pipeTargetParameters.setInputTemplate(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("KinesisStreamParameters", targetDepth)) {
                    context.nextToken();
                    pipeTargetParameters.setKinesisStreamParameters(PipeTargetKinesisStreamParametersJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("LambdaFunctionParameters", targetDepth)) {
                    context.nextToken();
                    pipeTargetParameters.setLambdaFunctionParameters(PipeTargetLambdaFunctionParametersJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("RedshiftDataParameters", targetDepth)) {
                    context.nextToken();
                    pipeTargetParameters.setRedshiftDataParameters(PipeTargetRedshiftDataParametersJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("SageMakerPipelineParameters", targetDepth)) {
                    context.nextToken();
                    pipeTargetParameters
                            .setSageMakerPipelineParameters(PipeTargetSageMakerPipelineParametersJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("SqsQueueParameters", targetDepth)) {
                    context.nextToken();
                    pipeTargetParameters.setSqsQueueParameters(PipeTargetSqsQueueParametersJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("StepFunctionStateMachineParameters", targetDepth)) {
                    context.nextToken();
                    pipeTargetParameters.setStepFunctionStateMachineParameters(PipeTargetStateMachineParametersJsonUnmarshaller.getInstance().unmarshall(
                            context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return pipeTargetParameters;
    }

    private static PipeTargetParametersJsonUnmarshaller instance;

    public static PipeTargetParametersJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new PipeTargetParametersJsonUnmarshaller();
        return instance;
    }
}
