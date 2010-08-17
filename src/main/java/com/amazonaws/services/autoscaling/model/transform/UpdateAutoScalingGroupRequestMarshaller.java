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
 * Update Auto Scaling Group Request Marshaller
 */
public class UpdateAutoScalingGroupRequestMarshaller implements Marshaller<Request<UpdateAutoScalingGroupRequest>, UpdateAutoScalingGroupRequest> {

    public Request<UpdateAutoScalingGroupRequest> marshall(UpdateAutoScalingGroupRequest updateAutoScalingGroupRequest) {
        Request<UpdateAutoScalingGroupRequest> request = new DefaultRequest<UpdateAutoScalingGroupRequest>(updateAutoScalingGroupRequest, "AmazonAutoScaling");
        request.addParameter("Action", "UpdateAutoScalingGroup");
        request.addParameter("Version", "2009-05-15");
        if (updateAutoScalingGroupRequest != null) {
            if (updateAutoScalingGroupRequest.getAutoScalingGroupName() != null) {
                request.addParameter("AutoScalingGroupName", StringUtils.fromString(updateAutoScalingGroupRequest.getAutoScalingGroupName()));
            }
        }
        if (updateAutoScalingGroupRequest != null) {
            if (updateAutoScalingGroupRequest.getLaunchConfigurationName() != null) {
                request.addParameter("LaunchConfigurationName", StringUtils.fromString(updateAutoScalingGroupRequest.getLaunchConfigurationName()));
            }
        }
        if (updateAutoScalingGroupRequest != null) {
            if (updateAutoScalingGroupRequest.getMinSize() != null) {
                request.addParameter("MinSize", StringUtils.fromInteger(updateAutoScalingGroupRequest.getMinSize()));
            }
        }
        if (updateAutoScalingGroupRequest != null) {
            if (updateAutoScalingGroupRequest.getMaxSize() != null) {
                request.addParameter("MaxSize", StringUtils.fromInteger(updateAutoScalingGroupRequest.getMaxSize()));
            }
        }
        if (updateAutoScalingGroupRequest != null) {
            if (updateAutoScalingGroupRequest.getCooldown() != null) {
                request.addParameter("Cooldown", StringUtils.fromInteger(updateAutoScalingGroupRequest.getCooldown()));
            }
        }
        if (updateAutoScalingGroupRequest != null) {
            java.util.List<String> availabilityZonesList = updateAutoScalingGroupRequest.getAvailabilityZones();
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
