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
 * GetImportFileTaskResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetImportFileTaskResultJsonUnmarshaller implements Unmarshaller<GetImportFileTaskResult, JsonUnmarshallerContext> {

    public GetImportFileTaskResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetImportFileTaskResult getImportFileTaskResult = new GetImportFileTaskResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return getImportFileTaskResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("completionTime", targetDepth)) {
                    context.nextToken();
                    getImportFileTaskResult.setCompletionTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("id", targetDepth)) {
                    context.nextToken();
                    getImportFileTaskResult.setId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("importName", targetDepth)) {
                    context.nextToken();
                    getImportFileTaskResult.setImportName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("inputS3Bucket", targetDepth)) {
                    context.nextToken();
                    getImportFileTaskResult.setInputS3Bucket(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("inputS3Key", targetDepth)) {
                    context.nextToken();
                    getImportFileTaskResult.setInputS3Key(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("numberOfRecordsFailed", targetDepth)) {
                    context.nextToken();
                    getImportFileTaskResult.setNumberOfRecordsFailed(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("numberOfRecordsSuccess", targetDepth)) {
                    context.nextToken();
                    getImportFileTaskResult.setNumberOfRecordsSuccess(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("startTime", targetDepth)) {
                    context.nextToken();
                    getImportFileTaskResult.setStartTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("status", targetDepth)) {
                    context.nextToken();
                    getImportFileTaskResult.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("statusReportS3Bucket", targetDepth)) {
                    context.nextToken();
                    getImportFileTaskResult.setStatusReportS3Bucket(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("statusReportS3Key", targetDepth)) {
                    context.nextToken();
                    getImportFileTaskResult.setStatusReportS3Key(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return getImportFileTaskResult;
    }

    private static GetImportFileTaskResultJsonUnmarshaller instance;

    public static GetImportFileTaskResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetImportFileTaskResultJsonUnmarshaller();
        return instance;
    }
}
