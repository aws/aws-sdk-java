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
package com.amazonaws.services.frauddetector.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.frauddetector.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * BatchPrediction JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchPredictionJsonUnmarshaller implements Unmarshaller<BatchPrediction, JsonUnmarshallerContext> {

    public BatchPrediction unmarshall(JsonUnmarshallerContext context) throws Exception {
        BatchPrediction batchPrediction = new BatchPrediction();

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
                    batchPrediction.setJobId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("status", targetDepth)) {
                    context.nextToken();
                    batchPrediction.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("failureReason", targetDepth)) {
                    context.nextToken();
                    batchPrediction.setFailureReason(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("startTime", targetDepth)) {
                    context.nextToken();
                    batchPrediction.setStartTime(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("completionTime", targetDepth)) {
                    context.nextToken();
                    batchPrediction.setCompletionTime(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("lastHeartbeatTime", targetDepth)) {
                    context.nextToken();
                    batchPrediction.setLastHeartbeatTime(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("inputPath", targetDepth)) {
                    context.nextToken();
                    batchPrediction.setInputPath(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("outputPath", targetDepth)) {
                    context.nextToken();
                    batchPrediction.setOutputPath(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("eventTypeName", targetDepth)) {
                    context.nextToken();
                    batchPrediction.setEventTypeName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("detectorName", targetDepth)) {
                    context.nextToken();
                    batchPrediction.setDetectorName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("detectorVersion", targetDepth)) {
                    context.nextToken();
                    batchPrediction.setDetectorVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("iamRoleArn", targetDepth)) {
                    context.nextToken();
                    batchPrediction.setIamRoleArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("arn", targetDepth)) {
                    context.nextToken();
                    batchPrediction.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("processedRecordsCount", targetDepth)) {
                    context.nextToken();
                    batchPrediction.setProcessedRecordsCount(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("totalRecordsCount", targetDepth)) {
                    context.nextToken();
                    batchPrediction.setTotalRecordsCount(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return batchPrediction;
    }

    private static BatchPredictionJsonUnmarshaller instance;

    public static BatchPredictionJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new BatchPredictionJsonUnmarshaller();
        return instance;
    }
}
