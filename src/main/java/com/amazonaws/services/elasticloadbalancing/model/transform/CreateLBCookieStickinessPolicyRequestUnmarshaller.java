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
 * Create L B Cookie Stickiness Policy Request Unmarshaller
 */
public class CreateLBCookieStickinessPolicyRequestUnmarshaller implements Unmarshaller<CreateLBCookieStickinessPolicyRequest, Node> {

    public CreateLBCookieStickinessPolicyRequest unmarshall(Node node) throws Exception {
        if (node == null) return null;

        CreateLBCookieStickinessPolicyRequest createLBCookieStickinessPolicyRequest = new CreateLBCookieStickinessPolicyRequest();

        
        Node loadBalancerNameNode = XpathUtils.asNode("LoadBalancerName", node);
        createLBCookieStickinessPolicyRequest.setLoadBalancerName(new StringUnmarshaller().unmarshall(loadBalancerNameNode));
    
        Node policyNameNode = XpathUtils.asNode("PolicyName", node);
        createLBCookieStickinessPolicyRequest.setPolicyName(new StringUnmarshaller().unmarshall(policyNameNode));
    
        Node cookieExpirationPeriodNode = XpathUtils.asNode("CookieExpirationPeriod", node);
        createLBCookieStickinessPolicyRequest.setCookieExpirationPeriod(new LongUnmarshaller().unmarshall(cookieExpirationPeriodNode));
    

        return createLBCookieStickinessPolicyRequest;
    }
}
    