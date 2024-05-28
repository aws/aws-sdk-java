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
 * GetJobResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetJobResultJsonUnmarshaller implements Unmarshaller<GetJobResult, JsonUnmarshallerContext> {

    public GetJobResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetJobResult getJobResult = new GetJobResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return getJobResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("attachments", targetDepth)) {
                    context.nextToken();
                    getJobResult.setAttachments(AttachmentsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("createdAt", targetDepth)) {
                    context.nextToken();
                    getJobResult.setCreatedAt(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("createdBy", targetDepth)) {
                    context.nextToken();
                    getJobResult.setCreatedBy(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("description", targetDepth)) {
                    context.nextToken();
                    getJobResult.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("endedAt", targetDepth)) {
                    context.nextToken();
                    getJobResult.setEndedAt(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("jobId", targetDepth)) {
                    context.nextToken();
                    getJobResult.setJobId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("lifecycleStatus", targetDepth)) {
                    context.nextToken();
                    getJobResult.setLifecycleStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("lifecycleStatusMessage", targetDepth)) {
                    context.nextToken();
                    getJobResult.setLifecycleStatusMessage(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("maxFailedTasksCount", targetDepth)) {
                    context.nextToken();
                    getJobResult.setMaxFailedTasksCount(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("maxRetriesPerTask", targetDepth)) {
                    context.nextToken();
                    getJobResult.setMaxRetriesPerTask(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("name", targetDepth)) {
                    context.nextToken();
                    getJobResult.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("parameters", targetDepth)) {
                    context.nextToken();
                    getJobResult.setParameters(new MapUnmarshaller<String, JobParameter>(context.getUnmarshaller(String.class), JobParameterJsonUnmarshaller
                            .getInstance()).unmarshall(context));
                }
                if (context.testExpression("priority", targetDepth)) {
                    context.nextToken();
                    getJobResult.setPriority(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("startedAt", targetDepth)) {
                    context.nextToken();
                    getJobResult.setStartedAt(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("storageProfileId", targetDepth)) {
                    context.nextToken();
                    getJobResult.setStorageProfileId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("targetTaskRunStatus", targetDepth)) {
                    context.nextToken();
                    getJobResult.setTargetTaskRunStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("taskRunStatus", targetDepth)) {
                    context.nextToken();
                    getJobResult.setTaskRunStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("taskRunStatusCounts", targetDepth)) {
                    context.nextToken();
                    getJobResult.setTaskRunStatusCounts(new MapUnmarshaller<String, Integer>(context.getUnmarshaller(String.class), context
                            .getUnmarshaller(Integer.class)).unmarshall(context));
                }
                if (context.testExpression("updatedAt", targetDepth)) {
                    context.nextToken();
                    getJobResult.setUpdatedAt(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("updatedBy", targetDepth)) {
                    context.nextToken();
                    getJobResult.setUpdatedBy(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return getJobResult;
    }

    private static GetJobResultJsonUnmarshaller instance;

    public static GetJobResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetJobResultJsonUnmarshaller();
        return instance;
    }
}
