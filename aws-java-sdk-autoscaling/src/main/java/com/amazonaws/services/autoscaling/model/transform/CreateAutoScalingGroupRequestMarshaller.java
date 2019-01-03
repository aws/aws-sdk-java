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
 * CreateAutoScalingGroupRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateAutoScalingGroupRequestMarshaller implements Marshaller<Request<CreateAutoScalingGroupRequest>, CreateAutoScalingGroupRequest> {

    public Request<CreateAutoScalingGroupRequest> marshall(CreateAutoScalingGroupRequest createAutoScalingGroupRequest) {

        if (createAutoScalingGroupRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<CreateAutoScalingGroupRequest> request = new DefaultRequest<CreateAutoScalingGroupRequest>(createAutoScalingGroupRequest, "AmazonAutoScaling");
        request.addParameter("Action", "CreateAutoScalingGroup");
        request.addParameter("Version", "2011-01-01");
        request.setHttpMethod(HttpMethodName.POST);

        if (createAutoScalingGroupRequest.getAutoScalingGroupName() != null) {
            request.addParameter("AutoScalingGroupName", StringUtils.fromString(createAutoScalingGroupRequest.getAutoScalingGroupName()));
        }

        if (createAutoScalingGroupRequest.getLaunchConfigurationName() != null) {
            request.addParameter("LaunchConfigurationName", StringUtils.fromString(createAutoScalingGroupRequest.getLaunchConfigurationName()));
        }

        {
            LaunchTemplateSpecification launchTemplate = createAutoScalingGroupRequest.getLaunchTemplate();
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
            MixedInstancesPolicy mixedInstancesPolicy = createAutoScalingGroupRequest.getMixedInstancesPolicy();
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

        if (createAutoScalingGroupRequest.getInstanceId() != null) {
            request.addParameter("InstanceId", StringUtils.fromString(createAutoScalingGroupRequest.getInstanceId()));
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

        if (!createAutoScalingGroupRequest.getAvailabilityZones().isEmpty()
                || !((com.amazonaws.internal.SdkInternalList<String>) createAutoScalingGroupRequest.getAvailabilityZones()).isAutoConstruct()) {
            com.amazonaws.internal.SdkInternalList<String> availabilityZonesList = (com.amazonaws.internal.SdkInternalList<String>) createAutoScalingGroupRequest
                    .getAvailabilityZones();
            int availabilityZonesListIndex = 1;

            for (String availabilityZonesListValue : availabilityZonesList) {
                if (availabilityZonesListValue != null) {
                    request.addParameter("AvailabilityZones.member." + availabilityZonesListIndex, StringUtils.fromString(availabilityZonesListValue));
                }
                availabilityZonesListIndex++;
            }
        }

        if (!createAutoScalingGroupRequest.getLoadBalancerNames().isEmpty()
                || !((com.amazonaws.internal.SdkInternalList<String>) createAutoScalingGroupRequest.getLoadBalancerNames()).isAutoConstruct()) {
            com.amazonaws.internal.SdkInternalList<String> loadBalancerNamesList = (com.amazonaws.internal.SdkInternalList<String>) createAutoScalingGroupRequest
                    .getLoadBalancerNames();
            int loadBalancerNamesListIndex = 1;

            for (String loadBalancerNamesListValue : loadBalancerNamesList) {
                if (loadBalancerNamesListValue != null) {
                    request.addParameter("LoadBalancerNames.member." + loadBalancerNamesListIndex, StringUtils.fromString(loadBalancerNamesListValue));
                }
                loadBalancerNamesListIndex++;
            }
        }

        if (!createAutoScalingGroupRequest.getTargetGroupARNs().isEmpty()
                || !((com.amazonaws.internal.SdkInternalList<String>) createAutoScalingGroupRequest.getTargetGroupARNs()).isAutoConstruct()) {
            com.amazonaws.internal.SdkInternalList<String> targetGroupARNsList = (com.amazonaws.internal.SdkInternalList<String>) createAutoScalingGroupRequest
                    .getTargetGroupARNs();
            int targetGroupARNsListIndex = 1;

            for (String targetGroupARNsListValue : targetGroupARNsList) {
                if (targetGroupARNsListValue != null) {
                    request.addParameter("TargetGroupARNs.member." + targetGroupARNsListIndex, StringUtils.fromString(targetGroupARNsListValue));
                }
                targetGroupARNsListIndex++;
            }
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

        if (!createAutoScalingGroupRequest.getTerminationPolicies().isEmpty()
                || !((com.amazonaws.internal.SdkInternalList<String>) createAutoScalingGroupRequest.getTerminationPolicies()).isAutoConstruct()) {
            com.amazonaws.internal.SdkInternalList<String> terminationPoliciesList = (com.amazonaws.internal.SdkInternalList<String>) createAutoScalingGroupRequest
                    .getTerminationPolicies();
            int terminationPoliciesListIndex = 1;

            for (String terminationPoliciesListValue : terminationPoliciesList) {
                if (terminationPoliciesListValue != null) {
                    request.addParameter("TerminationPolicies.member." + terminationPoliciesListIndex, StringUtils.fromString(terminationPoliciesListValue));
                }
                terminationPoliciesListIndex++;
            }
        }

        if (createAutoScalingGroupRequest.getNewInstancesProtectedFromScaleIn() != null) {
            request.addParameter("NewInstancesProtectedFromScaleIn",
                    StringUtils.fromBoolean(createAutoScalingGroupRequest.getNewInstancesProtectedFromScaleIn()));
        }

        if (!createAutoScalingGroupRequest.getLifecycleHookSpecificationList().isEmpty()
                || !((com.amazonaws.internal.SdkInternalList<LifecycleHookSpecification>) createAutoScalingGroupRequest.getLifecycleHookSpecificationList())
                        .isAutoConstruct()) {
            com.amazonaws.internal.SdkInternalList<LifecycleHookSpecification> lifecycleHookSpecificationListList = (com.amazonaws.internal.SdkInternalList<LifecycleHookSpecification>) createAutoScalingGroupRequest
                    .getLifecycleHookSpecificationList();
            int lifecycleHookSpecificationListListIndex = 1;

            for (LifecycleHookSpecification lifecycleHookSpecificationListListValue : lifecycleHookSpecificationListList) {

                if (lifecycleHookSpecificationListListValue.getLifecycleHookName() != null) {
                    request.addParameter("LifecycleHookSpecificationList.member." + lifecycleHookSpecificationListListIndex + ".LifecycleHookName",
                            StringUtils.fromString(lifecycleHookSpecificationListListValue.getLifecycleHookName()));
                }

                if (lifecycleHookSpecificationListListValue.getLifecycleTransition() != null) {
                    request.addParameter("LifecycleHookSpecificationList.member." + lifecycleHookSpecificationListListIndex + ".LifecycleTransition",
                            StringUtils.fromString(lifecycleHookSpecificationListListValue.getLifecycleTransition()));
                }

                if (lifecycleHookSpecificationListListValue.getNotificationMetadata() != null) {
                    request.addParameter("LifecycleHookSpecificationList.member." + lifecycleHookSpecificationListListIndex + ".NotificationMetadata",
                            StringUtils.fromString(lifecycleHookSpecificationListListValue.getNotificationMetadata()));
                }

                if (lifecycleHookSpecificationListListValue.getHeartbeatTimeout() != null) {
                    request.addParameter("LifecycleHookSpecificationList.member." + lifecycleHookSpecificationListListIndex + ".HeartbeatTimeout",
                            StringUtils.fromInteger(lifecycleHookSpecificationListListValue.getHeartbeatTimeout()));
                }

                if (lifecycleHookSpecificationListListValue.getDefaultResult() != null) {
                    request.addParameter("LifecycleHookSpecificationList.member." + lifecycleHookSpecificationListListIndex + ".DefaultResult",
                            StringUtils.fromString(lifecycleHookSpecificationListListValue.getDefaultResult()));
                }

                if (lifecycleHookSpecificationListListValue.getNotificationTargetARN() != null) {
                    request.addParameter("LifecycleHookSpecificationList.member." + lifecycleHookSpecificationListListIndex + ".NotificationTargetARN",
                            StringUtils.fromString(lifecycleHookSpecificationListListValue.getNotificationTargetARN()));
                }

                if (lifecycleHookSpecificationListListValue.getRoleARN() != null) {
                    request.addParameter("LifecycleHookSpecificationList.member." + lifecycleHookSpecificationListListIndex + ".RoleARN",
                            StringUtils.fromString(lifecycleHookSpecificationListListValue.getRoleARN()));
                }
                lifecycleHookSpecificationListListIndex++;
            }
        }

        if (!createAutoScalingGroupRequest.getTags().isEmpty()
                || !((com.amazonaws.internal.SdkInternalList<Tag>) createAutoScalingGroupRequest.getTags()).isAutoConstruct()) {
            com.amazonaws.internal.SdkInternalList<Tag> tagsList = (com.amazonaws.internal.SdkInternalList<Tag>) createAutoScalingGroupRequest.getTags();
            int tagsListIndex = 1;

            for (Tag tagsListValue : tagsList) {

                if (tagsListValue.getResourceId() != null) {
                    request.addParameter("Tags.member." + tagsListIndex + ".ResourceId", StringUtils.fromString(tagsListValue.getResourceId()));
                }

                if (tagsListValue.getResourceType() != null) {
                    request.addParameter("Tags.member." + tagsListIndex + ".ResourceType", StringUtils.fromString(tagsListValue.getResourceType()));
                }

                if (tagsListValue.getKey() != null) {
                    request.addParameter("Tags.member." + tagsListIndex + ".Key", StringUtils.fromString(tagsListValue.getKey()));
                }

                if (tagsListValue.getValue() != null) {
                    request.addParameter("Tags.member." + tagsListIndex + ".Value", StringUtils.fromString(tagsListValue.getValue()));
                }

                if (tagsListValue.getPropagateAtLaunch() != null) {
                    request.addParameter("Tags.member." + tagsListIndex + ".PropagateAtLaunch", StringUtils.fromBoolean(tagsListValue.getPropagateAtLaunch()));
                }
                tagsListIndex++;
            }
        }

        if (createAutoScalingGroupRequest.getServiceLinkedRoleARN() != null) {
            request.addParameter("ServiceLinkedRoleARN", StringUtils.fromString(createAutoScalingGroupRequest.getServiceLinkedRoleARN()));
        }

        return request;
    }

}
