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
package com.amazonaws.services.codebuild.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.codebuild.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * Fleet JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FleetJsonUnmarshaller implements Unmarshaller<Fleet, JsonUnmarshallerContext> {

    public Fleet unmarshall(JsonUnmarshallerContext context) throws Exception {
        Fleet fleet = new Fleet();

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
                    fleet.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("name", targetDepth)) {
                    context.nextToken();
                    fleet.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("id", targetDepth)) {
                    context.nextToken();
                    fleet.setId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("created", targetDepth)) {
                    context.nextToken();
                    fleet.setCreated(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("lastModified", targetDepth)) {
                    context.nextToken();
                    fleet.setLastModified(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("status", targetDepth)) {
                    context.nextToken();
                    fleet.setStatus(FleetStatusJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("baseCapacity", targetDepth)) {
                    context.nextToken();
                    fleet.setBaseCapacity(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("environmentType", targetDepth)) {
                    context.nextToken();
                    fleet.setEnvironmentType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("computeType", targetDepth)) {
                    context.nextToken();
                    fleet.setComputeType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("scalingConfiguration", targetDepth)) {
                    context.nextToken();
                    fleet.setScalingConfiguration(ScalingConfigurationOutputJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("overflowBehavior", targetDepth)) {
                    context.nextToken();
                    fleet.setOverflowBehavior(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("vpcConfig", targetDepth)) {
                    context.nextToken();
                    fleet.setVpcConfig(VpcConfigJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("fleetServiceRole", targetDepth)) {
                    context.nextToken();
                    fleet.setFleetServiceRole(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("tags", targetDepth)) {
                    context.nextToken();
                    fleet.setTags(new ListUnmarshaller<Tag>(TagJsonUnmarshaller.getInstance())

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

        return fleet;
    }

    private static FleetJsonUnmarshaller instance;

    public static FleetJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new FleetJsonUnmarshaller();
        return instance;
    }
}
