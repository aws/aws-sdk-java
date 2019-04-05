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
package com.amazonaws.services.batch.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.batch.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * ContainerProperties JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ContainerPropertiesJsonUnmarshaller implements Unmarshaller<ContainerProperties, JsonUnmarshallerContext> {

    public ContainerProperties unmarshall(JsonUnmarshallerContext context) throws Exception {
        ContainerProperties containerProperties = new ContainerProperties();

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
                if (context.testExpression("image", targetDepth)) {
                    context.nextToken();
                    containerProperties.setImage(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("vcpus", targetDepth)) {
                    context.nextToken();
                    containerProperties.setVcpus(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("memory", targetDepth)) {
                    context.nextToken();
                    containerProperties.setMemory(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("command", targetDepth)) {
                    context.nextToken();
                    containerProperties.setCommand(new ListUnmarshaller<String>(context.getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("jobRoleArn", targetDepth)) {
                    context.nextToken();
                    containerProperties.setJobRoleArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("volumes", targetDepth)) {
                    context.nextToken();
                    containerProperties.setVolumes(new ListUnmarshaller<Volume>(VolumeJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("environment", targetDepth)) {
                    context.nextToken();
                    containerProperties.setEnvironment(new ListUnmarshaller<KeyValuePair>(KeyValuePairJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("mountPoints", targetDepth)) {
                    context.nextToken();
                    containerProperties.setMountPoints(new ListUnmarshaller<MountPoint>(MountPointJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("readonlyRootFilesystem", targetDepth)) {
                    context.nextToken();
                    containerProperties.setReadonlyRootFilesystem(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("privileged", targetDepth)) {
                    context.nextToken();
                    containerProperties.setPrivileged(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("ulimits", targetDepth)) {
                    context.nextToken();
                    containerProperties.setUlimits(new ListUnmarshaller<Ulimit>(UlimitJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("user", targetDepth)) {
                    context.nextToken();
                    containerProperties.setUser(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("instanceType", targetDepth)) {
                    context.nextToken();
                    containerProperties.setInstanceType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("resourceRequirements", targetDepth)) {
                    context.nextToken();
                    containerProperties.setResourceRequirements(new ListUnmarshaller<ResourceRequirement>(ResourceRequirementJsonUnmarshaller.getInstance())
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

        return containerProperties;
    }

    private static ContainerPropertiesJsonUnmarshaller instance;

    public static ContainerPropertiesJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ContainerPropertiesJsonUnmarshaller();
        return instance;
    }
}
