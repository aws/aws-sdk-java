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
 * Describe Reserved Instances Offerings Request Unmarshaller
 */        
public class DescribeReservedInstancesOfferingsRequestUnmarshaller implements Unmarshaller<DescribeReservedInstancesOfferingsRequest, Node> {

    public DescribeReservedInstancesOfferingsRequest unmarshall(Node node) throws Exception {
        DescribeReservedInstancesOfferingsRequest describeReservedInstancesOfferingsRequest = new DescribeReservedInstancesOfferingsRequest();
        
        
        NodeList reservedInstancesOfferingIdsNodes = XpathUtils.asNodeList("ReservedInstancesOfferingId/member", node);
        for (int reservedInstancesOfferingIdsIndex = 0; reservedInstancesOfferingIdsIndex < XpathUtils.nodeLength(reservedInstancesOfferingIdsNodes); ++reservedInstancesOfferingIdsIndex) {
            Node reservedInstancesOfferingIdsNode = reservedInstancesOfferingIdsNodes.item(reservedInstancesOfferingIdsIndex);
            describeReservedInstancesOfferingsRequest.getReservedInstancesOfferingIds().add(new StringUnmarshaller().unmarshall(reservedInstancesOfferingIdsNode));
            reservedInstancesOfferingIdsNode.getParentNode().removeChild(reservedInstancesOfferingIdsNode);
        }
    
        Node instanceTypeNode = XpathUtils.asNode("InstanceType", node);
        describeReservedInstancesOfferingsRequest.setInstanceType(new StringUnmarshaller().unmarshall(instanceTypeNode));
    
        Node availabilityZoneNode = XpathUtils.asNode("AvailabilityZone", node);
        describeReservedInstancesOfferingsRequest.setAvailabilityZone(new StringUnmarshaller().unmarshall(availabilityZoneNode));
    
        Node productDescriptionNode = XpathUtils.asNode("ProductDescription", node);
        describeReservedInstancesOfferingsRequest.setProductDescription(new StringUnmarshaller().unmarshall(productDescriptionNode));
    

        return describeReservedInstancesOfferingsRequest;
    }  
}
    