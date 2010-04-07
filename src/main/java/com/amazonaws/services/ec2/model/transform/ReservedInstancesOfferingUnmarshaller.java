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
 * Reserved Instances Offering Unmarshaller
 */
public class ReservedInstancesOfferingUnmarshaller implements Unmarshaller<ReservedInstancesOffering, Node> {

    public ReservedInstancesOffering unmarshall(Node node) throws Exception {
        if (node == null) return null;

        ReservedInstancesOffering reservedInstancesOffering = new ReservedInstancesOffering();

        
        Node reservedInstancesOfferingIdNode = XpathUtils.asNode("reservedInstancesOfferingId", node);
        reservedInstancesOffering.setReservedInstancesOfferingId(new StringUnmarshaller().unmarshall(reservedInstancesOfferingIdNode));
    
        Node instanceTypeNode = XpathUtils.asNode("instanceType", node);
        reservedInstancesOffering.setInstanceType(new StringUnmarshaller().unmarshall(instanceTypeNode));
    
        Node availabilityZoneNode = XpathUtils.asNode("availabilityZone", node);
        reservedInstancesOffering.setAvailabilityZone(new StringUnmarshaller().unmarshall(availabilityZoneNode));
    
        Node durationNode = XpathUtils.asNode("duration", node);
        reservedInstancesOffering.setDuration(new LongUnmarshaller().unmarshall(durationNode));
    
        Node usagePriceNode = XpathUtils.asNode("usagePrice", node);
        reservedInstancesOffering.setUsagePrice(new FloatUnmarshaller().unmarshall(usagePriceNode));
    
        Node fixedPriceNode = XpathUtils.asNode("fixedPrice", node);
        reservedInstancesOffering.setFixedPrice(new FloatUnmarshaller().unmarshall(fixedPriceNode));
    
        Node productDescriptionNode = XpathUtils.asNode("productDescription", node);
        reservedInstancesOffering.setProductDescription(new StringUnmarshaller().unmarshall(productDescriptionNode));
    

        return reservedInstancesOffering;
    }
}
    