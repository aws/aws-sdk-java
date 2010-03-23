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
 * Describe Load Balancers Result Unmarshaller
 */        
public class DescribeLoadBalancersResultUnmarshaller implements Unmarshaller<DescribeLoadBalancersResult, Node> {

    public DescribeLoadBalancersResult unmarshall(Node node) throws Exception {
        DescribeLoadBalancersResult describeLoadBalancersResult = new DescribeLoadBalancersResult();
        
        
        NodeList loadBalancerDescriptionsNodes = XpathUtils.asNodeList("LoadBalancerDescriptions/member", node);
        for (int loadBalancerDescriptionsIndex = 0; loadBalancerDescriptionsIndex < XpathUtils.nodeLength(loadBalancerDescriptionsNodes); ++loadBalancerDescriptionsIndex) {
            Node loadBalancerDescriptionsNode = loadBalancerDescriptionsNodes.item(loadBalancerDescriptionsIndex);
            describeLoadBalancersResult.getLoadBalancerDescriptions().add(new LoadBalancerDescriptionUnmarshaller().unmarshall(loadBalancerDescriptionsNode));
            loadBalancerDescriptionsNode.getParentNode().removeChild(loadBalancerDescriptionsNode);
        }
    

        return describeLoadBalancersResult;
    }  
}
    