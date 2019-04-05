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
package com.amazonaws.services.autoscaling.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.autoscaling.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * UpdateAutoScalingGroupRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateAutoScalingGroupRequestMarshaller implements Marshaller<Request<UpdateAutoScalingGroupRequest>, UpdateAutoScalingGroupRequest> {

    public Request<UpdateAutoScalingGroupRequest> marshall(UpdateAutoScalingGroupRequest updateAutoScalingGroupRequest) {

        if (updateAutoScalingGroupRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<UpdateAutoScalingGroupRequest> request = new DefaultRequest<UpdateAutoScalingGroupRequest>(updateAutoScalingGroupRequest, "AmazonAutoScaling");
        request.addParameter("Action", "UpdateAutoScalingGroup");
        request.addParameter("Version", "2011-01-01");
        request.setHttpMethod(HttpMethodName.POST);

        if (updateAutoScalingGroupRequest.getAutoScalingGroupName() != null) {
            request.addParameter("AutoScalingGroupName", StringUtils.fromString(updateAutoScalingGroupRequest.getAutoScalingGroupName()));
        }

        if (updateAutoScalingGroupRequest.getLaunchConfigurationName() != null) {
            request.addParameter("LaunchConfigurationName", StringUtils.fromString(updateAutoScalingGroupRequest.getLaunchConfigurationName()));
        }

        {
            LaunchTemplateSpecification launchTemplate = updateAutoScalingGroupRequest.getLaunchTemplate();
            if (launchTemplate != null) {

                if (launchTemplate.getLaunchTemplateId() != null) {
                    request.addParameter("LaunchTemplate.LaunchTemplateId", StringUtils.fromString(launchTemplate.getLaunchTemplateId()));
                }

                if (launchTemplate.getLaunchTemplateName() != null) {
                    request.addParameter("LaunchTemplate.LaunchTemplateName", StringUtils.fromString(launchTemplate.getLaunchTemplateName()));
                }

                if (launchTemplate.getVersion() != null) {
                    request.addParameter("LaunchTemplate.Version", StringUtils.fromString(launchTemplate.getVersion()));
                }
            }
        }

        {
            MixedInstancesPolicy mixedInstancesPolicy = updateAutoScalingGroupRequest.getMixedInstancesPolicy();
            if (mixedInstancesPolicy != null) {

                {
                    LaunchTemplate launchTemplate = mixedInstancesPolicy.getLaunchTemplate();
                    if (launchTemplate != null) {

                        {
                            LaunchTemplateSpecification launchTemplateSpecification = launchTemplate.getLaunchTemplateSpecification();
                            if (launchTemplateSpecification != null) {

                                if (launchTemplateSpecification.getLaunchTemplateId() != null) {
                                    request.addParameter("MixedInstancesPolicy.LaunchTemplate.LaunchTemplateSpecification.LaunchTemplateId",
                                            StringUtils.fromString(launchTemplateSpecification.getLaunchTemplateId()));
                                }

                                if (launchTemplateSpecification.getLaunchTemplateName() != null) {
                                    request.addParameter("MixedInstancesPolicy.LaunchTemplate.LaunchTemplateSpecification.LaunchTemplateName",
                                            StringUtils.fromString(launchTemplateSpecification.getLaunchTemplateName()));
                                }

                                if (launchTemplateSpecification.getVersion() != null) {
                                    request.addParameter("MixedInstancesPolicy.LaunchTemplate.LaunchTemplateSpecification.Version",
                                            StringUtils.fromString(launchTemplateSpecification.getVersion()));
                                }
                            }
                        }

                        if (!launchTemplate.getOverrides().isEmpty()
                                || !((com.amazonaws.internal.SdkInternalList<LaunchTemplateOverrides>) launchTemplate.getOverrides()).isAutoConstruct()) {
                            com.amazonaws.internal.SdkInternalList<LaunchTemplateOverrides> overridesList = (com.amazonaws.internal.SdkInternalList<LaunchTemplateOverrides>) launchTemplate
                                    .getOverrides();
                            int overridesListIndex = 1;

                            for (LaunchTemplateOverrides overridesListValue : overridesList) {

                                if (overridesListValue.getInstanceType() != null) {
                                    request.addParameter("MixedInstancesPolicy.LaunchTemplate.Overrides.member." + overridesListIndex + ".InstanceType",
                                            StringUtils.fromString(overridesListValue.getInstanceType()));
                                }
                                overridesListIndex++;
                            }
                        }
                    }
                }

                {
                    InstancesDistribution instancesDistribution = mixedInstancesPolicy.getInstancesDistribution();
                    if (instancesDistribution != null) {

                        if (instancesDistribution.getOnDemandAllocationStrategy() != null) {
                            request.addParameter("MixedInstancesPolicy.InstancesDistribution.OnDemandAllocationStrategy",
                                    StringUtils.fromString(instancesDistribution.getOnDemandAllocationStrategy()));
                        }

                        if (instancesDistribution.getOnDemandBaseCapacity() != null) {
                            request.addParameter("MixedInstancesPolicy.InstancesDistribution.OnDemandBaseCapacity",
                                    StringUtils.fromInteger(instancesDistribution.getOnDemandBaseCapacity()));
                        }

                        if (instancesDistribution.getOnDemandPercentageAboveBaseCapacity() != null) {
                            request.addParameter("MixedInstancesPolicy.InstancesDistribution.OnDemandPercentageAboveBaseCapacity",
                                    StringUtils.fromInteger(instancesDistribution.getOnDemandPercentageAboveBaseCapacity()));
                        }

                        if (instancesDistribution.getSpotAllocationStrategy() != null) {
                            request.addParameter("MixedInstancesPolicy.InstancesDistribution.SpotAllocationStrategy",
                                    StringUtils.fromString(instancesDistribution.getSpotAllocationStrategy()));
                        }

                        if (instancesDistribution.getSpotInstancePools() != null) {
                            request.addParameter("MixedInstancesPolicy.InstancesDistribution.SpotInstancePools",
                                    StringUtils.fromInteger(instancesDistribution.getSpotInstancePools()));
                        }

                        if (instancesDistribution.getSpotMaxPrice() != null) {
                            request.addParameter("MixedInstancesPolicy.InstancesDistribution.SpotMaxPrice",
                                    StringUtils.fromString(instancesDistribution.getSpotMaxPrice()));
                        }
                    }
                }
            }
        }

        if (updateAutoScalingGroupRequest.getMinSize() != null) {
            request.addParameter("MinSize", StringUtils.fromInteger(updateAutoScalingGroupRequest.getMinSize()));
        }

        if (updateAutoScalingGroupRequest.getMaxSize() != null) {
            request.addParameter("MaxSize", StringUtils.fromInteger(updateAutoScalingGroupRequest.getMaxSize()));
        }

        if (updateAutoScalingGroupRequest.getDesiredCapacity() != null) {
            request.addParameter("DesiredCapacity", StringUtils.fromInteger(updateAutoScalingGroupRequest.getDesiredCapacity()));
        }

        if (updateAutoScalingGroupRequest.getDefaultCooldown() != null) {
            request.addParameter("DefaultCooldown", StringUtils.fromInteger(updateAutoScalingGroupRequest.getDefaultCooldown()));
        }

        if (!updateAutoScalingGroupRequest.getAvailabilityZones().isEmpty()
                || !((com.amazonaws.internal.SdkInternalList<String>) updateAutoScalingGroupRequest.getAvailabilityZones()).isAutoConstruct()) {
            com.amazonaws.internal.SdkInternalList<String> availabilityZonesList = (com.amazonaws.internal.SdkInternalList<String>) updateAutoScalingGroupRequest
                    .getAvailabilityZones();
            int availabilityZonesListIndex = 1;

            for (String availabilityZonesListValue : availabilityZonesList) {
                if (availabilityZonesListValue != null) {
                    request.addParameter("AvailabilityZones.member." + availabilityZonesListIndex, StringUtils.fromString(availabilityZonesListValue));
                }
                availabilityZonesListIndex++;
            }
        }

        if (updateAutoScalingGroupRequest.getHealthCheckType() != null) {
            request.addParameter("HealthCheckType", StringUtils.fromString(updateAutoScalingGroupRequest.getHealthCheckType()));
        }

        if (updateAutoScalingGroupRequest.getHealthCheckGracePeriod() != null) {
            request.addParameter("HealthCheckGracePeriod", StringUtils.fromInteger(updateAutoScalingGroupRequest.getHealthCheckGracePeriod()));
        }

        if (updateAutoScalingGroupRequest.getPlacementGroup() != null) {
            request.addParameter("PlacementGroup", StringUtils.fromString(updateAutoScalingGroupRequest.getPlacementGroup()));
        }

        if (updateAutoScalingGroupRequest.getVPCZoneIdentifier() != null) {
            request.addParameter("VPCZoneIdentifier", StringUtils.fromString(updateAutoScalingGroupRequest.getVPCZoneIdentifier()));
        }

        if (!updateAutoScalingGroupRequest.getTerminationPolicies().isEmpty()
                || !((com.amazonaws.internal.SdkInternalList<String>) updateAutoScalingGroupRequest.getTerminationPolicies()).isAutoConstruct()) {
            com.amazonaws.internal.SdkInternalList<String> terminationPoliciesList = (com.amazonaws.internal.SdkInternalList<String>) updateAutoScalingGroupRequest
                    .getTerminationPolicies();
            int terminationPoliciesListIndex = 1;

            for (String terminationPoliciesListValue : terminationPoliciesList) {
                if (terminationPoliciesListValue != null) {
                    request.addParameter("TerminationPolicies.member." + terminationPoliciesListIndex, StringUtils.fromString(terminationPoliciesListValue));
                }
                terminationPoliciesListIndex++;
            }
        }

        if (updateAutoScalingGroupRequest.getNewInstancesProtectedFromScaleIn() != null) {
            request.addParameter("NewInstancesProtectedFromScaleIn",
                    StringUtils.fromBoolean(updateAutoScalingGroupRequest.getNewInstancesProtectedFromScaleIn()));
        }

        if (updateAutoScalingGroupRequest.getServiceLinkedRoleARN() != null) {
            request.addParameter("ServiceLinkedRoleARN", StringUtils.fromString(updateAutoScalingGroupRequest.getServiceLinkedRoleARN()));
        }

        return request;
    }

}
