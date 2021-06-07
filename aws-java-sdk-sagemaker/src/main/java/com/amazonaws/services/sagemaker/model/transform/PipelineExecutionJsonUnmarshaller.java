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
 * PipelineExecution JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PipelineExecutionJsonUnmarshaller implements Unmarshaller<PipelineExecution, JsonUnmarshallerContext> {

    public PipelineExecution unmarshall(JsonUnmarshallerContext context) throws Exception {
        PipelineExecution pipelineExecution = new PipelineExecution();

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
                if (context.testExpression("PipelineArn", targetDepth)) {
                    context.nextToken();
                    pipelineExecution.setPipelineArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PipelineExecutionArn", targetDepth)) {
                    context.nextToken();
                    pipelineExecution.setPipelineExecutionArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PipelineExecutionDisplayName", targetDepth)) {
                    context.nextToken();
                    pipelineExecution.setPipelineExecutionDisplayName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PipelineExecutionStatus", targetDepth)) {
                    context.nextToken();
                    pipelineExecution.setPipelineExecutionStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PipelineExecutionDescription", targetDepth)) {
                    context.nextToken();
                    pipelineExecution.setPipelineExecutionDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PipelineExperimentConfig", targetDepth)) {
                    context.nextToken();
                    pipelineExecution.setPipelineExperimentConfig(PipelineExperimentConfigJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("FailureReason", targetDepth)) {
                    context.nextToken();
                    pipelineExecution.setFailureReason(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreationTime", targetDepth)) {
                    context.nextToken();
                    pipelineExecution.setCreationTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("LastModifiedTime", targetDepth)) {
                    context.nextToken();
                    pipelineExecution.setLastModifiedTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("CreatedBy", targetDepth)) {
                    context.nextToken();
                    pipelineExecution.setCreatedBy(UserContextJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("LastModifiedBy", targetDepth)) {
                    context.nextToken();
                    pipelineExecution.setLastModifiedBy(UserContextJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("PipelineParameters", targetDepth)) {
                    context.nextToken();
                    pipelineExecution.setPipelineParameters(new ListUnmarshaller<Parameter>(ParameterJsonUnmarshaller.getInstance())

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

        return pipelineExecution;
    }

    private static PipelineExecutionJsonUnmarshaller instance;

    public static PipelineExecutionJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new PipelineExecutionJsonUnmarshaller();
        return instance;
    }
}
