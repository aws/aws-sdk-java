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

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.ec2.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * GetVpnTunnelReplacementStatusResult StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetVpnTunnelReplacementStatusResultStaxUnmarshaller implements Unmarshaller<GetVpnTunnelReplacementStatusResult, StaxUnmarshallerContext> {

    public GetVpnTunnelReplacementStatusResult unmarshall(StaxUnmarshallerContext context) throws Exception {
        GetVpnTunnelReplacementStatusResult getVpnTunnelReplacementStatusResult = new GetVpnTunnelReplacementStatusResult();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return getVpnTunnelReplacementStatusResult;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("vpnConnectionId", targetDepth)) {
                    getVpnTunnelReplacementStatusResult.setVpnConnectionId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("transitGatewayId", targetDepth)) {
                    getVpnTunnelReplacementStatusResult.setTransitGatewayId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("customerGatewayId", targetDepth)) {
                    getVpnTunnelReplacementStatusResult.setCustomerGatewayId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("vpnGatewayId", targetDepth)) {
                    getVpnTunnelReplacementStatusResult.setVpnGatewayId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("vpnTunnelOutsideIpAddress", targetDepth)) {
                    getVpnTunnelReplacementStatusResult.setVpnTunnelOutsideIpAddress(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("maintenanceDetails", targetDepth)) {
                    getVpnTunnelReplacementStatusResult.setMaintenanceDetails(MaintenanceDetailsStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return getVpnTunnelReplacementStatusResult;
                }
            }
        }
    }

    private static GetVpnTunnelReplacementStatusResultStaxUnmarshaller instance;

    public static GetVpnTunnelReplacementStatusResultStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetVpnTunnelReplacementStatusResultStaxUnmarshaller();
        return instance;
    }
}
