/*
 * Copyright 2010-2012 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.services.elasticloadbalancing.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * Create L B Cookie Stickiness Policy Request Marshaller
 */
public class CreateLBCookieStickinessPolicyRequestMarshaller implements Marshaller<Request<CreateLBCookieStickinessPolicyRequest>, CreateLBCookieStickinessPolicyRequest> {

    public Request<CreateLBCookieStickinessPolicyRequest> marshall(CreateLBCookieStickinessPolicyRequest createLBCookieStickinessPolicyRequest) {

        if (createLBCookieStickinessPolicyRequest == null) {
		    throw new AmazonClientException("Invalid argument passed to marshall(...)");
		}

        Request<CreateLBCookieStickinessPolicyRequest> request = new DefaultRequest<CreateLBCookieStickinessPolicyRequest>(createLBCookieStickinessPolicyRequest, "AmazonElasticLoadBalancing");
        request.addParameter("Action", "CreateLBCookieStickinessPolicy");
        request.addParameter("Version", "2012-06-01");

        if (createLBCookieStickinessPolicyRequest.getLoadBalancerName() != null) {
            request.addParameter("LoadBalancerName", StringUtils.fromString(createLBCookieStickinessPolicyRequest.getLoadBalancerName()));
        }
        if (createLBCookieStickinessPolicyRequest.getPolicyName() != null) {
            request.addParameter("PolicyName", StringUtils.fromString(createLBCookieStickinessPolicyRequest.getPolicyName()));
        }
        if (createLBCookieStickinessPolicyRequest.getCookieExpirationPeriod() != null) {
            request.addParameter("CookieExpirationPeriod", StringUtils.fromLong(createLBCookieStickinessPolicyRequest.getCookieExpirationPeriod()));
        }


        return request;
    }
}
