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

package com.amazonaws.services.rds.model.transform;

import org.w3c.dom.*;
import com.amazonaws.services.rds.model.*;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.transform.SimpleTypeUnmarshallers.*;
import com.amazonaws.util.XpathUtils;

/**
 * D B Security Group Unmarshaller
 */        
public class DBSecurityGroupUnmarshaller implements Unmarshaller<DBSecurityGroup, Node> {

    public DBSecurityGroup unmarshall(Node node) throws Exception {
        DBSecurityGroup dBSecurityGroup = new DBSecurityGroup();
        
        
        Node ownerIdNode = XpathUtils.asNode("OwnerId", node);
        dBSecurityGroup.setOwnerId(new StringUnmarshaller().unmarshall(ownerIdNode));
    
        Node dBSecurityGroupNameNode = XpathUtils.asNode("DBSecurityGroupName", node);
        dBSecurityGroup.setDBSecurityGroupName(new StringUnmarshaller().unmarshall(dBSecurityGroupNameNode));
    
        Node dBSecurityGroupDescriptionNode = XpathUtils.asNode("DBSecurityGroupDescription", node);
        dBSecurityGroup.setDBSecurityGroupDescription(new StringUnmarshaller().unmarshall(dBSecurityGroupDescriptionNode));
    
        NodeList eC2SecurityGroupsNodes = XpathUtils.asNodeList("EC2SecurityGroups/EC2SecurityGroup", node);
        for (int eC2SecurityGroupsIndex = 0; eC2SecurityGroupsIndex < XpathUtils.nodeLength(eC2SecurityGroupsNodes); ++eC2SecurityGroupsIndex) {
            Node eC2SecurityGroupsNode = eC2SecurityGroupsNodes.item(eC2SecurityGroupsIndex);
            dBSecurityGroup.getEC2SecurityGroups().add(new EC2SecurityGroupUnmarshaller().unmarshall(eC2SecurityGroupsNode));
            eC2SecurityGroupsNode.getParentNode().removeChild(eC2SecurityGroupsNode);
        }
    
        NodeList iPRangesNodes = XpathUtils.asNodeList("IPRanges/IPRange", node);
        for (int iPRangesIndex = 0; iPRangesIndex < XpathUtils.nodeLength(iPRangesNodes); ++iPRangesIndex) {
            Node iPRangesNode = iPRangesNodes.item(iPRangesIndex);
            dBSecurityGroup.getIPRanges().add(new IPRangeUnmarshaller().unmarshall(iPRangesNode));
            iPRangesNode.getParentNode().removeChild(iPRangesNode);
        }
    

        return dBSecurityGroup;
    }  
}
    