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
package com.amazonaws.services.sagemaker.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.sagemaker.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * DeviceDeploymentSummary JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeviceDeploymentSummaryJsonUnmarshaller implements Unmarshaller<DeviceDeploymentSummary, JsonUnmarshallerContext> {

    public DeviceDeploymentSummary unmarshall(JsonUnmarshallerContext context) throws Exception {
        DeviceDeploymentSummary deviceDeploymentSummary = new DeviceDeploymentSummary();

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
                if (context.testExpression("EdgeDeploymentPlanArn", targetDepth)) {
                    context.nextToken();
                    deviceDeploymentSummary.setEdgeDeploymentPlanArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EdgeDeploymentPlanName", targetDepth)) {
                    context.nextToken();
                    deviceDeploymentSummary.setEdgeDeploymentPlanName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("StageName", targetDepth)) {
                    context.nextToken();
                    deviceDeploymentSummary.setStageName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DeployedStageName", targetDepth)) {
                    context.nextToken();
                    deviceDeploymentSummary.setDeployedStageName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DeviceFleetName", targetDepth)) {
                    context.nextToken();
                    deviceDeploymentSummary.setDeviceFleetName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DeviceName", targetDepth)) {
                    context.nextToken();
                    deviceDeploymentSummary.setDeviceName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DeviceArn", targetDepth)) {
                    context.nextToken();
                    deviceDeploymentSummary.setDeviceArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DeviceDeploymentStatus", targetDepth)) {
                    context.nextToken();
                    deviceDeploymentSummary.setDeviceDeploymentStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DeviceDeploymentStatusMessage", targetDepth)) {
                    context.nextToken();
                    deviceDeploymentSummary.setDeviceDeploymentStatusMessage(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Description", targetDepth)) {
                    context.nextToken();
                    deviceDeploymentSummary.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DeploymentStartTime", targetDepth)) {
                    context.nextToken();
                    deviceDeploymentSummary.setDeploymentStartTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return deviceDeploymentSummary;
    }

    private static DeviceDeploymentSummaryJsonUnmarshaller instance;

    public static DeviceDeploymentSummaryJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DeviceDeploymentSummaryJsonUnmarshaller();
        return instance;
    }
}
