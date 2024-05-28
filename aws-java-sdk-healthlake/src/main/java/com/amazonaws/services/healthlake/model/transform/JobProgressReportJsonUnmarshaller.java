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
package com.amazonaws.services.healthlake.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.healthlake.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * JobProgressReport JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class JobProgressReportJsonUnmarshaller implements Unmarshaller<JobProgressReport, JsonUnmarshallerContext> {

    public JobProgressReport unmarshall(JsonUnmarshallerContext context) throws Exception {
        JobProgressReport jobProgressReport = new JobProgressReport();

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
                if (context.testExpression("TotalNumberOfScannedFiles", targetDepth)) {
                    context.nextToken();
                    jobProgressReport.setTotalNumberOfScannedFiles(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("TotalSizeOfScannedFilesInMB", targetDepth)) {
                    context.nextToken();
                    jobProgressReport.setTotalSizeOfScannedFilesInMB(context.getUnmarshaller(Double.class).unmarshall(context));
                }
                if (context.testExpression("TotalNumberOfImportedFiles", targetDepth)) {
                    context.nextToken();
                    jobProgressReport.setTotalNumberOfImportedFiles(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("TotalNumberOfResourcesScanned", targetDepth)) {
                    context.nextToken();
                    jobProgressReport.setTotalNumberOfResourcesScanned(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("TotalNumberOfResourcesImported", targetDepth)) {
                    context.nextToken();
                    jobProgressReport.setTotalNumberOfResourcesImported(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("TotalNumberOfResourcesWithCustomerError", targetDepth)) {
                    context.nextToken();
                    jobProgressReport.setTotalNumberOfResourcesWithCustomerError(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("TotalNumberOfFilesReadWithCustomerError", targetDepth)) {
                    context.nextToken();
                    jobProgressReport.setTotalNumberOfFilesReadWithCustomerError(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("Throughput", targetDepth)) {
                    context.nextToken();
                    jobProgressReport.setThroughput(context.getUnmarshaller(Double.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return jobProgressReport;
    }

    private static JobProgressReportJsonUnmarshaller instance;

    public static JobProgressReportJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new JobProgressReportJsonUnmarshaller();
        return instance;
    }
}
