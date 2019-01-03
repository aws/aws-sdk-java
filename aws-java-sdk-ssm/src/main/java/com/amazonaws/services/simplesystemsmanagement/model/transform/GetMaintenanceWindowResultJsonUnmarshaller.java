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
 * GetMaintenanceWindowResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetMaintenanceWindowResultJsonUnmarshaller implements Unmarshaller<GetMaintenanceWindowResult, JsonUnmarshallerContext> {

    public GetMaintenanceWindowResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetMaintenanceWindowResult getMaintenanceWindowResult = new GetMaintenanceWindowResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return getMaintenanceWindowResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("WindowId", targetDepth)) {
                    context.nextToken();
                    getMaintenanceWindowResult.setWindowId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Name", targetDepth)) {
                    context.nextToken();
                    getMaintenanceWindowResult.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Description", targetDepth)) {
                    context.nextToken();
                    getMaintenanceWindowResult.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("StartDate", targetDepth)) {
                    context.nextToken();
                    getMaintenanceWindowResult.setStartDate(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EndDate", targetDepth)) {
                    context.nextToken();
                    getMaintenanceWindowResult.setEndDate(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Schedule", targetDepth)) {
                    context.nextToken();
                    getMaintenanceWindowResult.setSchedule(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ScheduleTimezone", targetDepth)) {
                    context.nextToken();
                    getMaintenanceWindowResult.setScheduleTimezone(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("NextExecutionTime", targetDepth)) {
                    context.nextToken();
                    getMaintenanceWindowResult.setNextExecutionTime(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Duration", targetDepth)) {
                    context.nextToken();
                    getMaintenanceWindowResult.setDuration(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("Cutoff", targetDepth)) {
                    context.nextToken();
                    getMaintenanceWindowResult.setCutoff(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("AllowUnassociatedTargets", targetDepth)) {
                    context.nextToken();
                    getMaintenanceWindowResult.setAllowUnassociatedTargets(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("Enabled", targetDepth)) {
                    context.nextToken();
                    getMaintenanceWindowResult.setEnabled(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("CreatedDate", targetDepth)) {
                    context.nextToken();
                    getMaintenanceWindowResult.setCreatedDate(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("ModifiedDate", targetDepth)) {
                    context.nextToken();
                    getMaintenanceWindowResult.setModifiedDate(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return getMaintenanceWindowResult;
    }

    private static GetMaintenanceWindowResultJsonUnmarshaller instance;

    public static GetMaintenanceWindowResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetMaintenanceWindowResultJsonUnmarshaller();
        return instance;
    }
}
