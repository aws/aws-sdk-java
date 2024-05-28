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
package com.amazonaws.services.simpleemailv2.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.simpleemailv2.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * GetExportJobResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetExportJobResultJsonUnmarshaller implements Unmarshaller<GetExportJobResult, JsonUnmarshallerContext> {

    public GetExportJobResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetExportJobResult getExportJobResult = new GetExportJobResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return getExportJobResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("JobId", targetDepth)) {
                    context.nextToken();
                    getExportJobResult.setJobId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ExportSourceType", targetDepth)) {
                    context.nextToken();
                    getExportJobResult.setExportSourceType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("JobStatus", targetDepth)) {
                    context.nextToken();
                    getExportJobResult.setJobStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ExportDestination", targetDepth)) {
                    context.nextToken();
                    getExportJobResult.setExportDestination(ExportDestinationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ExportDataSource", targetDepth)) {
                    context.nextToken();
                    getExportJobResult.setExportDataSource(ExportDataSourceJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("CreatedTimestamp", targetDepth)) {
                    context.nextToken();
                    getExportJobResult.setCreatedTimestamp(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("CompletedTimestamp", targetDepth)) {
                    context.nextToken();
                    getExportJobResult.setCompletedTimestamp(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("FailureInfo", targetDepth)) {
                    context.nextToken();
                    getExportJobResult.setFailureInfo(FailureInfoJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Statistics", targetDepth)) {
                    context.nextToken();
                    getExportJobResult.setStatistics(ExportStatisticsJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return getExportJobResult;
    }

    private static GetExportJobResultJsonUnmarshaller instance;

    public static GetExportJobResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetExportJobResultJsonUnmarshaller();
        return instance;
    }
}
