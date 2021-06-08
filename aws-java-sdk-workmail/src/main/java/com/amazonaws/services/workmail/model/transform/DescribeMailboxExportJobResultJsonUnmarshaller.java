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
package com.amazonaws.services.workmail.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.workmail.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * DescribeMailboxExportJobResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeMailboxExportJobResultJsonUnmarshaller implements Unmarshaller<DescribeMailboxExportJobResult, JsonUnmarshallerContext> {

    public DescribeMailboxExportJobResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribeMailboxExportJobResult describeMailboxExportJobResult = new DescribeMailboxExportJobResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return describeMailboxExportJobResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("EntityId", targetDepth)) {
                    context.nextToken();
                    describeMailboxExportJobResult.setEntityId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Description", targetDepth)) {
                    context.nextToken();
                    describeMailboxExportJobResult.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("RoleArn", targetDepth)) {
                    context.nextToken();
                    describeMailboxExportJobResult.setRoleArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("KmsKeyArn", targetDepth)) {
                    context.nextToken();
                    describeMailboxExportJobResult.setKmsKeyArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("S3BucketName", targetDepth)) {
                    context.nextToken();
                    describeMailboxExportJobResult.setS3BucketName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("S3Prefix", targetDepth)) {
                    context.nextToken();
                    describeMailboxExportJobResult.setS3Prefix(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("S3Path", targetDepth)) {
                    context.nextToken();
                    describeMailboxExportJobResult.setS3Path(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EstimatedProgress", targetDepth)) {
                    context.nextToken();
                    describeMailboxExportJobResult.setEstimatedProgress(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("State", targetDepth)) {
                    context.nextToken();
                    describeMailboxExportJobResult.setState(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ErrorInfo", targetDepth)) {
                    context.nextToken();
                    describeMailboxExportJobResult.setErrorInfo(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("StartTime", targetDepth)) {
                    context.nextToken();
                    describeMailboxExportJobResult.setStartTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("EndTime", targetDepth)) {
                    context.nextToken();
                    describeMailboxExportJobResult.setEndTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return describeMailboxExportJobResult;
    }

    private static DescribeMailboxExportJobResultJsonUnmarshaller instance;

    public static DescribeMailboxExportJobResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeMailboxExportJobResultJsonUnmarshaller();
        return instance;
    }
}
