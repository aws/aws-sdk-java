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
 * UpdateMaintenanceWindowTaskResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateMaintenanceWindowTaskResultJsonUnmarshaller implements Unmarshaller<UpdateMaintenanceWindowTaskResult, JsonUnmarshallerContext> {

    public UpdateMaintenanceWindowTaskResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        UpdateMaintenanceWindowTaskResult updateMaintenanceWindowTaskResult = new UpdateMaintenanceWindowTaskResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return updateMaintenanceWindowTaskResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("WindowId", targetDepth)) {
                    context.nextToken();
                    updateMaintenanceWindowTaskResult.setWindowId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("WindowTaskId", targetDepth)) {
                    context.nextToken();
                    updateMaintenanceWindowTaskResult.setWindowTaskId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Targets", targetDepth)) {
                    context.nextToken();
                    updateMaintenanceWindowTaskResult.setTargets(new ListUnmarshaller<Target>(TargetJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("TaskArn", targetDepth)) {
                    context.nextToken();
                    updateMaintenanceWindowTaskResult.setTaskArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ServiceRoleArn", targetDepth)) {
                    context.nextToken();
                    updateMaintenanceWindowTaskResult.setServiceRoleArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("TaskParameters", targetDepth)) {
                    context.nextToken();
                    updateMaintenanceWindowTaskResult.setTaskParameters(new MapUnmarshaller<String, MaintenanceWindowTaskParameterValueExpression>(context
                            .getUnmarshaller(String.class), MaintenanceWindowTaskParameterValueExpressionJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("TaskInvocationParameters", targetDepth)) {
                    context.nextToken();
                    updateMaintenanceWindowTaskResult.setTaskInvocationParameters(MaintenanceWindowTaskInvocationParametersJsonUnmarshaller.getInstance()
                            .unmarshall(context));
                }
                if (context.testExpression("Priority", targetDepth)) {
                    context.nextToken();
                    updateMaintenanceWindowTaskResult.setPriority(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("MaxConcurrency", targetDepth)) {
                    context.nextToken();
                    updateMaintenanceWindowTaskResult.setMaxConcurrency(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("MaxErrors", targetDepth)) {
                    context.nextToken();
                    updateMaintenanceWindowTaskResult.setMaxErrors(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LoggingInfo", targetDepth)) {
                    context.nextToken();
                    updateMaintenanceWindowTaskResult.setLoggingInfo(LoggingInfoJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Name", targetDepth)) {
                    context.nextToken();
                    updateMaintenanceWindowTaskResult.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Description", targetDepth)) {
                    context.nextToken();
                    updateMaintenanceWindowTaskResult.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return updateMaintenanceWindowTaskResult;
    }

    private static UpdateMaintenanceWindowTaskResultJsonUnmarshaller instance;

    public static UpdateMaintenanceWindowTaskResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new UpdateMaintenanceWindowTaskResultJsonUnmarshaller();
        return instance;
    }
}
