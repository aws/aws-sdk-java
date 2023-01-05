/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.managedgrafana.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.managedgrafana.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * WorkspaceDescription JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class WorkspaceDescriptionJsonUnmarshaller implements Unmarshaller<WorkspaceDescription, JsonUnmarshallerContext> {

    public WorkspaceDescription unmarshall(JsonUnmarshallerContext context) throws Exception {
        WorkspaceDescription workspaceDescription = new WorkspaceDescription();

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
                if (context.testExpression("accountAccessType", targetDepth)) {
                    context.nextToken();
                    workspaceDescription.setAccountAccessType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("authentication", targetDepth)) {
                    context.nextToken();
                    workspaceDescription.setAuthentication(AuthenticationSummaryJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("created", targetDepth)) {
                    context.nextToken();
                    workspaceDescription.setCreated(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("dataSources", targetDepth)) {
                    context.nextToken();
                    workspaceDescription.setDataSources(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("description", targetDepth)) {
                    context.nextToken();
                    workspaceDescription.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("endpoint", targetDepth)) {
                    context.nextToken();
                    workspaceDescription.setEndpoint(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("freeTrialConsumed", targetDepth)) {
                    context.nextToken();
                    workspaceDescription.setFreeTrialConsumed(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("freeTrialExpiration", targetDepth)) {
                    context.nextToken();
                    workspaceDescription.setFreeTrialExpiration(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("grafanaVersion", targetDepth)) {
                    context.nextToken();
                    workspaceDescription.setGrafanaVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("id", targetDepth)) {
                    context.nextToken();
                    workspaceDescription.setId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("licenseExpiration", targetDepth)) {
                    context.nextToken();
                    workspaceDescription.setLicenseExpiration(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("licenseType", targetDepth)) {
                    context.nextToken();
                    workspaceDescription.setLicenseType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("modified", targetDepth)) {
                    context.nextToken();
                    workspaceDescription.setModified(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("name", targetDepth)) {
                    context.nextToken();
                    workspaceDescription.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("notificationDestinations", targetDepth)) {
                    context.nextToken();
                    workspaceDescription.setNotificationDestinations(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("organizationRoleName", targetDepth)) {
                    context.nextToken();
                    workspaceDescription.setOrganizationRoleName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("organizationalUnits", targetDepth)) {
                    context.nextToken();
                    workspaceDescription.setOrganizationalUnits(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("permissionType", targetDepth)) {
                    context.nextToken();
                    workspaceDescription.setPermissionType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("stackSetName", targetDepth)) {
                    context.nextToken();
                    workspaceDescription.setStackSetName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("status", targetDepth)) {
                    context.nextToken();
                    workspaceDescription.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("tags", targetDepth)) {
                    context.nextToken();
                    workspaceDescription.setTags(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context
                            .getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("vpcConfiguration", targetDepth)) {
                    context.nextToken();
                    workspaceDescription.setVpcConfiguration(VpcConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("workspaceRoleArn", targetDepth)) {
                    context.nextToken();
                    workspaceDescription.setWorkspaceRoleArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return workspaceDescription;
    }

    private static WorkspaceDescriptionJsonUnmarshaller instance;

    public static WorkspaceDescriptionJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new WorkspaceDescriptionJsonUnmarshaller();
        return instance;
    }
}
