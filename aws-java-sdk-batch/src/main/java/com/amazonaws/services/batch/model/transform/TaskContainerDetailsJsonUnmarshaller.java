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
package com.amazonaws.services.batch.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.batch.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * TaskContainerDetails JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TaskContainerDetailsJsonUnmarshaller implements Unmarshaller<TaskContainerDetails, JsonUnmarshallerContext> {

    public TaskContainerDetails unmarshall(JsonUnmarshallerContext context) throws Exception {
        TaskContainerDetails taskContainerDetails = new TaskContainerDetails();

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
                if (context.testExpression("command", targetDepth)) {
                    context.nextToken();
                    taskContainerDetails.setCommand(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("dependsOn", targetDepth)) {
                    context.nextToken();
                    taskContainerDetails.setDependsOn(new ListUnmarshaller<TaskContainerDependency>(TaskContainerDependencyJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("environment", targetDepth)) {
                    context.nextToken();
                    taskContainerDetails.setEnvironment(new ListUnmarshaller<KeyValuePair>(KeyValuePairJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("essential", targetDepth)) {
                    context.nextToken();
                    taskContainerDetails.setEssential(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("image", targetDepth)) {
                    context.nextToken();
                    taskContainerDetails.setImage(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("linuxParameters", targetDepth)) {
                    context.nextToken();
                    taskContainerDetails.setLinuxParameters(LinuxParametersJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("logConfiguration", targetDepth)) {
                    context.nextToken();
                    taskContainerDetails.setLogConfiguration(LogConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("mountPoints", targetDepth)) {
                    context.nextToken();
                    taskContainerDetails.setMountPoints(new ListUnmarshaller<MountPoint>(MountPointJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("name", targetDepth)) {
                    context.nextToken();
                    taskContainerDetails.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("privileged", targetDepth)) {
                    context.nextToken();
                    taskContainerDetails.setPrivileged(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("readonlyRootFilesystem", targetDepth)) {
                    context.nextToken();
                    taskContainerDetails.setReadonlyRootFilesystem(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("repositoryCredentials", targetDepth)) {
                    context.nextToken();
                    taskContainerDetails.setRepositoryCredentials(RepositoryCredentialsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("resourceRequirements", targetDepth)) {
                    context.nextToken();
                    taskContainerDetails.setResourceRequirements(new ListUnmarshaller<ResourceRequirement>(ResourceRequirementJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("secrets", targetDepth)) {
                    context.nextToken();
                    taskContainerDetails.setSecrets(new ListUnmarshaller<Secret>(SecretJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("ulimits", targetDepth)) {
                    context.nextToken();
                    taskContainerDetails.setUlimits(new ListUnmarshaller<Ulimit>(UlimitJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("user", targetDepth)) {
                    context.nextToken();
                    taskContainerDetails.setUser(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("exitCode", targetDepth)) {
                    context.nextToken();
                    taskContainerDetails.setExitCode(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("reason", targetDepth)) {
                    context.nextToken();
                    taskContainerDetails.setReason(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("logStreamName", targetDepth)) {
                    context.nextToken();
                    taskContainerDetails.setLogStreamName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("networkInterfaces", targetDepth)) {
                    context.nextToken();
                    taskContainerDetails.setNetworkInterfaces(new ListUnmarshaller<NetworkInterface>(NetworkInterfaceJsonUnmarshaller.getInstance())

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

        return taskContainerDetails;
    }

    private static TaskContainerDetailsJsonUnmarshaller instance;

    public static TaskContainerDetailsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new TaskContainerDetailsJsonUnmarshaller();
        return instance;
    }
}
