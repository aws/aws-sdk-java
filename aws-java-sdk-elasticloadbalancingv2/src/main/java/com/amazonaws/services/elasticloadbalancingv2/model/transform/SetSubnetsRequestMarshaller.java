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
package com.amazonaws.services.elasticloadbalancingv2.model.transform;

import java.util.List;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.elasticloadbalancingv2.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * SetSubnetsRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SetSubnetsRequestMarshaller implements Marshaller<Request<SetSubnetsRequest>, SetSubnetsRequest> {

    public Request<SetSubnetsRequest> marshall(SetSubnetsRequest setSubnetsRequest) {

        if (setSubnetsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<SetSubnetsRequest> request = new DefaultRequest<SetSubnetsRequest>(setSubnetsRequest, "AmazonElasticLoadBalancing");
        request.addParameter("Action", "SetSubnets");
        request.addParameter("Version", "2015-12-01");
        request.setHttpMethod(HttpMethodName.POST);

        if (setSubnetsRequest.getLoadBalancerArn() != null) {
            request.addParameter("LoadBalancerArn", StringUtils.fromString(setSubnetsRequest.getLoadBalancerArn()));
        }

        if (setSubnetsRequest.getSubnets() != null) {
            java.util.List<String> subnetsList = setSubnetsRequest.getSubnets();
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

        if (setSubnetsRequest.getSubnetMappings() != null) {
            java.util.List<SubnetMapping> subnetMappingsList = setSubnetsRequest.getSubnetMappings();
            if (subnetMappingsList.isEmpty()) {
                request.addParameter("SubnetMappings", "");
            } else {
                int subnetMappingsListIndex = 1;

                for (SubnetMapping subnetMappingsListValue : subnetMappingsList) {

                    if (subnetMappingsListValue.getSubnetId() != null) {
                        request.addParameter("SubnetMappings.member." + subnetMappingsListIndex + ".SubnetId",
                                StringUtils.fromString(subnetMappingsListValue.getSubnetId()));
                    }

                    if (subnetMappingsListValue.getAllocationId() != null) {
                        request.addParameter("SubnetMappings.member." + subnetMappingsListIndex + ".AllocationId",
                                StringUtils.fromString(subnetMappingsListValue.getAllocationId()));
                    }
                    subnetMappingsListIndex++;
                }
            }
        }

        return request;
    }

}
