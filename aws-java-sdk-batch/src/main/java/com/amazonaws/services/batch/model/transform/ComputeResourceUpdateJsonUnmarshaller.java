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
package com.amazonaws.services.batch.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.batch.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * ComputeResourceUpdate JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ComputeResourceUpdateJsonUnmarshaller implements Unmarshaller<ComputeResourceUpdate, JsonUnmarshallerContext> {

    public ComputeResourceUpdate unmarshall(JsonUnmarshallerContext context) throws Exception {
        ComputeResourceUpdate computeResourceUpdate = new ComputeResourceUpdate();

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
                if (context.testExpression("minvCpus", targetDepth)) {
                    context.nextToken();
                    computeResourceUpdate.setMinvCpus(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("maxvCpus", targetDepth)) {
                    context.nextToken();
                    computeResourceUpdate.setMaxvCpus(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("desiredvCpus", targetDepth)) {
                    context.nextToken();
                    computeResourceUpdate.setDesiredvCpus(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("subnets", targetDepth)) {
                    context.nextToken();
                    computeResourceUpdate.setSubnets(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("securityGroupIds", targetDepth)) {
                    context.nextToken();
                    computeResourceUpdate.setSecurityGroupIds(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("allocationStrategy", targetDepth)) {
                    context.nextToken();
                    computeResourceUpdate.setAllocationStrategy(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("instanceTypes", targetDepth)) {
                    context.nextToken();
                    computeResourceUpdate.setInstanceTypes(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("ec2KeyPair", targetDepth)) {
                    context.nextToken();
                    computeResourceUpdate.setEc2KeyPair(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("instanceRole", targetDepth)) {
                    context.nextToken();
                    computeResourceUpdate.setInstanceRole(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("tags", targetDepth)) {
                    context.nextToken();
                    computeResourceUpdate.setTags(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context
                            .getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("placementGroup", targetDepth)) {
                    context.nextToken();
                    computeResourceUpdate.setPlacementGroup(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("bidPercentage", targetDepth)) {
                    context.nextToken();
                    computeResourceUpdate.setBidPercentage(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("launchTemplate", targetDepth)) {
                    context.nextToken();
                    computeResourceUpdate.setLaunchTemplate(LaunchTemplateSpecificationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ec2Configuration", targetDepth)) {
                    context.nextToken();
                    computeResourceUpdate.setEc2Configuration(new ListUnmarshaller<Ec2Configuration>(Ec2ConfigurationJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("updateToLatestImageVersion", targetDepth)) {
                    context.nextToken();
                    computeResourceUpdate.setUpdateToLatestImageVersion(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("type", targetDepth)) {
                    context.nextToken();
                    computeResourceUpdate.setType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("imageId", targetDepth)) {
                    context.nextToken();
                    computeResourceUpdate.setImageId(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return computeResourceUpdate;
    }

    private static ComputeResourceUpdateJsonUnmarshaller instance;

    public static ComputeResourceUpdateJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ComputeResourceUpdateJsonUnmarshaller();
        return instance;
    }
}
