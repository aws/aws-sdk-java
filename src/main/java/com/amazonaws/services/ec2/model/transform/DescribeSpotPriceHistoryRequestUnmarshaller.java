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
 * Describe Spot Price History Request Unmarshaller
 */
public class DescribeSpotPriceHistoryRequestUnmarshaller implements Unmarshaller<DescribeSpotPriceHistoryRequest, Node> {

    public DescribeSpotPriceHistoryRequest unmarshall(Node node) throws Exception {
        if (node == null) return null;

        DescribeSpotPriceHistoryRequest describeSpotPriceHistoryRequest = new DescribeSpotPriceHistoryRequest();

        
        Node startTimeNode = XpathUtils.asNode("startTime", node);
        describeSpotPriceHistoryRequest.setStartTime(new DateUnmarshaller().unmarshall(startTimeNode));
    
        Node endTimeNode = XpathUtils.asNode("endTime", node);
        describeSpotPriceHistoryRequest.setEndTime(new DateUnmarshaller().unmarshall(endTimeNode));
    
        NodeList instanceTypesNodes = XpathUtils.asNodeList("InstanceType/member", node);
        for (int instanceTypesIndex = 0; instanceTypesIndex < XpathUtils.nodeLength(instanceTypesNodes); ++instanceTypesIndex) {
            Node instanceTypesNode = instanceTypesNodes.item(instanceTypesIndex);
            describeSpotPriceHistoryRequest.getInstanceTypes().add(new StringUnmarshaller().unmarshall(instanceTypesNode));
            instanceTypesNode.getParentNode().removeChild(instanceTypesNode);
        }
    
        NodeList productDescriptionsNodes = XpathUtils.asNodeList("ProductDescription/member", node);
        for (int productDescriptionsIndex = 0; productDescriptionsIndex < XpathUtils.nodeLength(productDescriptionsNodes); ++productDescriptionsIndex) {
            Node productDescriptionsNode = productDescriptionsNodes.item(productDescriptionsIndex);
            describeSpotPriceHistoryRequest.getProductDescriptions().add(new StringUnmarshaller().unmarshall(productDescriptionsNode));
            productDescriptionsNode.getParentNode().removeChild(productDescriptionsNode);
        }
    

        return describeSpotPriceHistoryRequest;
    }
}
    