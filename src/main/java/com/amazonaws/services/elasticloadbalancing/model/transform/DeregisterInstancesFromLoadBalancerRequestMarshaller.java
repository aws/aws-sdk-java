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
 * Deregister Instances From Load Balancer Request Marshaller
 */
public class DeregisterInstancesFromLoadBalancerRequestMarshaller implements Marshaller<Request<DeregisterInstancesFromLoadBalancerRequest>, DeregisterInstancesFromLoadBalancerRequest> {

    public Request<DeregisterInstancesFromLoadBalancerRequest> marshall(DeregisterInstancesFromLoadBalancerRequest deregisterInstancesFromLoadBalancerRequest) {
        Request<DeregisterInstancesFromLoadBalancerRequest> request = new DefaultRequest<DeregisterInstancesFromLoadBalancerRequest>(deregisterInstancesFromLoadBalancerRequest, "AmazonElasticLoadBalancing");
        request.addParameter("Action", "DeregisterInstancesFromLoadBalancer");
        request.addParameter("Version", "2010-07-01");
        if (deregisterInstancesFromLoadBalancerRequest != null) {
            if (deregisterInstancesFromLoadBalancerRequest.getLoadBalancerName() != null) {
                request.addParameter("LoadBalancerName", StringUtils.fromString(deregisterInstancesFromLoadBalancerRequest.getLoadBalancerName()));
            }
        }

        if (deregisterInstancesFromLoadBalancerRequest != null) {
            java.util.List<Instance> instancesList = deregisterInstancesFromLoadBalancerRequest.getInstances();
            int instancesListIndex = 1;
            for (Instance instancesListValue : instancesList) {
                if (instancesListValue != null) {
                    if (instancesListValue.getInstanceId() != null) {
                        request.addParameter("Instances.member." + instancesListIndex + ".InstanceId", StringUtils.fromString(instancesListValue.getInstanceId()));
                    }
                }

                instancesListIndex++;
            }
        }


        return request;
    }
}
