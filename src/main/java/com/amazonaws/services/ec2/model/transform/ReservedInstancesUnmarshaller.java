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
 * Reserved Instances Unmarshaller
 */
public class ReservedInstancesUnmarshaller implements Unmarshaller<ReservedInstances, Node> {

    public ReservedInstances unmarshall(Node node) throws Exception {
        if (node == null) return null;

        ReservedInstances reservedInstances = new ReservedInstances();

        
        Node reservedInstancesIdNode = XpathUtils.asNode("reservedInstancesId", node);
        reservedInstances.setReservedInstancesId(new StringUnmarshaller().unmarshall(reservedInstancesIdNode));
    
        Node instanceTypeNode = XpathUtils.asNode("instanceType", node);
        reservedInstances.setInstanceType(new StringUnmarshaller().unmarshall(instanceTypeNode));
    
        Node availabilityZoneNode = XpathUtils.asNode("availabilityZone", node);
        reservedInstances.setAvailabilityZone(new StringUnmarshaller().unmarshall(availabilityZoneNode));
    
        Node startNode = XpathUtils.asNode("start", node);
        reservedInstances.setStart(new DateUnmarshaller().unmarshall(startNode));
    
        Node durationNode = XpathUtils.asNode("duration", node);
        reservedInstances.setDuration(new LongUnmarshaller().unmarshall(durationNode));
    
        Node usagePriceNode = XpathUtils.asNode("usagePrice", node);
        reservedInstances.setUsagePrice(new FloatUnmarshaller().unmarshall(usagePriceNode));
    
        Node fixedPriceNode = XpathUtils.asNode("fixedPrice", node);
        reservedInstances.setFixedPrice(new FloatUnmarshaller().unmarshall(fixedPriceNode));
    
        Node instanceCountNode = XpathUtils.asNode("instanceCount", node);
        reservedInstances.setInstanceCount(new IntegerUnmarshaller().unmarshall(instanceCountNode));
    
        Node productDescriptionNode = XpathUtils.asNode("productDescription", node);
        reservedInstances.setProductDescription(new StringUnmarshaller().unmarshall(productDescriptionNode));
    
        Node stateNode = XpathUtils.asNode("state", node);
        reservedInstances.setState(new StringUnmarshaller().unmarshall(stateNode));
    

        return reservedInstances;
    }
}
    