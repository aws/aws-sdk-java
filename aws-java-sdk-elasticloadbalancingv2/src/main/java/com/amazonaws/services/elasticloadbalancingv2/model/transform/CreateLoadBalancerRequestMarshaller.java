/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.elasticloadbalancingv2.model.transform;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.elasticloadbalancingv2.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;

/**
 * CreateLoadBalancerRequest Marshaller
 */

public class CreateLoadBalancerRequestMarshaller implements Marshaller<Request<CreateLoadBalancerRequest>, CreateLoadBalancerRequest> {

    public Request<CreateLoadBalancerRequest> marshall(CreateLoadBalancerRequest createLoadBalancerRequest) {

        if (createLoadBalancerRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<CreateLoadBalancerRequest> request = new DefaultRequest<CreateLoadBalancerRequest>(createLoadBalancerRequest, "AmazonElasticLoadBalancing");
        request.addParameter("Action", "CreateLoadBalancer");
        request.addParameter("Version", "2015-12-01");
        request.setHttpMethod(HttpMethodName.POST);

        if (createLoadBalancerRequest.getName() != null) {
            request.addParameter("Name", StringUtils.fromString(createLoadBalancerRequest.getName()));
        }

        java.util.List<String> subnetsList = createLoadBalancerRequest.getSubnets();

        if (subnetsList != null) {
            if (subnetsList.isEmpty()) {
                request.addParameter("Subnets", "");
            } else {
                int subnetsListIndex = 1;

                for (String subnetsListValue : subnetsList) {
                    if (subnetsListValue != null) {
                        request.addParameter("Subnets.member." + subnetsListIndex, StringUtils.fromString(subnetsListValue));
                    }
                    subnetsListIndex++;
                }
            }
        }

        java.util.List<String> securityGroupsList = createLoadBalancerRequest.getSecurityGroups();

        if (securityGroupsList != null) {
            if (securityGroupsList.isEmpty()) {
                request.addParameter("SecurityGroups", "");
            } else {
                int securityGroupsListIndex = 1;

                for (String securityGroupsListValue : securityGroupsList) {
                    if (securityGroupsListValue != null) {
                        request.addParameter("SecurityGroups.member." + securityGroupsListIndex, StringUtils.fromString(securityGroupsListValue));
                    }
                    securityGroupsListIndex++;
                }
            }
        }

        if (createLoadBalancerRequest.getScheme() != null) {
            request.addParameter("Scheme", StringUtils.fromString(createLoadBalancerRequest.getScheme()));
        }

        java.util.List<Tag> tagsList = createLoadBalancerRequest.getTags();

        if (tagsList != null) {
            if (tagsList.isEmpty()) {
                request.addParameter("Tags", "");
            } else {
                int tagsListIndex = 1;

                for (Tag tagsListValue : tagsList) {

                    if (tagsListValue.getKey() != null) {
                        request.addParameter("Tags.member." + tagsListIndex + ".Key", StringUtils.fromString(tagsListValue.getKey()));
                    }

                    if (tagsListValue.getValue() != null) {
                        request.addParameter("Tags.member." + tagsListIndex + ".Value", StringUtils.fromString(tagsListValue.getValue()));
                    }
                    tagsListIndex++;
                }
            }
        }

        return request;
    }

}
