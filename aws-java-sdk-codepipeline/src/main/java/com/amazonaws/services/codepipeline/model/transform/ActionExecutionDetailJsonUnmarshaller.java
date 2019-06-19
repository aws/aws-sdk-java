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
 * ActionExecutionDetail JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ActionExecutionDetailJsonUnmarshaller implements Unmarshaller<ActionExecutionDetail, JsonUnmarshallerContext> {

    public ActionExecutionDetail unmarshall(JsonUnmarshallerContext context) throws Exception {
        ActionExecutionDetail actionExecutionDetail = new ActionExecutionDetail();

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
                if (context.testExpression("pipelineExecutionId", targetDepth)) {
                    context.nextToken();
                    actionExecutionDetail.setPipelineExecutionId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("actionExecutionId", targetDepth)) {
                    context.nextToken();
                    actionExecutionDetail.setActionExecutionId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("pipelineVersion", targetDepth)) {
                    context.nextToken();
                    actionExecutionDetail.setPipelineVersion(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("stageName", targetDepth)) {
                    context.nextToken();
                    actionExecutionDetail.setStageName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("actionName", targetDepth)) {
                    context.nextToken();
                    actionExecutionDetail.setActionName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("startTime", targetDepth)) {
                    context.nextToken();
                    actionExecutionDetail.setStartTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("lastUpdateTime", targetDepth)) {
                    context.nextToken();
                    actionExecutionDetail.setLastUpdateTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("status", targetDepth)) {
                    context.nextToken();
                    actionExecutionDetail.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("input", targetDepth)) {
                    context.nextToken();
                    actionExecutionDetail.setInput(ActionExecutionInputJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("output", targetDepth)) {
                    context.nextToken();
                    actionExecutionDetail.setOutput(ActionExecutionOutputJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return actionExecutionDetail;
    }

    private static ActionExecutionDetailJsonUnmarshaller instance;

    public static ActionExecutionDetailJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ActionExecutionDetailJsonUnmarshaller();
        return instance;
    }
}
