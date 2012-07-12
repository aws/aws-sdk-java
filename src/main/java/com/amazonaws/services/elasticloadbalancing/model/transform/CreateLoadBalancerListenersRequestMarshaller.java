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
 * Create Load Balancer Listeners Request Marshaller
 */
public class CreateLoadBalancerListenersRequestMarshaller implements Marshaller<Request<CreateLoadBalancerListenersRequest>, CreateLoadBalancerListenersRequest> {

    public Request<CreateLoadBalancerListenersRequest> marshall(CreateLoadBalancerListenersRequest createLoadBalancerListenersRequest) {

        if (createLoadBalancerListenersRequest == null) {
		    throw new AmazonClientException("Invalid argument passed to marshall(...)");
		}

        Request<CreateLoadBalancerListenersRequest> request = new DefaultRequest<CreateLoadBalancerListenersRequest>(createLoadBalancerListenersRequest, "AmazonElasticLoadBalancing");
        request.addParameter("Action", "CreateLoadBalancerListeners");
        request.addParameter("Version", "2012-06-01");

        if (createLoadBalancerListenersRequest.getLoadBalancerName() != null) {
            request.addParameter("LoadBalancerName", StringUtils.fromString(createLoadBalancerListenersRequest.getLoadBalancerName()));
        }

        java.util.List<Listener> listenersList = createLoadBalancerListenersRequest.getListeners();
        int listenersListIndex = 1;

        for (Listener listenersListValue : listenersList) {
            Listener listenerMember = listenersListValue;
            if (listenerMember != null) {
                if (listenerMember.getProtocol() != null) {
                    request.addParameter("Listeners.member." + listenersListIndex + ".Protocol", StringUtils.fromString(listenerMember.getProtocol()));
                }
                if (listenerMember.getLoadBalancerPort() != null) {
                    request.addParameter("Listeners.member." + listenersListIndex + ".LoadBalancerPort", StringUtils.fromInteger(listenerMember.getLoadBalancerPort()));
                }
                if (listenerMember.getInstanceProtocol() != null) {
                    request.addParameter("Listeners.member." + listenersListIndex + ".InstanceProtocol", StringUtils.fromString(listenerMember.getInstanceProtocol()));
                }
                if (listenerMember.getInstancePort() != null) {
                    request.addParameter("Listeners.member." + listenersListIndex + ".InstancePort", StringUtils.fromInteger(listenerMember.getInstancePort()));
                }
                if (listenerMember.getSSLCertificateId() != null) {
                    request.addParameter("Listeners.member." + listenersListIndex + ".SSLCertificateId", StringUtils.fromString(listenerMember.getSSLCertificateId()));
                }
            }

            listenersListIndex++;
        }


        return request;
    }
}
