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

package com.amazonaws.services.elasticloadbalancing.model.transform;

import org.w3c.dom.*;
import com.amazonaws.services.elasticloadbalancing.model.*;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.transform.SimpleTypeUnmarshallers.*;
import com.amazonaws.util.XpathUtils;

/**
 * Create Load Balancer Request Unmarshaller
 */        
public class CreateLoadBalancerRequestUnmarshaller implements Unmarshaller<CreateLoadBalancerRequest, Node> {

    public CreateLoadBalancerRequest unmarshall(Node node) throws Exception {
        CreateLoadBalancerRequest createLoadBalancerRequest = new CreateLoadBalancerRequest();
        
        
        Node loadBalancerNameNode = XpathUtils.asNode("LoadBalancerName", node);
        createLoadBalancerRequest.setLoadBalancerName(new StringUnmarshaller().unmarshall(loadBalancerNameNode));
    
        NodeList listenersNodes = XpathUtils.asNodeList("Listeners/member", node);
        for (int listenersIndex = 0; listenersIndex < XpathUtils.nodeLength(listenersNodes); ++listenersIndex) {
            Node listenersNode = listenersNodes.item(listenersIndex);
            createLoadBalancerRequest.getListeners().add(new ListenerUnmarshaller().unmarshall(listenersNode));
            listenersNode.getParentNode().removeChild(listenersNode);
        }
    
        NodeList availabilityZonesNodes = XpathUtils.asNodeList("AvailabilityZones/member", node);
        for (int availabilityZonesIndex = 0; availabilityZonesIndex < XpathUtils.nodeLength(availabilityZonesNodes); ++availabilityZonesIndex) {
            Node availabilityZonesNode = availabilityZonesNodes.item(availabilityZonesIndex);
            createLoadBalancerRequest.getAvailabilityZones().add(new StringUnmarshaller().unmarshall(availabilityZonesNode));
            availabilityZonesNode.getParentNode().removeChild(availabilityZonesNode);
        }
    

        return createLoadBalancerRequest;
    }  
}
    