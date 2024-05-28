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
 * ImportTask JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ImportTaskJsonUnmarshaller implements Unmarshaller<ImportTask, JsonUnmarshallerContext> {

    public ImportTask unmarshall(JsonUnmarshallerContext context) throws Exception {
        ImportTask importTask = new ImportTask();

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
                    importTask.setCreationDateTime(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("endDateTime", targetDepth)) {
                    context.nextToken();
                    importTask.setEndDateTime(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("importID", targetDepth)) {
                    context.nextToken();
                    importTask.setImportID(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("progressPercentage", targetDepth)) {
                    context.nextToken();
                    importTask.setProgressPercentage(context.getUnmarshaller(Float.class).unmarshall(context));
                }
                if (context.testExpression("s3BucketSource", targetDepth)) {
                    context.nextToken();
                    importTask.setS3BucketSource(S3BucketSourceJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("status", targetDepth)) {
                    context.nextToken();
                    importTask.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("summary", targetDepth)) {
                    context.nextToken();
                    importTask.setSummary(ImportTaskSummaryJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return importTask;
    }

    private static ImportTaskJsonUnmarshaller instance;

    public static ImportTaskJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ImportTaskJsonUnmarshaller();
        return instance;
    }
}
