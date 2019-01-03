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
package com.amazonaws.services.simplesystemsmanagement.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.simplesystemsmanagement.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * GetMaintenanceWindowTaskResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetMaintenanceWindowTaskResultJsonUnmarshaller implements Unmarshaller<GetMaintenanceWindowTaskResult, JsonUnmarshallerContext> {

    public GetMaintenanceWindowTaskResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetMaintenanceWindowTaskResult getMaintenanceWindowTaskResult = new GetMaintenanceWindowTaskResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return getMaintenanceWindowTaskResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("WindowId", targetDepth)) {
                    context.nextToken();
                    getMaintenanceWindowTaskResult.setWindowId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("WindowTaskId", targetDepth)) {
                    context.nextToken();
                    getMaintenanceWindowTaskResult.setWindowTaskId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Targets", targetDepth)) {
                    context.nextToken();
                    getMaintenanceWindowTaskResult.setTargets(new ListUnmarshaller<Target>(TargetJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("TaskArn", targetDepth)) {
                    context.nextToken();
                    getMaintenanceWindowTaskResult.setTaskArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ServiceRoleArn", targetDepth)) {
                    context.nextToken();
                    getMaintenanceWindowTaskResult.setServiceRoleArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("TaskType", targetDepth)) {
                    context.nextToken();
                    getMaintenanceWindowTaskResult.setTaskType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("TaskParameters", targetDepth)) {
                    context.nextToken();
                    getMaintenanceWindowTaskResult.setTaskParameters(new MapUnmarshaller<String, MaintenanceWindowTaskParameterValueExpression>(context
                            .getUnmarshaller(String.class), MaintenanceWindowTaskParameterValueExpressionJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("TaskInvocationParameters", targetDepth)) {
                    context.nextToken();
                    getMaintenanceWindowTaskResult.setTaskInvocationParameters(MaintenanceWindowTaskInvocationParametersJsonUnmarshaller.getInstance()
                            .unmarshall(context));
                }
                if (context.testExpression("Priority", targetDepth)) {
                    context.nextToken();
                    getMaintenanceWindowTaskResult.setPriority(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("MaxConcurrency", targetDepth)) {
                    context.nextToken();
                    getMaintenanceWindowTaskResult.setMaxConcurrency(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("MaxErrors", targetDepth)) {
                    context.nextToken();
                    getMaintenanceWindowTaskResult.setMaxErrors(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LoggingInfo", targetDepth)) {
                    context.nextToken();
                    getMaintenanceWindowTaskResult.setLoggingInfo(LoggingInfoJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Name", targetDepth)) {
                    context.nextToken();
                    getMaintenanceWindowTaskResult.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Description", targetDepth)) {
                    context.nextToken();
                    getMaintenanceWindowTaskResult.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return getMaintenanceWindowTaskResult;
    }

    private static GetMaintenanceWindowTaskResultJsonUnmarshaller instance;

    public static GetMaintenanceWindowTaskResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetMaintenanceWindowTaskResultJsonUnmarshaller();
        return instance;
    }
}
