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
package com.amazonaws.services.servermigration.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.servermigration.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * ServerLaunchConfiguration JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ServerLaunchConfigurationJsonUnmarshaller implements Unmarshaller<ServerLaunchConfiguration, JsonUnmarshallerContext> {

    public ServerLaunchConfiguration unmarshall(JsonUnmarshallerContext context) throws Exception {
        ServerLaunchConfiguration serverLaunchConfiguration = new ServerLaunchConfiguration();

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
                if (context.testExpression("server", targetDepth)) {
                    context.nextToken();
                    serverLaunchConfiguration.setServer(ServerJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("logicalId", targetDepth)) {
                    context.nextToken();
                    serverLaunchConfiguration.setLogicalId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("vpc", targetDepth)) {
                    context.nextToken();
                    serverLaunchConfiguration.setVpc(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("subnet", targetDepth)) {
                    context.nextToken();
                    serverLaunchConfiguration.setSubnet(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("securityGroup", targetDepth)) {
                    context.nextToken();
                    serverLaunchConfiguration.setSecurityGroup(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ec2KeyName", targetDepth)) {
                    context.nextToken();
                    serverLaunchConfiguration.setEc2KeyName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("userData", targetDepth)) {
                    context.nextToken();
                    serverLaunchConfiguration.setUserData(UserDataJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("instanceType", targetDepth)) {
                    context.nextToken();
                    serverLaunchConfiguration.setInstanceType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("associatePublicIpAddress", targetDepth)) {
                    context.nextToken();
                    serverLaunchConfiguration.setAssociatePublicIpAddress(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return serverLaunchConfiguration;
    }

    private static ServerLaunchConfigurationJsonUnmarshaller instance;

    public static ServerLaunchConfigurationJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ServerLaunchConfigurationJsonUnmarshaller();
        return instance;
    }
}
