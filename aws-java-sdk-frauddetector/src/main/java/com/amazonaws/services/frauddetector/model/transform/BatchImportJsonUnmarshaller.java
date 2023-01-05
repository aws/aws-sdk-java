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
package com.amazonaws.services.frauddetector.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.frauddetector.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * BatchImport JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchImportJsonUnmarshaller implements Unmarshaller<BatchImport, JsonUnmarshallerContext> {

    public BatchImport unmarshall(JsonUnmarshallerContext context) throws Exception {
        BatchImport batchImport = new BatchImport();

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
                if (context.testExpression("jobId", targetDepth)) {
                    context.nextToken();
                    batchImport.setJobId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("status", targetDepth)) {
                    context.nextToken();
                    batchImport.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("failureReason", targetDepth)) {
                    context.nextToken();
                    batchImport.setFailureReason(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("startTime", targetDepth)) {
                    context.nextToken();
                    batchImport.setStartTime(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("completionTime", targetDepth)) {
                    context.nextToken();
                    batchImport.setCompletionTime(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("inputPath", targetDepth)) {
                    context.nextToken();
                    batchImport.setInputPath(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("outputPath", targetDepth)) {
                    context.nextToken();
                    batchImport.setOutputPath(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("eventTypeName", targetDepth)) {
                    context.nextToken();
                    batchImport.setEventTypeName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("iamRoleArn", targetDepth)) {
                    context.nextToken();
                    batchImport.setIamRoleArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("arn", targetDepth)) {
                    context.nextToken();
                    batchImport.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("processedRecordsCount", targetDepth)) {
                    context.nextToken();
                    batchImport.setProcessedRecordsCount(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("failedRecordsCount", targetDepth)) {
                    context.nextToken();
                    batchImport.setFailedRecordsCount(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("totalRecordsCount", targetDepth)) {
                    context.nextToken();
                    batchImport.setTotalRecordsCount(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return batchImport;
    }

    private static BatchImportJsonUnmarshaller instance;

    public static BatchImportJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new BatchImportJsonUnmarshaller();
        return instance;
    }
}
