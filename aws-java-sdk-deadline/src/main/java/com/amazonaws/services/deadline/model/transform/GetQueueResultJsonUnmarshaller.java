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
 * GetQueueResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetQueueResultJsonUnmarshaller implements Unmarshaller<GetQueueResult, JsonUnmarshallerContext> {

    public GetQueueResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetQueueResult getQueueResult = new GetQueueResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return getQueueResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("allowedStorageProfileIds", targetDepth)) {
                    context.nextToken();
                    getQueueResult.setAllowedStorageProfileIds(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("blockedReason", targetDepth)) {
                    context.nextToken();
                    getQueueResult.setBlockedReason(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("createdAt", targetDepth)) {
                    context.nextToken();
                    getQueueResult.setCreatedAt(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("createdBy", targetDepth)) {
                    context.nextToken();
                    getQueueResult.setCreatedBy(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("defaultBudgetAction", targetDepth)) {
                    context.nextToken();
                    getQueueResult.setDefaultBudgetAction(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("description", targetDepth)) {
                    context.nextToken();
                    getQueueResult.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("displayName", targetDepth)) {
                    context.nextToken();
                    getQueueResult.setDisplayName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("farmId", targetDepth)) {
                    context.nextToken();
                    getQueueResult.setFarmId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("jobAttachmentSettings", targetDepth)) {
                    context.nextToken();
                    getQueueResult.setJobAttachmentSettings(JobAttachmentSettingsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("jobRunAsUser", targetDepth)) {
                    context.nextToken();
                    getQueueResult.setJobRunAsUser(JobRunAsUserJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("queueId", targetDepth)) {
                    context.nextToken();
                    getQueueResult.setQueueId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("requiredFileSystemLocationNames", targetDepth)) {
                    context.nextToken();
                    getQueueResult.setRequiredFileSystemLocationNames(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("roleArn", targetDepth)) {
                    context.nextToken();
                    getQueueResult.setRoleArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("status", targetDepth)) {
                    context.nextToken();
                    getQueueResult.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("updatedAt", targetDepth)) {
                    context.nextToken();
                    getQueueResult.setUpdatedAt(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("updatedBy", targetDepth)) {
                    context.nextToken();
                    getQueueResult.setUpdatedBy(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return getQueueResult;
    }

    private static GetQueueResultJsonUnmarshaller instance;

    public static GetQueueResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetQueueResultJsonUnmarshaller();
        return instance;
    }
}
