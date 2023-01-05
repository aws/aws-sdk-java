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
package com.amazonaws.services.simspaceweaver.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.simspaceweaver.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * DescribeAppResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeAppResultJsonUnmarshaller implements Unmarshaller<DescribeAppResult, JsonUnmarshallerContext> {

    public DescribeAppResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribeAppResult describeAppResult = new DescribeAppResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return describeAppResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("Description", targetDepth)) {
                    context.nextToken();
                    describeAppResult.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Domain", targetDepth)) {
                    context.nextToken();
                    describeAppResult.setDomain(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EndpointInfo", targetDepth)) {
                    context.nextToken();
                    describeAppResult.setEndpointInfo(SimulationAppEndpointInfoJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("LaunchOverrides", targetDepth)) {
                    context.nextToken();
                    describeAppResult.setLaunchOverrides(LaunchOverridesJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Name", targetDepth)) {
                    context.nextToken();
                    describeAppResult.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Simulation", targetDepth)) {
                    context.nextToken();
                    describeAppResult.setSimulation(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    context.nextToken();
                    describeAppResult.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("TargetStatus", targetDepth)) {
                    context.nextToken();
                    describeAppResult.setTargetStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return describeAppResult;
    }

    private static DescribeAppResultJsonUnmarshaller instance;

    public static DescribeAppResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeAppResultJsonUnmarshaller();
        return instance;
    }
}
