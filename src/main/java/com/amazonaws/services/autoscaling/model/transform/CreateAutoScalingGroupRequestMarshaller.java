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
package com.amazonaws.services.autoscaling.model.transform;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.amazonaws.AmazonClientException;
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

        if (createAutoScalingGroupRequest == null) {
		    throw new AmazonClientException("Invalid argument passed to marshall(...)");
		}

        Request<CreateAutoScalingGroupRequest> request = new DefaultRequest<CreateAutoScalingGroupRequest>(createAutoScalingGroupRequest, "AmazonAutoScaling");
        request.addParameter("Action", "CreateAutoScalingGroup");
        request.addParameter("Version", "2011-01-01");

        if (createAutoScalingGroupRequest.getAutoScalingGroupName() != null) {
            request.addParameter("AutoScalingGroupName", StringUtils.fromString(createAutoScalingGroupRequest.getAutoScalingGroupName()));
        }
        if (createAutoScalingGroupRequest.getLaunchConfigurationName() != null) {
            request.addParameter("LaunchConfigurationName", StringUtils.fromString(createAutoScalingGroupRequest.getLaunchConfigurationName()));
        }
        if (createAutoScalingGroupRequest.getMinSize() != null) {
            request.addParameter("MinSize", StringUtils.fromInteger(createAutoScalingGroupRequest.getMinSize()));
        }
        if (createAutoScalingGroupRequest.getMaxSize() != null) {
            request.addParameter("MaxSize", StringUtils.fromInteger(createAutoScalingGroupRequest.getMaxSize()));
        }
        if (createAutoScalingGroupRequest.getDesiredCapacity() != null) {
            request.addParameter("DesiredCapacity", StringUtils.fromInteger(createAutoScalingGroupRequest.getDesiredCapacity()));
        }
        if (createAutoScalingGroupRequest.getDefaultCooldown() != null) {
            request.addParameter("DefaultCooldown", StringUtils.fromInteger(createAutoScalingGroupRequest.getDefaultCooldown()));
        }

        java.util.List<String> availabilityZonesList = createAutoScalingGroupRequest.getAvailabilityZones();
        int availabilityZonesListIndex = 1;

        for (String availabilityZonesListValue : availabilityZonesList) {
            if (availabilityZonesListValue != null) {
                request.addParameter("AvailabilityZones.member." + availabilityZonesListIndex, StringUtils.fromString(availabilityZonesListValue));
            }

            availabilityZonesListIndex++;
        }

        java.util.List<String> loadBalancerNamesList = createAutoScalingGroupRequest.getLoadBalancerNames();
        int loadBalancerNamesListIndex = 1;

        for (String loadBalancerNamesListValue : loadBalancerNamesList) {
            if (loadBalancerNamesListValue != null) {
                request.addParameter("LoadBalancerNames.member." + loadBalancerNamesListIndex, StringUtils.fromString(loadBalancerNamesListValue));
            }

            loadBalancerNamesListIndex++;
        }
        if (createAutoScalingGroupRequest.getHealthCheckType() != null) {
            request.addParameter("HealthCheckType", StringUtils.fromString(createAutoScalingGroupRequest.getHealthCheckType()));
        }
        if (createAutoScalingGroupRequest.getHealthCheckGracePeriod() != null) {
            request.addParameter("HealthCheckGracePeriod", StringUtils.fromInteger(createAutoScalingGroupRequest.getHealthCheckGracePeriod()));
        }
        if (createAutoScalingGroupRequest.getPlacementGroup() != null) {
            request.addParameter("PlacementGroup", StringUtils.fromString(createAutoScalingGroupRequest.getPlacementGroup()));
        }
        if (createAutoScalingGroupRequest.getVPCZoneIdentifier() != null) {
            request.addParameter("VPCZoneIdentifier", StringUtils.fromString(createAutoScalingGroupRequest.getVPCZoneIdentifier()));
        }

        java.util.List<String> terminationPoliciesList = createAutoScalingGroupRequest.getTerminationPolicies();
        int terminationPoliciesListIndex = 1;

        for (String terminationPoliciesListValue : terminationPoliciesList) {
            if (terminationPoliciesListValue != null) {
                request.addParameter("TerminationPolicies.member." + terminationPoliciesListIndex, StringUtils.fromString(terminationPoliciesListValue));
            }

            terminationPoliciesListIndex++;
        }

        java.util.List<Tag> tagsList = createAutoScalingGroupRequest.getTags();
        int tagsListIndex = 1;

        for (Tag tagsListValue : tagsList) {
            Tag tagMember = tagsListValue;
            if (tagMember != null) {
                if (tagMember.getResourceId() != null) {
                    request.addParameter("Tags.member." + tagsListIndex + ".ResourceId", StringUtils.fromString(tagMember.getResourceId()));
                }
                if (tagMember.getResourceType() != null) {
                    request.addParameter("Tags.member." + tagsListIndex + ".ResourceType", StringUtils.fromString(tagMember.getResourceType()));
                }
                if (tagMember.getKey() != null) {
                    request.addParameter("Tags.member." + tagsListIndex + ".Key", StringUtils.fromString(tagMember.getKey()));
                }
                if (tagMember.getValue() != null) {
                    request.addParameter("Tags.member." + tagsListIndex + ".Value", StringUtils.fromString(tagMember.getValue()));
                }
                if (tagMember.isPropagateAtLaunch() != null) {
                    request.addParameter("Tags.member." + tagsListIndex + ".PropagateAtLaunch", StringUtils.fromBoolean(tagMember.isPropagateAtLaunch()));
                }
            }

            tagsListIndex++;
        }


        return request;
    }
}
