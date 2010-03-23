/*
 * Copyright 2010 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.ec2.model.transform;

import org.w3c.dom.*;
import com.amazonaws.services.ec2.model.*;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.transform.SimpleTypeUnmarshallers.*;
import com.amazonaws.util.XpathUtils;

/**
 * Vpn Connection Unmarshaller
 */        
public class VpnConnectionUnmarshaller implements Unmarshaller<VpnConnection, Node> {

    public VpnConnection unmarshall(Node node) throws Exception {
        VpnConnection vpnConnection = new VpnConnection();
        
        
        Node vpnConnectionIdNode = XpathUtils.asNode("vpnConnectionId", node);
        vpnConnection.setVpnConnectionId(new StringUnmarshaller().unmarshall(vpnConnectionIdNode));
    
        Node stateNode = XpathUtils.asNode("state", node);
        vpnConnection.setState(new StringUnmarshaller().unmarshall(stateNode));
    
        Node customerGatewayConfigurationNode = XpathUtils.asNode("customerGatewayConfiguration", node);
        vpnConnection.setCustomerGatewayConfiguration(new StringUnmarshaller().unmarshall(customerGatewayConfigurationNode));
    
        Node typeNode = XpathUtils.asNode("type", node);
        vpnConnection.setType(new StringUnmarshaller().unmarshall(typeNode));
    
        Node customerGatewayIdNode = XpathUtils.asNode("customerGatewayId", node);
        vpnConnection.setCustomerGatewayId(new StringUnmarshaller().unmarshall(customerGatewayIdNode));
    
        Node vpnGatewayIdNode = XpathUtils.asNode("vpnGatewayId", node);
        vpnConnection.setVpnGatewayId(new StringUnmarshaller().unmarshall(vpnGatewayIdNode));
    

        return vpnConnection;
    }  
}
    