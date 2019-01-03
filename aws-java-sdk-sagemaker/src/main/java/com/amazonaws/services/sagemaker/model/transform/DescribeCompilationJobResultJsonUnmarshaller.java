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
 * DescribeCompilationJobResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeCompilationJobResultJsonUnmarshaller implements Unmarshaller<DescribeCompilationJobResult, JsonUnmarshallerContext> {

    public DescribeCompilationJobResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribeCompilationJobResult describeCompilationJobResult = new DescribeCompilationJobResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return describeCompilationJobResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("CompilationJobName", targetDepth)) {
                    context.nextToken();
                    describeCompilationJobResult.setCompilationJobName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CompilationJobArn", targetDepth)) {
                    context.nextToken();
                    describeCompilationJobResult.setCompilationJobArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CompilationJobStatus", targetDepth)) {
                    context.nextToken();
                    describeCompilationJobResult.setCompilationJobStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CompilationStartTime", targetDepth)) {
                    context.nextToken();
                    describeCompilationJobResult.setCompilationStartTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("CompilationEndTime", targetDepth)) {
                    context.nextToken();
                    describeCompilationJobResult.setCompilationEndTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("StoppingCondition", targetDepth)) {
                    context.nextToken();
                    describeCompilationJobResult.setStoppingCondition(StoppingConditionJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("CreationTime", targetDepth)) {
                    context.nextToken();
                    describeCompilationJobResult.setCreationTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("LastModifiedTime", targetDepth)) {
                    context.nextToken();
                    describeCompilationJobResult.setLastModifiedTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("FailureReason", targetDepth)) {
                    context.nextToken();
                    describeCompilationJobResult.setFailureReason(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ModelArtifacts", targetDepth)) {
                    context.nextToken();
                    describeCompilationJobResult.setModelArtifacts(ModelArtifactsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("RoleArn", targetDepth)) {
                    context.nextToken();
                    describeCompilationJobResult.setRoleArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("InputConfig", targetDepth)) {
                    context.nextToken();
                    describeCompilationJobResult.setInputConfig(InputConfigJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("OutputConfig", targetDepth)) {
                    context.nextToken();
                    describeCompilationJobResult.setOutputConfig(OutputConfigJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return describeCompilationJobResult;
    }

    private static DescribeCompilationJobResultJsonUnmarshaller instance;

    public static DescribeCompilationJobResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeCompilationJobResultJsonUnmarshaller();
        return instance;
    }
}
