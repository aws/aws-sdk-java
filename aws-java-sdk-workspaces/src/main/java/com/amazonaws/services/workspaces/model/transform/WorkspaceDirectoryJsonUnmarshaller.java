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
package com.amazonaws.services.workspaces.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.workspaces.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * WorkspaceDirectory JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class WorkspaceDirectoryJsonUnmarshaller implements Unmarshaller<WorkspaceDirectory, JsonUnmarshallerContext> {

    public WorkspaceDirectory unmarshall(JsonUnmarshallerContext context) throws Exception {
        WorkspaceDirectory workspaceDirectory = new WorkspaceDirectory();

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
                if (context.testExpression("DirectoryId", targetDepth)) {
                    context.nextToken();
                    workspaceDirectory.setDirectoryId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Alias", targetDepth)) {
                    context.nextToken();
                    workspaceDirectory.setAlias(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DirectoryName", targetDepth)) {
                    context.nextToken();
                    workspaceDirectory.setDirectoryName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("RegistrationCode", targetDepth)) {
                    context.nextToken();
                    workspaceDirectory.setRegistrationCode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SubnetIds", targetDepth)) {
                    context.nextToken();
                    workspaceDirectory.setSubnetIds(new ListUnmarshaller<String>(context.getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("DnsIpAddresses", targetDepth)) {
                    context.nextToken();
                    workspaceDirectory.setDnsIpAddresses(new ListUnmarshaller<String>(context.getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("CustomerUserName", targetDepth)) {
                    context.nextToken();
                    workspaceDirectory.setCustomerUserName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("IamRoleId", targetDepth)) {
                    context.nextToken();
                    workspaceDirectory.setIamRoleId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DirectoryType", targetDepth)) {
                    context.nextToken();
                    workspaceDirectory.setDirectoryType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("WorkspaceSecurityGroupId", targetDepth)) {
                    context.nextToken();
                    workspaceDirectory.setWorkspaceSecurityGroupId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("State", targetDepth)) {
                    context.nextToken();
                    workspaceDirectory.setState(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("WorkspaceCreationProperties", targetDepth)) {
                    context.nextToken();
                    workspaceDirectory.setWorkspaceCreationProperties(DefaultWorkspaceCreationPropertiesJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ipGroupIds", targetDepth)) {
                    context.nextToken();
                    workspaceDirectory.setIpGroupIds(new ListUnmarshaller<String>(context.getUnmarshaller(String.class)).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return workspaceDirectory;
    }

    private static WorkspaceDirectoryJsonUnmarshaller instance;

    public static WorkspaceDirectoryJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new WorkspaceDirectoryJsonUnmarshaller();
        return instance;
    }
}
