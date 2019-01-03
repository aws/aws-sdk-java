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
 * DescribeSSLPoliciesRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeSSLPoliciesRequestMarshaller implements Marshaller<Request<DescribeSSLPoliciesRequest>, DescribeSSLPoliciesRequest> {

    public Request<DescribeSSLPoliciesRequest> marshall(DescribeSSLPoliciesRequest describeSSLPoliciesRequest) {

        if (describeSSLPoliciesRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DescribeSSLPoliciesRequest> request = new DefaultRequest<DescribeSSLPoliciesRequest>(describeSSLPoliciesRequest, "AmazonElasticLoadBalancing");
        request.addParameter("Action", "DescribeSSLPolicies");
        request.addParameter("Version", "2015-12-01");
        request.setHttpMethod(HttpMethodName.POST);

        if (describeSSLPoliciesRequest.getNames() != null) {
            java.util.List<String> namesList = describeSSLPoliciesRequest.getNames();
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

        if (describeSSLPoliciesRequest.getMarker() != null) {
            request.addParameter("Marker", StringUtils.fromString(describeSSLPoliciesRequest.getMarker()));
        }

        if (describeSSLPoliciesRequest.getPageSize() != null) {
            request.addParameter("PageSize", StringUtils.fromInteger(describeSSLPoliciesRequest.getPageSize()));
        }

        return request;
    }

}
