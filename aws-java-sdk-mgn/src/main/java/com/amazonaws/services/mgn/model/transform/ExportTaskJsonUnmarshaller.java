/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.mgn.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.mgn.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * ExportTask JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ExportTaskJsonUnmarshaller implements Unmarshaller<ExportTask, JsonUnmarshallerContext> {

    public ExportTask unmarshall(JsonUnmarshallerContext context) throws Exception {
        ExportTask exportTask = new ExportTask();

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
                if (context.testExpression("creationDateTime", targetDepth)) {
                    context.nextToken();
                    exportTask.setCreationDateTime(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("endDateTime", targetDepth)) {
                    context.nextToken();
                    exportTask.setEndDateTime(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("exportID", targetDepth)) {
                    context.nextToken();
                    exportTask.setExportID(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("progressPercentage", targetDepth)) {
                    context.nextToken();
                    exportTask.setProgressPercentage(context.getUnmarshaller(Float.class).unmarshall(context));
                }
                if (context.testExpression("s3Bucket", targetDepth)) {
                    context.nextToken();
                    exportTask.setS3Bucket(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("s3BucketOwner", targetDepth)) {
                    context.nextToken();
                    exportTask.setS3BucketOwner(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("s3Key", targetDepth)) {
                    context.nextToken();
                    exportTask.setS3Key(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("status", targetDepth)) {
                    context.nextToken();
                    exportTask.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("summary", targetDepth)) {
                    context.nextToken();
                    exportTask.setSummary(ExportTaskSummaryJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return exportTask;
    }

    private static ExportTaskJsonUnmarshaller instance;

    public static ExportTaskJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ExportTaskJsonUnmarshaller();
        return instance;
    }
}
