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
 * Describe Subnets Request Unmarshaller
 */        
public class DescribeSubnetsRequestUnmarshaller implements Unmarshaller<DescribeSubnetsRequest, Node> {

    public DescribeSubnetsRequest unmarshall(Node node) throws Exception {
        DescribeSubnetsRequest describeSubnetsRequest = new DescribeSubnetsRequest();
        
        
        NodeList subnetIdsNodes = XpathUtils.asNodeList("SubnetId/SubnetId", node);
        for (int subnetIdsIndex = 0; subnetIdsIndex < XpathUtils.nodeLength(subnetIdsNodes); ++subnetIdsIndex) {
            Node subnetIdsNode = subnetIdsNodes.item(subnetIdsIndex);
            describeSubnetsRequest.getSubnetIds().add(new StringUnmarshaller().unmarshall(subnetIdsNode));
            subnetIdsNode.getParentNode().removeChild(subnetIdsNode);
        }
    
        NodeList filtersNodes = XpathUtils.asNodeList("Filter/Filter", node);
        for (int filtersIndex = 0; filtersIndex < XpathUtils.nodeLength(filtersNodes); ++filtersIndex) {
            Node filtersNode = filtersNodes.item(filtersIndex);
            describeSubnetsRequest.getFilters().add(new FilterUnmarshaller().unmarshall(filtersNode));
            filtersNode.getParentNode().removeChild(filtersNode);
        }
    

        return describeSubnetsRequest;
    }  
}
    