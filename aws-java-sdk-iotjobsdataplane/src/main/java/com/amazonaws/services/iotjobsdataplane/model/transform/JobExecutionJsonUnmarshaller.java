/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.iotjobsdataplane.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.iotjobsdataplane.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * JobExecution JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class JobExecutionJsonUnmarshaller implements Unmarshaller<JobExecution, JsonUnmarshallerContext> {

    public JobExecution unmarshall(JsonUnmarshallerContext context) throws Exception {
        JobExecution jobExecution = new JobExecution();

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
                    jobExecution.setJobId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("thingName", targetDepth)) {
                    context.nextToken();
                    jobExecution.setThingName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("status", targetDepth)) {
                    context.nextToken();
                    jobExecution.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("statusDetails", targetDepth)) {
                    context.nextToken();
                    jobExecution.setStatusDetails(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context
                            .getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("queuedAt", targetDepth)) {
                    context.nextToken();
                    jobExecution.setQueuedAt(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("startedAt", targetDepth)) {
                    context.nextToken();
                    jobExecution.setStartedAt(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("lastUpdatedAt", targetDepth)) {
                    context.nextToken();
                    jobExecution.setLastUpdatedAt(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("approximateSecondsBeforeTimedOut", targetDepth)) {
                    context.nextToken();
                    jobExecution.setApproximateSecondsBeforeTimedOut(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("versionNumber", targetDepth)) {
                    context.nextToken();
                    jobExecution.setVersionNumber(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("executionNumber", targetDepth)) {
                    context.nextToken();
                    jobExecution.setExecutionNumber(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("jobDocument", targetDepth)) {
                    context.nextToken();
                    jobExecution.setJobDocument(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return jobExecution;
    }

    private static JobExecutionJsonUnmarshaller instance;

    public static JobExecutionJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new JobExecutionJsonUnmarshaller();
        return instance;
    }
}
