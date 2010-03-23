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
 * Describe Customer Gateways Request Unmarshaller
 */        
public class DescribeCustomerGatewaysRequestUnmarshaller implements Unmarshaller<DescribeCustomerGatewaysRequest, Node> {

    public DescribeCustomerGatewaysRequest unmarshall(Node node) throws Exception {
        DescribeCustomerGatewaysRequest describeCustomerGatewaysRequest = new DescribeCustomerGatewaysRequest();
        
        
        NodeList customerGatewayIdsNodes = XpathUtils.asNodeList("CustomerGatewayId/CustomerGatewayId", node);
        for (int customerGatewayIdsIndex = 0; customerGatewayIdsIndex < XpathUtils.nodeLength(customerGatewayIdsNodes); ++customerGatewayIdsIndex) {
            Node customerGatewayIdsNode = customerGatewayIdsNodes.item(customerGatewayIdsIndex);
            describeCustomerGatewaysRequest.getCustomerGatewayIds().add(new StringUnmarshaller().unmarshall(customerGatewayIdsNode));
            customerGatewayIdsNode.getParentNode().removeChild(customerGatewayIdsNode);
        }
    
        NodeList filtersNodes = XpathUtils.asNodeList("Filter/Filter", node);
        for (int filtersIndex = 0; filtersIndex < XpathUtils.nodeLength(filtersNodes); ++filtersIndex) {
            Node filtersNode = filtersNodes.item(filtersIndex);
            describeCustomerGatewaysRequest.getFilters().add(new FilterUnmarshaller().unmarshall(filtersNode));
            filtersNode.getParentNode().removeChild(filtersNode);
        }
    

        return describeCustomerGatewaysRequest;
    }  
}
    