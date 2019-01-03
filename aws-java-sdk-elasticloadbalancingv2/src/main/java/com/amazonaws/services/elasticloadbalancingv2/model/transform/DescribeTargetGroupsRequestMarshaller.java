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
 * DescribeTargetGroupsRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeTargetGroupsRequestMarshaller implements Marshaller<Request<DescribeTargetGroupsRequest>, DescribeTargetGroupsRequest> {

    public Request<DescribeTargetGroupsRequest> marshall(DescribeTargetGroupsRequest describeTargetGroupsRequest) {

        if (describeTargetGroupsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DescribeTargetGroupsRequest> request = new DefaultRequest<DescribeTargetGroupsRequest>(describeTargetGroupsRequest,
                "AmazonElasticLoadBalancing");
        request.addParameter("Action", "DescribeTargetGroups");
        request.addParameter("Version", "2015-12-01");
        request.setHttpMethod(HttpMethodName.POST);

        if (describeTargetGroupsRequest.getLoadBalancerArn() != null) {
            request.addParameter("LoadBalancerArn", StringUtils.fromString(describeTargetGroupsRequest.getLoadBalancerArn()));
        }

        if (describeTargetGroupsRequest.getTargetGroupArns() != null) {
            java.util.List<String> targetGroupArnsList = describeTargetGroupsRequest.getTargetGroupArns();
            if (targetGroupArnsList.isEmpty()) {
                request.addParameter("TargetGroupArns", "");
            } else {
                int targetGroupArnsListIndex = 1;

                for (String targetGroupArnsListValue : targetGroupArnsList) {
                    if (targetGroupArnsListValue != null) {
                        request.addParameter("TargetGroupArns.member." + targetGroupArnsListIndex, StringUtils.fromString(targetGroupArnsListValue));
                    }
                    targetGroupArnsListIndex++;
                }
            }
        }

        if (describeTargetGroupsRequest.getNames() != null) {
            java.util.List<String> namesList = describeTargetGroupsRequest.getNames();
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

        if (describeTargetGroupsRequest.getMarker() != null) {
            request.addParameter("Marker", StringUtils.fromString(describeTargetGroupsRequest.getMarker()));
        }

        if (describeTargetGroupsRequest.getPageSize() != null) {
            request.addParameter("PageSize", StringUtils.fromInteger(describeTargetGroupsRequest.getPageSize()));
        }

        return request;
    }

}
