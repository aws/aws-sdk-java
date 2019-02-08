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
 * SimulationJob JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SimulationJobJsonUnmarshaller implements Unmarshaller<SimulationJob, JsonUnmarshallerContext> {

    public SimulationJob unmarshall(JsonUnmarshallerContext context) throws Exception {
        SimulationJob simulationJob = new SimulationJob();

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
                    simulationJob.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("name", targetDepth)) {
                    context.nextToken();
                    simulationJob.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("status", targetDepth)) {
                    context.nextToken();
                    simulationJob.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("lastUpdatedAt", targetDepth)) {
                    context.nextToken();
                    simulationJob.setLastUpdatedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("failureBehavior", targetDepth)) {
                    context.nextToken();
                    simulationJob.setFailureBehavior(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("failureCode", targetDepth)) {
                    context.nextToken();
                    simulationJob.setFailureCode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("failureReason", targetDepth)) {
                    context.nextToken();
                    simulationJob.setFailureReason(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("clientRequestToken", targetDepth)) {
                    context.nextToken();
                    simulationJob.setClientRequestToken(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("outputLocation", targetDepth)) {
                    context.nextToken();
                    simulationJob.setOutputLocation(OutputLocationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("maxJobDurationInSeconds", targetDepth)) {
                    context.nextToken();
                    simulationJob.setMaxJobDurationInSeconds(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("simulationTimeMillis", targetDepth)) {
                    context.nextToken();
                    simulationJob.setSimulationTimeMillis(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("iamRole", targetDepth)) {
                    context.nextToken();
                    simulationJob.setIamRole(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("robotApplications", targetDepth)) {
                    context.nextToken();
                    simulationJob.setRobotApplications(new ListUnmarshaller<RobotApplicationConfig>(RobotApplicationConfigJsonUnmarshaller.getInstance())
                            .unmarshall(context));
                }
                if (context.testExpression("simulationApplications", targetDepth)) {
                    context.nextToken();
                    simulationJob.setSimulationApplications(new ListUnmarshaller<SimulationApplicationConfig>(SimulationApplicationConfigJsonUnmarshaller
                            .getInstance()).unmarshall(context));
                }
                if (context.testExpression("tags", targetDepth)) {
                    context.nextToken();
                    simulationJob.setTags(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context.getUnmarshaller(String.class))
                            .unmarshall(context));
                }
                if (context.testExpression("vpcConfig", targetDepth)) {
                    context.nextToken();
                    simulationJob.setVpcConfig(VPCConfigResponseJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return simulationJob;
    }

    private static SimulationJobJsonUnmarshaller instance;

    public static SimulationJobJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new SimulationJobJsonUnmarshaller();
        return instance;
    }
}
