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
 * Delete Load Balancer Listeners Request Marshaller
 */
public class DeleteLoadBalancerListenersRequestMarshaller implements Marshaller<Request<DeleteLoadBalancerListenersRequest>, DeleteLoadBalancerListenersRequest> {

    public Request<DeleteLoadBalancerListenersRequest> marshall(DeleteLoadBalancerListenersRequest deleteLoadBalancerListenersRequest) {

        if (deleteLoadBalancerListenersRequest == null) {
		    throw new AmazonClientException("Invalid argument passed to marshall(...)");
		}

        Request<DeleteLoadBalancerListenersRequest> request = new DefaultRequest<DeleteLoadBalancerListenersRequest>(deleteLoadBalancerListenersRequest, "AmazonElasticLoadBalancing");
        request.addParameter("Action", "DeleteLoadBalancerListeners");
        request.addParameter("Version", "2012-06-01");

        if (deleteLoadBalancerListenersRequest.getLoadBalancerName() != null) {
            request.addParameter("LoadBalancerName", StringUtils.fromString(deleteLoadBalancerListenersRequest.getLoadBalancerName()));
        }

        java.util.List<Integer> loadBalancerPortsList = deleteLoadBalancerListenersRequest.getLoadBalancerPorts();
        int loadBalancerPortsListIndex = 1;

        for (Integer loadBalancerPortsListValue : loadBalancerPortsList) {
            if (loadBalancerPortsListValue != null) {
                request.addParameter("LoadBalancerPorts.member." + loadBalancerPortsListIndex, StringUtils.fromInteger(loadBalancerPortsListValue));
            }

            loadBalancerPortsListIndex++;
        }


        return request;
    }
}
