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
 * Request Spot Instances Request Unmarshaller
 */
public class RequestSpotInstancesRequestUnmarshaller implements Unmarshaller<RequestSpotInstancesRequest, Node> {

    public RequestSpotInstancesRequest unmarshall(Node node) throws Exception {
        if (node == null) return null;

        RequestSpotInstancesRequest requestSpotInstancesRequest = new RequestSpotInstancesRequest();

        
        Node spotPriceNode = XpathUtils.asNode("spotPrice", node);
        requestSpotInstancesRequest.setSpotPrice(new StringUnmarshaller().unmarshall(spotPriceNode));
    
        Node instanceCountNode = XpathUtils.asNode("instanceCount", node);
        requestSpotInstancesRequest.setInstanceCount(new IntegerUnmarshaller().unmarshall(instanceCountNode));
    
        Node typeNode = XpathUtils.asNode("type", node);
        requestSpotInstancesRequest.setType(new StringUnmarshaller().unmarshall(typeNode));
    
        Node validFromNode = XpathUtils.asNode("validFrom", node);
        requestSpotInstancesRequest.setValidFrom(new DateUnmarshaller().unmarshall(validFromNode));
    
        Node validUntilNode = XpathUtils.asNode("validUntil", node);
        requestSpotInstancesRequest.setValidUntil(new DateUnmarshaller().unmarshall(validUntilNode));
    
        Node launchGroupNode = XpathUtils.asNode("launchGroup", node);
        requestSpotInstancesRequest.setLaunchGroup(new StringUnmarshaller().unmarshall(launchGroupNode));
    
        Node availabilityZoneGroupNode = XpathUtils.asNode("availabilityZoneGroup", node);
        requestSpotInstancesRequest.setAvailabilityZoneGroup(new StringUnmarshaller().unmarshall(availabilityZoneGroupNode));
    
        Node launchSpecificationNode = XpathUtils.asNode("launchSpecification", node);
        requestSpotInstancesRequest.setLaunchSpecification(new LaunchSpecificationUnmarshaller().unmarshall(launchSpecificationNode));
    

        return requestSpotInstancesRequest;
    }
}
    