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
package com.amazonaws.services.qconnect.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.qconnect.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * ImportJobData JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ImportJobDataJsonUnmarshaller implements Unmarshaller<ImportJobData, JsonUnmarshallerContext> {

    public ImportJobData unmarshall(JsonUnmarshallerContext context) throws Exception {
        ImportJobData importJobData = new ImportJobData();

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
                if (context.testExpression("createdTime", targetDepth)) {
                    context.nextToken();
                    importJobData.setCreatedTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("externalSourceConfiguration", targetDepth)) {
                    context.nextToken();
                    importJobData.setExternalSourceConfiguration(ExternalSourceConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("failedRecordReport", targetDepth)) {
                    context.nextToken();
                    importJobData.setFailedRecordReport(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("importJobId", targetDepth)) {
                    context.nextToken();
                    importJobData.setImportJobId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("importJobType", targetDepth)) {
                    context.nextToken();
                    importJobData.setImportJobType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("knowledgeBaseArn", targetDepth)) {
                    context.nextToken();
                    importJobData.setKnowledgeBaseArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("knowledgeBaseId", targetDepth)) {
                    context.nextToken();
                    importJobData.setKnowledgeBaseId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("lastModifiedTime", targetDepth)) {
                    context.nextToken();
                    importJobData.setLastModifiedTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("metadata", targetDepth)) {
                    context.nextToken();
                    importJobData.setMetadata(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context.getUnmarshaller(String.class))
                            .unmarshall(context));
                }
                if (context.testExpression("status", targetDepth)) {
                    context.nextToken();
                    importJobData.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("uploadId", targetDepth)) {
                    context.nextToken();
                    importJobData.setUploadId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("url", targetDepth)) {
                    context.nextToken();
                    importJobData.setUrl(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("urlExpiry", targetDepth)) {
                    context.nextToken();
                    importJobData.setUrlExpiry(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return importJobData;
    }

    private static ImportJobDataJsonUnmarshaller instance;

    public static ImportJobDataJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ImportJobDataJsonUnmarshaller();
        return instance;
    }
}
