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
 * Ip Permission Unmarshaller
 */
public class IpPermissionUnmarshaller implements Unmarshaller<IpPermission, Node> {

    public IpPermission unmarshall(Node node) throws Exception {
        if (node == null) return null;

        IpPermission ipPermission = new IpPermission();

        
        Node ipProtocolNode = XpathUtils.asNode("ipProtocol", node);
        ipPermission.setIpProtocol(new StringUnmarshaller().unmarshall(ipProtocolNode));
    
        Node fromPortNode = XpathUtils.asNode("fromPort", node);
        ipPermission.setFromPort(new IntegerUnmarshaller().unmarshall(fromPortNode));
    
        Node toPortNode = XpathUtils.asNode("toPort", node);
        ipPermission.setToPort(new IntegerUnmarshaller().unmarshall(toPortNode));
    
        NodeList userIdGroupPairsNodes = XpathUtils.asNodeList("groups/item", node);
        for (int userIdGroupPairsIndex = 0; userIdGroupPairsIndex < XpathUtils.nodeLength(userIdGroupPairsNodes); ++userIdGroupPairsIndex) {
            Node userIdGroupPairsNode = userIdGroupPairsNodes.item(userIdGroupPairsIndex);
            ipPermission.getUserIdGroupPairs().add(new UserIdGroupPairUnmarshaller().unmarshall(userIdGroupPairsNode));
            userIdGroupPairsNode.getParentNode().removeChild(userIdGroupPairsNode);
        }
    
        NodeList ipRangesNodes = XpathUtils.asNodeList("ipRanges/item/cidrIp", node);
        for (int ipRangesIndex = 0; ipRangesIndex < XpathUtils.nodeLength(ipRangesNodes); ++ipRangesIndex) {
            Node ipRangesNode = ipRangesNodes.item(ipRangesIndex);
            ipPermission.getIpRanges().add(new StringUnmarshaller().unmarshall(ipRangesNode));
            ipRangesNode.getParentNode().removeChild(ipRangesNode);
        }
    

        return ipPermission;
    }
}
    