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
 * DescribePipelineExecutionResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribePipelineExecutionResultJsonUnmarshaller implements Unmarshaller<DescribePipelineExecutionResult, JsonUnmarshallerContext> {

    public DescribePipelineExecutionResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribePipelineExecutionResult describePipelineExecutionResult = new DescribePipelineExecutionResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return describePipelineExecutionResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("PipelineArn", targetDepth)) {
                    context.nextToken();
                    describePipelineExecutionResult.setPipelineArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PipelineExecutionArn", targetDepth)) {
                    context.nextToken();
                    describePipelineExecutionResult.setPipelineExecutionArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PipelineExecutionDisplayName", targetDepth)) {
                    context.nextToken();
                    describePipelineExecutionResult.setPipelineExecutionDisplayName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PipelineExecutionStatus", targetDepth)) {
                    context.nextToken();
                    describePipelineExecutionResult.setPipelineExecutionStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PipelineExecutionDescription", targetDepth)) {
                    context.nextToken();
                    describePipelineExecutionResult.setPipelineExecutionDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PipelineExperimentConfig", targetDepth)) {
                    context.nextToken();
                    describePipelineExecutionResult.setPipelineExperimentConfig(PipelineExperimentConfigJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("FailureReason", targetDepth)) {
                    context.nextToken();
                    describePipelineExecutionResult.setFailureReason(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreationTime", targetDepth)) {
                    context.nextToken();
                    describePipelineExecutionResult.setCreationTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("LastModifiedTime", targetDepth)) {
                    context.nextToken();
                    describePipelineExecutionResult.setLastModifiedTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("CreatedBy", targetDepth)) {
                    context.nextToken();
                    describePipelineExecutionResult.setCreatedBy(UserContextJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("LastModifiedBy", targetDepth)) {
                    context.nextToken();
                    describePipelineExecutionResult.setLastModifiedBy(UserContextJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return describePipelineExecutionResult;
    }

    private static DescribePipelineExecutionResultJsonUnmarshaller instance;

    public static DescribePipelineExecutionResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribePipelineExecutionResultJsonUnmarshaller();
        return instance;
    }
}
