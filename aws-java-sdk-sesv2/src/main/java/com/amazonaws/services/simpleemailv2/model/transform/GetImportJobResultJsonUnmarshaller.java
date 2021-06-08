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
package com.amazonaws.services.simpleemailv2.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.simpleemailv2.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * GetImportJobResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetImportJobResultJsonUnmarshaller implements Unmarshaller<GetImportJobResult, JsonUnmarshallerContext> {

    public GetImportJobResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetImportJobResult getImportJobResult = new GetImportJobResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return getImportJobResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("JobId", targetDepth)) {
                    context.nextToken();
                    getImportJobResult.setJobId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ImportDestination", targetDepth)) {
                    context.nextToken();
                    getImportJobResult.setImportDestination(ImportDestinationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ImportDataSource", targetDepth)) {
                    context.nextToken();
                    getImportJobResult.setImportDataSource(ImportDataSourceJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("FailureInfo", targetDepth)) {
                    context.nextToken();
                    getImportJobResult.setFailureInfo(FailureInfoJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("JobStatus", targetDepth)) {
                    context.nextToken();
                    getImportJobResult.setJobStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreatedTimestamp", targetDepth)) {
                    context.nextToken();
                    getImportJobResult.setCreatedTimestamp(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("CompletedTimestamp", targetDepth)) {
                    context.nextToken();
                    getImportJobResult.setCompletedTimestamp(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("ProcessedRecordsCount", targetDepth)) {
                    context.nextToken();
                    getImportJobResult.setProcessedRecordsCount(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("FailedRecordsCount", targetDepth)) {
                    context.nextToken();
                    getImportJobResult.setFailedRecordsCount(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return getImportJobResult;
    }

    private static GetImportJobResultJsonUnmarshaller instance;

    public static GetImportJobResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetImportJobResultJsonUnmarshaller();
        return instance;
    }
}
