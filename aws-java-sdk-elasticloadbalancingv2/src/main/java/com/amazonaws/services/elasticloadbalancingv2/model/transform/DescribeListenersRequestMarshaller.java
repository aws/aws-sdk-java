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
 * DescribeListenersRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeListenersRequestMarshaller implements Marshaller<Request<DescribeListenersRequest>, DescribeListenersRequest> {

    public Request<DescribeListenersRequest> marshall(DescribeListenersRequest describeListenersRequest) {

        if (describeListenersRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DescribeListenersRequest> request = new DefaultRequest<DescribeListenersRequest>(describeListenersRequest, "AmazonElasticLoadBalancing");
        request.addParameter("Action", "DescribeListeners");
        request.addParameter("Version", "2015-12-01");
        request.setHttpMethod(HttpMethodName.POST);

        if (describeListenersRequest.getLoadBalancerArn() != null) {
            request.addParameter("LoadBalancerArn", StringUtils.fromString(describeListenersRequest.getLoadBalancerArn()));
        }

        if (describeListenersRequest.getListenerArns() != null) {
            java.util.List<String> listenerArnsList = describeListenersRequest.getListenerArns();
            if (listenerArnsList.isEmpty()) {
                request.addParameter("ListenerArns", "");
            } else {
                int listenerArnsListIndex = 1;

                for (String listenerArnsListValue : listenerArnsList) {
                    if (listenerArnsListValue != null) {
                        request.addParameter("ListenerArns.member." + listenerArnsListIndex, StringUtils.fromString(listenerArnsListValue));
                    }
                    listenerArnsListIndex++;
                }
            }
        }

        if (describeListenersRequest.getMarker() != null) {
            request.addParameter("Marker", StringUtils.fromString(describeListenersRequest.getMarker()));
        }

        if (describeListenersRequest.getPageSize() != null) {
            request.addParameter("PageSize", StringUtils.fromInteger(describeListenersRequest.getPageSize()));
        }

        return request;
    }

}
