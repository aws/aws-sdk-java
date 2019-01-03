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
 * GetMaintenanceWindowExecutionResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetMaintenanceWindowExecutionResultJsonUnmarshaller implements Unmarshaller<GetMaintenanceWindowExecutionResult, JsonUnmarshallerContext> {

    public GetMaintenanceWindowExecutionResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetMaintenanceWindowExecutionResult getMaintenanceWindowExecutionResult = new GetMaintenanceWindowExecutionResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return getMaintenanceWindowExecutionResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("WindowExecutionId", targetDepth)) {
                    context.nextToken();
                    getMaintenanceWindowExecutionResult.setWindowExecutionId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("TaskIds", targetDepth)) {
                    context.nextToken();
                    getMaintenanceWindowExecutionResult.setTaskIds(new ListUnmarshaller<String>(context.getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    context.nextToken();
                    getMaintenanceWindowExecutionResult.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("StatusDetails", targetDepth)) {
                    context.nextToken();
                    getMaintenanceWindowExecutionResult.setStatusDetails(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("StartTime", targetDepth)) {
                    context.nextToken();
                    getMaintenanceWindowExecutionResult.setStartTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("EndTime", targetDepth)) {
                    context.nextToken();
                    getMaintenanceWindowExecutionResult.setEndTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return getMaintenanceWindowExecutionResult;
    }

    private static GetMaintenanceWindowExecutionResultJsonUnmarshaller instance;

    public static GetMaintenanceWindowExecutionResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetMaintenanceWindowExecutionResultJsonUnmarshaller();
        return instance;
    }
}
