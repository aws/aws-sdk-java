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
package com.amazonaws.services.backupgateway.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.backupgateway.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * GatewayDetails JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GatewayDetailsJsonUnmarshaller implements Unmarshaller<GatewayDetails, JsonUnmarshallerContext> {

    public GatewayDetails unmarshall(JsonUnmarshallerContext context) throws Exception {
        GatewayDetails gatewayDetails = new GatewayDetails();

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
                if (context.testExpression("GatewayArn", targetDepth)) {
                    context.nextToken();
                    gatewayDetails.setGatewayArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("GatewayDisplayName", targetDepth)) {
                    context.nextToken();
                    gatewayDetails.setGatewayDisplayName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("GatewayType", targetDepth)) {
                    context.nextToken();
                    gatewayDetails.setGatewayType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("HypervisorId", targetDepth)) {
                    context.nextToken();
                    gatewayDetails.setHypervisorId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LastSeenTime", targetDepth)) {
                    context.nextToken();
                    gatewayDetails.setLastSeenTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("MaintenanceStartTime", targetDepth)) {
                    context.nextToken();
                    gatewayDetails.setMaintenanceStartTime(MaintenanceStartTimeJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("NextUpdateAvailabilityTime", targetDepth)) {
                    context.nextToken();
                    gatewayDetails.setNextUpdateAvailabilityTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("VpcEndpoint", targetDepth)) {
                    context.nextToken();
                    gatewayDetails.setVpcEndpoint(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return gatewayDetails;
    }

    private static GatewayDetailsJsonUnmarshaller instance;

    public static GatewayDetailsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GatewayDetailsJsonUnmarshaller();
        return instance;
    }
}
