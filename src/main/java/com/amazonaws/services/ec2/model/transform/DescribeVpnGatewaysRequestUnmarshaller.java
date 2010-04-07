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
 * Describe Vpn Gateways Request Unmarshaller
 */
public class DescribeVpnGatewaysRequestUnmarshaller implements Unmarshaller<DescribeVpnGatewaysRequest, Node> {

    public DescribeVpnGatewaysRequest unmarshall(Node node) throws Exception {
        if (node == null) return null;

        DescribeVpnGatewaysRequest describeVpnGatewaysRequest = new DescribeVpnGatewaysRequest();

        
        NodeList vpnGatewayIdsNodes = XpathUtils.asNodeList("VpnGatewayId/VpnGatewayId", node);
        for (int vpnGatewayIdsIndex = 0; vpnGatewayIdsIndex < XpathUtils.nodeLength(vpnGatewayIdsNodes); ++vpnGatewayIdsIndex) {
            Node vpnGatewayIdsNode = vpnGatewayIdsNodes.item(vpnGatewayIdsIndex);
            describeVpnGatewaysRequest.getVpnGatewayIds().add(new StringUnmarshaller().unmarshall(vpnGatewayIdsNode));
            vpnGatewayIdsNode.getParentNode().removeChild(vpnGatewayIdsNode);
        }
    
        NodeList filtersNodes = XpathUtils.asNodeList("Filter/Filter", node);
        for (int filtersIndex = 0; filtersIndex < XpathUtils.nodeLength(filtersNodes); ++filtersIndex) {
            Node filtersNode = filtersNodes.item(filtersIndex);
            describeVpnGatewaysRequest.getFilters().add(new FilterUnmarshaller().unmarshall(filtersNode));
            filtersNode.getParentNode().removeChild(filtersNode);
        }
    

        return describeVpnGatewaysRequest;
    }
}
    