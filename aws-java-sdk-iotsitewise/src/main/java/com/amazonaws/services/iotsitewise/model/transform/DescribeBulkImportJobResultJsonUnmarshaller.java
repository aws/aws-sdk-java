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
package com.amazonaws.services.iotsitewise.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.iotsitewise.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * DescribeBulkImportJobResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeBulkImportJobResultJsonUnmarshaller implements Unmarshaller<DescribeBulkImportJobResult, JsonUnmarshallerContext> {

    public DescribeBulkImportJobResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribeBulkImportJobResult describeBulkImportJobResult = new DescribeBulkImportJobResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return describeBulkImportJobResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("jobId", targetDepth)) {
                    context.nextToken();
                    describeBulkImportJobResult.setJobId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("jobName", targetDepth)) {
                    context.nextToken();
                    describeBulkImportJobResult.setJobName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("jobStatus", targetDepth)) {
                    context.nextToken();
                    describeBulkImportJobResult.setJobStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("jobRoleArn", targetDepth)) {
                    context.nextToken();
                    describeBulkImportJobResult.setJobRoleArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("files", targetDepth)) {
                    context.nextToken();
                    describeBulkImportJobResult.setFiles(new ListUnmarshaller<File>(FileJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("errorReportLocation", targetDepth)) {
                    context.nextToken();
                    describeBulkImportJobResult.setErrorReportLocation(ErrorReportLocationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("jobConfiguration", targetDepth)) {
                    context.nextToken();
                    describeBulkImportJobResult.setJobConfiguration(JobConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("jobCreationDate", targetDepth)) {
                    context.nextToken();
                    describeBulkImportJobResult.setJobCreationDate(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("jobLastUpdateDate", targetDepth)) {
                    context.nextToken();
                    describeBulkImportJobResult.setJobLastUpdateDate(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return describeBulkImportJobResult;
    }

    private static DescribeBulkImportJobResultJsonUnmarshaller instance;

    public static DescribeBulkImportJobResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeBulkImportJobResultJsonUnmarshaller();
        return instance;
    }
}
