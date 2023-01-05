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
package com.amazonaws.services.sagemaker.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.sagemaker.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * DescribeModelCardExportJobResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeModelCardExportJobResultJsonUnmarshaller implements Unmarshaller<DescribeModelCardExportJobResult, JsonUnmarshallerContext> {

    public DescribeModelCardExportJobResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribeModelCardExportJobResult describeModelCardExportJobResult = new DescribeModelCardExportJobResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return describeModelCardExportJobResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("ModelCardExportJobName", targetDepth)) {
                    context.nextToken();
                    describeModelCardExportJobResult.setModelCardExportJobName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ModelCardExportJobArn", targetDepth)) {
                    context.nextToken();
                    describeModelCardExportJobResult.setModelCardExportJobArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    context.nextToken();
                    describeModelCardExportJobResult.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ModelCardName", targetDepth)) {
                    context.nextToken();
                    describeModelCardExportJobResult.setModelCardName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ModelCardVersion", targetDepth)) {
                    context.nextToken();
                    describeModelCardExportJobResult.setModelCardVersion(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("OutputConfig", targetDepth)) {
                    context.nextToken();
                    describeModelCardExportJobResult.setOutputConfig(ModelCardExportOutputConfigJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("CreatedAt", targetDepth)) {
                    context.nextToken();
                    describeModelCardExportJobResult.setCreatedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("LastModifiedAt", targetDepth)) {
                    context.nextToken();
                    describeModelCardExportJobResult.setLastModifiedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("FailureReason", targetDepth)) {
                    context.nextToken();
                    describeModelCardExportJobResult.setFailureReason(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ExportArtifacts", targetDepth)) {
                    context.nextToken();
                    describeModelCardExportJobResult.setExportArtifacts(ModelCardExportArtifactsJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return describeModelCardExportJobResult;
    }

    private static DescribeModelCardExportJobResultJsonUnmarshaller instance;

    public static DescribeModelCardExportJobResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeModelCardExportJobResultJsonUnmarshaller();
        return instance;
    }
}
