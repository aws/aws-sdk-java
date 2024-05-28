/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import java.util.ArrayList;

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.ec2.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * AssociateNatGatewayAddressResult StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AssociateNatGatewayAddressResultStaxUnmarshaller implements Unmarshaller<AssociateNatGatewayAddressResult, StaxUnmarshallerContext> {

    public AssociateNatGatewayAddressResult unmarshall(StaxUnmarshallerContext context) throws Exception {
        AssociateNatGatewayAddressResult associateNatGatewayAddressResult = new AssociateNatGatewayAddressResult();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return associateNatGatewayAddressResult;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("natGatewayId", targetDepth)) {
                    associateNatGatewayAddressResult.setNatGatewayId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("natGatewayAddressSet", targetDepth)) {
                    associateNatGatewayAddressResult.withNatGatewayAddresses(new ArrayList<NatGatewayAddress>());
                    continue;
                }

                if (context.testExpression("natGatewayAddressSet/item", targetDepth)) {
                    associateNatGatewayAddressResult.withNatGatewayAddresses(NatGatewayAddressStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return associateNatGatewayAddressResult;
                }
            }
        }
    }

    private static AssociateNatGatewayAddressResultStaxUnmarshaller instance;

    public static AssociateNatGatewayAddressResultStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new AssociateNatGatewayAddressResultStaxUnmarshaller();
        return instance;
    }
}
