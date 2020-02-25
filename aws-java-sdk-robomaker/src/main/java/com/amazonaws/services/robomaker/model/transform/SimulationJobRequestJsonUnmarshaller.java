/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * SimulationJobRequest JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SimulationJobRequestJsonUnmarshaller implements Unmarshaller<SimulationJobRequest, JsonUnmarshallerContext> {

    public SimulationJobRequest unmarshall(JsonUnmarshallerContext context) throws Exception {
        SimulationJobRequest simulationJobRequest = new SimulationJobRequest();

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
                if (context.testExpression("outputLocation", targetDepth)) {
                    context.nextToken();
                    simulationJobRequest.setOutputLocation(OutputLocationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("loggingConfig", targetDepth)) {
                    context.nextToken();
                    simulationJobRequest.setLoggingConfig(LoggingConfigJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("maxJobDurationInSeconds", targetDepth)) {
                    context.nextToken();
                    simulationJobRequest.setMaxJobDurationInSeconds(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("iamRole", targetDepth)) {
                    context.nextToken();
                    simulationJobRequest.setIamRole(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("failureBehavior", targetDepth)) {
                    context.nextToken();
                    simulationJobRequest.setFailureBehavior(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("useDefaultApplications", targetDepth)) {
                    context.nextToken();
                    simulationJobRequest.setUseDefaultApplications(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("robotApplications", targetDepth)) {
                    context.nextToken();
                    simulationJobRequest
                            .setRobotApplications(new ListUnmarshaller<RobotApplicationConfig>(RobotApplicationConfigJsonUnmarshaller.getInstance())
                                    .unmarshall(context));
                }
                if (context.testExpression("simulationApplications", targetDepth)) {
                    context.nextToken();
                    simulationJobRequest.setSimulationApplications(new ListUnmarshaller<SimulationApplicationConfig>(
                            SimulationApplicationConfigJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("dataSources", targetDepth)) {
                    context.nextToken();
                    simulationJobRequest.setDataSources(new ListUnmarshaller<DataSourceConfig>(DataSourceConfigJsonUnmarshaller.getInstance())
                            .unmarshall(context));
                }
                if (context.testExpression("vpcConfig", targetDepth)) {
                    context.nextToken();
                    simulationJobRequest.setVpcConfig(VPCConfigJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("tags", targetDepth)) {
                    context.nextToken();
                    simulationJobRequest.setTags(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context
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

        return simulationJobRequest;
    }

    private static SimulationJobRequestJsonUnmarshaller instance;

    public static SimulationJobRequestJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new SimulationJobRequestJsonUnmarshaller();
        return instance;
    }
}
