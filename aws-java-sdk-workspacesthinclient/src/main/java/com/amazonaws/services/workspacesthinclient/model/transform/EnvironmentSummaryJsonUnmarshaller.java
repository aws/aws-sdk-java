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
package com.amazonaws.services.workspacesthinclient.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.workspacesthinclient.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * EnvironmentSummary JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EnvironmentSummaryJsonUnmarshaller implements Unmarshaller<EnvironmentSummary, JsonUnmarshallerContext> {

    public EnvironmentSummary unmarshall(JsonUnmarshallerContext context) throws Exception {
        EnvironmentSummary environmentSummary = new EnvironmentSummary();

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
                if (context.testExpression("id", targetDepth)) {
                    context.nextToken();
                    environmentSummary.setId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("name", targetDepth)) {
                    context.nextToken();
                    environmentSummary.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("desktopArn", targetDepth)) {
                    context.nextToken();
                    environmentSummary.setDesktopArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("desktopEndpoint", targetDepth)) {
                    context.nextToken();
                    environmentSummary.setDesktopEndpoint(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("desktopType", targetDepth)) {
                    context.nextToken();
                    environmentSummary.setDesktopType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("activationCode", targetDepth)) {
                    context.nextToken();
                    environmentSummary.setActivationCode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("softwareSetUpdateSchedule", targetDepth)) {
                    context.nextToken();
                    environmentSummary.setSoftwareSetUpdateSchedule(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("maintenanceWindow", targetDepth)) {
                    context.nextToken();
                    environmentSummary.setMaintenanceWindow(MaintenanceWindowJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("softwareSetUpdateMode", targetDepth)) {
                    context.nextToken();
                    environmentSummary.setSoftwareSetUpdateMode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("desiredSoftwareSetId", targetDepth)) {
                    context.nextToken();
                    environmentSummary.setDesiredSoftwareSetId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("pendingSoftwareSetId", targetDepth)) {
                    context.nextToken();
                    environmentSummary.setPendingSoftwareSetId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("createdAt", targetDepth)) {
                    context.nextToken();
                    environmentSummary.setCreatedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("updatedAt", targetDepth)) {
                    context.nextToken();
                    environmentSummary.setUpdatedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("arn", targetDepth)) {
                    context.nextToken();
                    environmentSummary.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return environmentSummary;
    }

    private static EnvironmentSummaryJsonUnmarshaller instance;

    public static EnvironmentSummaryJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new EnvironmentSummaryJsonUnmarshaller();
        return instance;
    }
}
