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
 * PipeTargetBatchJobParameters JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PipeTargetBatchJobParametersJsonUnmarshaller implements Unmarshaller<PipeTargetBatchJobParameters, JsonUnmarshallerContext> {

    public PipeTargetBatchJobParameters unmarshall(JsonUnmarshallerContext context) throws Exception {
        PipeTargetBatchJobParameters pipeTargetBatchJobParameters = new PipeTargetBatchJobParameters();

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
                if (context.testExpression("ArrayProperties", targetDepth)) {
                    context.nextToken();
                    pipeTargetBatchJobParameters.setArrayProperties(BatchArrayPropertiesJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ContainerOverrides", targetDepth)) {
                    context.nextToken();
                    pipeTargetBatchJobParameters.setContainerOverrides(BatchContainerOverridesJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("DependsOn", targetDepth)) {
                    context.nextToken();
                    pipeTargetBatchJobParameters.setDependsOn(new ListUnmarshaller<BatchJobDependency>(BatchJobDependencyJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("JobDefinition", targetDepth)) {
                    context.nextToken();
                    pipeTargetBatchJobParameters.setJobDefinition(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("JobName", targetDepth)) {
                    context.nextToken();
                    pipeTargetBatchJobParameters.setJobName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Parameters", targetDepth)) {
                    context.nextToken();
                    pipeTargetBatchJobParameters.setParameters(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context
                            .getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("RetryStrategy", targetDepth)) {
                    context.nextToken();
                    pipeTargetBatchJobParameters.setRetryStrategy(BatchRetryStrategyJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return pipeTargetBatchJobParameters;
    }

    private static PipeTargetBatchJobParametersJsonUnmarshaller instance;

    public static PipeTargetBatchJobParametersJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new PipeTargetBatchJobParametersJsonUnmarshaller();
        return instance;
    }
}
