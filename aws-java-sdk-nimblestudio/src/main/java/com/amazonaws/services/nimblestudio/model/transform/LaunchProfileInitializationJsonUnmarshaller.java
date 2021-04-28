/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.nimblestudio.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.nimblestudio.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * LaunchProfileInitialization JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LaunchProfileInitializationJsonUnmarshaller implements Unmarshaller<LaunchProfileInitialization, JsonUnmarshallerContext> {

    public LaunchProfileInitialization unmarshall(JsonUnmarshallerContext context) throws Exception {
        LaunchProfileInitialization launchProfileInitialization = new LaunchProfileInitialization();

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
                if (context.testExpression("activeDirectory", targetDepth)) {
                    context.nextToken();
                    launchProfileInitialization
                            .setActiveDirectory(LaunchProfileInitializationActiveDirectoryJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ec2SecurityGroupIds", targetDepth)) {
                    context.nextToken();
                    launchProfileInitialization.setEc2SecurityGroupIds(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("launchProfileId", targetDepth)) {
                    context.nextToken();
                    launchProfileInitialization.setLaunchProfileId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("launchProfileProtocolVersion", targetDepth)) {
                    context.nextToken();
                    launchProfileInitialization.setLaunchProfileProtocolVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("launchPurpose", targetDepth)) {
                    context.nextToken();
                    launchProfileInitialization.setLaunchPurpose(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("name", targetDepth)) {
                    context.nextToken();
                    launchProfileInitialization.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("platform", targetDepth)) {
                    context.nextToken();
                    launchProfileInitialization.setPlatform(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("systemInitializationScripts", targetDepth)) {
                    context.nextToken();
                    launchProfileInitialization.setSystemInitializationScripts(new ListUnmarshaller<LaunchProfileInitializationScript>(
                            LaunchProfileInitializationScriptJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("userInitializationScripts", targetDepth)) {
                    context.nextToken();
                    launchProfileInitialization.setUserInitializationScripts(new ListUnmarshaller<LaunchProfileInitializationScript>(
                            LaunchProfileInitializationScriptJsonUnmarshaller.getInstance())

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

        return launchProfileInitialization;
    }

    private static LaunchProfileInitializationJsonUnmarshaller instance;

    public static LaunchProfileInitializationJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new LaunchProfileInitializationJsonUnmarshaller();
        return instance;
    }
}
