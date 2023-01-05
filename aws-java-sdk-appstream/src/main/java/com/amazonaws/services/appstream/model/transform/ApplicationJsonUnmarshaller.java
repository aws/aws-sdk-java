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
package com.amazonaws.services.appstream.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.appstream.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * Application JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ApplicationJsonUnmarshaller implements Unmarshaller<Application, JsonUnmarshallerContext> {

    public Application unmarshall(JsonUnmarshallerContext context) throws Exception {
        Application application = new Application();

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
                if (context.testExpression("Name", targetDepth)) {
                    context.nextToken();
                    application.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DisplayName", targetDepth)) {
                    context.nextToken();
                    application.setDisplayName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("IconURL", targetDepth)) {
                    context.nextToken();
                    application.setIconURL(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LaunchPath", targetDepth)) {
                    context.nextToken();
                    application.setLaunchPath(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LaunchParameters", targetDepth)) {
                    context.nextToken();
                    application.setLaunchParameters(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Enabled", targetDepth)) {
                    context.nextToken();
                    application.setEnabled(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("Metadata", targetDepth)) {
                    context.nextToken();
                    application.setMetadata(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context.getUnmarshaller(String.class))
                            .unmarshall(context));
                }
                if (context.testExpression("WorkingDirectory", targetDepth)) {
                    context.nextToken();
                    application.setWorkingDirectory(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Description", targetDepth)) {
                    context.nextToken();
                    application.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Arn", targetDepth)) {
                    context.nextToken();
                    application.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("AppBlockArn", targetDepth)) {
                    context.nextToken();
                    application.setAppBlockArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("IconS3Location", targetDepth)) {
                    context.nextToken();
                    application.setIconS3Location(S3LocationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Platforms", targetDepth)) {
                    context.nextToken();
                    application.setPlatforms(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("InstanceFamilies", targetDepth)) {
                    context.nextToken();
                    application.setInstanceFamilies(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("CreatedTime", targetDepth)) {
                    context.nextToken();
                    application.setCreatedTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return application;
    }

    private static ApplicationJsonUnmarshaller instance;

    public static ApplicationJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ApplicationJsonUnmarshaller();
        return instance;
    }
}
