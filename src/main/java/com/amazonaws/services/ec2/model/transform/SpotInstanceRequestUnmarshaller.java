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
 * Spot Instance Request Unmarshaller
 */
public class SpotInstanceRequestUnmarshaller implements Unmarshaller<SpotInstanceRequest, Node> {

    public SpotInstanceRequest unmarshall(Node node) throws Exception {
        if (node == null) return null;

        SpotInstanceRequest spotInstanceRequest = new SpotInstanceRequest();

        
        Node spotInstanceRequestIdNode = XpathUtils.asNode("spotInstanceRequestId", node);
        spotInstanceRequest.setSpotInstanceRequestId(new StringUnmarshaller().unmarshall(spotInstanceRequestIdNode));
    
        Node spotPriceNode = XpathUtils.asNode("spotPrice", node);
        spotInstanceRequest.setSpotPrice(new StringUnmarshaller().unmarshall(spotPriceNode));
    
        Node typeNode = XpathUtils.asNode("type", node);
        spotInstanceRequest.setType(new StringUnmarshaller().unmarshall(typeNode));
    
        Node stateNode = XpathUtils.asNode("state", node);
        spotInstanceRequest.setState(new StringUnmarshaller().unmarshall(stateNode));
    
        Node faultNode = XpathUtils.asNode("fault", node);
        spotInstanceRequest.setFault(new SpotInstanceStateFaultUnmarshaller().unmarshall(faultNode));
    
        Node validFromNode = XpathUtils.asNode("validFrom", node);
        spotInstanceRequest.setValidFrom(new DateUnmarshaller().unmarshall(validFromNode));
    
        Node validUntilNode = XpathUtils.asNode("validUntil", node);
        spotInstanceRequest.setValidUntil(new DateUnmarshaller().unmarshall(validUntilNode));
    
        Node launchGroupNode = XpathUtils.asNode("launchGroup", node);
        spotInstanceRequest.setLaunchGroup(new StringUnmarshaller().unmarshall(launchGroupNode));
    
        Node availabilityZoneGroupNode = XpathUtils.asNode("availabilityZoneGroup", node);
        spotInstanceRequest.setAvailabilityZoneGroup(new StringUnmarshaller().unmarshall(availabilityZoneGroupNode));
    
        Node launchSpecificationNode = XpathUtils.asNode("launchSpecification", node);
        spotInstanceRequest.setLaunchSpecification(new LaunchSpecificationUnmarshaller().unmarshall(launchSpecificationNode));
    
        Node instanceIdNode = XpathUtils.asNode("instanceId", node);
        spotInstanceRequest.setInstanceId(new StringUnmarshaller().unmarshall(instanceIdNode));
    
        Node createTimeNode = XpathUtils.asNode("createTime", node);
        spotInstanceRequest.setCreateTime(new DateUnmarshaller().unmarshall(createTimeNode));
    
        Node productDescriptionNode = XpathUtils.asNode("productDescription", node);
        spotInstanceRequest.setProductDescription(new StringUnmarshaller().unmarshall(productDescriptionNode));
    

        return spotInstanceRequest;
    }
}
    