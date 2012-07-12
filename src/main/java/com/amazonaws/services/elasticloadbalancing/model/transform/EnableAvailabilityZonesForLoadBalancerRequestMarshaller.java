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
 * Enable Availability Zones For Load Balancer Request Marshaller
 */
public class EnableAvailabilityZonesForLoadBalancerRequestMarshaller implements Marshaller<Request<EnableAvailabilityZonesForLoadBalancerRequest>, EnableAvailabilityZonesForLoadBalancerRequest> {

    public Request<EnableAvailabilityZonesForLoadBalancerRequest> marshall(EnableAvailabilityZonesForLoadBalancerRequest enableAvailabilityZonesForLoadBalancerRequest) {

        if (enableAvailabilityZonesForLoadBalancerRequest == null) {
		    throw new AmazonClientException("Invalid argument passed to marshall(...)");
		}

        Request<EnableAvailabilityZonesForLoadBalancerRequest> request = new DefaultRequest<EnableAvailabilityZonesForLoadBalancerRequest>(enableAvailabilityZonesForLoadBalancerRequest, "AmazonElasticLoadBalancing");
        request.addParameter("Action", "EnableAvailabilityZonesForLoadBalancer");
        request.addParameter("Version", "2012-06-01");

        if (enableAvailabilityZonesForLoadBalancerRequest.getLoadBalancerName() != null) {
            request.addParameter("LoadBalancerName", StringUtils.fromString(enableAvailabilityZonesForLoadBalancerRequest.getLoadBalancerName()));
        }

        java.util.List<String> availabilityZonesList = enableAvailabilityZonesForLoadBalancerRequest.getAvailabilityZones();
        int availabilityZonesListIndex = 1;

        for (String availabilityZonesListValue : availabilityZonesList) {
            if (availabilityZonesListValue != null) {
                request.addParameter("AvailabilityZones.member." + availabilityZonesListIndex, StringUtils.fromString(availabilityZonesListValue));
            }

            availabilityZonesListIndex++;
        }


        return request;
    }
}
