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
 * Security Group Unmarshaller
 */        
public class SecurityGroupUnmarshaller implements Unmarshaller<SecurityGroup, Node> {

    public SecurityGroup unmarshall(Node node) throws Exception {
        SecurityGroup securityGroup = new SecurityGroup();
        
        
        Node ownerIdNode = XpathUtils.asNode("ownerId", node);
        securityGroup.setOwnerId(new StringUnmarshaller().unmarshall(ownerIdNode));
    
        Node groupNameNode = XpathUtils.asNode("groupName", node);
        securityGroup.setGroupName(new StringUnmarshaller().unmarshall(groupNameNode));
    
        Node descriptionNode = XpathUtils.asNode("groupDescription", node);
        securityGroup.setDescription(new StringUnmarshaller().unmarshall(descriptionNode));
    
        NodeList ipPermissionsNodes = XpathUtils.asNodeList("ipPermissions/item", node);
        for (int ipPermissionsIndex = 0; ipPermissionsIndex < XpathUtils.nodeLength(ipPermissionsNodes); ++ipPermissionsIndex) {
            Node ipPermissionsNode = ipPermissionsNodes.item(ipPermissionsIndex);
            securityGroup.getIpPermissions().add(new IpPermissionUnmarshaller().unmarshall(ipPermissionsNode));
            ipPermissionsNode.getParentNode().removeChild(ipPermissionsNode);
        }
    

        return securityGroup;
    }  
}
    