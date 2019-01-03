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
package com.amazonaws.services.datasync.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.datasync.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * TaskExecutionResultDetail JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TaskExecutionResultDetailJsonUnmarshaller implements Unmarshaller<TaskExecutionResultDetail, JsonUnmarshallerContext> {

    public TaskExecutionResultDetail unmarshall(JsonUnmarshallerContext context) throws Exception {
        TaskExecutionResultDetail taskExecutionResultDetail = new TaskExecutionResultDetail();

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
                if (context.testExpression("PrepareDuration", targetDepth)) {
                    context.nextToken();
                    taskExecutionResultDetail.setPrepareDuration(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("PrepareStatus", targetDepth)) {
                    context.nextToken();
                    taskExecutionResultDetail.setPrepareStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("TransferDuration", targetDepth)) {
                    context.nextToken();
                    taskExecutionResultDetail.setTransferDuration(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("TransferStatus", targetDepth)) {
                    context.nextToken();
                    taskExecutionResultDetail.setTransferStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("VerifyDuration", targetDepth)) {
                    context.nextToken();
                    taskExecutionResultDetail.setVerifyDuration(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("VerifyStatus", targetDepth)) {
                    context.nextToken();
                    taskExecutionResultDetail.setVerifyStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ErrorCode", targetDepth)) {
                    context.nextToken();
                    taskExecutionResultDetail.setErrorCode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ErrorDetail", targetDepth)) {
                    context.nextToken();
                    taskExecutionResultDetail.setErrorDetail(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return taskExecutionResultDetail;
    }

    private static TaskExecutionResultDetailJsonUnmarshaller instance;

    public static TaskExecutionResultDetailJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new TaskExecutionResultDetailJsonUnmarshaller();
        return instance;
    }
}
