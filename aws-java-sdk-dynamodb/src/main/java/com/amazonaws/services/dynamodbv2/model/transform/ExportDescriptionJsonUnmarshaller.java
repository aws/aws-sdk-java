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
package com.amazonaws.services.dynamodbv2.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.dynamodbv2.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * ExportDescription JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ExportDescriptionJsonUnmarshaller implements Unmarshaller<ExportDescription, JsonUnmarshallerContext> {

    public ExportDescription unmarshall(JsonUnmarshallerContext context) throws Exception {
        ExportDescription exportDescription = new ExportDescription();

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
                if (context.testExpression("ExportArn", targetDepth)) {
                    context.nextToken();
                    exportDescription.setExportArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ExportStatus", targetDepth)) {
                    context.nextToken();
                    exportDescription.setExportStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("StartTime", targetDepth)) {
                    context.nextToken();
                    exportDescription.setStartTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("EndTime", targetDepth)) {
                    context.nextToken();
                    exportDescription.setEndTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("ExportManifest", targetDepth)) {
                    context.nextToken();
                    exportDescription.setExportManifest(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("TableArn", targetDepth)) {
                    context.nextToken();
                    exportDescription.setTableArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("TableId", targetDepth)) {
                    context.nextToken();
                    exportDescription.setTableId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ExportTime", targetDepth)) {
                    context.nextToken();
                    exportDescription.setExportTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("ClientToken", targetDepth)) {
                    context.nextToken();
                    exportDescription.setClientToken(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("S3Bucket", targetDepth)) {
                    context.nextToken();
                    exportDescription.setS3Bucket(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("S3BucketOwner", targetDepth)) {
                    context.nextToken();
                    exportDescription.setS3BucketOwner(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("S3Prefix", targetDepth)) {
                    context.nextToken();
                    exportDescription.setS3Prefix(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("S3SseAlgorithm", targetDepth)) {
                    context.nextToken();
                    exportDescription.setS3SseAlgorithm(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("S3SseKmsKeyId", targetDepth)) {
                    context.nextToken();
                    exportDescription.setS3SseKmsKeyId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("FailureCode", targetDepth)) {
                    context.nextToken();
                    exportDescription.setFailureCode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("FailureMessage", targetDepth)) {
                    context.nextToken();
                    exportDescription.setFailureMessage(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ExportFormat", targetDepth)) {
                    context.nextToken();
                    exportDescription.setExportFormat(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("BilledSizeBytes", targetDepth)) {
                    context.nextToken();
                    exportDescription.setBilledSizeBytes(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("ItemCount", targetDepth)) {
                    context.nextToken();
                    exportDescription.setItemCount(context.getUnmarshaller(Long.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return exportDescription;
    }

    private static ExportDescriptionJsonUnmarshaller instance;

    public static ExportDescriptionJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ExportDescriptionJsonUnmarshaller();
        return instance;
    }
}
