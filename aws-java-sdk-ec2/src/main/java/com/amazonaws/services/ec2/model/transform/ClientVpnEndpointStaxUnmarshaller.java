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
 * ClientVpnEndpoint StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ClientVpnEndpointStaxUnmarshaller implements Unmarshaller<ClientVpnEndpoint, StaxUnmarshallerContext> {

    public ClientVpnEndpoint unmarshall(StaxUnmarshallerContext context) throws Exception {
        ClientVpnEndpoint clientVpnEndpoint = new ClientVpnEndpoint();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return clientVpnEndpoint;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("clientVpnEndpointId", targetDepth)) {
                    clientVpnEndpoint.setClientVpnEndpointId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("description", targetDepth)) {
                    clientVpnEndpoint.setDescription(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("status", targetDepth)) {
                    clientVpnEndpoint.setStatus(ClientVpnEndpointStatusStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("creationTime", targetDepth)) {
                    clientVpnEndpoint.setCreationTime(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("deletionTime", targetDepth)) {
                    clientVpnEndpoint.setDeletionTime(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("dnsName", targetDepth)) {
                    clientVpnEndpoint.setDnsName(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("clientCidrBlock", targetDepth)) {
                    clientVpnEndpoint.setClientCidrBlock(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("dnsServer", targetDepth)) {
                    clientVpnEndpoint.withDnsServers(new ArrayList<String>());
                    continue;
                }

                if (context.testExpression("dnsServer/item", targetDepth)) {
                    clientVpnEndpoint.withDnsServers(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("splitTunnel", targetDepth)) {
                    clientVpnEndpoint.setSplitTunnel(BooleanStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("vpnProtocol", targetDepth)) {
                    clientVpnEndpoint.setVpnProtocol(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("transportProtocol", targetDepth)) {
                    clientVpnEndpoint.setTransportProtocol(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("associatedTargetNetwork", targetDepth)) {
                    clientVpnEndpoint.withAssociatedTargetNetworks(new ArrayList<AssociatedTargetNetwork>());
                    continue;
                }

                if (context.testExpression("associatedTargetNetwork/item", targetDepth)) {
                    clientVpnEndpoint.withAssociatedTargetNetworks(AssociatedTargetNetworkStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("serverCertificateArn", targetDepth)) {
                    clientVpnEndpoint.setServerCertificateArn(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("authenticationOptions", targetDepth)) {
                    clientVpnEndpoint.withAuthenticationOptions(new ArrayList<ClientVpnAuthentication>());
                    continue;
                }

                if (context.testExpression("authenticationOptions/item", targetDepth)) {
                    clientVpnEndpoint.withAuthenticationOptions(ClientVpnAuthenticationStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("connectionLogOptions", targetDepth)) {
                    clientVpnEndpoint.setConnectionLogOptions(ConnectionLogResponseOptionsStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("tagSet", targetDepth)) {
                    clientVpnEndpoint.withTags(new ArrayList<Tag>());
                    continue;
                }

                if (context.testExpression("tagSet/item", targetDepth)) {
                    clientVpnEndpoint.withTags(TagStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return clientVpnEndpoint;
                }
            }
        }
    }

    private static ClientVpnEndpointStaxUnmarshaller instance;

    public static ClientVpnEndpointStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new ClientVpnEndpointStaxUnmarshaller();
        return instance;
    }
}
