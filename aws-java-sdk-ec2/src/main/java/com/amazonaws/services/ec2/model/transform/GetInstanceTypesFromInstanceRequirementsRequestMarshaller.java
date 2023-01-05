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
 * GetInstanceTypesFromInstanceRequirementsRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetInstanceTypesFromInstanceRequirementsRequestMarshaller implements
        Marshaller<Request<GetInstanceTypesFromInstanceRequirementsRequest>, GetInstanceTypesFromInstanceRequirementsRequest> {

    public Request<GetInstanceTypesFromInstanceRequirementsRequest> marshall(
            GetInstanceTypesFromInstanceRequirementsRequest getInstanceTypesFromInstanceRequirementsRequest) {

        if (getInstanceTypesFromInstanceRequirementsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<GetInstanceTypesFromInstanceRequirementsRequest> request = new DefaultRequest<GetInstanceTypesFromInstanceRequirementsRequest>(
                getInstanceTypesFromInstanceRequirementsRequest, "AmazonEC2");
        request.addParameter("Action", "GetInstanceTypesFromInstanceRequirements");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        com.amazonaws.internal.SdkInternalList<String> getInstanceTypesFromInstanceRequirementsRequestArchitectureTypesList = (com.amazonaws.internal.SdkInternalList<String>) getInstanceTypesFromInstanceRequirementsRequest
                .getArchitectureTypes();
        if (!getInstanceTypesFromInstanceRequirementsRequestArchitectureTypesList.isEmpty()
                || !getInstanceTypesFromInstanceRequirementsRequestArchitectureTypesList.isAutoConstruct()) {
            int architectureTypesListIndex = 1;

            for (String getInstanceTypesFromInstanceRequirementsRequestArchitectureTypesListValue : getInstanceTypesFromInstanceRequirementsRequestArchitectureTypesList) {
                if (getInstanceTypesFromInstanceRequirementsRequestArchitectureTypesListValue != null) {
                    request.addParameter("ArchitectureType." + architectureTypesListIndex,
                            StringUtils.fromString(getInstanceTypesFromInstanceRequirementsRequestArchitectureTypesListValue));
                }
                architectureTypesListIndex++;
            }
        }

        com.amazonaws.internal.SdkInternalList<String> getInstanceTypesFromInstanceRequirementsRequestVirtualizationTypesList = (com.amazonaws.internal.SdkInternalList<String>) getInstanceTypesFromInstanceRequirementsRequest
                .getVirtualizationTypes();
        if (!getInstanceTypesFromInstanceRequirementsRequestVirtualizationTypesList.isEmpty()
                || !getInstanceTypesFromInstanceRequirementsRequestVirtualizationTypesList.isAutoConstruct()) {
            int virtualizationTypesListIndex = 1;

            for (String getInstanceTypesFromInstanceRequirementsRequestVirtualizationTypesListValue : getInstanceTypesFromInstanceRequirementsRequestVirtualizationTypesList) {
                if (getInstanceTypesFromInstanceRequirementsRequestVirtualizationTypesListValue != null) {
                    request.addParameter("VirtualizationType." + virtualizationTypesListIndex,
                            StringUtils.fromString(getInstanceTypesFromInstanceRequirementsRequestVirtualizationTypesListValue));
                }
                virtualizationTypesListIndex++;
            }
        }

        InstanceRequirementsRequest instanceRequirements = getInstanceTypesFromInstanceRequirementsRequest.getInstanceRequirements();
        if (instanceRequirements != null) {

            VCpuCountRangeRequest vCpuCount = instanceRequirements.getVCpuCount();
            if (vCpuCount != null) {

                if (vCpuCount.getMin() != null) {
                    request.addParameter("InstanceRequirements.VCpuCount.Min", StringUtils.fromInteger(vCpuCount.getMin()));
                }

                if (vCpuCount.getMax() != null) {
                    request.addParameter("InstanceRequirements.VCpuCount.Max", StringUtils.fromInteger(vCpuCount.getMax()));
                }
            }

            MemoryMiBRequest memoryMiB = instanceRequirements.getMemoryMiB();
            if (memoryMiB != null) {

                if (memoryMiB.getMin() != null) {
                    request.addParameter("InstanceRequirements.MemoryMiB.Min", StringUtils.fromInteger(memoryMiB.getMin()));
                }

                if (memoryMiB.getMax() != null) {
                    request.addParameter("InstanceRequirements.MemoryMiB.Max", StringUtils.fromInteger(memoryMiB.getMax()));
                }
            }

            com.amazonaws.internal.SdkInternalList<String> instanceRequirementsRequestCpuManufacturersList = (com.amazonaws.internal.SdkInternalList<String>) instanceRequirements
                    .getCpuManufacturers();
            if (!instanceRequirementsRequestCpuManufacturersList.isEmpty() || !instanceRequirementsRequestCpuManufacturersList.isAutoConstruct()) {
                int cpuManufacturersListIndex = 1;

                for (String instanceRequirementsRequestCpuManufacturersListValue : instanceRequirementsRequestCpuManufacturersList) {
                    if (instanceRequirementsRequestCpuManufacturersListValue != null) {
                        request.addParameter("InstanceRequirements.CpuManufacturer." + cpuManufacturersListIndex,
                                StringUtils.fromString(instanceRequirementsRequestCpuManufacturersListValue));
                    }
                    cpuManufacturersListIndex++;
                }
            }

            MemoryGiBPerVCpuRequest memoryGiBPerVCpu = instanceRequirements.getMemoryGiBPerVCpu();
            if (memoryGiBPerVCpu != null) {

                if (memoryGiBPerVCpu.getMin() != null) {
                    request.addParameter("InstanceRequirements.MemoryGiBPerVCpu.Min", StringUtils.fromDouble(memoryGiBPerVCpu.getMin()));
                }

                if (memoryGiBPerVCpu.getMax() != null) {
                    request.addParameter("InstanceRequirements.MemoryGiBPerVCpu.Max", StringUtils.fromDouble(memoryGiBPerVCpu.getMax()));
                }
            }

            com.amazonaws.internal.SdkInternalList<String> instanceRequirementsRequestExcludedInstanceTypesList = (com.amazonaws.internal.SdkInternalList<String>) instanceRequirements
                    .getExcludedInstanceTypes();
            if (!instanceRequirementsRequestExcludedInstanceTypesList.isEmpty() || !instanceRequirementsRequestExcludedInstanceTypesList.isAutoConstruct()) {
                int excludedInstanceTypesListIndex = 1;

                for (String instanceRequirementsRequestExcludedInstanceTypesListValue : instanceRequirementsRequestExcludedInstanceTypesList) {
                    if (instanceRequirementsRequestExcludedInstanceTypesListValue != null) {
                        request.addParameter("InstanceRequirements.ExcludedInstanceType." + excludedInstanceTypesListIndex,
                                StringUtils.fromString(instanceRequirementsRequestExcludedInstanceTypesListValue));
                    }
                    excludedInstanceTypesListIndex++;
                }
            }

            com.amazonaws.internal.SdkInternalList<String> instanceRequirementsRequestInstanceGenerationsList = (com.amazonaws.internal.SdkInternalList<String>) instanceRequirements
                    .getInstanceGenerations();
            if (!instanceRequirementsRequestInstanceGenerationsList.isEmpty() || !instanceRequirementsRequestInstanceGenerationsList.isAutoConstruct()) {
                int instanceGenerationsListIndex = 1;

                for (String instanceRequirementsRequestInstanceGenerationsListValue : instanceRequirementsRequestInstanceGenerationsList) {
                    if (instanceRequirementsRequestInstanceGenerationsListValue != null) {
                        request.addParameter("InstanceRequirements.InstanceGeneration." + instanceGenerationsListIndex,
                                StringUtils.fromString(instanceRequirementsRequestInstanceGenerationsListValue));
                    }
                    instanceGenerationsListIndex++;
                }
            }

            if (instanceRequirements.getSpotMaxPricePercentageOverLowestPrice() != null) {
                request.addParameter("InstanceRequirements.SpotMaxPricePercentageOverLowestPrice",
                        StringUtils.fromInteger(instanceRequirements.getSpotMaxPricePercentageOverLowestPrice()));
            }

            if (instanceRequirements.getOnDemandMaxPricePercentageOverLowestPrice() != null) {
                request.addParameter("InstanceRequirements.OnDemandMaxPricePercentageOverLowestPrice",
                        StringUtils.fromInteger(instanceRequirements.getOnDemandMaxPricePercentageOverLowestPrice()));
            }

            if (instanceRequirements.getBareMetal() != null) {
                request.addParameter("InstanceRequirements.BareMetal", StringUtils.fromString(instanceRequirements.getBareMetal()));
            }

            if (instanceRequirements.getBurstablePerformance() != null) {
                request.addParameter("InstanceRequirements.BurstablePerformance", StringUtils.fromString(instanceRequirements.getBurstablePerformance()));
            }

            if (instanceRequirements.getRequireHibernateSupport() != null) {
                request.addParameter("InstanceRequirements.RequireHibernateSupport", StringUtils.fromBoolean(instanceRequirements.getRequireHibernateSupport()));
            }

            NetworkInterfaceCountRequest networkInterfaceCount = instanceRequirements.getNetworkInterfaceCount();
            if (networkInterfaceCount != null) {

                if (networkInterfaceCount.getMin() != null) {
                    request.addParameter("InstanceRequirements.NetworkInterfaceCount.Min", StringUtils.fromInteger(networkInterfaceCount.getMin()));
                }

                if (networkInterfaceCount.getMax() != null) {
                    request.addParameter("InstanceRequirements.NetworkInterfaceCount.Max", StringUtils.fromInteger(networkInterfaceCount.getMax()));
                }
            }

            if (instanceRequirements.getLocalStorage() != null) {
                request.addParameter("InstanceRequirements.LocalStorage", StringUtils.fromString(instanceRequirements.getLocalStorage()));
            }

            com.amazonaws.internal.SdkInternalList<String> instanceRequirementsRequestLocalStorageTypesList = (com.amazonaws.internal.SdkInternalList<String>) instanceRequirements
                    .getLocalStorageTypes();
            if (!instanceRequirementsRequestLocalStorageTypesList.isEmpty() || !instanceRequirementsRequestLocalStorageTypesList.isAutoConstruct()) {
                int localStorageTypesListIndex = 1;

                for (String instanceRequirementsRequestLocalStorageTypesListValue : instanceRequirementsRequestLocalStorageTypesList) {
                    if (instanceRequirementsRequestLocalStorageTypesListValue != null) {
                        request.addParameter("InstanceRequirements.LocalStorageType." + localStorageTypesListIndex,
                                StringUtils.fromString(instanceRequirementsRequestLocalStorageTypesListValue));
                    }
                    localStorageTypesListIndex++;
                }
            }

            TotalLocalStorageGBRequest totalLocalStorageGB = instanceRequirements.getTotalLocalStorageGB();
            if (totalLocalStorageGB != null) {

                if (totalLocalStorageGB.getMin() != null) {
                    request.addParameter("InstanceRequirements.TotalLocalStorageGB.Min", StringUtils.fromDouble(totalLocalStorageGB.getMin()));
                }

                if (totalLocalStorageGB.getMax() != null) {
                    request.addParameter("InstanceRequirements.TotalLocalStorageGB.Max", StringUtils.fromDouble(totalLocalStorageGB.getMax()));
                }
            }

            BaselineEbsBandwidthMbpsRequest baselineEbsBandwidthMbps = instanceRequirements.getBaselineEbsBandwidthMbps();
            if (baselineEbsBandwidthMbps != null) {

                if (baselineEbsBandwidthMbps.getMin() != null) {
                    request.addParameter("InstanceRequirements.BaselineEbsBandwidthMbps.Min", StringUtils.fromInteger(baselineEbsBandwidthMbps.getMin()));
                }

                if (baselineEbsBandwidthMbps.getMax() != null) {
                    request.addParameter("InstanceRequirements.BaselineEbsBandwidthMbps.Max", StringUtils.fromInteger(baselineEbsBandwidthMbps.getMax()));
                }
            }

            com.amazonaws.internal.SdkInternalList<String> instanceRequirementsRequestAcceleratorTypesList = (com.amazonaws.internal.SdkInternalList<String>) instanceRequirements
                    .getAcceleratorTypes();
            if (!instanceRequirementsRequestAcceleratorTypesList.isEmpty() || !instanceRequirementsRequestAcceleratorTypesList.isAutoConstruct()) {
                int acceleratorTypesListIndex = 1;

                for (String instanceRequirementsRequestAcceleratorTypesListValue : instanceRequirementsRequestAcceleratorTypesList) {
                    if (instanceRequirementsRequestAcceleratorTypesListValue != null) {
                        request.addParameter("InstanceRequirements.AcceleratorType." + acceleratorTypesListIndex,
                                StringUtils.fromString(instanceRequirementsRequestAcceleratorTypesListValue));
                    }
                    acceleratorTypesListIndex++;
                }
            }

            AcceleratorCountRequest acceleratorCount = instanceRequirements.getAcceleratorCount();
            if (acceleratorCount != null) {

                if (acceleratorCount.getMin() != null) {
                    request.addParameter("InstanceRequirements.AcceleratorCount.Min", StringUtils.fromInteger(acceleratorCount.getMin()));
                }

                if (acceleratorCount.getMax() != null) {
                    request.addParameter("InstanceRequirements.AcceleratorCount.Max", StringUtils.fromInteger(acceleratorCount.getMax()));
                }
            }

            com.amazonaws.internal.SdkInternalList<String> instanceRequirementsRequestAcceleratorManufacturersList = (com.amazonaws.internal.SdkInternalList<String>) instanceRequirements
                    .getAcceleratorManufacturers();
            if (!instanceRequirementsRequestAcceleratorManufacturersList.isEmpty()
                    || !instanceRequirementsRequestAcceleratorManufacturersList.isAutoConstruct()) {
                int acceleratorManufacturersListIndex = 1;

                for (String instanceRequirementsRequestAcceleratorManufacturersListValue : instanceRequirementsRequestAcceleratorManufacturersList) {
                    if (instanceRequirementsRequestAcceleratorManufacturersListValue != null) {
                        request.addParameter("InstanceRequirements.AcceleratorManufacturer." + acceleratorManufacturersListIndex,
                                StringUtils.fromString(instanceRequirementsRequestAcceleratorManufacturersListValue));
                    }
                    acceleratorManufacturersListIndex++;
                }
            }

            com.amazonaws.internal.SdkInternalList<String> instanceRequirementsRequestAcceleratorNamesList = (com.amazonaws.internal.SdkInternalList<String>) instanceRequirements
                    .getAcceleratorNames();
            if (!instanceRequirementsRequestAcceleratorNamesList.isEmpty() || !instanceRequirementsRequestAcceleratorNamesList.isAutoConstruct()) {
                int acceleratorNamesListIndex = 1;

                for (String instanceRequirementsRequestAcceleratorNamesListValue : instanceRequirementsRequestAcceleratorNamesList) {
                    if (instanceRequirementsRequestAcceleratorNamesListValue != null) {
                        request.addParameter("InstanceRequirements.AcceleratorName." + acceleratorNamesListIndex,
                                StringUtils.fromString(instanceRequirementsRequestAcceleratorNamesListValue));
                    }
                    acceleratorNamesListIndex++;
                }
            }

            AcceleratorTotalMemoryMiBRequest acceleratorTotalMemoryMiB = instanceRequirements.getAcceleratorTotalMemoryMiB();
            if (acceleratorTotalMemoryMiB != null) {

                if (acceleratorTotalMemoryMiB.getMin() != null) {
                    request.addParameter("InstanceRequirements.AcceleratorTotalMemoryMiB.Min", StringUtils.fromInteger(acceleratorTotalMemoryMiB.getMin()));
                }

                if (acceleratorTotalMemoryMiB.getMax() != null) {
                    request.addParameter("InstanceRequirements.AcceleratorTotalMemoryMiB.Max", StringUtils.fromInteger(acceleratorTotalMemoryMiB.getMax()));
                }
            }

            NetworkBandwidthGbpsRequest networkBandwidthGbps = instanceRequirements.getNetworkBandwidthGbps();
            if (networkBandwidthGbps != null) {

                if (networkBandwidthGbps.getMin() != null) {
                    request.addParameter("InstanceRequirements.NetworkBandwidthGbps.Min", StringUtils.fromDouble(networkBandwidthGbps.getMin()));
                }

                if (networkBandwidthGbps.getMax() != null) {
                    request.addParameter("InstanceRequirements.NetworkBandwidthGbps.Max", StringUtils.fromDouble(networkBandwidthGbps.getMax()));
                }
            }

            com.amazonaws.internal.SdkInternalList<String> instanceRequirementsRequestAllowedInstanceTypesList = (com.amazonaws.internal.SdkInternalList<String>) instanceRequirements
                    .getAllowedInstanceTypes();
            if (!instanceRequirementsRequestAllowedInstanceTypesList.isEmpty() || !instanceRequirementsRequestAllowedInstanceTypesList.isAutoConstruct()) {
                int allowedInstanceTypesListIndex = 1;

                for (String instanceRequirementsRequestAllowedInstanceTypesListValue : instanceRequirementsRequestAllowedInstanceTypesList) {
                    if (instanceRequirementsRequestAllowedInstanceTypesListValue != null) {
                        request.addParameter("InstanceRequirements.AllowedInstanceType." + allowedInstanceTypesListIndex,
                                StringUtils.fromString(instanceRequirementsRequestAllowedInstanceTypesListValue));
                    }
                    allowedInstanceTypesListIndex++;
                }
            }
        }

        if (getInstanceTypesFromInstanceRequirementsRequest.getMaxResults() != null) {
            request.addParameter("MaxResults", StringUtils.fromInteger(getInstanceTypesFromInstanceRequirementsRequest.getMaxResults()));
        }

        if (getInstanceTypesFromInstanceRequirementsRequest.getNextToken() != null) {
            request.addParameter("NextToken", StringUtils.fromString(getInstanceTypesFromInstanceRequirementsRequest.getNextToken()));
        }

        return request;
    }

}
