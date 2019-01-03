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

import java.util.Map;
import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.simplesystemsmanagement.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * GetMaintenanceWindowExecutionTaskResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetMaintenanceWindowExecutionTaskResultJsonUnmarshaller implements Unmarshaller<GetMaintenanceWindowExecutionTaskResult, JsonUnmarshallerContext> {

    public GetMaintenanceWindowExecutionTaskResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetMaintenanceWindowExecutionTaskResult getMaintenanceWindowExecutionTaskResult = new GetMaintenanceWindowExecutionTaskResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return getMaintenanceWindowExecutionTaskResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("WindowExecutionId", targetDepth)) {
                    context.nextToken();
                    getMaintenanceWindowExecutionTaskResult.setWindowExecutionId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("TaskExecutionId", targetDepth)) {
                    context.nextToken();
                    getMaintenanceWindowExecutionTaskResult.setTaskExecutionId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("TaskArn", targetDepth)) {
                    context.nextToken();
                    getMaintenanceWindowExecutionTaskResult.setTaskArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ServiceRole", targetDepth)) {
                    context.nextToken();
                    getMaintenanceWindowExecutionTaskResult.setServiceRole(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Type", targetDepth)) {
                    context.nextToken();
                    getMaintenanceWindowExecutionTaskResult.setType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("TaskParameters", targetDepth)) {
                    context.nextToken();
                    getMaintenanceWindowExecutionTaskResult
                            .setTaskParameters(new ListUnmarshaller<java.util.Map<String, MaintenanceWindowTaskParameterValueExpression>>(
                                    new MapUnmarshaller<String, MaintenanceWindowTaskParameterValueExpression>(context.getUnmarshaller(String.class),
                                            MaintenanceWindowTaskParameterValueExpressionJsonUnmarshaller.getInstance())).unmarshall(context));
                }
                if (context.testExpression("Priority", targetDepth)) {
                    context.nextToken();
                    getMaintenanceWindowExecutionTaskResult.setPriority(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("MaxConcurrency", targetDepth)) {
                    context.nextToken();
                    getMaintenanceWindowExecutionTaskResult.setMaxConcurrency(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("MaxErrors", targetDepth)) {
                    context.nextToken();
                    getMaintenanceWindowExecutionTaskResult.setMaxErrors(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    context.nextToken();
                    getMaintenanceWindowExecutionTaskResult.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("StatusDetails", targetDepth)) {
                    context.nextToken();
                    getMaintenanceWindowExecutionTaskResult.setStatusDetails(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("StartTime", targetDepth)) {
                    context.nextToken();
                    getMaintenanceWindowExecutionTaskResult.setStartTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("EndTime", targetDepth)) {
                    context.nextToken();
                    getMaintenanceWindowExecutionTaskResult.setEndTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return getMaintenanceWindowExecutionTaskResult;
    }

    private static GetMaintenanceWindowExecutionTaskResultJsonUnmarshaller instance;

    public static GetMaintenanceWindowExecutionTaskResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetMaintenanceWindowExecutionTaskResultJsonUnmarshaller();
        return instance;
    }
}
