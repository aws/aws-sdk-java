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
 * ContainerDetail JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ContainerDetailJsonUnmarshaller implements Unmarshaller<ContainerDetail, JsonUnmarshallerContext> {

    public ContainerDetail unmarshall(JsonUnmarshallerContext context) throws Exception {
        ContainerDetail containerDetail = new ContainerDetail();

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
                    containerDetail.setImage(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("vcpus", targetDepth)) {
                    context.nextToken();
                    containerDetail.setVcpus(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("memory", targetDepth)) {
                    context.nextToken();
                    containerDetail.setMemory(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("command", targetDepth)) {
                    context.nextToken();
                    containerDetail.setCommand(new ListUnmarshaller<String>(context.getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("jobRoleArn", targetDepth)) {
                    context.nextToken();
                    containerDetail.setJobRoleArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("volumes", targetDepth)) {
                    context.nextToken();
                    containerDetail.setVolumes(new ListUnmarshaller<Volume>(VolumeJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("environment", targetDepth)) {
                    context.nextToken();
                    containerDetail.setEnvironment(new ListUnmarshaller<KeyValuePair>(KeyValuePairJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("mountPoints", targetDepth)) {
                    context.nextToken();
                    containerDetail.setMountPoints(new ListUnmarshaller<MountPoint>(MountPointJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("readonlyRootFilesystem", targetDepth)) {
                    context.nextToken();
                    containerDetail.setReadonlyRootFilesystem(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("ulimits", targetDepth)) {
                    context.nextToken();
                    containerDetail.setUlimits(new ListUnmarshaller<Ulimit>(UlimitJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("privileged", targetDepth)) {
                    context.nextToken();
                    containerDetail.setPrivileged(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("user", targetDepth)) {
                    context.nextToken();
                    containerDetail.setUser(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("exitCode", targetDepth)) {
                    context.nextToken();
                    containerDetail.setExitCode(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("reason", targetDepth)) {
                    context.nextToken();
                    containerDetail.setReason(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("containerInstanceArn", targetDepth)) {
                    context.nextToken();
                    containerDetail.setContainerInstanceArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("taskArn", targetDepth)) {
                    context.nextToken();
                    containerDetail.setTaskArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("logStreamName", targetDepth)) {
                    context.nextToken();
                    containerDetail.setLogStreamName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("instanceType", targetDepth)) {
                    context.nextToken();
                    containerDetail.setInstanceType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("networkInterfaces", targetDepth)) {
                    context.nextToken();
                    containerDetail.setNetworkInterfaces(new ListUnmarshaller<NetworkInterface>(NetworkInterfaceJsonUnmarshaller.getInstance())
                            .unmarshall(context));
                }
                if (context.testExpression("resourceRequirements", targetDepth)) {
                    context.nextToken();
                    containerDetail.setResourceRequirements(new ListUnmarshaller<ResourceRequirement>(ResourceRequirementJsonUnmarshaller.getInstance())
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

        return containerDetail;
    }

    private static ContainerDetailJsonUnmarshaller instance;

    public static ContainerDetailJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ContainerDetailJsonUnmarshaller();
        return instance;
    }
}
