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
package com.amazonaws.services.securityhub.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.securityhub.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * AwsEcsTaskDefinitionDetails JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsEcsTaskDefinitionDetailsJsonUnmarshaller implements Unmarshaller<AwsEcsTaskDefinitionDetails, JsonUnmarshallerContext> {

    public AwsEcsTaskDefinitionDetails unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsEcsTaskDefinitionDetails awsEcsTaskDefinitionDetails = new AwsEcsTaskDefinitionDetails();

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
                if (context.testExpression("ContainerDefinitions", targetDepth)) {
                    context.nextToken();
                    awsEcsTaskDefinitionDetails.setContainerDefinitions(new ListUnmarshaller<AwsEcsTaskDefinitionContainerDefinitionsDetails>(
                            AwsEcsTaskDefinitionContainerDefinitionsDetailsJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("Cpu", targetDepth)) {
                    context.nextToken();
                    awsEcsTaskDefinitionDetails.setCpu(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ExecutionRoleArn", targetDepth)) {
                    context.nextToken();
                    awsEcsTaskDefinitionDetails.setExecutionRoleArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Family", targetDepth)) {
                    context.nextToken();
                    awsEcsTaskDefinitionDetails.setFamily(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("InferenceAccelerators", targetDepth)) {
                    context.nextToken();
                    awsEcsTaskDefinitionDetails.setInferenceAccelerators(new ListUnmarshaller<AwsEcsTaskDefinitionInferenceAcceleratorsDetails>(
                            AwsEcsTaskDefinitionInferenceAcceleratorsDetailsJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("IpcMode", targetDepth)) {
                    context.nextToken();
                    awsEcsTaskDefinitionDetails.setIpcMode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Memory", targetDepth)) {
                    context.nextToken();
                    awsEcsTaskDefinitionDetails.setMemory(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("NetworkMode", targetDepth)) {
                    context.nextToken();
                    awsEcsTaskDefinitionDetails.setNetworkMode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PidMode", targetDepth)) {
                    context.nextToken();
                    awsEcsTaskDefinitionDetails.setPidMode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PlacementConstraints", targetDepth)) {
                    context.nextToken();
                    awsEcsTaskDefinitionDetails.setPlacementConstraints(new ListUnmarshaller<AwsEcsTaskDefinitionPlacementConstraintsDetails>(
                            AwsEcsTaskDefinitionPlacementConstraintsDetailsJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("ProxyConfiguration", targetDepth)) {
                    context.nextToken();
                    awsEcsTaskDefinitionDetails.setProxyConfiguration(AwsEcsTaskDefinitionProxyConfigurationDetailsJsonUnmarshaller.getInstance().unmarshall(
                            context));
                }
                if (context.testExpression("RequiresCompatibilities", targetDepth)) {
                    context.nextToken();
                    awsEcsTaskDefinitionDetails.setRequiresCompatibilities(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("TaskRoleArn", targetDepth)) {
                    context.nextToken();
                    awsEcsTaskDefinitionDetails.setTaskRoleArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Volumes", targetDepth)) {
                    context.nextToken();
                    awsEcsTaskDefinitionDetails.setVolumes(new ListUnmarshaller<AwsEcsTaskDefinitionVolumesDetails>(
                            AwsEcsTaskDefinitionVolumesDetailsJsonUnmarshaller.getInstance())

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

        return awsEcsTaskDefinitionDetails;
    }

    private static AwsEcsTaskDefinitionDetailsJsonUnmarshaller instance;

    public static AwsEcsTaskDefinitionDetailsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AwsEcsTaskDefinitionDetailsJsonUnmarshaller();
        return instance;
    }
}
