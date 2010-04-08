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
 * Set Load Balancer Policies Of Listener Request Unmarshaller
 */
public class SetLoadBalancerPoliciesOfListenerRequestUnmarshaller implements Unmarshaller<SetLoadBalancerPoliciesOfListenerRequest, Node> {

    public SetLoadBalancerPoliciesOfListenerRequest unmarshall(Node node) throws Exception {
        if (node == null) return null;

        SetLoadBalancerPoliciesOfListenerRequest setLoadBalancerPoliciesOfListenerRequest = new SetLoadBalancerPoliciesOfListenerRequest();

        
        Node loadBalancerNameNode = XpathUtils.asNode("LoadBalancerName", node);
        setLoadBalancerPoliciesOfListenerRequest.setLoadBalancerName(new StringUnmarshaller().unmarshall(loadBalancerNameNode));
    
        Node loadBalancerPortNode = XpathUtils.asNode("LoadBalancerPort", node);
        setLoadBalancerPoliciesOfListenerRequest.setLoadBalancerPort(new IntegerUnmarshaller().unmarshall(loadBalancerPortNode));
    
        NodeList policyNamesNodes = XpathUtils.asNodeList("PolicyNames/member", node);
        for (int policyNamesIndex = 0; policyNamesIndex < XpathUtils.nodeLength(policyNamesNodes); ++policyNamesIndex) {
            Node policyNamesNode = policyNamesNodes.item(policyNamesIndex);
            setLoadBalancerPoliciesOfListenerRequest.getPolicyNames().add(new StringUnmarshaller().unmarshall(policyNamesNode));
            policyNamesNode.getParentNode().removeChild(policyNamesNode);
        }
    

        return setLoadBalancerPoliciesOfListenerRequest;
    }
}
    