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
package com.amazonaws.services.securityhub.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.securityhub.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * AwsEc2VpnConnectionDetails JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsEc2VpnConnectionDetailsJsonUnmarshaller implements Unmarshaller<AwsEc2VpnConnectionDetails, JsonUnmarshallerContext> {

    public AwsEc2VpnConnectionDetails unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsEc2VpnConnectionDetails awsEc2VpnConnectionDetails = new AwsEc2VpnConnectionDetails();

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
                if (context.testExpression("VpnConnectionId", targetDepth)) {
                    context.nextToken();
                    awsEc2VpnConnectionDetails.setVpnConnectionId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("State", targetDepth)) {
                    context.nextToken();
                    awsEc2VpnConnectionDetails.setState(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CustomerGatewayId", targetDepth)) {
                    context.nextToken();
                    awsEc2VpnConnectionDetails.setCustomerGatewayId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CustomerGatewayConfiguration", targetDepth)) {
                    context.nextToken();
                    awsEc2VpnConnectionDetails.setCustomerGatewayConfiguration(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Type", targetDepth)) {
                    context.nextToken();
                    awsEc2VpnConnectionDetails.setType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("VpnGatewayId", targetDepth)) {
                    context.nextToken();
                    awsEc2VpnConnectionDetails.setVpnGatewayId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Category", targetDepth)) {
                    context.nextToken();
                    awsEc2VpnConnectionDetails.setCategory(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("VgwTelemetry", targetDepth)) {
                    context.nextToken();
                    awsEc2VpnConnectionDetails.setVgwTelemetry(new ListUnmarshaller<AwsEc2VpnConnectionVgwTelemetryDetails>(
                            AwsEc2VpnConnectionVgwTelemetryDetailsJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("Options", targetDepth)) {
                    context.nextToken();
                    awsEc2VpnConnectionDetails.setOptions(AwsEc2VpnConnectionOptionsDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Routes", targetDepth)) {
                    context.nextToken();
                    awsEc2VpnConnectionDetails.setRoutes(new ListUnmarshaller<AwsEc2VpnConnectionRoutesDetails>(
                            AwsEc2VpnConnectionRoutesDetailsJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("TransitGatewayId", targetDepth)) {
                    context.nextToken();
                    awsEc2VpnConnectionDetails.setTransitGatewayId(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return awsEc2VpnConnectionDetails;
    }

    private static AwsEc2VpnConnectionDetailsJsonUnmarshaller instance;

    public static AwsEc2VpnConnectionDetailsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AwsEc2VpnConnectionDetailsJsonUnmarshaller();
        return instance;
    }
}
