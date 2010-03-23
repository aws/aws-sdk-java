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

package com.amazonaws.services.autoscaling.model.transform;

import org.w3c.dom.*;
import com.amazonaws.services.autoscaling.model.*;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.transform.SimpleTypeUnmarshallers.*;
import com.amazonaws.util.XpathUtils;

/**
 * Auto Scaling Group Unmarshaller
 */        
public class AutoScalingGroupUnmarshaller implements Unmarshaller<AutoScalingGroup, Node> {

    public AutoScalingGroup unmarshall(Node node) throws Exception {
        AutoScalingGroup autoScalingGroup = new AutoScalingGroup();
        
        
        Node autoScalingGroupNameNode = XpathUtils.asNode("AutoScalingGroupName", node);
        autoScalingGroup.setAutoScalingGroupName(new StringUnmarshaller().unmarshall(autoScalingGroupNameNode));
    
        Node launchConfigurationNameNode = XpathUtils.asNode("LaunchConfigurationName", node);
        autoScalingGroup.setLaunchConfigurationName(new StringUnmarshaller().unmarshall(launchConfigurationNameNode));
    
        Node minSizeNode = XpathUtils.asNode("MinSize", node);
        autoScalingGroup.setMinSize(new IntegerUnmarshaller().unmarshall(minSizeNode));
    
        Node maxSizeNode = XpathUtils.asNode("MaxSize", node);
        autoScalingGroup.setMaxSize(new IntegerUnmarshaller().unmarshall(maxSizeNode));
    
        Node desiredCapacityNode = XpathUtils.asNode("DesiredCapacity", node);
        autoScalingGroup.setDesiredCapacity(new IntegerUnmarshaller().unmarshall(desiredCapacityNode));
    
        Node cooldownNode = XpathUtils.asNode("Cooldown", node);
        autoScalingGroup.setCooldown(new IntegerUnmarshaller().unmarshall(cooldownNode));
    
        NodeList availabilityZonesNodes = XpathUtils.asNodeList("AvailabilityZones/member", node);
        for (int availabilityZonesIndex = 0; availabilityZonesIndex < XpathUtils.nodeLength(availabilityZonesNodes); ++availabilityZonesIndex) {
            Node availabilityZonesNode = availabilityZonesNodes.item(availabilityZonesIndex);
            autoScalingGroup.getAvailabilityZones().add(new StringUnmarshaller().unmarshall(availabilityZonesNode));
            availabilityZonesNode.getParentNode().removeChild(availabilityZonesNode);
        }
    
        NodeList loadBalancerNamesNodes = XpathUtils.asNodeList("LoadBalancerNames/member", node);
        for (int loadBalancerNamesIndex = 0; loadBalancerNamesIndex < XpathUtils.nodeLength(loadBalancerNamesNodes); ++loadBalancerNamesIndex) {
            Node loadBalancerNamesNode = loadBalancerNamesNodes.item(loadBalancerNamesIndex);
            autoScalingGroup.getLoadBalancerNames().add(new StringUnmarshaller().unmarshall(loadBalancerNamesNode));
            loadBalancerNamesNode.getParentNode().removeChild(loadBalancerNamesNode);
        }
    
        NodeList instancesNodes = XpathUtils.asNodeList("Instances/member", node);
        for (int instancesIndex = 0; instancesIndex < XpathUtils.nodeLength(instancesNodes); ++instancesIndex) {
            Node instancesNode = instancesNodes.item(instancesIndex);
            autoScalingGroup.getInstances().add(new InstanceUnmarshaller().unmarshall(instancesNode));
            instancesNode.getParentNode().removeChild(instancesNode);
        }
    
        Node createdTimeNode = XpathUtils.asNode("CreatedTime", node);
        autoScalingGroup.setCreatedTime(new DateUnmarshaller().unmarshall(createdTimeNode));
    

        return autoScalingGroup;
    }  
}
    