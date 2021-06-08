/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * ModifyFleetRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModifyFleetRequestMarshaller implements Marshaller<Request<ModifyFleetRequest>, ModifyFleetRequest> {

    public Request<ModifyFleetRequest> marshall(ModifyFleetRequest modifyFleetRequest) {

        if (modifyFleetRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<ModifyFleetRequest> request = new DefaultRequest<ModifyFleetRequest>(modifyFleetRequest, "AmazonEC2");
        request.addParameter("Action", "ModifyFleet");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        if (modifyFleetRequest.getExcessCapacityTerminationPolicy() != null) {
            request.addParameter("ExcessCapacityTerminationPolicy", StringUtils.fromString(modifyFleetRequest.getExcessCapacityTerminationPolicy()));
        }

        com.amazonaws.internal.SdkInternalList<FleetLaunchTemplateConfigRequest> modifyFleetRequestLaunchTemplateConfigsList = (com.amazonaws.internal.SdkInternalList<FleetLaunchTemplateConfigRequest>) modifyFleetRequest
                .getLaunchTemplateConfigs();
        if (!modifyFleetRequestLaunchTemplateConfigsList.isEmpty() || !modifyFleetRequestLaunchTemplateConfigsList.isAutoConstruct()) {
            int launchTemplateConfigsListIndex = 1;

            for (FleetLaunchTemplateConfigRequest modifyFleetRequestLaunchTemplateConfigsListValue : modifyFleetRequestLaunchTemplateConfigsList) {

                FleetLaunchTemplateSpecificationRequest launchTemplateSpecification = modifyFleetRequestLaunchTemplateConfigsListValue
                        .getLaunchTemplateSpecification();
                if (launchTemplateSpecification != null) {

                    if (launchTemplateSpecification.getLaunchTemplateId() != null) {
                        request.addParameter("LaunchTemplateConfig." + launchTemplateConfigsListIndex + ".LaunchTemplateSpecification.LaunchTemplateId",
                                StringUtils.fromString(launchTemplateSpecification.getLaunchTemplateId()));
                    }

                    if (launchTemplateSpecification.getLaunchTemplateName() != null) {
                        request.addParameter("LaunchTemplateConfig." + launchTemplateConfigsListIndex + ".LaunchTemplateSpecification.LaunchTemplateName",
                                StringUtils.fromString(launchTemplateSpecification.getLaunchTemplateName()));
                    }

                    if (launchTemplateSpecification.getVersion() != null) {
                        request.addParameter("LaunchTemplateConfig." + launchTemplateConfigsListIndex + ".LaunchTemplateSpecification.Version",
                                StringUtils.fromString(launchTemplateSpecification.getVersion()));
                    }
                }

                com.amazonaws.internal.SdkInternalList<FleetLaunchTemplateOverridesRequest> fleetLaunchTemplateConfigRequestOverridesList = (com.amazonaws.internal.SdkInternalList<FleetLaunchTemplateOverridesRequest>) modifyFleetRequestLaunchTemplateConfigsListValue
                        .getOverrides();
                if (!fleetLaunchTemplateConfigRequestOverridesList.isEmpty() || !fleetLaunchTemplateConfigRequestOverridesList.isAutoConstruct()) {
                    int overridesListIndex = 1;

                    for (FleetLaunchTemplateOverridesRequest fleetLaunchTemplateConfigRequestOverridesListValue : fleetLaunchTemplateConfigRequestOverridesList) {

                        if (fleetLaunchTemplateConfigRequestOverridesListValue.getInstanceType() != null) {
                            request.addParameter("LaunchTemplateConfig." + launchTemplateConfigsListIndex + ".Overrides." + overridesListIndex
                                    + ".InstanceType", StringUtils.fromString(fleetLaunchTemplateConfigRequestOverridesListValue.getInstanceType()));
                        }

                        if (fleetLaunchTemplateConfigRequestOverridesListValue.getMaxPrice() != null) {
                            request.addParameter("LaunchTemplateConfig." + launchTemplateConfigsListIndex + ".Overrides." + overridesListIndex + ".MaxPrice",
                                    StringUtils.fromString(fleetLaunchTemplateConfigRequestOverridesListValue.getMaxPrice()));
                        }

                        if (fleetLaunchTemplateConfigRequestOverridesListValue.getSubnetId() != null) {
                            request.addParameter("LaunchTemplateConfig." + launchTemplateConfigsListIndex + ".Overrides." + overridesListIndex + ".SubnetId",
                                    StringUtils.fromString(fleetLaunchTemplateConfigRequestOverridesListValue.getSubnetId()));
                        }

                        if (fleetLaunchTemplateConfigRequestOverridesListValue.getAvailabilityZone() != null) {
                            request.addParameter("LaunchTemplateConfig." + launchTemplateConfigsListIndex + ".Overrides." + overridesListIndex
                                    + ".AvailabilityZone", StringUtils.fromString(fleetLaunchTemplateConfigRequestOverridesListValue.getAvailabilityZone()));
                        }

                        if (fleetLaunchTemplateConfigRequestOverridesListValue.getWeightedCapacity() != null) {
                            request.addParameter("LaunchTemplateConfig." + launchTemplateConfigsListIndex + ".Overrides." + overridesListIndex
                                    + ".WeightedCapacity", StringUtils.fromDouble(fleetLaunchTemplateConfigRequestOverridesListValue.getWeightedCapacity()));
                        }

                        if (fleetLaunchTemplateConfigRequestOverridesListValue.getPriority() != null) {
                            request.addParameter("LaunchTemplateConfig." + launchTemplateConfigsListIndex + ".Overrides." + overridesListIndex + ".Priority",
                                    StringUtils.fromDouble(fleetLaunchTemplateConfigRequestOverridesListValue.getPriority()));
                        }

                        Placement placement = fleetLaunchTemplateConfigRequestOverridesListValue.getPlacement();
                        if (placement != null) {

                            if (placement.getAvailabilityZone() != null) {
                                request.addParameter("LaunchTemplateConfig." + launchTemplateConfigsListIndex + ".Overrides." + overridesListIndex
                                        + ".Placement.AvailabilityZone", StringUtils.fromString(placement.getAvailabilityZone()));
                            }

                            if (placement.getAffinity() != null) {
                                request.addParameter("LaunchTemplateConfig." + launchTemplateConfigsListIndex + ".Overrides." + overridesListIndex
                                        + ".Placement.Affinity", StringUtils.fromString(placement.getAffinity()));
                            }

                            if (placement.getGroupName() != null) {
                                request.addParameter("LaunchTemplateConfig." + launchTemplateConfigsListIndex + ".Overrides." + overridesListIndex
                                        + ".Placement.GroupName", StringUtils.fromString(placement.getGroupName()));
                            }

                            if (placement.getPartitionNumber() != null) {
                                request.addParameter("LaunchTemplateConfig." + launchTemplateConfigsListIndex + ".Overrides." + overridesListIndex
                                        + ".Placement.PartitionNumber", StringUtils.fromInteger(placement.getPartitionNumber()));
                            }

                            if (placement.getHostId() != null) {
                                request.addParameter("LaunchTemplateConfig." + launchTemplateConfigsListIndex + ".Overrides." + overridesListIndex
                                        + ".Placement.HostId", StringUtils.fromString(placement.getHostId()));
                            }

                            if (placement.getTenancy() != null) {
                                request.addParameter("LaunchTemplateConfig." + launchTemplateConfigsListIndex + ".Overrides." + overridesListIndex
                                        + ".Placement.Tenancy", StringUtils.fromString(placement.getTenancy()));
                            }

                            if (placement.getSpreadDomain() != null) {
                                request.addParameter("LaunchTemplateConfig." + launchTemplateConfigsListIndex + ".Overrides." + overridesListIndex
                                        + ".Placement.SpreadDomain", StringUtils.fromString(placement.getSpreadDomain()));
                            }

                            if (placement.getHostResourceGroupArn() != null) {
                                request.addParameter("LaunchTemplateConfig." + launchTemplateConfigsListIndex + ".Overrides." + overridesListIndex
                                        + ".Placement.HostResourceGroupArn", StringUtils.fromString(placement.getHostResourceGroupArn()));
                            }
                        }
                        overridesListIndex++;
                    }
                }
                launchTemplateConfigsListIndex++;
            }
        }

        if (modifyFleetRequest.getFleetId() != null) {
            request.addParameter("FleetId", StringUtils.fromString(modifyFleetRequest.getFleetId()));
        }

        TargetCapacitySpecificationRequest targetCapacitySpecification = modifyFleetRequest.getTargetCapacitySpecification();
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

        return request;
    }

}
