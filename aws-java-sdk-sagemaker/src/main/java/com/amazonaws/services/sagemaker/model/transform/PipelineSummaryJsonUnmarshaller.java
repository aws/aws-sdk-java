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
 * PipelineSummary JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PipelineSummaryJsonUnmarshaller implements Unmarshaller<PipelineSummary, JsonUnmarshallerContext> {

    public PipelineSummary unmarshall(JsonUnmarshallerContext context) throws Exception {
        PipelineSummary pipelineSummary = new PipelineSummary();

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
                    pipelineSummary.setPipelineArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PipelineName", targetDepth)) {
                    context.nextToken();
                    pipelineSummary.setPipelineName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PipelineDisplayName", targetDepth)) {
                    context.nextToken();
                    pipelineSummary.setPipelineDisplayName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PipelineDescription", targetDepth)) {
                    context.nextToken();
                    pipelineSummary.setPipelineDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("RoleArn", targetDepth)) {
                    context.nextToken();
                    pipelineSummary.setRoleArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreationTime", targetDepth)) {
                    context.nextToken();
                    pipelineSummary.setCreationTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("LastModifiedTime", targetDepth)) {
                    context.nextToken();
                    pipelineSummary.setLastModifiedTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("LastExecutionTime", targetDepth)) {
                    context.nextToken();
                    pipelineSummary.setLastExecutionTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return pipelineSummary;
    }

    private static PipelineSummaryJsonUnmarshaller instance;

    public static PipelineSummaryJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new PipelineSummaryJsonUnmarshaller();
        return instance;
    }
}
