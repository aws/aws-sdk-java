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
 * UpdatedSessionActionInfo JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdatedSessionActionInfoJsonUnmarshaller implements Unmarshaller<UpdatedSessionActionInfo, JsonUnmarshallerContext> {

    public UpdatedSessionActionInfo unmarshall(JsonUnmarshallerContext context) throws Exception {
        UpdatedSessionActionInfo updatedSessionActionInfo = new UpdatedSessionActionInfo();

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
                if (context.testExpression("completedStatus", targetDepth)) {
                    context.nextToken();
                    updatedSessionActionInfo.setCompletedStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("endedAt", targetDepth)) {
                    context.nextToken();
                    updatedSessionActionInfo.setEndedAt(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("processExitCode", targetDepth)) {
                    context.nextToken();
                    updatedSessionActionInfo.setProcessExitCode(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("progressMessage", targetDepth)) {
                    context.nextToken();
                    updatedSessionActionInfo.setProgressMessage(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("progressPercent", targetDepth)) {
                    context.nextToken();
                    updatedSessionActionInfo.setProgressPercent(context.getUnmarshaller(Float.class).unmarshall(context));
                }
                if (context.testExpression("startedAt", targetDepth)) {
                    context.nextToken();
                    updatedSessionActionInfo.setStartedAt(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("updatedAt", targetDepth)) {
                    context.nextToken();
                    updatedSessionActionInfo.setUpdatedAt(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return updatedSessionActionInfo;
    }

    private static UpdatedSessionActionInfoJsonUnmarshaller instance;

    public static UpdatedSessionActionInfoJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new UpdatedSessionActionInfoJsonUnmarshaller();
        return instance;
    }
}
