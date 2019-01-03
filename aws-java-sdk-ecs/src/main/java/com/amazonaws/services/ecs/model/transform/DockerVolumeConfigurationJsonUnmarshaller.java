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
package com.amazonaws.services.ecs.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.ecs.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * DockerVolumeConfiguration JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DockerVolumeConfigurationJsonUnmarshaller implements Unmarshaller<DockerVolumeConfiguration, JsonUnmarshallerContext> {

    public DockerVolumeConfiguration unmarshall(JsonUnmarshallerContext context) throws Exception {
        DockerVolumeConfiguration dockerVolumeConfiguration = new DockerVolumeConfiguration();

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
                if (context.testExpression("scope", targetDepth)) {
                    context.nextToken();
                    dockerVolumeConfiguration.setScope(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("autoprovision", targetDepth)) {
                    context.nextToken();
                    dockerVolumeConfiguration.setAutoprovision(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("driver", targetDepth)) {
                    context.nextToken();
                    dockerVolumeConfiguration.setDriver(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("driverOpts", targetDepth)) {
                    context.nextToken();
                    dockerVolumeConfiguration.setDriverOpts(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context
                            .getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("labels", targetDepth)) {
                    context.nextToken();
                    dockerVolumeConfiguration.setLabels(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context
                            .getUnmarshaller(String.class)).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return dockerVolumeConfiguration;
    }

    private static DockerVolumeConfigurationJsonUnmarshaller instance;

    public static DockerVolumeConfigurationJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DockerVolumeConfigurationJsonUnmarshaller();
        return instance;
    }
}
