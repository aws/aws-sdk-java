/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

            FleetSpotMaintenanceStrategiesRequest maintenanceStrategies = spotOptions.getMaintenanceStrategies();
            if (maintenanceStrategies != null) {

                FleetSpotCapacityRebalanceRequest capacityRebalance = maintenanceStrategies.getCapacityRebalance();
                if (capacityRebalance != null) {

                    if (capacityRebalance.getReplacementStrategy() != null) {
                        request.addParameter("SpotOptions.MaintenanceStrategies.CapacityRebalance.ReplacementStrategy",
                                StringUtils.fromString(capacityRebalance.getReplacementStrategy()));
                    }

                    if (capacityRebalance.getTerminationDelay() != null) {
                        request.addParameter("SpotOptions.MaintenanceStrategies.CapacityRebalance.TerminationDelay",
                                StringUtils.fromInteger(capacityRebalance.getTerminationDelay()));
                    }
                }
            }

            if (spotOptions.getInstanceInterruptionBehavior() != null) {
                request.addParameter("SpotOptions.InstanceInterruptionBehavior", StringUtils.fromString(spotOptions.getInstanceInterruptionBehavior()));
            }

            if (spotOptions.getInstancePoolsToUseCount() != null) {
                request.addParameter("SpotOptions.InstancePoolsToUseCount", StringUtils.fromInteger(spotOptions.getInstancePoolsToUseCount()));
            }

            if (spotOptions.getSingleInstanceType() != null) {
                request.addParameter("SpotOptions.SingleInstanceType", StringUtils.fromBoolean(spotOptions.getSingleInstanceType()));
            }

            if (spotOptions.getSingleAvailabilityZone() != null) {
                request.addParameter("SpotOptions.SingleAvailabilityZone", StringUtils.fromBoolean(spotOptions.getSingleAvailabilityZone()));
            }

            if (spotOptions.getMinTargetCapacity() != null) {
                request.addParameter("SpotOptions.MinTargetCapacity", StringUtils.fromInteger(spotOptions.getMinTargetCapacity()));
            }

            if (spotOptions.getMaxTotalPrice() != null) {
                request.addParameter("SpotOptions.MaxTotalPrice", StringUtils.fromString(spotOptions.getMaxTotalPrice()));
            }
        }

        OnDemandOptionsRequest onDemandOptions = createFleetRequest.getOnDemandOptions();
        if (onDemandOptions != null) {

            if (onDemandOptions.getAllocationStrategy() != null) {
                request.addParameter("OnDemandOptions.AllocationStrategy", StringUtils.fromString(onDemandOptions.getAllocationStrategy()));
            }

            CapacityReservationOptionsRequest capacityReservationOptions = onDemandOptions.getCapacityReservationOptions();
            if (capacityReservationOptions != null) {

                if (capacityReservationOptions.getUsageStrategy() != null) {
                    request.addParameter("OnDemandOptions.CapacityReservationOptions.UsageStrategy",
                            StringUtils.fromString(capacityReservationOptions.getUsageStrategy()));
                }
            }

            if (onDemandOptions.getSingleInstanceType() != null) {
                request.addParameter("OnDemandOptions.SingleInstanceType", StringUtils.fromBoolean(onDemandOptions.getSingleInstanceType()));
            }

            if (onDemandOptions.getSingleAvailabilityZone() != null) {
                request.addParameter("OnDemandOptions.SingleAvailabilityZone", StringUtils.fromBoolean(onDemandOptions.getSingleAvailabilityZone()));
            }

            if (onDemandOptions.getMinTargetCapacity() != null) {
                request.addParameter("OnDemandOptions.MinTargetCapacity", StringUtils.fromInteger(onDemandOptions.getMinTargetCapacity()));
            }

            if (onDemandOptions.getMaxTotalPrice() != null) {
                request.addParameter("OnDemandOptions.MaxTotalPrice", StringUtils.fromString(onDemandOptions.getMaxTotalPrice()));
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

                        if (fleetLaunchTemplateConfigRequestOverridesListValue.getPriority() != null) {
                            request.addParameter("LaunchTemplateConfigs." + launchTemplateConfigsListIndex + ".Overrides." + overridesListIndex + ".Priority",
                                    StringUtils.fromDouble(fleetLaunchTemplateConfigRequestOverridesListValue.getPriority()));
                        }

                        Placement placement = fleetLaunchTemplateConfigRequestOverridesListValue.getPlacement();
                        if (placement != null) {

                            if (placement.getAvailabilityZone() != null) {
                                request.addParameter("LaunchTemplateConfigs." + launchTemplateConfigsListIndex + ".Overrides." + overridesListIndex
                                        + ".Placement.AvailabilityZone", StringUtils.fromString(placement.getAvailabilityZone()));
                            }

                            if (placement.getAffinity() != null) {
                                request.addParameter("LaunchTemplateConfigs." + launchTemplateConfigsListIndex + ".Overrides." + overridesListIndex
                                        + ".Placement.Affinity", StringUtils.fromString(placement.getAffinity()));
                            }

                            if (placement.getGroupName() != null) {
                                request.addParameter("LaunchTemplateConfigs." + launchTemplateConfigsListIndex + ".Overrides." + overridesListIndex
                                        + ".Placement.GroupName", StringUtils.fromString(placement.getGroupName()));
                            }

                            if (placement.getPartitionNumber() != null) {
                                request.addParameter("LaunchTemplateConfigs." + launchTemplateConfigsListIndex + ".Overrides." + overridesListIndex
                                        + ".Placement.PartitionNumber", StringUtils.fromInteger(placement.getPartitionNumber()));
                            }

                            if (placement.getHostId() != null) {
                                request.addParameter("LaunchTemplateConfigs." + launchTemplateConfigsListIndex + ".Overrides." + overridesListIndex
                                        + ".Placement.HostId", StringUtils.fromString(placement.getHostId()));
                            }

                            if (placement.getTenancy() != null) {
                                request.addParameter("LaunchTemplateConfigs." + launchTemplateConfigsListIndex + ".Overrides." + overridesListIndex
                                        + ".Placement.Tenancy", StringUtils.fromString(placement.getTenancy()));
                            }

                            if (placement.getSpreadDomain() != null) {
                                request.addParameter("LaunchTemplateConfigs." + launchTemplateConfigsListIndex + ".Overrides." + overridesListIndex
                                        + ".Placement.SpreadDomain", StringUtils.fromString(placement.getSpreadDomain()));
                            }

                            if (placement.getHostResourceGroupArn() != null) {
                                request.addParameter("LaunchTemplateConfigs." + launchTemplateConfigsListIndex + ".Overrides." + overridesListIndex
                                        + ".Placement.HostResourceGroupArn", StringUtils.fromString(placement.getHostResourceGroupArn()));
                            }

                            if (placement.getGroupId() != null) {
                                request.addParameter("LaunchTemplateConfigs." + launchTemplateConfigsListIndex + ".Overrides." + overridesListIndex
                                        + ".Placement.GroupId", StringUtils.fromString(placement.getGroupId()));
                            }
                        }

                        InstanceRequirementsRequest instanceRequirements = fleetLaunchTemplateConfigRequestOverridesListValue.getInstanceRequirements();
                        if (instanceRequirements != null) {

                            VCpuCountRangeRequest vCpuCount = instanceRequirements.getVCpuCount();
                            if (vCpuCount != null) {

                                if (vCpuCount.getMin() != null) {
                                    request.addParameter("LaunchTemplateConfigs." + launchTemplateConfigsListIndex + ".Overrides." + overridesListIndex
                                            + ".InstanceRequirements.VCpuCount.Min", StringUtils.fromInteger(vCpuCount.getMin()));
                                }

                                if (vCpuCount.getMax() != null) {
                                    request.addParameter("LaunchTemplateConfigs." + launchTemplateConfigsListIndex + ".Overrides." + overridesListIndex
                                            + ".InstanceRequirements.VCpuCount.Max", StringUtils.fromInteger(vCpuCount.getMax()));
                                }
                            }

                            MemoryMiBRequest memoryMiB = instanceRequirements.getMemoryMiB();
                            if (memoryMiB != null) {

                                if (memoryMiB.getMin() != null) {
                                    request.addParameter("LaunchTemplateConfigs." + launchTemplateConfigsListIndex + ".Overrides." + overridesListIndex
                                            + ".InstanceRequirements.MemoryMiB.Min", StringUtils.fromInteger(memoryMiB.getMin()));
                                }

                                if (memoryMiB.getMax() != null) {
                                    request.addParameter("LaunchTemplateConfigs." + launchTemplateConfigsListIndex + ".Overrides." + overridesListIndex
                                            + ".InstanceRequirements.MemoryMiB.Max", StringUtils.fromInteger(memoryMiB.getMax()));
                                }
                            }

                            com.amazonaws.internal.SdkInternalList<String> instanceRequirementsRequestCpuManufacturersList = (com.amazonaws.internal.SdkInternalList<String>) instanceRequirements
                                    .getCpuManufacturers();
                            if (!instanceRequirementsRequestCpuManufacturersList.isEmpty()
                                    || !instanceRequirementsRequestCpuManufacturersList.isAutoConstruct()) {
                                int cpuManufacturersListIndex = 1;

                                for (String instanceRequirementsRequestCpuManufacturersListValue : instanceRequirementsRequestCpuManufacturersList) {
                                    if (instanceRequirementsRequestCpuManufacturersListValue != null) {
                                        request.addParameter("LaunchTemplateConfigs." + launchTemplateConfigsListIndex + ".Overrides." + overridesListIndex
                                                + ".InstanceRequirements.CpuManufacturer." + cpuManufacturersListIndex,
                                                StringUtils.fromString(instanceRequirementsRequestCpuManufacturersListValue));
                                    }
                                    cpuManufacturersListIndex++;
                                }
                            }

                            MemoryGiBPerVCpuRequest memoryGiBPerVCpu = instanceRequirements.getMemoryGiBPerVCpu();
                            if (memoryGiBPerVCpu != null) {

                                if (memoryGiBPerVCpu.getMin() != null) {
                                    request.addParameter("LaunchTemplateConfigs." + launchTemplateConfigsListIndex + ".Overrides." + overridesListIndex
                                            + ".InstanceRequirements.MemoryGiBPerVCpu.Min", StringUtils.fromDouble(memoryGiBPerVCpu.getMin()));
                                }

                                if (memoryGiBPerVCpu.getMax() != null) {
                                    request.addParameter("LaunchTemplateConfigs." + launchTemplateConfigsListIndex + ".Overrides." + overridesListIndex
                                            + ".InstanceRequirements.MemoryGiBPerVCpu.Max", StringUtils.fromDouble(memoryGiBPerVCpu.getMax()));
                                }
                            }

                            com.amazonaws.internal.SdkInternalList<String> instanceRequirementsRequestExcludedInstanceTypesList = (com.amazonaws.internal.SdkInternalList<String>) instanceRequirements
                                    .getExcludedInstanceTypes();
                            if (!instanceRequirementsRequestExcludedInstanceTypesList.isEmpty()
                                    || !instanceRequirementsRequestExcludedInstanceTypesList.isAutoConstruct()) {
                                int excludedInstanceTypesListIndex = 1;

                                for (String instanceRequirementsRequestExcludedInstanceTypesListValue : instanceRequirementsRequestExcludedInstanceTypesList) {
                                    if (instanceRequirementsRequestExcludedInstanceTypesListValue != null) {
                                        request.addParameter("LaunchTemplateConfigs." + launchTemplateConfigsListIndex + ".Overrides." + overridesListIndex
                                                + ".InstanceRequirements.ExcludedInstanceType." + excludedInstanceTypesListIndex,
                                                StringUtils.fromString(instanceRequirementsRequestExcludedInstanceTypesListValue));
                                    }
                                    excludedInstanceTypesListIndex++;
                                }
                            }

                            com.amazonaws.internal.SdkInternalList<String> instanceRequirementsRequestInstanceGenerationsList = (com.amazonaws.internal.SdkInternalList<String>) instanceRequirements
                                    .getInstanceGenerations();
                            if (!instanceRequirementsRequestInstanceGenerationsList.isEmpty()
                                    || !instanceRequirementsRequestInstanceGenerationsList.isAutoConstruct()) {
                                int instanceGenerationsListIndex = 1;

                                for (String instanceRequirementsRequestInstanceGenerationsListValue : instanceRequirementsRequestInstanceGenerationsList) {
                                    if (instanceRequirementsRequestInstanceGenerationsListValue != null) {
                                        request.addParameter("LaunchTemplateConfigs." + launchTemplateConfigsListIndex + ".Overrides." + overridesListIndex
                                                + ".InstanceRequirements.InstanceGeneration." + instanceGenerationsListIndex,
                                                StringUtils.fromString(instanceRequirementsRequestInstanceGenerationsListValue));
                                    }
                                    instanceGenerationsListIndex++;
                                }
                            }

                            if (instanceRequirements.getSpotMaxPricePercentageOverLowestPrice() != null) {
                                request.addParameter("LaunchTemplateConfigs." + launchTemplateConfigsListIndex + ".Overrides." + overridesListIndex
                                        + ".InstanceRequirements.SpotMaxPricePercentageOverLowestPrice",
                                        StringUtils.fromInteger(instanceRequirements.getSpotMaxPricePercentageOverLowestPrice()));
                            }

                            if (instanceRequirements.getOnDemandMaxPricePercentageOverLowestPrice() != null) {
                                request.addParameter("LaunchTemplateConfigs." + launchTemplateConfigsListIndex + ".Overrides." + overridesListIndex
                                        + ".InstanceRequirements.OnDemandMaxPricePercentageOverLowestPrice",
                                        StringUtils.fromInteger(instanceRequirements.getOnDemandMaxPricePercentageOverLowestPrice()));
                            }

                            if (instanceRequirements.getBareMetal() != null) {
                                request.addParameter("LaunchTemplateConfigs." + launchTemplateConfigsListIndex + ".Overrides." + overridesListIndex
                                        + ".InstanceRequirements.BareMetal", StringUtils.fromString(instanceRequirements.getBareMetal()));
                            }

                            if (instanceRequirements.getBurstablePerformance() != null) {
                                request.addParameter("LaunchTemplateConfigs." + launchTemplateConfigsListIndex + ".Overrides." + overridesListIndex
                                        + ".InstanceRequirements.BurstablePerformance", StringUtils.fromString(instanceRequirements.getBurstablePerformance()));
                            }

                            if (instanceRequirements.getRequireHibernateSupport() != null) {
                                request.addParameter("LaunchTemplateConfigs." + launchTemplateConfigsListIndex + ".Overrides." + overridesListIndex
                                        + ".InstanceRequirements.RequireHibernateSupport",
                                        StringUtils.fromBoolean(instanceRequirements.getRequireHibernateSupport()));
                            }

                            NetworkInterfaceCountRequest networkInterfaceCount = instanceRequirements.getNetworkInterfaceCount();
                            if (networkInterfaceCount != null) {

                                if (networkInterfaceCount.getMin() != null) {
                                    request.addParameter("LaunchTemplateConfigs." + launchTemplateConfigsListIndex + ".Overrides." + overridesListIndex
                                            + ".InstanceRequirements.NetworkInterfaceCount.Min", StringUtils.fromInteger(networkInterfaceCount.getMin()));
                                }

                                if (networkInterfaceCount.getMax() != null) {
                                    request.addParameter("LaunchTemplateConfigs." + launchTemplateConfigsListIndex + ".Overrides." + overridesListIndex
                                            + ".InstanceRequirements.NetworkInterfaceCount.Max", StringUtils.fromInteger(networkInterfaceCount.getMax()));
                                }
                            }

                            if (instanceRequirements.getLocalStorage() != null) {
                                request.addParameter("LaunchTemplateConfigs." + launchTemplateConfigsListIndex + ".Overrides." + overridesListIndex
                                        + ".InstanceRequirements.LocalStorage", StringUtils.fromString(instanceRequirements.getLocalStorage()));
                            }

                            com.amazonaws.internal.SdkInternalList<String> instanceRequirementsRequestLocalStorageTypesList = (com.amazonaws.internal.SdkInternalList<String>) instanceRequirements
                                    .getLocalStorageTypes();
                            if (!instanceRequirementsRequestLocalStorageTypesList.isEmpty()
                                    || !instanceRequirementsRequestLocalStorageTypesList.isAutoConstruct()) {
                                int localStorageTypesListIndex = 1;

                                for (String instanceRequirementsRequestLocalStorageTypesListValue : instanceRequirementsRequestLocalStorageTypesList) {
                                    if (instanceRequirementsRequestLocalStorageTypesListValue != null) {
                                        request.addParameter("LaunchTemplateConfigs." + launchTemplateConfigsListIndex + ".Overrides." + overridesListIndex
                                                + ".InstanceRequirements.LocalStorageType." + localStorageTypesListIndex,
                                                StringUtils.fromString(instanceRequirementsRequestLocalStorageTypesListValue));
                                    }
                                    localStorageTypesListIndex++;
                                }
                            }

                            TotalLocalStorageGBRequest totalLocalStorageGB = instanceRequirements.getTotalLocalStorageGB();
                            if (totalLocalStorageGB != null) {

                                if (totalLocalStorageGB.getMin() != null) {
                                    request.addParameter("LaunchTemplateConfigs." + launchTemplateConfigsListIndex + ".Overrides." + overridesListIndex
                                            + ".InstanceRequirements.TotalLocalStorageGB.Min", StringUtils.fromDouble(totalLocalStorageGB.getMin()));
                                }

                                if (totalLocalStorageGB.getMax() != null) {
                                    request.addParameter("LaunchTemplateConfigs." + launchTemplateConfigsListIndex + ".Overrides." + overridesListIndex
                                            + ".InstanceRequirements.TotalLocalStorageGB.Max", StringUtils.fromDouble(totalLocalStorageGB.getMax()));
                                }
                            }

                            BaselineEbsBandwidthMbpsRequest baselineEbsBandwidthMbps = instanceRequirements.getBaselineEbsBandwidthMbps();
                            if (baselineEbsBandwidthMbps != null) {

                                if (baselineEbsBandwidthMbps.getMin() != null) {
                                    request.addParameter("LaunchTemplateConfigs." + launchTemplateConfigsListIndex + ".Overrides." + overridesListIndex
                                            + ".InstanceRequirements.BaselineEbsBandwidthMbps.Min", StringUtils.fromInteger(baselineEbsBandwidthMbps.getMin()));
                                }

                                if (baselineEbsBandwidthMbps.getMax() != null) {
                                    request.addParameter("LaunchTemplateConfigs." + launchTemplateConfigsListIndex + ".Overrides." + overridesListIndex
                                            + ".InstanceRequirements.BaselineEbsBandwidthMbps.Max", StringUtils.fromInteger(baselineEbsBandwidthMbps.getMax()));
                                }
                            }

                            com.amazonaws.internal.SdkInternalList<String> instanceRequirementsRequestAcceleratorTypesList = (com.amazonaws.internal.SdkInternalList<String>) instanceRequirements
                                    .getAcceleratorTypes();
                            if (!instanceRequirementsRequestAcceleratorTypesList.isEmpty()
                                    || !instanceRequirementsRequestAcceleratorTypesList.isAutoConstruct()) {
                                int acceleratorTypesListIndex = 1;

                                for (String instanceRequirementsRequestAcceleratorTypesListValue : instanceRequirementsRequestAcceleratorTypesList) {
                                    if (instanceRequirementsRequestAcceleratorTypesListValue != null) {
                                        request.addParameter("LaunchTemplateConfigs." + launchTemplateConfigsListIndex + ".Overrides." + overridesListIndex
                                                + ".InstanceRequirements.AcceleratorType." + acceleratorTypesListIndex,
                                                StringUtils.fromString(instanceRequirementsRequestAcceleratorTypesListValue));
                                    }
                                    acceleratorTypesListIndex++;
                                }
                            }

                            AcceleratorCountRequest acceleratorCount = instanceRequirements.getAcceleratorCount();
                            if (acceleratorCount != null) {

                                if (acceleratorCount.getMin() != null) {
                                    request.addParameter("LaunchTemplateConfigs." + launchTemplateConfigsListIndex + ".Overrides." + overridesListIndex
                                            + ".InstanceRequirements.AcceleratorCount.Min", StringUtils.fromInteger(acceleratorCount.getMin()));
                                }

                                if (acceleratorCount.getMax() != null) {
                                    request.addParameter("LaunchTemplateConfigs." + launchTemplateConfigsListIndex + ".Overrides." + overridesListIndex
                                            + ".InstanceRequirements.AcceleratorCount.Max", StringUtils.fromInteger(acceleratorCount.getMax()));
                                }
                            }

                            com.amazonaws.internal.SdkInternalList<String> instanceRequirementsRequestAcceleratorManufacturersList = (com.amazonaws.internal.SdkInternalList<String>) instanceRequirements
                                    .getAcceleratorManufacturers();
                            if (!instanceRequirementsRequestAcceleratorManufacturersList.isEmpty()
                                    || !instanceRequirementsRequestAcceleratorManufacturersList.isAutoConstruct()) {
                                int acceleratorManufacturersListIndex = 1;

                                for (String instanceRequirementsRequestAcceleratorManufacturersListValue : instanceRequirementsRequestAcceleratorManufacturersList) {
                                    if (instanceRequirementsRequestAcceleratorManufacturersListValue != null) {
                                        request.addParameter("LaunchTemplateConfigs." + launchTemplateConfigsListIndex + ".Overrides." + overridesListIndex
                                                + ".InstanceRequirements.AcceleratorManufacturer." + acceleratorManufacturersListIndex,
                                                StringUtils.fromString(instanceRequirementsRequestAcceleratorManufacturersListValue));
                                    }
                                    acceleratorManufacturersListIndex++;
                                }
                            }

                            com.amazonaws.internal.SdkInternalList<String> instanceRequirementsRequestAcceleratorNamesList = (com.amazonaws.internal.SdkInternalList<String>) instanceRequirements
                                    .getAcceleratorNames();
                            if (!instanceRequirementsRequestAcceleratorNamesList.isEmpty()
                                    || !instanceRequirementsRequestAcceleratorNamesList.isAutoConstruct()) {
                                int acceleratorNamesListIndex = 1;

                                for (String instanceRequirementsRequestAcceleratorNamesListValue : instanceRequirementsRequestAcceleratorNamesList) {
                                    if (instanceRequirementsRequestAcceleratorNamesListValue != null) {
                                        request.addParameter("LaunchTemplateConfigs." + launchTemplateConfigsListIndex + ".Overrides." + overridesListIndex
                                                + ".InstanceRequirements.AcceleratorName." + acceleratorNamesListIndex,
                                                StringUtils.fromString(instanceRequirementsRequestAcceleratorNamesListValue));
                                    }
                                    acceleratorNamesListIndex++;
                                }
                            }

                            AcceleratorTotalMemoryMiBRequest acceleratorTotalMemoryMiB = instanceRequirements.getAcceleratorTotalMemoryMiB();
                            if (acceleratorTotalMemoryMiB != null) {

                                if (acceleratorTotalMemoryMiB.getMin() != null) {
                                    request.addParameter("LaunchTemplateConfigs." + launchTemplateConfigsListIndex + ".Overrides." + overridesListIndex
                                            + ".InstanceRequirements.AcceleratorTotalMemoryMiB.Min",
                                            StringUtils.fromInteger(acceleratorTotalMemoryMiB.getMin()));
                                }

                                if (acceleratorTotalMemoryMiB.getMax() != null) {
                                    request.addParameter("LaunchTemplateConfigs." + launchTemplateConfigsListIndex + ".Overrides." + overridesListIndex
                                            + ".InstanceRequirements.AcceleratorTotalMemoryMiB.Max",
                                            StringUtils.fromInteger(acceleratorTotalMemoryMiB.getMax()));
                                }
                            }

                            NetworkBandwidthGbpsRequest networkBandwidthGbps = instanceRequirements.getNetworkBandwidthGbps();
                            if (networkBandwidthGbps != null) {

                                if (networkBandwidthGbps.getMin() != null) {
                                    request.addParameter("LaunchTemplateConfigs." + launchTemplateConfigsListIndex + ".Overrides." + overridesListIndex
                                            + ".InstanceRequirements.NetworkBandwidthGbps.Min", StringUtils.fromDouble(networkBandwidthGbps.getMin()));
                                }

                                if (networkBandwidthGbps.getMax() != null) {
                                    request.addParameter("LaunchTemplateConfigs." + launchTemplateConfigsListIndex + ".Overrides." + overridesListIndex
                                            + ".InstanceRequirements.NetworkBandwidthGbps.Max", StringUtils.fromDouble(networkBandwidthGbps.getMax()));
                                }
                            }

                            com.amazonaws.internal.SdkInternalList<String> instanceRequirementsRequestAllowedInstanceTypesList = (com.amazonaws.internal.SdkInternalList<String>) instanceRequirements
                                    .getAllowedInstanceTypes();
                            if (!instanceRequirementsRequestAllowedInstanceTypesList.isEmpty()
                                    || !instanceRequirementsRequestAllowedInstanceTypesList.isAutoConstruct()) {
                                int allowedInstanceTypesListIndex = 1;

                                for (String instanceRequirementsRequestAllowedInstanceTypesListValue : instanceRequirementsRequestAllowedInstanceTypesList) {
                                    if (instanceRequirementsRequestAllowedInstanceTypesListValue != null) {
                                        request.addParameter("LaunchTemplateConfigs." + launchTemplateConfigsListIndex + ".Overrides." + overridesListIndex
                                                + ".InstanceRequirements.AllowedInstanceType." + allowedInstanceTypesListIndex,
                                                StringUtils.fromString(instanceRequirementsRequestAllowedInstanceTypesListValue));
                                    }
                                    allowedInstanceTypesListIndex++;
                                }
                            }
                        }

                        if (fleetLaunchTemplateConfigRequestOverridesListValue.getImageId() != null) {
                            request.addParameter("LaunchTemplateConfigs." + launchTemplateConfigsListIndex + ".Overrides." + overridesListIndex + ".ImageId",
                                    StringUtils.fromString(fleetLaunchTemplateConfigRequestOverridesListValue.getImageId()));
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

            if (targetCapacitySpecification.getTargetCapacityUnitType() != null) {
                request.addParameter("TargetCapacitySpecification.TargetCapacityUnitType",
                        StringUtils.fromString(targetCapacitySpecification.getTargetCapacityUnitType()));
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

        if (createFleetRequest.getContext() != null) {
            request.addParameter("Context", StringUtils.fromString(createFleetRequest.getContext()));
        }

        return request;
    }

}
