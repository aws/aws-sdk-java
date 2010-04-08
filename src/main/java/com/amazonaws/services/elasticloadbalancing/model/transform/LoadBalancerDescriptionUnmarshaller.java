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
 * Load Balancer Description Unmarshaller
 */
public class LoadBalancerDescriptionUnmarshaller implements Unmarshaller<LoadBalancerDescription, Node> {

    public LoadBalancerDescription unmarshall(Node node) throws Exception {
        if (node == null) return null;

        LoadBalancerDescription loadBalancerDescription = new LoadBalancerDescription();

        
        Node loadBalancerNameNode = XpathUtils.asNode("LoadBalancerName", node);
        loadBalancerDescription.setLoadBalancerName(new StringUnmarshaller().unmarshall(loadBalancerNameNode));
    
        Node dNSNameNode = XpathUtils.asNode("DNSName", node);
        loadBalancerDescription.setDNSName(new StringUnmarshaller().unmarshall(dNSNameNode));
    
        NodeList listenerDescriptionsNodes = XpathUtils.asNodeList("ListenerDescriptions/member", node);
        for (int listenerDescriptionsIndex = 0; listenerDescriptionsIndex < XpathUtils.nodeLength(listenerDescriptionsNodes); ++listenerDescriptionsIndex) {
            Node listenerDescriptionsNode = listenerDescriptionsNodes.item(listenerDescriptionsIndex);
            loadBalancerDescription.getListenerDescriptions().add(new ListenerDescriptionUnmarshaller().unmarshall(listenerDescriptionsNode));
            listenerDescriptionsNode.getParentNode().removeChild(listenerDescriptionsNode);
        }
    
        Node policiesNode = XpathUtils.asNode("Policies", node);
        loadBalancerDescription.setPolicies(new PoliciesUnmarshaller().unmarshall(policiesNode));
    
        NodeList availabilityZonesNodes = XpathUtils.asNodeList("AvailabilityZones/member", node);
        for (int availabilityZonesIndex = 0; availabilityZonesIndex < XpathUtils.nodeLength(availabilityZonesNodes); ++availabilityZonesIndex) {
            Node availabilityZonesNode = availabilityZonesNodes.item(availabilityZonesIndex);
            loadBalancerDescription.getAvailabilityZones().add(new StringUnmarshaller().unmarshall(availabilityZonesNode));
            availabilityZonesNode.getParentNode().removeChild(availabilityZonesNode);
        }
    
        NodeList instancesNodes = XpathUtils.asNodeList("Instances/member", node);
        for (int instancesIndex = 0; instancesIndex < XpathUtils.nodeLength(instancesNodes); ++instancesIndex) {
            Node instancesNode = instancesNodes.item(instancesIndex);
            loadBalancerDescription.getInstances().add(new InstanceUnmarshaller().unmarshall(instancesNode));
            instancesNode.getParentNode().removeChild(instancesNode);
        }
    
        Node healthCheckNode = XpathUtils.asNode("HealthCheck", node);
        loadBalancerDescription.setHealthCheck(new HealthCheckUnmarshaller().unmarshall(healthCheckNode));
    
        Node createdTimeNode = XpathUtils.asNode("CreatedTime", node);
        loadBalancerDescription.setCreatedTime(new DateUnmarshaller().unmarshall(createdTimeNode));
    

        return loadBalancerDescription;
    }
}
    