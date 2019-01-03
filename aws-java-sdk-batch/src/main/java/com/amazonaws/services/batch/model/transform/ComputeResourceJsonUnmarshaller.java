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
 * ComputeResource JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ComputeResourceJsonUnmarshaller implements Unmarshaller<ComputeResource, JsonUnmarshallerContext> {

    public ComputeResource unmarshall(JsonUnmarshallerContext context) throws Exception {
        ComputeResource computeResource = new ComputeResource();

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
                if (context.testExpression("type", targetDepth)) {
                    context.nextToken();
                    computeResource.setType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("minvCpus", targetDepth)) {
                    context.nextToken();
                    computeResource.setMinvCpus(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("maxvCpus", targetDepth)) {
                    context.nextToken();
                    computeResource.setMaxvCpus(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("desiredvCpus", targetDepth)) {
                    context.nextToken();
                    computeResource.setDesiredvCpus(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("instanceTypes", targetDepth)) {
                    context.nextToken();
                    computeResource.setInstanceTypes(new ListUnmarshaller<String>(context.getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("imageId", targetDepth)) {
                    context.nextToken();
                    computeResource.setImageId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("subnets", targetDepth)) {
                    context.nextToken();
                    computeResource.setSubnets(new ListUnmarshaller<String>(context.getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("securityGroupIds", targetDepth)) {
                    context.nextToken();
                    computeResource.setSecurityGroupIds(new ListUnmarshaller<String>(context.getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("ec2KeyPair", targetDepth)) {
                    context.nextToken();
                    computeResource.setEc2KeyPair(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("instanceRole", targetDepth)) {
                    context.nextToken();
                    computeResource.setInstanceRole(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("tags", targetDepth)) {
                    context.nextToken();
                    computeResource.setTags(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context.getUnmarshaller(String.class))
                            .unmarshall(context));
                }
                if (context.testExpression("placementGroup", targetDepth)) {
                    context.nextToken();
                    computeResource.setPlacementGroup(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("bidPercentage", targetDepth)) {
                    context.nextToken();
                    computeResource.setBidPercentage(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("spotIamFleetRole", targetDepth)) {
                    context.nextToken();
                    computeResource.setSpotIamFleetRole(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("launchTemplate", targetDepth)) {
                    context.nextToken();
                    computeResource.setLaunchTemplate(LaunchTemplateSpecificationJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return computeResource;
    }

    private static ComputeResourceJsonUnmarshaller instance;

    public static ComputeResourceJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ComputeResourceJsonUnmarshaller();
        return instance;
    }
}
