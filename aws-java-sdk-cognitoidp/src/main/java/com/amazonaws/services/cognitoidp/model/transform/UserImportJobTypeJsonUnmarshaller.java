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
package com.amazonaws.services.cognitoidp.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.cognitoidp.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * UserImportJobType JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UserImportJobTypeJsonUnmarshaller implements Unmarshaller<UserImportJobType, JsonUnmarshallerContext> {

    public UserImportJobType unmarshall(JsonUnmarshallerContext context) throws Exception {
        UserImportJobType userImportJobType = new UserImportJobType();

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
                if (context.testExpression("JobName", targetDepth)) {
                    context.nextToken();
                    userImportJobType.setJobName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("JobId", targetDepth)) {
                    context.nextToken();
                    userImportJobType.setJobId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("UserPoolId", targetDepth)) {
                    context.nextToken();
                    userImportJobType.setUserPoolId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PreSignedUrl", targetDepth)) {
                    context.nextToken();
                    userImportJobType.setPreSignedUrl(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreationDate", targetDepth)) {
                    context.nextToken();
                    userImportJobType.setCreationDate(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("StartDate", targetDepth)) {
                    context.nextToken();
                    userImportJobType.setStartDate(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("CompletionDate", targetDepth)) {
                    context.nextToken();
                    userImportJobType.setCompletionDate(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    context.nextToken();
                    userImportJobType.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CloudWatchLogsRoleArn", targetDepth)) {
                    context.nextToken();
                    userImportJobType.setCloudWatchLogsRoleArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ImportedUsers", targetDepth)) {
                    context.nextToken();
                    userImportJobType.setImportedUsers(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("SkippedUsers", targetDepth)) {
                    context.nextToken();
                    userImportJobType.setSkippedUsers(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("FailedUsers", targetDepth)) {
                    context.nextToken();
                    userImportJobType.setFailedUsers(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("CompletionMessage", targetDepth)) {
                    context.nextToken();
                    userImportJobType.setCompletionMessage(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return userImportJobType;
    }

    private static UserImportJobTypeJsonUnmarshaller instance;

    public static UserImportJobTypeJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new UserImportJobTypeJsonUnmarshaller();
        return instance;
    }
}
