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
 * Describe Security Groups Result Unmarshaller
 */        
public class DescribeSecurityGroupsResultUnmarshaller implements Unmarshaller<DescribeSecurityGroupsResult, Node> {

    public DescribeSecurityGroupsResult unmarshall(Node node) throws Exception {
        DescribeSecurityGroupsResult describeSecurityGroupsResult = new DescribeSecurityGroupsResult();
        
        
        NodeList securityGroupsNodes = XpathUtils.asNodeList("securityGroupInfo/item", node);
        for (int securityGroupsIndex = 0; securityGroupsIndex < XpathUtils.nodeLength(securityGroupsNodes); ++securityGroupsIndex) {
            Node securityGroupsNode = securityGroupsNodes.item(securityGroupsIndex);
            describeSecurityGroupsResult.getSecurityGroups().add(new SecurityGroupUnmarshaller().unmarshall(securityGroupsNode));
            securityGroupsNode.getParentNode().removeChild(securityGroupsNode);
        }
    

        return describeSecurityGroupsResult;
    }  
}
    