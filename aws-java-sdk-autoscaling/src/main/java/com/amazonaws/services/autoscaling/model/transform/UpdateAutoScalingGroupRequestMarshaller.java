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
                                if (overridesListValue != null) {

                                    if (overridesListValue.getInstanceType() != null) {
                                        request.addParameter("MixedInstancesPolicy.LaunchTemplate.Overrides.member." + overridesListIndex + ".InstanceType",
                                                StringUtils.fromString(overridesListValue.getInstanceType()));
                                    }

                                    if (overridesListValue.getWeightedCapacity() != null) {
                                        request.addParameter(
                                                "MixedInstancesPolicy.LaunchTemplate.Overrides.member." + overridesListIndex + ".WeightedCapacity",
                                                StringUtils.fromString(overridesListValue.getWeightedCapacity()));
                                    }

                                    {
                                        LaunchTemplateSpecification launchTemplateSpecification = overridesListValue.getLaunchTemplateSpecification();
                                        if (launchTemplateSpecification != null) {

                                            if (launchTemplateSpecification.getLaunchTemplateId() != null) {
                                                request.addParameter("MixedInstancesPolicy.LaunchTemplate.Overrides.member." + overridesListIndex
                                                        + ".LaunchTemplateSpecification.LaunchTemplateId",
                                                        StringUtils.fromString(launchTemplateSpecification.getLaunchTemplateId()));
                                            }

                                            if (launchTemplateSpecification.getLaunchTemplateName() != null) {
                                                request.addParameter("MixedInstancesPolicy.LaunchTemplate.Overrides.member." + overridesListIndex
                                                        + ".LaunchTemplateSpecification.LaunchTemplateName",
                                                        StringUtils.fromString(launchTemplateSpecification.getLaunchTemplateName()));
                                            }

                                            if (launchTemplateSpecification.getVersion() != null) {
                                                request.addParameter("MixedInstancesPolicy.LaunchTemplate.Overrides.member." + overridesListIndex
                                                        + ".LaunchTemplateSpecification.Version",
                                                        StringUtils.fromString(launchTemplateSpecification.getVersion()));
                                            }
                                        }
                                    }

                                    {
                                        InstanceRequirements instanceRequirements = overridesListValue.getInstanceRequirements();
                                        if (instanceRequirements != null) {

                                            {
                                                VCpuCountRequest vCpuCount = instanceRequirements.getVCpuCount();
                                                if (vCpuCount != null) {

                                                    if (vCpuCount.getMin() != null) {
                                                        request.addParameter("MixedInstancesPolicy.LaunchTemplate.Overrides.member." + overridesListIndex
                                                                + ".InstanceRequirements.VCpuCount.Min", StringUtils.fromInteger(vCpuCount.getMin()));
                                                    }

                                                    if (vCpuCount.getMax() != null) {
                                                        request.addParameter("MixedInstancesPolicy.LaunchTemplate.Overrides.member." + overridesListIndex
                                                                + ".InstanceRequirements.VCpuCount.Max", StringUtils.fromInteger(vCpuCount.getMax()));
                                                    }
                                                }
                                            }

                                            {
                                                MemoryMiBRequest memoryMiB = instanceRequirements.getMemoryMiB();
                                                if (memoryMiB != null) {

                                                    if (memoryMiB.getMin() != null) {
                                                        request.addParameter("MixedInstancesPolicy.LaunchTemplate.Overrides.member." + overridesListIndex
                                                                + ".InstanceRequirements.MemoryMiB.Min", StringUtils.fromInteger(memoryMiB.getMin()));
                                                    }

                                                    if (memoryMiB.getMax() != null) {
                                                        request.addParameter("MixedInstancesPolicy.LaunchTemplate.Overrides.member." + overridesListIndex
                                                                + ".InstanceRequirements.MemoryMiB.Max", StringUtils.fromInteger(memoryMiB.getMax()));
                                                    }
                                                }
                                            }

                                            if (!instanceRequirements.getCpuManufacturers().isEmpty()
                                                    || !((com.amazonaws.internal.SdkInternalList<String>) instanceRequirements.getCpuManufacturers())
                                                            .isAutoConstruct()) {
                                                com.amazonaws.internal.SdkInternalList<String> cpuManufacturersList = (com.amazonaws.internal.SdkInternalList<String>) instanceRequirements
                                                        .getCpuManufacturers();
                                                int cpuManufacturersListIndex = 1;

                                                for (String cpuManufacturersListValue : cpuManufacturersList) {
                                                    if (cpuManufacturersListValue != null) {
                                                        request.addParameter("MixedInstancesPolicy.LaunchTemplate.Overrides.member." + overridesListIndex
                                                                + ".InstanceRequirements.CpuManufacturers.member." + cpuManufacturersListIndex,
                                                                StringUtils.fromString(cpuManufacturersListValue));
                                                    }
                                                    cpuManufacturersListIndex++;
                                                }
                                            }

                                            {
                                                MemoryGiBPerVCpuRequest memoryGiBPerVCpu = instanceRequirements.getMemoryGiBPerVCpu();
                                                if (memoryGiBPerVCpu != null) {

                                                    if (memoryGiBPerVCpu.getMin() != null) {
                                                        request.addParameter("MixedInstancesPolicy.LaunchTemplate.Overrides.member." + overridesListIndex
                                                                + ".InstanceRequirements.MemoryGiBPerVCpu.Min",
                                                                StringUtils.fromDouble(memoryGiBPerVCpu.getMin()));
                                                    }

                                                    if (memoryGiBPerVCpu.getMax() != null) {
                                                        request.addParameter("MixedInstancesPolicy.LaunchTemplate.Overrides.member." + overridesListIndex
                                                                + ".InstanceRequirements.MemoryGiBPerVCpu.Max",
                                                                StringUtils.fromDouble(memoryGiBPerVCpu.getMax()));
                                                    }
                                                }
                                            }

                                            if (!instanceRequirements.getExcludedInstanceTypes().isEmpty()
                                                    || !((com.amazonaws.internal.SdkInternalList<String>) instanceRequirements.getExcludedInstanceTypes())
                                                            .isAutoConstruct()) {
                                                com.amazonaws.internal.SdkInternalList<String> excludedInstanceTypesList = (com.amazonaws.internal.SdkInternalList<String>) instanceRequirements
                                                        .getExcludedInstanceTypes();
                                                int excludedInstanceTypesListIndex = 1;

                                                for (String excludedInstanceTypesListValue : excludedInstanceTypesList) {
                                                    if (excludedInstanceTypesListValue != null) {
                                                        request.addParameter("MixedInstancesPolicy.LaunchTemplate.Overrides.member." + overridesListIndex
                                                                + ".InstanceRequirements.ExcludedInstanceTypes.member." + excludedInstanceTypesListIndex,
                                                                StringUtils.fromString(excludedInstanceTypesListValue));
                                                    }
                                                    excludedInstanceTypesListIndex++;
                                                }
                                            }

                                            if (!instanceRequirements.getInstanceGenerations().isEmpty()
                                                    || !((com.amazonaws.internal.SdkInternalList<String>) instanceRequirements.getInstanceGenerations())
                                                            .isAutoConstruct()) {
                                                com.amazonaws.internal.SdkInternalList<String> instanceGenerationsList = (com.amazonaws.internal.SdkInternalList<String>) instanceRequirements
                                                        .getInstanceGenerations();
                                                int instanceGenerationsListIndex = 1;

                                                for (String instanceGenerationsListValue : instanceGenerationsList) {
                                                    if (instanceGenerationsListValue != null) {
                                                        request.addParameter("MixedInstancesPolicy.LaunchTemplate.Overrides.member." + overridesListIndex
                                                                + ".InstanceRequirements.InstanceGenerations.member." + instanceGenerationsListIndex,
                                                                StringUtils.fromString(instanceGenerationsListValue));
                                                    }
                                                    instanceGenerationsListIndex++;
                                                }
                                            }

                                            if (instanceRequirements.getSpotMaxPricePercentageOverLowestPrice() != null) {
                                                request.addParameter("MixedInstancesPolicy.LaunchTemplate.Overrides.member." + overridesListIndex
                                                        + ".InstanceRequirements.SpotMaxPricePercentageOverLowestPrice",
                                                        StringUtils.fromInteger(instanceRequirements.getSpotMaxPricePercentageOverLowestPrice()));
                                            }

                                            if (instanceRequirements.getOnDemandMaxPricePercentageOverLowestPrice() != null) {
                                                request.addParameter("MixedInstancesPolicy.LaunchTemplate.Overrides.member." + overridesListIndex
                                                        + ".InstanceRequirements.OnDemandMaxPricePercentageOverLowestPrice",
                                                        StringUtils.fromInteger(instanceRequirements.getOnDemandMaxPricePercentageOverLowestPrice()));
                                            }

                                            if (instanceRequirements.getBareMetal() != null) {
                                                request.addParameter("MixedInstancesPolicy.LaunchTemplate.Overrides.member." + overridesListIndex
                                                        + ".InstanceRequirements.BareMetal", StringUtils.fromString(instanceRequirements.getBareMetal()));
                                            }

                                            if (instanceRequirements.getBurstablePerformance() != null) {
                                                request.addParameter("MixedInstancesPolicy.LaunchTemplate.Overrides.member." + overridesListIndex
                                                        + ".InstanceRequirements.BurstablePerformance",
                                                        StringUtils.fromString(instanceRequirements.getBurstablePerformance()));
                                            }

                                            if (instanceRequirements.getRequireHibernateSupport() != null) {
                                                request.addParameter("MixedInstancesPolicy.LaunchTemplate.Overrides.member." + overridesListIndex
                                                        + ".InstanceRequirements.RequireHibernateSupport",
                                                        StringUtils.fromBoolean(instanceRequirements.getRequireHibernateSupport()));
                                            }

                                            {
                                                NetworkInterfaceCountRequest networkInterfaceCount = instanceRequirements.getNetworkInterfaceCount();
                                                if (networkInterfaceCount != null) {

                                                    if (networkInterfaceCount.getMin() != null) {
                                                        request.addParameter("MixedInstancesPolicy.LaunchTemplate.Overrides.member." + overridesListIndex
                                                                + ".InstanceRequirements.NetworkInterfaceCount.Min",
                                                                StringUtils.fromInteger(networkInterfaceCount.getMin()));
                                                    }

                                                    if (networkInterfaceCount.getMax() != null) {
                                                        request.addParameter("MixedInstancesPolicy.LaunchTemplate.Overrides.member." + overridesListIndex
                                                                + ".InstanceRequirements.NetworkInterfaceCount.Max",
                                                                StringUtils.fromInteger(networkInterfaceCount.getMax()));
                                                    }
                                                }
                                            }

                                            if (instanceRequirements.getLocalStorage() != null) {
                                                request.addParameter("MixedInstancesPolicy.LaunchTemplate.Overrides.member." + overridesListIndex
                                                        + ".InstanceRequirements.LocalStorage", StringUtils.fromString(instanceRequirements.getLocalStorage()));
                                            }

                                            if (!instanceRequirements.getLocalStorageTypes().isEmpty()
                                                    || !((com.amazonaws.internal.SdkInternalList<String>) instanceRequirements.getLocalStorageTypes())
                                                            .isAutoConstruct()) {
                                                com.amazonaws.internal.SdkInternalList<String> localStorageTypesList = (com.amazonaws.internal.SdkInternalList<String>) instanceRequirements
                                                        .getLocalStorageTypes();
                                                int localStorageTypesListIndex = 1;

                                                for (String localStorageTypesListValue : localStorageTypesList) {
                                                    if (localStorageTypesListValue != null) {
                                                        request.addParameter("MixedInstancesPolicy.LaunchTemplate.Overrides.member." + overridesListIndex
                                                                + ".InstanceRequirements.LocalStorageTypes.member." + localStorageTypesListIndex,
                                                                StringUtils.fromString(localStorageTypesListValue));
                                                    }
                                                    localStorageTypesListIndex++;
                                                }
                                            }

                                            {
                                                TotalLocalStorageGBRequest totalLocalStorageGB = instanceRequirements.getTotalLocalStorageGB();
                                                if (totalLocalStorageGB != null) {

                                                    if (totalLocalStorageGB.getMin() != null) {
                                                        request.addParameter("MixedInstancesPolicy.LaunchTemplate.Overrides.member." + overridesListIndex
                                                                + ".InstanceRequirements.TotalLocalStorageGB.Min",
                                                                StringUtils.fromDouble(totalLocalStorageGB.getMin()));
                                                    }

                                                    if (totalLocalStorageGB.getMax() != null) {
                                                        request.addParameter("MixedInstancesPolicy.LaunchTemplate.Overrides.member." + overridesListIndex
                                                                + ".InstanceRequirements.TotalLocalStorageGB.Max",
                                                                StringUtils.fromDouble(totalLocalStorageGB.getMax()));
                                                    }
                                                }
                                            }

                                            {
                                                BaselineEbsBandwidthMbpsRequest baselineEbsBandwidthMbps = instanceRequirements.getBaselineEbsBandwidthMbps();
                                                if (baselineEbsBandwidthMbps != null) {

                                                    if (baselineEbsBandwidthMbps.getMin() != null) {
                                                        request.addParameter("MixedInstancesPolicy.LaunchTemplate.Overrides.member." + overridesListIndex
                                                                + ".InstanceRequirements.BaselineEbsBandwidthMbps.Min",
                                                                StringUtils.fromInteger(baselineEbsBandwidthMbps.getMin()));
                                                    }

                                                    if (baselineEbsBandwidthMbps.getMax() != null) {
                                                        request.addParameter("MixedInstancesPolicy.LaunchTemplate.Overrides.member." + overridesListIndex
                                                                + ".InstanceRequirements.BaselineEbsBandwidthMbps.Max",
                                                                StringUtils.fromInteger(baselineEbsBandwidthMbps.getMax()));
                                                    }
                                                }
                                            }

                                            if (!instanceRequirements.getAcceleratorTypes().isEmpty()
                                                    || !((com.amazonaws.internal.SdkInternalList<String>) instanceRequirements.getAcceleratorTypes())
                                                            .isAutoConstruct()) {
                                                com.amazonaws.internal.SdkInternalList<String> acceleratorTypesList = (com.amazonaws.internal.SdkInternalList<String>) instanceRequirements
                                                        .getAcceleratorTypes();
                                                int acceleratorTypesListIndex = 1;

                                                for (String acceleratorTypesListValue : acceleratorTypesList) {
                                                    if (acceleratorTypesListValue != null) {
                                                        request.addParameter("MixedInstancesPolicy.LaunchTemplate.Overrides.member." + overridesListIndex
                                                                + ".InstanceRequirements.AcceleratorTypes.member." + acceleratorTypesListIndex,
                                                                StringUtils.fromString(acceleratorTypesListValue));
                                                    }
                                                    acceleratorTypesListIndex++;
                                                }
                                            }

                                            {
                                                AcceleratorCountRequest acceleratorCount = instanceRequirements.getAcceleratorCount();
                                                if (acceleratorCount != null) {

                                                    if (acceleratorCount.getMin() != null) {
                                                        request.addParameter("MixedInstancesPolicy.LaunchTemplate.Overrides.member." + overridesListIndex
                                                                + ".InstanceRequirements.AcceleratorCount.Min",
                                                                StringUtils.fromInteger(acceleratorCount.getMin()));
                                                    }

                                                    if (acceleratorCount.getMax() != null) {
                                                        request.addParameter("MixedInstancesPolicy.LaunchTemplate.Overrides.member." + overridesListIndex
                                                                + ".InstanceRequirements.AcceleratorCount.Max",
                                                                StringUtils.fromInteger(acceleratorCount.getMax()));
                                                    }
                                                }
                                            }

                                            if (!instanceRequirements.getAcceleratorManufacturers().isEmpty()
                                                    || !((com.amazonaws.internal.SdkInternalList<String>) instanceRequirements.getAcceleratorManufacturers())
                                                            .isAutoConstruct()) {
                                                com.amazonaws.internal.SdkInternalList<String> acceleratorManufacturersList = (com.amazonaws.internal.SdkInternalList<String>) instanceRequirements
                                                        .getAcceleratorManufacturers();
                                                int acceleratorManufacturersListIndex = 1;

                                                for (String acceleratorManufacturersListValue : acceleratorManufacturersList) {
                                                    if (acceleratorManufacturersListValue != null) {
                                                        request.addParameter("MixedInstancesPolicy.LaunchTemplate.Overrides.member." + overridesListIndex
                                                                + ".InstanceRequirements.AcceleratorManufacturers.member." + acceleratorManufacturersListIndex,
                                                                StringUtils.fromString(acceleratorManufacturersListValue));
                                                    }
                                                    acceleratorManufacturersListIndex++;
                                                }
                                            }

                                            if (!instanceRequirements.getAcceleratorNames().isEmpty()
                                                    || !((com.amazonaws.internal.SdkInternalList<String>) instanceRequirements.getAcceleratorNames())
                                                            .isAutoConstruct()) {
                                                com.amazonaws.internal.SdkInternalList<String> acceleratorNamesList = (com.amazonaws.internal.SdkInternalList<String>) instanceRequirements
                                                        .getAcceleratorNames();
                                                int acceleratorNamesListIndex = 1;

                                                for (String acceleratorNamesListValue : acceleratorNamesList) {
                                                    if (acceleratorNamesListValue != null) {
                                                        request.addParameter("MixedInstancesPolicy.LaunchTemplate.Overrides.member." + overridesListIndex
                                                                + ".InstanceRequirements.AcceleratorNames.member." + acceleratorNamesListIndex,
                                                                StringUtils.fromString(acceleratorNamesListValue));
                                                    }
                                                    acceleratorNamesListIndex++;
                                                }
                                            }

                                            {
                                                AcceleratorTotalMemoryMiBRequest acceleratorTotalMemoryMiB = instanceRequirements
                                                        .getAcceleratorTotalMemoryMiB();
                                                if (acceleratorTotalMemoryMiB != null) {

                                                    if (acceleratorTotalMemoryMiB.getMin() != null) {
                                                        request.addParameter("MixedInstancesPolicy.LaunchTemplate.Overrides.member." + overridesListIndex
                                                                + ".InstanceRequirements.AcceleratorTotalMemoryMiB.Min",
                                                                StringUtils.fromInteger(acceleratorTotalMemoryMiB.getMin()));
                                                    }

                                                    if (acceleratorTotalMemoryMiB.getMax() != null) {
                                                        request.addParameter("MixedInstancesPolicy.LaunchTemplate.Overrides.member." + overridesListIndex
                                                                + ".InstanceRequirements.AcceleratorTotalMemoryMiB.Max",
                                                                StringUtils.fromInteger(acceleratorTotalMemoryMiB.getMax()));
                                                    }
                                                }
                                            }

                                            {
                                                NetworkBandwidthGbpsRequest networkBandwidthGbps = instanceRequirements.getNetworkBandwidthGbps();
                                                if (networkBandwidthGbps != null) {

                                                    if (networkBandwidthGbps.getMin() != null) {
                                                        request.addParameter("MixedInstancesPolicy.LaunchTemplate.Overrides.member." + overridesListIndex
                                                                + ".InstanceRequirements.NetworkBandwidthGbps.Min",
                                                                StringUtils.fromDouble(networkBandwidthGbps.getMin()));
                                                    }

                                                    if (networkBandwidthGbps.getMax() != null) {
                                                        request.addParameter("MixedInstancesPolicy.LaunchTemplate.Overrides.member." + overridesListIndex
                                                                + ".InstanceRequirements.NetworkBandwidthGbps.Max",
                                                                StringUtils.fromDouble(networkBandwidthGbps.getMax()));
                                                    }
                                                }
                                            }

                                            if (!instanceRequirements.getAllowedInstanceTypes().isEmpty()
                                                    || !((com.amazonaws.internal.SdkInternalList<String>) instanceRequirements.getAllowedInstanceTypes())
                                                            .isAutoConstruct()) {
                                                com.amazonaws.internal.SdkInternalList<String> allowedInstanceTypesList = (com.amazonaws.internal.SdkInternalList<String>) instanceRequirements
                                                        .getAllowedInstanceTypes();
                                                int allowedInstanceTypesListIndex = 1;

                                                for (String allowedInstanceTypesListValue : allowedInstanceTypesList) {
                                                    if (allowedInstanceTypesListValue != null) {
                                                        request.addParameter("MixedInstancesPolicy.LaunchTemplate.Overrides.member." + overridesListIndex
                                                                + ".InstanceRequirements.AllowedInstanceTypes.member." + allowedInstanceTypesListIndex,
                                                                StringUtils.fromString(allowedInstanceTypesListValue));
                                                    }
                                                    allowedInstanceTypesListIndex++;
                                                }
                                            }
                                        }
                                    }
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

        if (updateAutoScalingGroupRequest.getMaxInstanceLifetime() != null) {
            request.addParameter("MaxInstanceLifetime", StringUtils.fromInteger(updateAutoScalingGroupRequest.getMaxInstanceLifetime()));
        }

        if (updateAutoScalingGroupRequest.getCapacityRebalance() != null) {
            request.addParameter("CapacityRebalance", StringUtils.fromBoolean(updateAutoScalingGroupRequest.getCapacityRebalance()));
        }

        if (updateAutoScalingGroupRequest.getContext() != null) {
            request.addParameter("Context", StringUtils.fromString(updateAutoScalingGroupRequest.getContext()));
        }

        if (updateAutoScalingGroupRequest.getDesiredCapacityType() != null) {
            request.addParameter("DesiredCapacityType", StringUtils.fromString(updateAutoScalingGroupRequest.getDesiredCapacityType()));
        }

        if (updateAutoScalingGroupRequest.getDefaultInstanceWarmup() != null) {
            request.addParameter("DefaultInstanceWarmup", StringUtils.fromInteger(updateAutoScalingGroupRequest.getDefaultInstanceWarmup()));
        }

        return request;
    }

}
