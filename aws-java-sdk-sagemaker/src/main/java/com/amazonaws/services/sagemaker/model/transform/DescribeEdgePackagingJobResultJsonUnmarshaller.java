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
 * DescribeEdgePackagingJobResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeEdgePackagingJobResultJsonUnmarshaller implements Unmarshaller<DescribeEdgePackagingJobResult, JsonUnmarshallerContext> {

    public DescribeEdgePackagingJobResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribeEdgePackagingJobResult describeEdgePackagingJobResult = new DescribeEdgePackagingJobResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return describeEdgePackagingJobResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("EdgePackagingJobArn", targetDepth)) {
                    context.nextToken();
                    describeEdgePackagingJobResult.setEdgePackagingJobArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EdgePackagingJobName", targetDepth)) {
                    context.nextToken();
                    describeEdgePackagingJobResult.setEdgePackagingJobName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CompilationJobName", targetDepth)) {
                    context.nextToken();
                    describeEdgePackagingJobResult.setCompilationJobName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ModelName", targetDepth)) {
                    context.nextToken();
                    describeEdgePackagingJobResult.setModelName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ModelVersion", targetDepth)) {
                    context.nextToken();
                    describeEdgePackagingJobResult.setModelVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("RoleArn", targetDepth)) {
                    context.nextToken();
                    describeEdgePackagingJobResult.setRoleArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("OutputConfig", targetDepth)) {
                    context.nextToken();
                    describeEdgePackagingJobResult.setOutputConfig(EdgeOutputConfigJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ResourceKey", targetDepth)) {
                    context.nextToken();
                    describeEdgePackagingJobResult.setResourceKey(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EdgePackagingJobStatus", targetDepth)) {
                    context.nextToken();
                    describeEdgePackagingJobResult.setEdgePackagingJobStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EdgePackagingJobStatusMessage", targetDepth)) {
                    context.nextToken();
                    describeEdgePackagingJobResult.setEdgePackagingJobStatusMessage(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreationTime", targetDepth)) {
                    context.nextToken();
                    describeEdgePackagingJobResult.setCreationTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("LastModifiedTime", targetDepth)) {
                    context.nextToken();
                    describeEdgePackagingJobResult.setLastModifiedTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("ModelArtifact", targetDepth)) {
                    context.nextToken();
                    describeEdgePackagingJobResult.setModelArtifact(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ModelSignature", targetDepth)) {
                    context.nextToken();
                    describeEdgePackagingJobResult.setModelSignature(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PresetDeploymentOutput", targetDepth)) {
                    context.nextToken();
                    describeEdgePackagingJobResult.setPresetDeploymentOutput(EdgePresetDeploymentOutputJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return describeEdgePackagingJobResult;
    }

    private static DescribeEdgePackagingJobResultJsonUnmarshaller instance;

    public static DescribeEdgePackagingJobResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeEdgePackagingJobResultJsonUnmarshaller();
        return instance;
    }
}
