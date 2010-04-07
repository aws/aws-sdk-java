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
 * Update Auto Scaling Group Request Unmarshaller
 */
public class UpdateAutoScalingGroupRequestUnmarshaller implements Unmarshaller<UpdateAutoScalingGroupRequest, Node> {

    public UpdateAutoScalingGroupRequest unmarshall(Node node) throws Exception {
        if (node == null) return null;

        UpdateAutoScalingGroupRequest updateAutoScalingGroupRequest = new UpdateAutoScalingGroupRequest();

        
        Node autoScalingGroupNameNode = XpathUtils.asNode("AutoScalingGroupName", node);
        updateAutoScalingGroupRequest.setAutoScalingGroupName(new StringUnmarshaller().unmarshall(autoScalingGroupNameNode));
    
        Node launchConfigurationNameNode = XpathUtils.asNode("LaunchConfigurationName", node);
        updateAutoScalingGroupRequest.setLaunchConfigurationName(new StringUnmarshaller().unmarshall(launchConfigurationNameNode));
    
        Node minSizeNode = XpathUtils.asNode("MinSize", node);
        updateAutoScalingGroupRequest.setMinSize(new IntegerUnmarshaller().unmarshall(minSizeNode));
    
        Node maxSizeNode = XpathUtils.asNode("MaxSize", node);
        updateAutoScalingGroupRequest.setMaxSize(new IntegerUnmarshaller().unmarshall(maxSizeNode));
    
        Node cooldownNode = XpathUtils.asNode("Cooldown", node);
        updateAutoScalingGroupRequest.setCooldown(new IntegerUnmarshaller().unmarshall(cooldownNode));
    
        NodeList availabilityZonesNodes = XpathUtils.asNodeList("AvailabilityZones/member", node);
        for (int availabilityZonesIndex = 0; availabilityZonesIndex < XpathUtils.nodeLength(availabilityZonesNodes); ++availabilityZonesIndex) {
            Node availabilityZonesNode = availabilityZonesNodes.item(availabilityZonesIndex);
            updateAutoScalingGroupRequest.getAvailabilityZones().add(new StringUnmarshaller().unmarshall(availabilityZonesNode));
            availabilityZonesNode.getParentNode().removeChild(availabilityZonesNode);
        }
    

        return updateAutoScalingGroupRequest;
    }
}
    