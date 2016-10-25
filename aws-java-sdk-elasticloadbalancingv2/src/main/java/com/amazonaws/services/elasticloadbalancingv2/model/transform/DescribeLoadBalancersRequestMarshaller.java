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
 * DescribeLoadBalancersRequest Marshaller
 */

public class DescribeLoadBalancersRequestMarshaller implements Marshaller<Request<DescribeLoadBalancersRequest>, DescribeLoadBalancersRequest> {

    public Request<DescribeLoadBalancersRequest> marshall(DescribeLoadBalancersRequest describeLoadBalancersRequest) {

        if (describeLoadBalancersRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DescribeLoadBalancersRequest> request = new DefaultRequest<DescribeLoadBalancersRequest>(describeLoadBalancersRequest,
                "AmazonElasticLoadBalancing");
        request.addParameter("Action", "DescribeLoadBalancers");
        request.addParameter("Version", "2015-12-01");
        request.setHttpMethod(HttpMethodName.POST);

        java.util.List<String> loadBalancerArnsList = describeLoadBalancersRequest.getLoadBalancerArns();

        if (loadBalancerArnsList != null) {
            if (loadBalancerArnsList.isEmpty()) {
                request.addParameter("LoadBalancerArns", "");
            } else {
                int loadBalancerArnsListIndex = 1;

                for (String loadBalancerArnsListValue : loadBalancerArnsList) {
                    if (loadBalancerArnsListValue != null) {
                        request.addParameter("LoadBalancerArns.member." + loadBalancerArnsListIndex, StringUtils.fromString(loadBalancerArnsListValue));
                    }
                    loadBalancerArnsListIndex++;
                }
            }
        }

        java.util.List<String> namesList = describeLoadBalancersRequest.getNames();

        if (namesList != null) {
            if (namesList.isEmpty()) {
                request.addParameter("Names", "");
            } else {
                int namesListIndex = 1;

                for (String namesListValue : namesList) {
                    if (namesListValue != null) {
                        request.addParameter("Names.member." + namesListIndex, StringUtils.fromString(namesListValue));
                    }
                    namesListIndex++;
                }
            }
        }

        if (describeLoadBalancersRequest.getMarker() != null) {
            request.addParameter("Marker", StringUtils.fromString(describeLoadBalancersRequest.getMarker()));
        }

        if (describeLoadBalancersRequest.getPageSize() != null) {
            request.addParameter("PageSize", StringUtils.fromInteger(describeLoadBalancersRequest.getPageSize()));
        }

        return request;
    }

}
