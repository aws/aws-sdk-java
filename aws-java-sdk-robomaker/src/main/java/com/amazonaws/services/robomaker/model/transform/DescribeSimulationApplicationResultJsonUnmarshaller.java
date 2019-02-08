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
package com.amazonaws.services.robomaker.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.robomaker.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * DescribeSimulationApplicationResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeSimulationApplicationResultJsonUnmarshaller implements Unmarshaller<DescribeSimulationApplicationResult, JsonUnmarshallerContext> {

    public DescribeSimulationApplicationResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribeSimulationApplicationResult describeSimulationApplicationResult = new DescribeSimulationApplicationResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return describeSimulationApplicationResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("arn", targetDepth)) {
                    context.nextToken();
                    describeSimulationApplicationResult.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("name", targetDepth)) {
                    context.nextToken();
                    describeSimulationApplicationResult.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("version", targetDepth)) {
                    context.nextToken();
                    describeSimulationApplicationResult.setVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("sources", targetDepth)) {
                    context.nextToken();
                    describeSimulationApplicationResult.setSources(new ListUnmarshaller<Source>(SourceJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("simulationSoftwareSuite", targetDepth)) {
                    context.nextToken();
                    describeSimulationApplicationResult.setSimulationSoftwareSuite(SimulationSoftwareSuiteJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("robotSoftwareSuite", targetDepth)) {
                    context.nextToken();
                    describeSimulationApplicationResult.setRobotSoftwareSuite(RobotSoftwareSuiteJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("renderingEngine", targetDepth)) {
                    context.nextToken();
                    describeSimulationApplicationResult.setRenderingEngine(RenderingEngineJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("revisionId", targetDepth)) {
                    context.nextToken();
                    describeSimulationApplicationResult.setRevisionId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("lastUpdatedAt", targetDepth)) {
                    context.nextToken();
                    describeSimulationApplicationResult.setLastUpdatedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("tags", targetDepth)) {
                    context.nextToken();
                    describeSimulationApplicationResult.setTags(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context
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

        return describeSimulationApplicationResult;
    }

    private static DescribeSimulationApplicationResultJsonUnmarshaller instance;

    public static DescribeSimulationApplicationResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeSimulationApplicationResultJsonUnmarshaller();
        return instance;
    }
}
