/*
 * Copyright 2010 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.services.elasticloadbalancing.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * Create Load Balancer Request Marshaller
 */
public class CreateLoadBalancerRequestMarshaller implements Marshaller<Request<CreateLoadBalancerRequest>, CreateLoadBalancerRequest> {

    public Request<CreateLoadBalancerRequest> marshall(CreateLoadBalancerRequest createLoadBalancerRequest) {
        Request<CreateLoadBalancerRequest> request = new DefaultRequest<CreateLoadBalancerRequest>(createLoadBalancerRequest, "AmazonElasticLoadBalancing");
        request.addParameter("Action", "CreateLoadBalancer");
        request.addParameter("Version", "2009-11-25");
        if (createLoadBalancerRequest != null) {
            if (createLoadBalancerRequest.getLoadBalancerName() != null) {
                request.addParameter("LoadBalancerName", StringUtils.fromString(createLoadBalancerRequest.getLoadBalancerName()));
            }
        }

        if (createLoadBalancerRequest != null) {
            java.util.List<Listener> listenersList = createLoadBalancerRequest.getListeners();
            int listenersListIndex = 1;
            for (Listener listenersListValue : listenersList) {
                if (listenersListValue != null) {
                    if (listenersListValue.getProtocol() != null) {
                        request.addParameter("Listeners.member." + listenersListIndex + ".Protocol", StringUtils.fromString(listenersListValue.getProtocol()));
                    }
                }
                if (listenersListValue != null) {
                    if (listenersListValue.getLoadBalancerPort() != null) {
                        request.addParameter("Listeners.member." + listenersListIndex + ".LoadBalancerPort", StringUtils.fromInteger(listenersListValue.getLoadBalancerPort()));
                    }
                }
                if (listenersListValue != null) {
                    if (listenersListValue.getInstancePort() != null) {
                        request.addParameter("Listeners.member." + listenersListIndex + ".InstancePort", StringUtils.fromInteger(listenersListValue.getInstancePort()));
                    }
                }

                listenersListIndex++;
            }
        }
        if (createLoadBalancerRequest != null) {
            java.util.List<String> availabilityZonesList = createLoadBalancerRequest.getAvailabilityZones();
            int availabilityZonesListIndex = 1;
            for (String availabilityZonesListValue : availabilityZonesList) {
                if (availabilityZonesListValue != null) {
                    request.addParameter("AvailabilityZones.member." + availabilityZonesListIndex, StringUtils.fromString(availabilityZonesListValue));
                }
                availabilityZonesListIndex++;
            }
        }


        return request;
    }
}
