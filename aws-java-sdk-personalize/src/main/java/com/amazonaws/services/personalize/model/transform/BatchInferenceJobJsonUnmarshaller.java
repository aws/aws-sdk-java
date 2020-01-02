/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.personalize.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.personalize.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * BatchInferenceJob JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchInferenceJobJsonUnmarshaller implements Unmarshaller<BatchInferenceJob, JsonUnmarshallerContext> {

    public BatchInferenceJob unmarshall(JsonUnmarshallerContext context) throws Exception {
        BatchInferenceJob batchInferenceJob = new BatchInferenceJob();

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
                if (context.testExpression("jobName", targetDepth)) {
                    context.nextToken();
                    batchInferenceJob.setJobName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("batchInferenceJobArn", targetDepth)) {
                    context.nextToken();
                    batchInferenceJob.setBatchInferenceJobArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("failureReason", targetDepth)) {
                    context.nextToken();
                    batchInferenceJob.setFailureReason(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("solutionVersionArn", targetDepth)) {
                    context.nextToken();
                    batchInferenceJob.setSolutionVersionArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("numResults", targetDepth)) {
                    context.nextToken();
                    batchInferenceJob.setNumResults(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("jobInput", targetDepth)) {
                    context.nextToken();
                    batchInferenceJob.setJobInput(BatchInferenceJobInputJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("jobOutput", targetDepth)) {
                    context.nextToken();
                    batchInferenceJob.setJobOutput(BatchInferenceJobOutputJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("roleArn", targetDepth)) {
                    context.nextToken();
                    batchInferenceJob.setRoleArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("status", targetDepth)) {
                    context.nextToken();
                    batchInferenceJob.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("creationDateTime", targetDepth)) {
                    context.nextToken();
                    batchInferenceJob.setCreationDateTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("lastUpdatedDateTime", targetDepth)) {
                    context.nextToken();
                    batchInferenceJob.setLastUpdatedDateTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return batchInferenceJob;
    }

    private static BatchInferenceJobJsonUnmarshaller instance;

    public static BatchInferenceJobJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new BatchInferenceJobJsonUnmarshaller();
        return instance;
    }
}
