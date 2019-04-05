/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.elasticloadbalancing.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.elasticloadbalancing.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * CreateLBCookieStickinessPolicyRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateLBCookieStickinessPolicyRequestMarshaller implements
        Marshaller<Request<CreateLBCookieStickinessPolicyRequest>, CreateLBCookieStickinessPolicyRequest> {

    public Request<CreateLBCookieStickinessPolicyRequest> marshall(CreateLBCookieStickinessPolicyRequest createLBCookieStickinessPolicyRequest) {

        if (createLBCookieStickinessPolicyRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<CreateLBCookieStickinessPolicyRequest> request = new DefaultRequest<CreateLBCookieStickinessPolicyRequest>(
                createLBCookieStickinessPolicyRequest, "AmazonElasticLoadBalancing");
        request.addParameter("Action", "CreateLBCookieStickinessPolicy");
        request.addParameter("Version", "2012-06-01");
        request.setHttpMethod(HttpMethodName.POST);

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
