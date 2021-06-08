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
 * LaunchProfile JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LaunchProfileJsonUnmarshaller implements Unmarshaller<LaunchProfile, JsonUnmarshallerContext> {

    public LaunchProfile unmarshall(JsonUnmarshallerContext context) throws Exception {
        LaunchProfile launchProfile = new LaunchProfile();

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
                if (context.testExpression("arn", targetDepth)) {
                    context.nextToken();
                    launchProfile.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("createdAt", targetDepth)) {
                    context.nextToken();
                    launchProfile.setCreatedAt(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("createdBy", targetDepth)) {
                    context.nextToken();
                    launchProfile.setCreatedBy(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("description", targetDepth)) {
                    context.nextToken();
                    launchProfile.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ec2SubnetIds", targetDepth)) {
                    context.nextToken();
                    launchProfile.setEc2SubnetIds(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("launchProfileId", targetDepth)) {
                    context.nextToken();
                    launchProfile.setLaunchProfileId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("launchProfileProtocolVersions", targetDepth)) {
                    context.nextToken();
                    launchProfile.setLaunchProfileProtocolVersions(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("name", targetDepth)) {
                    context.nextToken();
                    launchProfile.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("state", targetDepth)) {
                    context.nextToken();
                    launchProfile.setState(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("statusCode", targetDepth)) {
                    context.nextToken();
                    launchProfile.setStatusCode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("statusMessage", targetDepth)) {
                    context.nextToken();
                    launchProfile.setStatusMessage(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("streamConfiguration", targetDepth)) {
                    context.nextToken();
                    launchProfile.setStreamConfiguration(StreamConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("studioComponentIds", targetDepth)) {
                    context.nextToken();
                    launchProfile.setStudioComponentIds(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("tags", targetDepth)) {
                    context.nextToken();
                    launchProfile.setTags(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context.getUnmarshaller(String.class))
                            .unmarshall(context));
                }
                if (context.testExpression("updatedAt", targetDepth)) {
                    context.nextToken();
                    launchProfile.setUpdatedAt(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("updatedBy", targetDepth)) {
                    context.nextToken();
                    launchProfile.setUpdatedBy(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return launchProfile;
    }

    private static LaunchProfileJsonUnmarshaller instance;

    public static LaunchProfileJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new LaunchProfileJsonUnmarshaller();
        return instance;
    }
}
