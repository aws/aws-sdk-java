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
 * ClientVpnConnection StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ClientVpnConnectionStaxUnmarshaller implements Unmarshaller<ClientVpnConnection, StaxUnmarshallerContext> {

    public ClientVpnConnection unmarshall(StaxUnmarshallerContext context) throws Exception {
        ClientVpnConnection clientVpnConnection = new ClientVpnConnection();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return clientVpnConnection;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("clientVpnEndpointId", targetDepth)) {
                    clientVpnConnection.setClientVpnEndpointId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("timestamp", targetDepth)) {
                    clientVpnConnection.setTimestamp(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("connectionId", targetDepth)) {
                    clientVpnConnection.setConnectionId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("username", targetDepth)) {
                    clientVpnConnection.setUsername(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("connectionEstablishedTime", targetDepth)) {
                    clientVpnConnection.setConnectionEstablishedTime(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ingressBytes", targetDepth)) {
                    clientVpnConnection.setIngressBytes(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("egressBytes", targetDepth)) {
                    clientVpnConnection.setEgressBytes(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ingressPackets", targetDepth)) {
                    clientVpnConnection.setIngressPackets(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("egressPackets", targetDepth)) {
                    clientVpnConnection.setEgressPackets(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("clientIp", targetDepth)) {
                    clientVpnConnection.setClientIp(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("commonName", targetDepth)) {
                    clientVpnConnection.setCommonName(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("status", targetDepth)) {
                    clientVpnConnection.setStatus(ClientVpnConnectionStatusStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("connectionEndTime", targetDepth)) {
                    clientVpnConnection.setConnectionEndTime(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return clientVpnConnection;
                }
            }
        }
    }

    private static ClientVpnConnectionStaxUnmarshaller instance;

    public static ClientVpnConnectionStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new ClientVpnConnectionStaxUnmarshaller();
        return instance;
    }
}
