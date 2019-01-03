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
 * UpdateSimulationApplicationResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateSimulationApplicationResultJsonUnmarshaller implements Unmarshaller<UpdateSimulationApplicationResult, JsonUnmarshallerContext> {

    public UpdateSimulationApplicationResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        UpdateSimulationApplicationResult updateSimulationApplicationResult = new UpdateSimulationApplicationResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return updateSimulationApplicationResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("arn", targetDepth)) {
                    context.nextToken();
                    updateSimulationApplicationResult.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("name", targetDepth)) {
                    context.nextToken();
                    updateSimulationApplicationResult.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("version", targetDepth)) {
                    context.nextToken();
                    updateSimulationApplicationResult.setVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("sources", targetDepth)) {
                    context.nextToken();
                    updateSimulationApplicationResult.setSources(new ListUnmarshaller<Source>(SourceJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("simulationSoftwareSuite", targetDepth)) {
                    context.nextToken();
                    updateSimulationApplicationResult.setSimulationSoftwareSuite(SimulationSoftwareSuiteJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("robotSoftwareSuite", targetDepth)) {
                    context.nextToken();
                    updateSimulationApplicationResult.setRobotSoftwareSuite(RobotSoftwareSuiteJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("renderingEngine", targetDepth)) {
                    context.nextToken();
                    updateSimulationApplicationResult.setRenderingEngine(RenderingEngineJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("lastUpdatedAt", targetDepth)) {
                    context.nextToken();
                    updateSimulationApplicationResult.setLastUpdatedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("revisionId", targetDepth)) {
                    context.nextToken();
                    updateSimulationApplicationResult.setRevisionId(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return updateSimulationApplicationResult;
    }

    private static UpdateSimulationApplicationResultJsonUnmarshaller instance;

    public static UpdateSimulationApplicationResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new UpdateSimulationApplicationResultJsonUnmarshaller();
        return instance;
    }
}
