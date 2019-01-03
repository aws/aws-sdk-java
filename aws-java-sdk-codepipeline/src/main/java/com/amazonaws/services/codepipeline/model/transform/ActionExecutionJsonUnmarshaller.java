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
package com.amazonaws.services.codepipeline.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.codepipeline.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * ActionExecution JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ActionExecutionJsonUnmarshaller implements Unmarshaller<ActionExecution, JsonUnmarshallerContext> {

    public ActionExecution unmarshall(JsonUnmarshallerContext context) throws Exception {
        ActionExecution actionExecution = new ActionExecution();

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
                if (context.testExpression("status", targetDepth)) {
                    context.nextToken();
                    actionExecution.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("summary", targetDepth)) {
                    context.nextToken();
                    actionExecution.setSummary(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("lastStatusChange", targetDepth)) {
                    context.nextToken();
                    actionExecution.setLastStatusChange(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("token", targetDepth)) {
                    context.nextToken();
                    actionExecution.setToken(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("lastUpdatedBy", targetDepth)) {
                    context.nextToken();
                    actionExecution.setLastUpdatedBy(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("externalExecutionId", targetDepth)) {
                    context.nextToken();
                    actionExecution.setExternalExecutionId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("externalExecutionUrl", targetDepth)) {
                    context.nextToken();
                    actionExecution.setExternalExecutionUrl(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("percentComplete", targetDepth)) {
                    context.nextToken();
                    actionExecution.setPercentComplete(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("errorDetails", targetDepth)) {
                    context.nextToken();
                    actionExecution.setErrorDetails(ErrorDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return actionExecution;
    }

    private static ActionExecutionJsonUnmarshaller instance;

    public static ActionExecutionJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ActionExecutionJsonUnmarshaller();
        return instance;
    }
}
