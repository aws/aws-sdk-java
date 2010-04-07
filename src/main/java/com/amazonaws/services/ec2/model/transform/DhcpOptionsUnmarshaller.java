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
 * Dhcp Options Unmarshaller
 */
public class DhcpOptionsUnmarshaller implements Unmarshaller<DhcpOptions, Node> {

    public DhcpOptions unmarshall(Node node) throws Exception {
        if (node == null) return null;

        DhcpOptions dhcpOptions = new DhcpOptions();

        
        Node dhcpOptionsIdNode = XpathUtils.asNode("dhcpOptionsId", node);
        dhcpOptions.setDhcpOptionsId(new StringUnmarshaller().unmarshall(dhcpOptionsIdNode));
    
        NodeList dhcpConfigurationsNodes = XpathUtils.asNodeList("dhcpConfigurationSet/item", node);
        for (int dhcpConfigurationsIndex = 0; dhcpConfigurationsIndex < XpathUtils.nodeLength(dhcpConfigurationsNodes); ++dhcpConfigurationsIndex) {
            Node dhcpConfigurationsNode = dhcpConfigurationsNodes.item(dhcpConfigurationsIndex);
            dhcpOptions.getDhcpConfigurations().add(new DhcpConfigurationUnmarshaller().unmarshall(dhcpConfigurationsNode));
            dhcpConfigurationsNode.getParentNode().removeChild(dhcpConfigurationsNode);
        }
    

        return dhcpOptions;
    }
}
    