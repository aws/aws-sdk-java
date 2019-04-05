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
 * DescribeSimulationJobResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeSimulationJobResultJsonUnmarshaller implements Unmarshaller<DescribeSimulationJobResult, JsonUnmarshallerContext> {

    public DescribeSimulationJobResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribeSimulationJobResult describeSimulationJobResult = new DescribeSimulationJobResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return describeSimulationJobResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("arn", targetDepth)) {
                    context.nextToken();
                    describeSimulationJobResult.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("name", targetDepth)) {
                    context.nextToken();
                    describeSimulationJobResult.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("status", targetDepth)) {
                    context.nextToken();
                    describeSimulationJobResult.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("lastUpdatedAt", targetDepth)) {
                    context.nextToken();
                    describeSimulationJobResult.setLastUpdatedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("failureBehavior", targetDepth)) {
                    context.nextToken();
                    describeSimulationJobResult.setFailureBehavior(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("failureCode", targetDepth)) {
                    context.nextToken();
                    describeSimulationJobResult.setFailureCode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("failureReason", targetDepth)) {
                    context.nextToken();
                    describeSimulationJobResult.setFailureReason(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("clientRequestToken", targetDepth)) {
                    context.nextToken();
                    describeSimulationJobResult.setClientRequestToken(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("outputLocation", targetDepth)) {
                    context.nextToken();
                    describeSimulationJobResult.setOutputLocation(OutputLocationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("maxJobDurationInSeconds", targetDepth)) {
                    context.nextToken();
                    describeSimulationJobResult.setMaxJobDurationInSeconds(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("simulationTimeMillis", targetDepth)) {
                    context.nextToken();
                    describeSimulationJobResult.setSimulationTimeMillis(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("iamRole", targetDepth)) {
                    context.nextToken();
                    describeSimulationJobResult.setIamRole(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("robotApplications", targetDepth)) {
                    context.nextToken();
                    describeSimulationJobResult.setRobotApplications(new ListUnmarshaller<RobotApplicationConfig>(RobotApplicationConfigJsonUnmarshaller
                            .getInstance()).unmarshall(context));
                }
                if (context.testExpression("simulationApplications", targetDepth)) {
                    context.nextToken();
                    describeSimulationJobResult.setSimulationApplications(new ListUnmarshaller<SimulationApplicationConfig>(
                            SimulationApplicationConfigJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("tags", targetDepth)) {
                    context.nextToken();
                    describeSimulationJobResult.setTags(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context
                            .getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("vpcConfig", targetDepth)) {
                    context.nextToken();
                    describeSimulationJobResult.setVpcConfig(VPCConfigResponseJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return describeSimulationJobResult;
    }

    private static DescribeSimulationJobResultJsonUnmarshaller instance;

    public static DescribeSimulationJobResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeSimulationJobResultJsonUnmarshaller();
        return instance;
    }
}
