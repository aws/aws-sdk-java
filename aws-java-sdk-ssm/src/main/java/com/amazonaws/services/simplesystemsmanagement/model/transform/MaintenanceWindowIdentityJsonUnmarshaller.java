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
 * MaintenanceWindowIdentity JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MaintenanceWindowIdentityJsonUnmarshaller implements Unmarshaller<MaintenanceWindowIdentity, JsonUnmarshallerContext> {

    public MaintenanceWindowIdentity unmarshall(JsonUnmarshallerContext context) throws Exception {
        MaintenanceWindowIdentity maintenanceWindowIdentity = new MaintenanceWindowIdentity();

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
                if (context.testExpression("WindowId", targetDepth)) {
                    context.nextToken();
                    maintenanceWindowIdentity.setWindowId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Name", targetDepth)) {
                    context.nextToken();
                    maintenanceWindowIdentity.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Description", targetDepth)) {
                    context.nextToken();
                    maintenanceWindowIdentity.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Enabled", targetDepth)) {
                    context.nextToken();
                    maintenanceWindowIdentity.setEnabled(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("Duration", targetDepth)) {
                    context.nextToken();
                    maintenanceWindowIdentity.setDuration(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("Cutoff", targetDepth)) {
                    context.nextToken();
                    maintenanceWindowIdentity.setCutoff(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("Schedule", targetDepth)) {
                    context.nextToken();
                    maintenanceWindowIdentity.setSchedule(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ScheduleTimezone", targetDepth)) {
                    context.nextToken();
                    maintenanceWindowIdentity.setScheduleTimezone(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EndDate", targetDepth)) {
                    context.nextToken();
                    maintenanceWindowIdentity.setEndDate(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("StartDate", targetDepth)) {
                    context.nextToken();
                    maintenanceWindowIdentity.setStartDate(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("NextExecutionTime", targetDepth)) {
                    context.nextToken();
                    maintenanceWindowIdentity.setNextExecutionTime(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return maintenanceWindowIdentity;
    }

    private static MaintenanceWindowIdentityJsonUnmarshaller instance;

    public static MaintenanceWindowIdentityJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new MaintenanceWindowIdentityJsonUnmarshaller();
        return instance;
    }
}
