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
 * Environment JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EnvironmentJsonUnmarshaller implements Unmarshaller<Environment, JsonUnmarshallerContext> {

    public Environment unmarshall(JsonUnmarshallerContext context) throws Exception {
        Environment environment = new Environment();

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
                    environment.setId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("name", targetDepth)) {
                    context.nextToken();
                    environment.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("desktopArn", targetDepth)) {
                    context.nextToken();
                    environment.setDesktopArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("desktopEndpoint", targetDepth)) {
                    context.nextToken();
                    environment.setDesktopEndpoint(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("desktopType", targetDepth)) {
                    context.nextToken();
                    environment.setDesktopType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("activationCode", targetDepth)) {
                    context.nextToken();
                    environment.setActivationCode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("registeredDevicesCount", targetDepth)) {
                    context.nextToken();
                    environment.setRegisteredDevicesCount(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("softwareSetUpdateSchedule", targetDepth)) {
                    context.nextToken();
                    environment.setSoftwareSetUpdateSchedule(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("maintenanceWindow", targetDepth)) {
                    context.nextToken();
                    environment.setMaintenanceWindow(MaintenanceWindowJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("softwareSetUpdateMode", targetDepth)) {
                    context.nextToken();
                    environment.setSoftwareSetUpdateMode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("desiredSoftwareSetId", targetDepth)) {
                    context.nextToken();
                    environment.setDesiredSoftwareSetId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("pendingSoftwareSetId", targetDepth)) {
                    context.nextToken();
                    environment.setPendingSoftwareSetId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("pendingSoftwareSetVersion", targetDepth)) {
                    context.nextToken();
                    environment.setPendingSoftwareSetVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("softwareSetComplianceStatus", targetDepth)) {
                    context.nextToken();
                    environment.setSoftwareSetComplianceStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("createdAt", targetDepth)) {
                    context.nextToken();
                    environment.setCreatedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("updatedAt", targetDepth)) {
                    context.nextToken();
                    environment.setUpdatedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("arn", targetDepth)) {
                    context.nextToken();
                    environment.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("kmsKeyArn", targetDepth)) {
                    context.nextToken();
                    environment.setKmsKeyArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("tags", targetDepth)) {
                    context.nextToken();
                    environment.setTags(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context.getUnmarshaller(String.class))
                            .unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return environment;
    }

    private static EnvironmentJsonUnmarshaller instance;

    public static EnvironmentJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new EnvironmentJsonUnmarshaller();
        return instance;
    }
}
