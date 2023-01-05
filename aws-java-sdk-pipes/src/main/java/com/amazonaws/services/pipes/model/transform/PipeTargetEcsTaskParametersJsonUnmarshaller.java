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
package com.amazonaws.services.pipes.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.pipes.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * PipeTargetEcsTaskParameters JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PipeTargetEcsTaskParametersJsonUnmarshaller implements Unmarshaller<PipeTargetEcsTaskParameters, JsonUnmarshallerContext> {

    public PipeTargetEcsTaskParameters unmarshall(JsonUnmarshallerContext context) throws Exception {
        PipeTargetEcsTaskParameters pipeTargetEcsTaskParameters = new PipeTargetEcsTaskParameters();

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
                if (context.testExpression("CapacityProviderStrategy", targetDepth)) {
                    context.nextToken();
                    pipeTargetEcsTaskParameters.setCapacityProviderStrategy(new ListUnmarshaller<CapacityProviderStrategyItem>(
                            CapacityProviderStrategyItemJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("EnableECSManagedTags", targetDepth)) {
                    context.nextToken();
                    pipeTargetEcsTaskParameters.setEnableECSManagedTags(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("EnableExecuteCommand", targetDepth)) {
                    context.nextToken();
                    pipeTargetEcsTaskParameters.setEnableExecuteCommand(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("Group", targetDepth)) {
                    context.nextToken();
                    pipeTargetEcsTaskParameters.setGroup(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LaunchType", targetDepth)) {
                    context.nextToken();
                    pipeTargetEcsTaskParameters.setLaunchType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("NetworkConfiguration", targetDepth)) {
                    context.nextToken();
                    pipeTargetEcsTaskParameters.setNetworkConfiguration(NetworkConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Overrides", targetDepth)) {
                    context.nextToken();
                    pipeTargetEcsTaskParameters.setOverrides(EcsTaskOverrideJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("PlacementConstraints", targetDepth)) {
                    context.nextToken();
                    pipeTargetEcsTaskParameters.setPlacementConstraints(new ListUnmarshaller<PlacementConstraint>(PlacementConstraintJsonUnmarshaller
                            .getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("PlacementStrategy", targetDepth)) {
                    context.nextToken();
                    pipeTargetEcsTaskParameters.setPlacementStrategy(new ListUnmarshaller<PlacementStrategy>(PlacementStrategyJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("PlatformVersion", targetDepth)) {
                    context.nextToken();
                    pipeTargetEcsTaskParameters.setPlatformVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PropagateTags", targetDepth)) {
                    context.nextToken();
                    pipeTargetEcsTaskParameters.setPropagateTags(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ReferenceId", targetDepth)) {
                    context.nextToken();
                    pipeTargetEcsTaskParameters.setReferenceId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Tags", targetDepth)) {
                    context.nextToken();
                    pipeTargetEcsTaskParameters.setTags(new ListUnmarshaller<Tag>(TagJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("TaskCount", targetDepth)) {
                    context.nextToken();
                    pipeTargetEcsTaskParameters.setTaskCount(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("TaskDefinitionArn", targetDepth)) {
                    context.nextToken();
                    pipeTargetEcsTaskParameters.setTaskDefinitionArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return pipeTargetEcsTaskParameters;
    }

    private static PipeTargetEcsTaskParametersJsonUnmarshaller instance;

    public static PipeTargetEcsTaskParametersJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new PipeTargetEcsTaskParametersJsonUnmarshaller();
        return instance;
    }
}
