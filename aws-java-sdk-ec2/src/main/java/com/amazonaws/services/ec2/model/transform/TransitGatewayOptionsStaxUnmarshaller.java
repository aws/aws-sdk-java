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
package com.amazonaws.services.ec2.model.transform;

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.ec2.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * TransitGatewayOptions StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TransitGatewayOptionsStaxUnmarshaller implements Unmarshaller<TransitGatewayOptions, StaxUnmarshallerContext> {

    public TransitGatewayOptions unmarshall(StaxUnmarshallerContext context) throws Exception {
        TransitGatewayOptions transitGatewayOptions = new TransitGatewayOptions();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return transitGatewayOptions;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("amazonSideAsn", targetDepth)) {
                    transitGatewayOptions.setAmazonSideAsn(LongStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("autoAcceptSharedAttachments", targetDepth)) {
                    transitGatewayOptions.setAutoAcceptSharedAttachments(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("defaultRouteTableAssociation", targetDepth)) {
                    transitGatewayOptions.setDefaultRouteTableAssociation(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("associationDefaultRouteTableId", targetDepth)) {
                    transitGatewayOptions.setAssociationDefaultRouteTableId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("defaultRouteTablePropagation", targetDepth)) {
                    transitGatewayOptions.setDefaultRouteTablePropagation(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("propagationDefaultRouteTableId", targetDepth)) {
                    transitGatewayOptions.setPropagationDefaultRouteTableId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("vpnEcmpSupport", targetDepth)) {
                    transitGatewayOptions.setVpnEcmpSupport(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("dnsSupport", targetDepth)) {
                    transitGatewayOptions.setDnsSupport(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return transitGatewayOptions;
                }
            }
        }
    }

    private static TransitGatewayOptionsStaxUnmarshaller instance;

    public static TransitGatewayOptionsStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new TransitGatewayOptionsStaxUnmarshaller();
        return instance;
    }
}
