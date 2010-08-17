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
package com.amazonaws.services.autoscaling.model.transform;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.services.autoscaling.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * Create Auto Scaling Group Request Marshaller
 */
public class CreateAutoScalingGroupRequestMarshaller implements Marshaller<Request<CreateAutoScalingGroupRequest>, CreateAutoScalingGroupRequest> {

    public Request<CreateAutoScalingGroupRequest> marshall(CreateAutoScalingGroupRequest createAutoScalingGroupRequest) {
        Request<CreateAutoScalingGroupRequest> request = new DefaultRequest<CreateAutoScalingGroupRequest>(createAutoScalingGroupRequest, "AmazonAutoScaling");
        request.addParameter("Action", "CreateAutoScalingGroup");
        request.addParameter("Version", "2009-05-15");
        if (createAutoScalingGroupRequest != null) {
            if (createAutoScalingGroupRequest.getAutoScalingGroupName() != null) {
                request.addParameter("AutoScalingGroupName", StringUtils.fromString(createAutoScalingGroupRequest.getAutoScalingGroupName()));
            }
        }
        if (createAutoScalingGroupRequest != null) {
            if (createAutoScalingGroupRequest.getLaunchConfigurationName() != null) {
                request.addParameter("LaunchConfigurationName", StringUtils.fromString(createAutoScalingGroupRequest.getLaunchConfigurationName()));
            }
        }
        if (createAutoScalingGroupRequest != null) {
            if (createAutoScalingGroupRequest.getMinSize() != null) {
                request.addParameter("MinSize", StringUtils.fromInteger(createAutoScalingGroupRequest.getMinSize()));
            }
        }
        if (createAutoScalingGroupRequest != null) {
            if (createAutoScalingGroupRequest.getMaxSize() != null) {
                request.addParameter("MaxSize", StringUtils.fromInteger(createAutoScalingGroupRequest.getMaxSize()));
            }
        }
        if (createAutoScalingGroupRequest != null) {
            if (createAutoScalingGroupRequest.getCooldown() != null) {
                request.addParameter("Cooldown", StringUtils.fromInteger(createAutoScalingGroupRequest.getCooldown()));
            }
        }
        if (createAutoScalingGroupRequest != null) {
            java.util.List<String> availabilityZonesList = createAutoScalingGroupRequest.getAvailabilityZones();
            int availabilityZonesListIndex = 1;
            for (String availabilityZonesListValue : availabilityZonesList) {
                if (availabilityZonesListValue != null) {
                    request.addParameter("AvailabilityZones.member." + availabilityZonesListIndex, StringUtils.fromString(availabilityZonesListValue));
                }
                availabilityZonesListIndex++;
            }
        }
        if (createAutoScalingGroupRequest != null) {
            java.util.List<String> loadBalancerNamesList = createAutoScalingGroupRequest.getLoadBalancerNames();
            int loadBalancerNamesListIndex = 1;
            for (String loadBalancerNamesListValue : loadBalancerNamesList) {
                if (loadBalancerNamesListValue != null) {
                    request.addParameter("LoadBalancerNames.member." + loadBalancerNamesListIndex, StringUtils.fromString(loadBalancerNamesListValue));
                }
                loadBalancerNamesListIndex++;
            }
        }


        return request;
    }
}
