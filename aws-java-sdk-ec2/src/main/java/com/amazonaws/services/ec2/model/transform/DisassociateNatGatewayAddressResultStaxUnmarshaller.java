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
 * DisassociateNatGatewayAddressResult StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DisassociateNatGatewayAddressResultStaxUnmarshaller implements Unmarshaller<DisassociateNatGatewayAddressResult, StaxUnmarshallerContext> {

    public DisassociateNatGatewayAddressResult unmarshall(StaxUnmarshallerContext context) throws Exception {
        DisassociateNatGatewayAddressResult disassociateNatGatewayAddressResult = new DisassociateNatGatewayAddressResult();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return disassociateNatGatewayAddressResult;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("natGatewayId", targetDepth)) {
                    disassociateNatGatewayAddressResult.setNatGatewayId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("natGatewayAddressSet", targetDepth)) {
                    disassociateNatGatewayAddressResult.withNatGatewayAddresses(new ArrayList<NatGatewayAddress>());
                    continue;
                }

                if (context.testExpression("natGatewayAddressSet/item", targetDepth)) {
                    disassociateNatGatewayAddressResult.withNatGatewayAddresses(NatGatewayAddressStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return disassociateNatGatewayAddressResult;
                }
            }
        }
    }

    private static DisassociateNatGatewayAddressResultStaxUnmarshaller instance;

    public static DisassociateNatGatewayAddressResultStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new DisassociateNatGatewayAddressResultStaxUnmarshaller();
        return instance;
    }
}
