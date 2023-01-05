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
package com.amazonaws.services.migrationhubstrategyrecommendations.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.migrationhubstrategyrecommendations.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * ImportFileTaskInformation JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ImportFileTaskInformationJsonUnmarshaller implements Unmarshaller<ImportFileTaskInformation, JsonUnmarshallerContext> {

    public ImportFileTaskInformation unmarshall(JsonUnmarshallerContext context) throws Exception {
        ImportFileTaskInformation importFileTaskInformation = new ImportFileTaskInformation();

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
                if (context.testExpression("completionTime", targetDepth)) {
                    context.nextToken();
                    importFileTaskInformation.setCompletionTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("id", targetDepth)) {
                    context.nextToken();
                    importFileTaskInformation.setId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("importName", targetDepth)) {
                    context.nextToken();
                    importFileTaskInformation.setImportName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("inputS3Bucket", targetDepth)) {
                    context.nextToken();
                    importFileTaskInformation.setInputS3Bucket(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("inputS3Key", targetDepth)) {
                    context.nextToken();
                    importFileTaskInformation.setInputS3Key(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("numberOfRecordsFailed", targetDepth)) {
                    context.nextToken();
                    importFileTaskInformation.setNumberOfRecordsFailed(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("numberOfRecordsSuccess", targetDepth)) {
                    context.nextToken();
                    importFileTaskInformation.setNumberOfRecordsSuccess(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("startTime", targetDepth)) {
                    context.nextToken();
                    importFileTaskInformation.setStartTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("status", targetDepth)) {
                    context.nextToken();
                    importFileTaskInformation.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("statusReportS3Bucket", targetDepth)) {
                    context.nextToken();
                    importFileTaskInformation.setStatusReportS3Bucket(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("statusReportS3Key", targetDepth)) {
                    context.nextToken();
                    importFileTaskInformation.setStatusReportS3Key(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return importFileTaskInformation;
    }

    private static ImportFileTaskInformationJsonUnmarshaller instance;

    public static ImportFileTaskInformationJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ImportFileTaskInformationJsonUnmarshaller();
        return instance;
    }
}
