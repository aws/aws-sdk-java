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
 * ModifySpotFleetRequestRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModifySpotFleetRequestRequestMarshaller implements Marshaller<Request<ModifySpotFleetRequestRequest>, ModifySpotFleetRequestRequest> {

    public Request<ModifySpotFleetRequestRequest> marshall(ModifySpotFleetRequestRequest modifySpotFleetRequestRequest) {

        if (modifySpotFleetRequestRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<ModifySpotFleetRequestRequest> request = new DefaultRequest<ModifySpotFleetRequestRequest>(modifySpotFleetRequestRequest, "AmazonEC2");
        request.addParameter("Action", "ModifySpotFleetRequest");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        if (modifySpotFleetRequestRequest.getExcessCapacityTerminationPolicy() != null) {
            request.addParameter("ExcessCapacityTerminationPolicy", StringUtils.fromString(modifySpotFleetRequestRequest.getExcessCapacityTerminationPolicy()));
        }

        com.amazonaws.internal.SdkInternalList<LaunchTemplateConfig> modifySpotFleetRequestRequestLaunchTemplateConfigsList = (com.amazonaws.internal.SdkInternalList<LaunchTemplateConfig>) modifySpotFleetRequestRequest
                .getLaunchTemplateConfigs();
        if (!modifySpotFleetRequestRequestLaunchTemplateConfigsList.isEmpty() || !modifySpotFleetRequestRequestLaunchTemplateConfigsList.isAutoConstruct()) {
            int launchTemplateConfigsListIndex = 1;

            for (LaunchTemplateConfig modifySpotFleetRequestRequestLaunchTemplateConfigsListValue : modifySpotFleetRequestRequestLaunchTemplateConfigsList) {

                FleetLaunchTemplateSpecification launchTemplateSpecification = modifySpotFleetRequestRequestLaunchTemplateConfigsListValue
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

                com.amazonaws.internal.SdkInternalList<LaunchTemplateOverrides> launchTemplateConfigOverridesList = (com.amazonaws.internal.SdkInternalList<LaunchTemplateOverrides>) modifySpotFleetRequestRequestLaunchTemplateConfigsListValue
                        .getOverrides();
                if (!launchTemplateConfigOverridesList.isEmpty() || !launchTemplateConfigOverridesList.isAutoConstruct()) {
                    int overridesListIndex = 1;

                    for (LaunchTemplateOverrides launchTemplateConfigOverridesListValue : launchTemplateConfigOverridesList) {

                        if (launchTemplateConfigOverridesListValue.getInstanceType() != null) {
                            request.addParameter("LaunchTemplateConfig." + launchTemplateConfigsListIndex + ".Overrides." + overridesListIndex
                                    + ".InstanceType", StringUtils.fromString(launchTemplateConfigOverridesListValue.getInstanceType()));
                        }

                        if (launchTemplateConfigOverridesListValue.getSpotPrice() != null) {
                            request.addParameter("LaunchTemplateConfig." + launchTemplateConfigsListIndex + ".Overrides." + overridesListIndex + ".SpotPrice",
                                    StringUtils.fromString(launchTemplateConfigOverridesListValue.getSpotPrice()));
                        }

                        if (launchTemplateConfigOverridesListValue.getSubnetId() != null) {
                            request.addParameter("LaunchTemplateConfig." + launchTemplateConfigsListIndex + ".Overrides." + overridesListIndex + ".SubnetId",
                                    StringUtils.fromString(launchTemplateConfigOverridesListValue.getSubnetId()));
                        }

                        if (launchTemplateConfigOverridesListValue.getAvailabilityZone() != null) {
                            request.addParameter("LaunchTemplateConfig." + launchTemplateConfigsListIndex + ".Overrides." + overridesListIndex
                                    + ".AvailabilityZone", StringUtils.fromString(launchTemplateConfigOverridesListValue.getAvailabilityZone()));
                        }

                        if (launchTemplateConfigOverridesListValue.getWeightedCapacity() != null) {
                            request.addParameter("LaunchTemplateConfig." + launchTemplateConfigsListIndex + ".Overrides." + overridesListIndex
                                    + ".WeightedCapacity", StringUtils.fromDouble(launchTemplateConfigOverridesListValue.getWeightedCapacity()));
                        }

                        if (launchTemplateConfigOverridesListValue.getPriority() != null) {
                            request.addParameter("LaunchTemplateConfig." + launchTemplateConfigsListIndex + ".Overrides." + overridesListIndex + ".Priority",
                                    StringUtils.fromDouble(launchTemplateConfigOverridesListValue.getPriority()));
                        }

                        InstanceRequirements instanceRequirements = launchTemplateConfigOverridesListValue.getInstanceRequirements();
                        if (instanceRequirements != null) {

                            VCpuCountRange vCpuCount = instanceRequirements.getVCpuCount();
                            if (vCpuCount != null) {

                                if (vCpuCount.getMin() != null) {
                                    request.addParameter("LaunchTemplateConfig." + launchTemplateConfigsListIndex + ".Overrides." + overridesListIndex
                                            + ".InstanceRequirements.VCpuCount.Min", StringUtils.fromInteger(vCpuCount.getMin()));
                                }

                                if (vCpuCount.getMax() != null) {
                                    request.addParameter("LaunchTemplateConfig." + launchTemplateConfigsListIndex + ".Overrides." + overridesListIndex
                                            + ".InstanceRequirements.VCpuCount.Max", StringUtils.fromInteger(vCpuCount.getMax()));
                                }
                            }

                            MemoryMiB memoryMiB = instanceRequirements.getMemoryMiB();
                            if (memoryMiB != null) {

                                if (memoryMiB.getMin() != null) {
                                    request.addParameter("LaunchTemplateConfig." + launchTemplateConfigsListIndex + ".Overrides." + overridesListIndex
                                            + ".InstanceRequirements.MemoryMiB.Min", StringUtils.fromInteger(memoryMiB.getMin()));
                                }

                                if (memoryMiB.getMax() != null) {
                                    request.addParameter("LaunchTemplateConfig." + launchTemplateConfigsListIndex + ".Overrides." + overridesListIndex
                                            + ".InstanceRequirements.MemoryMiB.Max", StringUtils.fromInteger(memoryMiB.getMax()));
                                }
                            }

                            com.amazonaws.internal.SdkInternalList<String> instanceRequirementsCpuManufacturersList = (com.amazonaws.internal.SdkInternalList<String>) instanceRequirements
                                    .getCpuManufacturers();
                            if (!instanceRequirementsCpuManufacturersList.isEmpty() || !instanceRequirementsCpuManufacturersList.isAutoConstruct()) {
                                int cpuManufacturersListIndex = 1;

                                for (String instanceRequirementsCpuManufacturersListValue : instanceRequirementsCpuManufacturersList) {
                                    if (instanceRequirementsCpuManufacturersListValue != null) {
                                        request.addParameter("LaunchTemplateConfig." + launchTemplateConfigsListIndex + ".Overrides." + overridesListIndex
                                                + ".InstanceRequirements.CpuManufacturerSet." + cpuManufacturersListIndex,
                                                StringUtils.fromString(instanceRequirementsCpuManufacturersListValue));
                                    }
                                    cpuManufacturersListIndex++;
                                }
                            }

                            MemoryGiBPerVCpu memoryGiBPerVCpu = instanceRequirements.getMemoryGiBPerVCpu();
                            if (memoryGiBPerVCpu != null) {

                                if (memoryGiBPerVCpu.getMin() != null) {
                                    request.addParameter("LaunchTemplateConfig." + launchTemplateConfigsListIndex + ".Overrides." + overridesListIndex
                                            + ".InstanceRequirements.MemoryGiBPerVCpu.Min", StringUtils.fromDouble(memoryGiBPerVCpu.getMin()));
                                }

                                if (memoryGiBPerVCpu.getMax() != null) {
                                    request.addParameter("LaunchTemplateConfig." + launchTemplateConfigsListIndex + ".Overrides." + overridesListIndex
                                            + ".InstanceRequirements.MemoryGiBPerVCpu.Max", StringUtils.fromDouble(memoryGiBPerVCpu.getMax()));
                                }
                            }

                            com.amazonaws.internal.SdkInternalList<String> instanceRequirementsExcludedInstanceTypesList = (com.amazonaws.internal.SdkInternalList<String>) instanceRequirements
                                    .getExcludedInstanceTypes();
                            if (!instanceRequirementsExcludedInstanceTypesList.isEmpty() || !instanceRequirementsExcludedInstanceTypesList.isAutoConstruct()) {
                                int excludedInstanceTypesListIndex = 1;

                                for (String instanceRequirementsExcludedInstanceTypesListValue : instanceRequirementsExcludedInstanceTypesList) {
                                    if (instanceRequirementsExcludedInstanceTypesListValue != null) {
                                        request.addParameter("LaunchTemplateConfig." + launchTemplateConfigsListIndex + ".Overrides." + overridesListIndex
                                                + ".InstanceRequirements.ExcludedInstanceTypeSet." + excludedInstanceTypesListIndex,
                                                StringUtils.fromString(instanceRequirementsExcludedInstanceTypesListValue));
                                    }
                                    excludedInstanceTypesListIndex++;
                                }
                            }

                            com.amazonaws.internal.SdkInternalList<String> instanceRequirementsInstanceGenerationsList = (com.amazonaws.internal.SdkInternalList<String>) instanceRequirements
                                    .getInstanceGenerations();
                            if (!instanceRequirementsInstanceGenerationsList.isEmpty() || !instanceRequirementsInstanceGenerationsList.isAutoConstruct()) {
                                int instanceGenerationsListIndex = 1;

                                for (String instanceRequirementsInstanceGenerationsListValue : instanceRequirementsInstanceGenerationsList) {
                                    if (instanceRequirementsInstanceGenerationsListValue != null) {
                                        request.addParameter("LaunchTemplateConfig." + launchTemplateConfigsListIndex + ".Overrides." + overridesListIndex
                                                + ".InstanceRequirements.InstanceGenerationSet." + instanceGenerationsListIndex,
                                                StringUtils.fromString(instanceRequirementsInstanceGenerationsListValue));
                                    }
                                    instanceGenerationsListIndex++;
                                }
                            }

                            if (instanceRequirements.getSpotMaxPricePercentageOverLowestPrice() != null) {
                                request.addParameter("LaunchTemplateConfig." + launchTemplateConfigsListIndex + ".Overrides." + overridesListIndex
                                        + ".InstanceRequirements.SpotMaxPricePercentageOverLowestPrice",
                                        StringUtils.fromInteger(instanceRequirements.getSpotMaxPricePercentageOverLowestPrice()));
                            }

                            if (instanceRequirements.getOnDemandMaxPricePercentageOverLowestPrice() != null) {
                                request.addParameter("LaunchTemplateConfig." + launchTemplateConfigsListIndex + ".Overrides." + overridesListIndex
                                        + ".InstanceRequirements.OnDemandMaxPricePercentageOverLowestPrice",
                                        StringUtils.fromInteger(instanceRequirements.getOnDemandMaxPricePercentageOverLowestPrice()));
                            }

                            if (instanceRequirements.getBareMetal() != null) {
                                request.addParameter("LaunchTemplateConfig." + launchTemplateConfigsListIndex + ".Overrides." + overridesListIndex
                                        + ".InstanceRequirements.BareMetal", StringUtils.fromString(instanceRequirements.getBareMetal()));
                            }

                            if (instanceRequirements.getBurstablePerformance() != null) {
                                request.addParameter("LaunchTemplateConfig." + launchTemplateConfigsListIndex + ".Overrides." + overridesListIndex
                                        + ".InstanceRequirements.BurstablePerformance", StringUtils.fromString(instanceRequirements.getBurstablePerformance()));
                            }

                            if (instanceRequirements.getRequireHibernateSupport() != null) {
                                request.addParameter("LaunchTemplateConfig." + launchTemplateConfigsListIndex + ".Overrides." + overridesListIndex
                                        + ".InstanceRequirements.RequireHibernateSupport",
                                        StringUtils.fromBoolean(instanceRequirements.getRequireHibernateSupport()));
                            }

                            NetworkInterfaceCount networkInterfaceCount = instanceRequirements.getNetworkInterfaceCount();
                            if (networkInterfaceCount != null) {

                                if (networkInterfaceCount.getMin() != null) {
                                    request.addParameter("LaunchTemplateConfig." + launchTemplateConfigsListIndex + ".Overrides." + overridesListIndex
                                            + ".InstanceRequirements.NetworkInterfaceCount.Min", StringUtils.fromInteger(networkInterfaceCount.getMin()));
                                }

                                if (networkInterfaceCount.getMax() != null) {
                                    request.addParameter("LaunchTemplateConfig." + launchTemplateConfigsListIndex + ".Overrides." + overridesListIndex
                                            + ".InstanceRequirements.NetworkInterfaceCount.Max", StringUtils.fromInteger(networkInterfaceCount.getMax()));
                                }
                            }

                            if (instanceRequirements.getLocalStorage() != null) {
                                request.addParameter("LaunchTemplateConfig." + launchTemplateConfigsListIndex + ".Overrides." + overridesListIndex
                                        + ".InstanceRequirements.LocalStorage", StringUtils.fromString(instanceRequirements.getLocalStorage()));
                            }

                            com.amazonaws.internal.SdkInternalList<String> instanceRequirementsLocalStorageTypesList = (com.amazonaws.internal.SdkInternalList<String>) instanceRequirements
                                    .getLocalStorageTypes();
                            if (!instanceRequirementsLocalStorageTypesList.isEmpty() || !instanceRequirementsLocalStorageTypesList.isAutoConstruct()) {
                                int localStorageTypesListIndex = 1;

                                for (String instanceRequirementsLocalStorageTypesListValue : instanceRequirementsLocalStorageTypesList) {
                                    if (instanceRequirementsLocalStorageTypesListValue != null) {
                                        request.addParameter("LaunchTemplateConfig." + launchTemplateConfigsListIndex + ".Overrides." + overridesListIndex
                                                + ".InstanceRequirements.LocalStorageTypeSet." + localStorageTypesListIndex,
                                                StringUtils.fromString(instanceRequirementsLocalStorageTypesListValue));
                                    }
                                    localStorageTypesListIndex++;
                                }
                            }

                            TotalLocalStorageGB totalLocalStorageGB = instanceRequirements.getTotalLocalStorageGB();
                            if (totalLocalStorageGB != null) {

                                if (totalLocalStorageGB.getMin() != null) {
                                    request.addParameter("LaunchTemplateConfig." + launchTemplateConfigsListIndex + ".Overrides." + overridesListIndex
                                            + ".InstanceRequirements.TotalLocalStorageGB.Min", StringUtils.fromDouble(totalLocalStorageGB.getMin()));
                                }

                                if (totalLocalStorageGB.getMax() != null) {
                                    request.addParameter("LaunchTemplateConfig." + launchTemplateConfigsListIndex + ".Overrides." + overridesListIndex
                                            + ".InstanceRequirements.TotalLocalStorageGB.Max", StringUtils.fromDouble(totalLocalStorageGB.getMax()));
                                }
                            }

                            BaselineEbsBandwidthMbps baselineEbsBandwidthMbps = instanceRequirements.getBaselineEbsBandwidthMbps();
                            if (baselineEbsBandwidthMbps != null) {

                                if (baselineEbsBandwidthMbps.getMin() != null) {
                                    request.addParameter("LaunchTemplateConfig." + launchTemplateConfigsListIndex + ".Overrides." + overridesListIndex
                                            + ".InstanceRequirements.BaselineEbsBandwidthMbps.Min", StringUtils.fromInteger(baselineEbsBandwidthMbps.getMin()));
                                }

                                if (baselineEbsBandwidthMbps.getMax() != null) {
                                    request.addParameter("LaunchTemplateConfig." + launchTemplateConfigsListIndex + ".Overrides." + overridesListIndex
                                            + ".InstanceRequirements.BaselineEbsBandwidthMbps.Max", StringUtils.fromInteger(baselineEbsBandwidthMbps.getMax()));
                                }
                            }

                            com.amazonaws.internal.SdkInternalList<String> instanceRequirementsAcceleratorTypesList = (com.amazonaws.internal.SdkInternalList<String>) instanceRequirements
                                    .getAcceleratorTypes();
                            if (!instanceRequirementsAcceleratorTypesList.isEmpty() || !instanceRequirementsAcceleratorTypesList.isAutoConstruct()) {
                                int acceleratorTypesListIndex = 1;

                                for (String instanceRequirementsAcceleratorTypesListValue : instanceRequirementsAcceleratorTypesList) {
                                    if (instanceRequirementsAcceleratorTypesListValue != null) {
                                        request.addParameter("LaunchTemplateConfig." + launchTemplateConfigsListIndex + ".Overrides." + overridesListIndex
                                                + ".InstanceRequirements.AcceleratorTypeSet." + acceleratorTypesListIndex,
                                                StringUtils.fromString(instanceRequirementsAcceleratorTypesListValue));
                                    }
                                    acceleratorTypesListIndex++;
                                }
                            }

                            AcceleratorCount acceleratorCount = instanceRequirements.getAcceleratorCount();
                            if (acceleratorCount != null) {

                                if (acceleratorCount.getMin() != null) {
                                    request.addParameter("LaunchTemplateConfig." + launchTemplateConfigsListIndex + ".Overrides." + overridesListIndex
                                            + ".InstanceRequirements.AcceleratorCount.Min", StringUtils.fromInteger(acceleratorCount.getMin()));
                                }

                                if (acceleratorCount.getMax() != null) {
                                    request.addParameter("LaunchTemplateConfig." + launchTemplateConfigsListIndex + ".Overrides." + overridesListIndex
                                            + ".InstanceRequirements.AcceleratorCount.Max", StringUtils.fromInteger(acceleratorCount.getMax()));
                                }
                            }

                            com.amazonaws.internal.SdkInternalList<String> instanceRequirementsAcceleratorManufacturersList = (com.amazonaws.internal.SdkInternalList<String>) instanceRequirements
                                    .getAcceleratorManufacturers();
                            if (!instanceRequirementsAcceleratorManufacturersList.isEmpty()
                                    || !instanceRequirementsAcceleratorManufacturersList.isAutoConstruct()) {
                                int acceleratorManufacturersListIndex = 1;

                                for (String instanceRequirementsAcceleratorManufacturersListValue : instanceRequirementsAcceleratorManufacturersList) {
                                    if (instanceRequirementsAcceleratorManufacturersListValue != null) {
                                        request.addParameter("LaunchTemplateConfig." + launchTemplateConfigsListIndex + ".Overrides." + overridesListIndex
                                                + ".InstanceRequirements.AcceleratorManufacturerSet." + acceleratorManufacturersListIndex,
                                                StringUtils.fromString(instanceRequirementsAcceleratorManufacturersListValue));
                                    }
                                    acceleratorManufacturersListIndex++;
                                }
                            }

                            com.amazonaws.internal.SdkInternalList<String> instanceRequirementsAcceleratorNamesList = (com.amazonaws.internal.SdkInternalList<String>) instanceRequirements
                                    .getAcceleratorNames();
                            if (!instanceRequirementsAcceleratorNamesList.isEmpty() || !instanceRequirementsAcceleratorNamesList.isAutoConstruct()) {
                                int acceleratorNamesListIndex = 1;

                                for (String instanceRequirementsAcceleratorNamesListValue : instanceRequirementsAcceleratorNamesList) {
                                    if (instanceRequirementsAcceleratorNamesListValue != null) {
                                        request.addParameter("LaunchTemplateConfig." + launchTemplateConfigsListIndex + ".Overrides." + overridesListIndex
                                                + ".InstanceRequirements.AcceleratorNameSet." + acceleratorNamesListIndex,
                                                StringUtils.fromString(instanceRequirementsAcceleratorNamesListValue));
                                    }
                                    acceleratorNamesListIndex++;
                                }
                            }

                            AcceleratorTotalMemoryMiB acceleratorTotalMemoryMiB = instanceRequirements.getAcceleratorTotalMemoryMiB();
                            if (acceleratorTotalMemoryMiB != null) {

                                if (acceleratorTotalMemoryMiB.getMin() != null) {
                                    request.addParameter("LaunchTemplateConfig." + launchTemplateConfigsListIndex + ".Overrides." + overridesListIndex
                                            + ".InstanceRequirements.AcceleratorTotalMemoryMiB.Min",
                                            StringUtils.fromInteger(acceleratorTotalMemoryMiB.getMin()));
                                }

                                if (acceleratorTotalMemoryMiB.getMax() != null) {
                                    request.addParameter("LaunchTemplateConfig." + launchTemplateConfigsListIndex + ".Overrides." + overridesListIndex
                                            + ".InstanceRequirements.AcceleratorTotalMemoryMiB.Max",
                                            StringUtils.fromInteger(acceleratorTotalMemoryMiB.getMax()));
                                }
                            }

                            NetworkBandwidthGbps networkBandwidthGbps = instanceRequirements.getNetworkBandwidthGbps();
                            if (networkBandwidthGbps != null) {

                                if (networkBandwidthGbps.getMin() != null) {
                                    request.addParameter("LaunchTemplateConfig." + launchTemplateConfigsListIndex + ".Overrides." + overridesListIndex
                                            + ".InstanceRequirements.NetworkBandwidthGbps.Min", StringUtils.fromDouble(networkBandwidthGbps.getMin()));
                                }

                                if (networkBandwidthGbps.getMax() != null) {
                                    request.addParameter("LaunchTemplateConfig." + launchTemplateConfigsListIndex + ".Overrides." + overridesListIndex
                                            + ".InstanceRequirements.NetworkBandwidthGbps.Max", StringUtils.fromDouble(networkBandwidthGbps.getMax()));
                                }
                            }

                            com.amazonaws.internal.SdkInternalList<String> instanceRequirementsAllowedInstanceTypesList = (com.amazonaws.internal.SdkInternalList<String>) instanceRequirements
                                    .getAllowedInstanceTypes();
                            if (!instanceRequirementsAllowedInstanceTypesList.isEmpty() || !instanceRequirementsAllowedInstanceTypesList.isAutoConstruct()) {
                                int allowedInstanceTypesListIndex = 1;

                                for (String instanceRequirementsAllowedInstanceTypesListValue : instanceRequirementsAllowedInstanceTypesList) {
                                    if (instanceRequirementsAllowedInstanceTypesListValue != null) {
                                        request.addParameter("LaunchTemplateConfig." + launchTemplateConfigsListIndex + ".Overrides." + overridesListIndex
                                                + ".InstanceRequirements.AllowedInstanceTypeSet." + allowedInstanceTypesListIndex,
                                                StringUtils.fromString(instanceRequirementsAllowedInstanceTypesListValue));
                                    }
                                    allowedInstanceTypesListIndex++;
                                }
                            }
                        }
                        overridesListIndex++;
                    }
                }
                launchTemplateConfigsListIndex++;
            }
        }

        if (modifySpotFleetRequestRequest.getSpotFleetRequestId() != null) {
            request.addParameter("SpotFleetRequestId", StringUtils.fromString(modifySpotFleetRequestRequest.getSpotFleetRequestId()));
        }

        if (modifySpotFleetRequestRequest.getTargetCapacity() != null) {
            request.addParameter("TargetCapacity", StringUtils.fromInteger(modifySpotFleetRequestRequest.getTargetCapacity()));
        }

        if (modifySpotFleetRequestRequest.getOnDemandTargetCapacity() != null) {
            request.addParameter("OnDemandTargetCapacity", StringUtils.fromInteger(modifySpotFleetRequestRequest.getOnDemandTargetCapacity()));
        }

        if (modifySpotFleetRequestRequest.getContext() != null) {
            request.addParameter("Context", StringUtils.fromString(modifySpotFleetRequestRequest.getContext()));
        }

        return request;
    }

}
