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

import java.util.ArrayList;

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.ec2.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * AssignIpv6AddressesResult StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AssignIpv6AddressesResultStaxUnmarshaller implements Unmarshaller<AssignIpv6AddressesResult, StaxUnmarshallerContext> {

    public AssignIpv6AddressesResult unmarshall(StaxUnmarshallerContext context) throws Exception {
        AssignIpv6AddressesResult assignIpv6AddressesResult = new AssignIpv6AddressesResult();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return assignIpv6AddressesResult;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("assignedIpv6Addresses", targetDepth)) {
                    assignIpv6AddressesResult.withAssignedIpv6Addresses(new ArrayList<String>());
                    continue;
                }

                if (context.testExpression("assignedIpv6Addresses/item", targetDepth)) {
                    assignIpv6AddressesResult.withAssignedIpv6Addresses(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("networkInterfaceId", targetDepth)) {
                    assignIpv6AddressesResult.setNetworkInterfaceId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return assignIpv6AddressesResult;
                }
            }
        }
    }

    private static AssignIpv6AddressesResultStaxUnmarshaller instance;

    public static AssignIpv6AddressesResultStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new AssignIpv6AddressesResultStaxUnmarshaller();
        return instance;
    }
}
