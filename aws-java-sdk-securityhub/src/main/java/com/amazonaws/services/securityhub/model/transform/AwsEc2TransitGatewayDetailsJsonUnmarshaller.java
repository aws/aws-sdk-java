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
 * AwsEc2TransitGatewayDetails JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsEc2TransitGatewayDetailsJsonUnmarshaller implements Unmarshaller<AwsEc2TransitGatewayDetails, JsonUnmarshallerContext> {

    public AwsEc2TransitGatewayDetails unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsEc2TransitGatewayDetails awsEc2TransitGatewayDetails = new AwsEc2TransitGatewayDetails();

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
                if (context.testExpression("Id", targetDepth)) {
                    context.nextToken();
                    awsEc2TransitGatewayDetails.setId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Description", targetDepth)) {
                    context.nextToken();
                    awsEc2TransitGatewayDetails.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DefaultRouteTablePropagation", targetDepth)) {
                    context.nextToken();
                    awsEc2TransitGatewayDetails.setDefaultRouteTablePropagation(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("AutoAcceptSharedAttachments", targetDepth)) {
                    context.nextToken();
                    awsEc2TransitGatewayDetails.setAutoAcceptSharedAttachments(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DefaultRouteTableAssociation", targetDepth)) {
                    context.nextToken();
                    awsEc2TransitGatewayDetails.setDefaultRouteTableAssociation(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("TransitGatewayCidrBlocks", targetDepth)) {
                    context.nextToken();
                    awsEc2TransitGatewayDetails.setTransitGatewayCidrBlocks(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("AssociationDefaultRouteTableId", targetDepth)) {
                    context.nextToken();
                    awsEc2TransitGatewayDetails.setAssociationDefaultRouteTableId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PropagationDefaultRouteTableId", targetDepth)) {
                    context.nextToken();
                    awsEc2TransitGatewayDetails.setPropagationDefaultRouteTableId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("VpnEcmpSupport", targetDepth)) {
                    context.nextToken();
                    awsEc2TransitGatewayDetails.setVpnEcmpSupport(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DnsSupport", targetDepth)) {
                    context.nextToken();
                    awsEc2TransitGatewayDetails.setDnsSupport(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("MulticastSupport", targetDepth)) {
                    context.nextToken();
                    awsEc2TransitGatewayDetails.setMulticastSupport(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("AmazonSideAsn", targetDepth)) {
                    context.nextToken();
                    awsEc2TransitGatewayDetails.setAmazonSideAsn(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return awsEc2TransitGatewayDetails;
    }

    private static AwsEc2TransitGatewayDetailsJsonUnmarshaller instance;

    public static AwsEc2TransitGatewayDetailsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AwsEc2TransitGatewayDetailsJsonUnmarshaller();
        return instance;
    }
}
