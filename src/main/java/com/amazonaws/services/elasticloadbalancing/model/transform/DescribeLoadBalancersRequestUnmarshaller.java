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
 * Describe Load Balancers Request Unmarshaller
 */
public class DescribeLoadBalancersRequestUnmarshaller implements Unmarshaller<DescribeLoadBalancersRequest, Node> {

    public DescribeLoadBalancersRequest unmarshall(Node node) throws Exception {
        if (node == null) return null;

        DescribeLoadBalancersRequest describeLoadBalancersRequest = new DescribeLoadBalancersRequest();

        
        NodeList loadBalancerNamesNodes = XpathUtils.asNodeList("LoadBalancerNames/member", node);
        for (int loadBalancerNamesIndex = 0; loadBalancerNamesIndex < XpathUtils.nodeLength(loadBalancerNamesNodes); ++loadBalancerNamesIndex) {
            Node loadBalancerNamesNode = loadBalancerNamesNodes.item(loadBalancerNamesIndex);
            describeLoadBalancersRequest.getLoadBalancerNames().add(new StringUnmarshaller().unmarshall(loadBalancerNamesNode));
            loadBalancerNamesNode.getParentNode().removeChild(loadBalancerNamesNode);
        }
    

        return describeLoadBalancersRequest;
    }
}
    