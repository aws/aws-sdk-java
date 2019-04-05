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
 * CreateAppCookieStickinessPolicyRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateAppCookieStickinessPolicyRequestMarshaller implements
        Marshaller<Request<CreateAppCookieStickinessPolicyRequest>, CreateAppCookieStickinessPolicyRequest> {

    public Request<CreateAppCookieStickinessPolicyRequest> marshall(CreateAppCookieStickinessPolicyRequest createAppCookieStickinessPolicyRequest) {

        if (createAppCookieStickinessPolicyRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<CreateAppCookieStickinessPolicyRequest> request = new DefaultRequest<CreateAppCookieStickinessPolicyRequest>(
                createAppCookieStickinessPolicyRequest, "AmazonElasticLoadBalancing");
        request.addParameter("Action", "CreateAppCookieStickinessPolicy");
        request.addParameter("Version", "2012-06-01");
        request.setHttpMethod(HttpMethodName.POST);

        if (createAppCookieStickinessPolicyRequest.getLoadBalancerName() != null) {
            request.addParameter("LoadBalancerName", StringUtils.fromString(createAppCookieStickinessPolicyRequest.getLoadBalancerName()));
        }

        if (createAppCookieStickinessPolicyRequest.getPolicyName() != null) {
            request.addParameter("PolicyName", StringUtils.fromString(createAppCookieStickinessPolicyRequest.getPolicyName()));
        }

        if (createAppCookieStickinessPolicyRequest.getCookieName() != null) {
            request.addParameter("CookieName", StringUtils.fromString(createAppCookieStickinessPolicyRequest.getCookieName()));
        }

        return request;
    }

}
