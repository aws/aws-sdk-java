/*
 * Copyright 2013-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ec2.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.ec2.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * CreateFleetRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateFleetRequestMarshaller implements Marshaller<Request<CreateFleetRequest>, CreateFleetRequest> {

    public Request<CreateFleetRequest> marshall(CreateFleetRequest createFleetRequest) {

        if (createFleetRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<CreateFleetRequest> request = new DefaultRequest<CreateFleetRequest>(createFleetRequest, "AmazonEC2");
        request.addParameter("Action", "CreateFleet");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        if (createFleetRequest.getClientToken() != null) {
            request.addParameter("ClientToken", StringUtils.fromString(createFleetRequest.getClientToken()));
        }

        SpotOptionsRequest spotOptions = createFleetRequest.getSpotOptions();
        if (spotOptions != null) {

            if (spotOptions.getAllocationStrategy() != null) {
                request.addParameter("SpotOptions.AllocationStrategy", StringUtils.fromString(spotOptions.getAllocationStrategy()));
            }

            if (spotOptions.getInstanceInterruptionBehavior() != null) {
                request.addParameter("SpotOptions.InstanceInterruptionBehavior", StringUtils.fromString(spotOptions.getInstanceInterruptionBehavior()));
            }
        }

        if (createFleetRequest.getExcessCapacityTerminationPolicy() != null) {
            request.addParameter("ExcessCapacityTerminationPolicy", StringUtils.fromString(createFleetRequest.getExcessCapacityTerminationPolicy()));
        }

        com.amazonaws.internal.SdkInternalList<FleetLaunchTemplateConfigRequest> createFleetRequestLaunchTemplateConfigsList = (com.amazonaws.internal.SdkInternalList<FleetLaunchTemplateConfigRequest>) createFleetRequest
                .getLaunchTemplateConfigs();
        if (!createFleetRequestLaunchTemplateConfigsList.isEmpty() || !createFleetRequestLaunchTemplateConfigsList.isAutoConstruct()) {
            int launchTemplateConfigsListIndex = 1;

            for (FleetLaunchTemplateConfigRequest createFleetRequestLaunchTemplateConfigsListValue : createFleetRequestLaunchTemplateConfigsList) {

                FleetLaunchTemplateSpecificationRequest launchTemplateSpecification = createFleetRequestLaunchTemplateConfigsListValue
                        .getLaunchTemplateSpecification();
                if (launchTemplateSpecification != null) {

                    if (launchTemplateSpecification.getLaunchTemplateId() != null) {
                        request.addParameter("LaunchTemplateConfigs." + launchTemplateConfigsListIndex + ".LaunchTemplateSpecification.LaunchTemplateId",
                                StringUtils.fromString(launchTemplateSpecification.getLaunchTemplateId()));
                    }

                    if (launchTemplateSpecification.getLaunchTemplateName() != null) {
                        request.addParameter("LaunchTemplateConfigs." + launchTemplateConfigsListIndex + ".LaunchTemplateSpecification.LaunchTemplateName",
                                StringUtils.fromString(launchTemplateSpecification.getLaunchTemplateName()));
                    }

                    if (launchTemplateSpecification.getVersion() != null) {
                        request.addParameter("LaunchTemplateConfigs." + launchTemplateConfigsListIndex + ".LaunchTemplateSpecification.Version",
                                StringUtils.fromString(launchTemplateSpecification.getVersion()));
                    }
                }

                com.amazonaws.internal.SdkInternalList<FleetLaunchTemplateOverridesRequest> fleetLaunchTemplateConfigRequestOverridesList = (com.amazonaws.internal.SdkInternalList<FleetLaunchTemplateOverridesRequest>) createFleetRequestLaunchTemplateConfigsListValue
                        .getOverrides();
                if (!fleetLaunchTemplateConfigRequestOverridesList.isEmpty() || !fleetLaunchTemplateConfigRequestOverridesList.isAutoConstruct()) {
                    int overridesListIndex = 1;

                    for (FleetLaunchTemplateOverridesRequest fleetLaunchTemplateConfigRequestOverridesListValue : fleetLaunchTemplateConfigRequestOverridesList) {

                        if (fleetLaunchTemplateConfigRequestOverridesListValue.getInstanceType() != null) {
                            request.addParameter("LaunchTemplateConfigs." + launchTemplateConfigsListIndex + ".Overrides." + overridesListIndex
                                    + ".InstanceType", StringUtils.fromString(fleetLaunchTemplateConfigRequestOverridesListValue.getInstanceType()));
                        }

                        if (fleetLaunchTemplateConfigRequestOverridesListValue.getMaxPrice() != null) {
                            request.addParameter("LaunchTemplateConfigs." + launchTemplateConfigsListIndex + ".Overrides." + overridesListIndex + ".MaxPrice",
                                    StringUtils.fromString(fleetLaunchTemplateConfigRequestOverridesListValue.getMaxPrice()));
                        }

                        if (fleetLaunchTemplateConfigRequestOverridesListValue.getSubnetId() != null) {
                            request.addParameter("LaunchTemplateConfigs." + launchTemplateConfigsListIndex + ".Overrides." + overridesListIndex + ".SubnetId",
                                    StringUtils.fromString(fleetLaunchTemplateConfigRequestOverridesListValue.getSubnetId()));
                        }

                        if (fleetLaunchTemplateConfigRequestOverridesListValue.getAvailabilityZone() != null) {
                            request.addParameter("LaunchTemplateConfigs." + launchTemplateConfigsListIndex + ".Overrides." + overridesListIndex
                                    + ".AvailabilityZone", StringUtils.fromString(fleetLaunchTemplateConfigRequestOverridesListValue.getAvailabilityZone()));
                        }

                        if (fleetLaunchTemplateConfigRequestOverridesListValue.getWeightedCapacity() != null) {
                            request.addParameter("LaunchTemplateConfigs." + launchTemplateConfigsListIndex + ".Overrides." + overridesListIndex
                                    + ".WeightedCapacity", StringUtils.fromDouble(fleetLaunchTemplateConfigRequestOverridesListValue.getWeightedCapacity()));
                        }
                        overridesListIndex++;
                    }
                }
                launchTemplateConfigsListIndex++;
            }
        }

        TargetCapacitySpecificationRequest targetCapacitySpecification = createFleetRequest.getTargetCapacitySpecification();
        if (targetCapacitySpecification != null) {

            if (targetCapacitySpecification.getTotalTargetCapacity() != null) {
                request.addParameter("TargetCapacitySpecification.TotalTargetCapacity",
                        StringUtils.fromInteger(targetCapacitySpecification.getTotalTargetCapacity()));
            }

            if (targetCapacitySpecification.getOnDemandTargetCapacity() != null) {
                request.addParameter("TargetCapacitySpecification.OnDemandTargetCapacity",
                        StringUtils.fromInteger(targetCapacitySpecification.getOnDemandTargetCapacity()));
            }

            if (targetCapacitySpecification.getSpotTargetCapacity() != null) {
                request.addParameter("TargetCapacitySpecification.SpotTargetCapacity",
                        StringUtils.fromInteger(targetCapacitySpecification.getSpotTargetCapacity()));
            }

            if (targetCapacitySpecification.getDefaultTargetCapacityType() != null) {
                request.addParameter("TargetCapacitySpecification.DefaultTargetCapacityType",
                        StringUtils.fromString(targetCapacitySpecification.getDefaultTargetCapacityType()));
            }
        }

        if (createFleetRequest.getTerminateInstancesWithExpiration() != null) {
            request.addParameter("TerminateInstancesWithExpiration", StringUtils.fromBoolean(createFleetRequest.getTerminateInstancesWithExpiration()));
        }

        if (createFleetRequest.getType() != null) {
            request.addParameter("Type", StringUtils.fromString(createFleetRequest.getType()));
        }

        if (createFleetRequest.getValidFrom() != null) {
            request.addParameter("ValidFrom", StringUtils.fromDate(createFleetRequest.getValidFrom()));
        }

        if (createFleetRequest.getValidUntil() != null) {
            request.addParameter("ValidUntil", StringUtils.fromDate(createFleetRequest.getValidUntil()));
        }

        if (createFleetRequest.getReplaceUnhealthyInstances() != null) {
            request.addParameter("ReplaceUnhealthyInstances", StringUtils.fromBoolean(createFleetRequest.getReplaceUnhealthyInstances()));
        }

        com.amazonaws.internal.SdkInternalList<TagSpecification> createFleetRequestTagSpecificationsList = (com.amazonaws.internal.SdkInternalList<TagSpecification>) createFleetRequest
                .getTagSpecifications();
        if (!createFleetRequestTagSpecificationsList.isEmpty() || !createFleetRequestTagSpecificationsList.isAutoConstruct()) {
            int tagSpecificationsListIndex = 1;

            for (TagSpecification createFleetRequestTagSpecificationsListValue : createFleetRequestTagSpecificationsList) {

                if (createFleetRequestTagSpecificationsListValue.getResourceType() != null) {
                    request.addParameter("TagSpecification." + tagSpecificationsListIndex + ".ResourceType",
                            StringUtils.fromString(createFleetRequestTagSpecificationsListValue.getResourceType()));
                }

                com.amazonaws.internal.SdkInternalList<Tag> tagSpecificationTagsList = (com.amazonaws.internal.SdkInternalList<Tag>) createFleetRequestTagSpecificationsListValue
                        .getTags();
                if (!tagSpecificationTagsList.isEmpty() || !tagSpecificationTagsList.isAutoConstruct()) {
                    int tagsListIndex = 1;

                    for (Tag tagSpecificationTagsListValue : tagSpecificationTagsList) {

                        if (tagSpecificationTagsListValue.getKey() != null) {
                            request.addParameter("TagSpecification." + tagSpecificationsListIndex + ".Tag." + tagsListIndex + ".Key",
                                    StringUtils.fromString(tagSpecificationTagsListValue.getKey()));
                        }

                        if (tagSpecificationTagsListValue.getValue() != null) {
                            request.addParameter("TagSpecification." + tagSpecificationsListIndex + ".Tag." + tagsListIndex + ".Value",
                                    StringUtils.fromString(tagSpecificationTagsListValue.getValue()));
                        }
                        tagsListIndex++;
                    }
                }
                tagSpecificationsListIndex++;
            }
        }

        return request;
    }

}
