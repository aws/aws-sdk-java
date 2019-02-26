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
 * CreateLoadBalancerPolicyRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateLoadBalancerPolicyRequestMarshaller implements Marshaller<Request<CreateLoadBalancerPolicyRequest>, CreateLoadBalancerPolicyRequest> {

    public Request<CreateLoadBalancerPolicyRequest> marshall(CreateLoadBalancerPolicyRequest createLoadBalancerPolicyRequest) {

        if (createLoadBalancerPolicyRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<CreateLoadBalancerPolicyRequest> request = new DefaultRequest<CreateLoadBalancerPolicyRequest>(createLoadBalancerPolicyRequest,
                "AmazonElasticLoadBalancing");
        request.addParameter("Action", "CreateLoadBalancerPolicy");
        request.addParameter("Version", "2012-06-01");
        request.setHttpMethod(HttpMethodName.POST);

        if (createLoadBalancerPolicyRequest.getLoadBalancerName() != null) {
            request.addParameter("LoadBalancerName", StringUtils.fromString(createLoadBalancerPolicyRequest.getLoadBalancerName()));
        }

        if (createLoadBalancerPolicyRequest.getPolicyName() != null) {
            request.addParameter("PolicyName", StringUtils.fromString(createLoadBalancerPolicyRequest.getPolicyName()));
        }

        if (createLoadBalancerPolicyRequest.getPolicyTypeName() != null) {
            request.addParameter("PolicyTypeName", StringUtils.fromString(createLoadBalancerPolicyRequest.getPolicyTypeName()));
        }

        if (!createLoadBalancerPolicyRequest.getPolicyAttributes().isEmpty()
                || !((com.amazonaws.internal.SdkInternalList<PolicyAttribute>) createLoadBalancerPolicyRequest.getPolicyAttributes()).isAutoConstruct()) {
            com.amazonaws.internal.SdkInternalList<PolicyAttribute> policyAttributesList = (com.amazonaws.internal.SdkInternalList<PolicyAttribute>) createLoadBalancerPolicyRequest
                    .getPolicyAttributes();
            int policyAttributesListIndex = 1;

            for (PolicyAttribute policyAttributesListValue : policyAttributesList) {

                if (policyAttributesListValue.getAttributeName() != null) {
                    request.addParameter("PolicyAttributes.member." + policyAttributesListIndex + ".AttributeName",
                            StringUtils.fromString(policyAttributesListValue.getAttributeName()));
                }

                if (policyAttributesListValue.getAttributeValue() != null) {
                    request.addParameter("PolicyAttributes.member." + policyAttributesListIndex + ".AttributeValue",
                            StringUtils.fromString(policyAttributesListValue.getAttributeValue()));
                }
                policyAttributesListIndex++;
            }
        }

        return request;
    }

}
