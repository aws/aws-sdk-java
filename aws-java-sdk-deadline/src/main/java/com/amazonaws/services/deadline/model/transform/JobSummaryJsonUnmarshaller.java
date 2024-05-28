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
package com.amazonaws.services.deadline.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.deadline.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * JobSummary JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class JobSummaryJsonUnmarshaller implements Unmarshaller<JobSummary, JsonUnmarshallerContext> {

    public JobSummary unmarshall(JsonUnmarshallerContext context) throws Exception {
        JobSummary jobSummary = new JobSummary();

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
                if (context.testExpression("createdAt", targetDepth)) {
                    context.nextToken();
                    jobSummary.setCreatedAt(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("createdBy", targetDepth)) {
                    context.nextToken();
                    jobSummary.setCreatedBy(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("endedAt", targetDepth)) {
                    context.nextToken();
                    jobSummary.setEndedAt(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("jobId", targetDepth)) {
                    context.nextToken();
                    jobSummary.setJobId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("lifecycleStatus", targetDepth)) {
                    context.nextToken();
                    jobSummary.setLifecycleStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("lifecycleStatusMessage", targetDepth)) {
                    context.nextToken();
                    jobSummary.setLifecycleStatusMessage(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("maxFailedTasksCount", targetDepth)) {
                    context.nextToken();
                    jobSummary.setMaxFailedTasksCount(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("maxRetriesPerTask", targetDepth)) {
                    context.nextToken();
                    jobSummary.setMaxRetriesPerTask(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("name", targetDepth)) {
                    context.nextToken();
                    jobSummary.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("priority", targetDepth)) {
                    context.nextToken();
                    jobSummary.setPriority(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("startedAt", targetDepth)) {
                    context.nextToken();
                    jobSummary.setStartedAt(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("targetTaskRunStatus", targetDepth)) {
                    context.nextToken();
                    jobSummary.setTargetTaskRunStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("taskRunStatus", targetDepth)) {
                    context.nextToken();
                    jobSummary.setTaskRunStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("taskRunStatusCounts", targetDepth)) {
                    context.nextToken();
                    jobSummary.setTaskRunStatusCounts(new MapUnmarshaller<String, Integer>(context.getUnmarshaller(String.class), context
                            .getUnmarshaller(Integer.class)).unmarshall(context));
                }
                if (context.testExpression("updatedAt", targetDepth)) {
                    context.nextToken();
                    jobSummary.setUpdatedAt(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("updatedBy", targetDepth)) {
                    context.nextToken();
                    jobSummary.setUpdatedBy(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return jobSummary;
    }

    private static JobSummaryJsonUnmarshaller instance;

    public static JobSummaryJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new JobSummaryJsonUnmarshaller();
        return instance;
    }
}
