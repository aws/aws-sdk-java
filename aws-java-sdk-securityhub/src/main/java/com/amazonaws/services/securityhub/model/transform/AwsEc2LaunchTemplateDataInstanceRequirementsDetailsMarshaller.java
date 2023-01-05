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
package com.amazonaws.services.securityhub.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.securityhub.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * AwsEc2LaunchTemplateDataInstanceRequirementsDetailsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AwsEc2LaunchTemplateDataInstanceRequirementsDetailsMarshaller {

    private static final MarshallingInfo<StructuredPojo> ACCELERATORCOUNT_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AcceleratorCount").build();
    private static final MarshallingInfo<List> ACCELERATORMANUFACTURERS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AcceleratorManufacturers").build();
    private static final MarshallingInfo<List> ACCELERATORNAMES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AcceleratorNames").build();
    private static final MarshallingInfo<StructuredPojo> ACCELERATORTOTALMEMORYMIB_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AcceleratorTotalMemoryMiB").build();
    private static final MarshallingInfo<List> ACCELERATORTYPES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AcceleratorTypes").build();
    private static final MarshallingInfo<String> BAREMETAL_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("BareMetal").build();
    private static final MarshallingInfo<StructuredPojo> BASELINEEBSBANDWIDTHMBPS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("BaselineEbsBandwidthMbps").build();
    private static final MarshallingInfo<String> BURSTABLEPERFORMANCE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("BurstablePerformance").build();
    private static final MarshallingInfo<List> CPUMANUFACTURERS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CpuManufacturers").build();
    private static final MarshallingInfo<List> EXCLUDEDINSTANCETYPES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ExcludedInstanceTypes").build();
    private static final MarshallingInfo<List> INSTANCEGENERATIONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("InstanceGenerations").build();
    private static final MarshallingInfo<String> LOCALSTORAGE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LocalStorage").build();
    private static final MarshallingInfo<List> LOCALSTORAGETYPES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LocalStorageTypes").build();
    private static final MarshallingInfo<StructuredPojo> MEMORYGIBPERVCPU_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MemoryGiBPerVCpu").build();
    private static final MarshallingInfo<StructuredPojo> MEMORYMIB_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MemoryMiB").build();
    private static final MarshallingInfo<StructuredPojo> NETWORKINTERFACECOUNT_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("NetworkInterfaceCount").build();
    private static final MarshallingInfo<Integer> ONDEMANDMAXPRICEPERCENTAGEOVERLOWESTPRICE_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("OnDemandMaxPricePercentageOverLowestPrice").build();
    private static final MarshallingInfo<Boolean> REQUIREHIBERNATESUPPORT_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RequireHibernateSupport").build();
    private static final MarshallingInfo<Integer> SPOTMAXPRICEPERCENTAGEOVERLOWESTPRICE_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SpotMaxPricePercentageOverLowestPrice").build();
    private static final MarshallingInfo<StructuredPojo> TOTALLOCALSTORAGEGB_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TotalLocalStorageGB").build();
    private static final MarshallingInfo<StructuredPojo> VCPUCOUNT_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("VCpuCount").build();

    private static final AwsEc2LaunchTemplateDataInstanceRequirementsDetailsMarshaller instance = new AwsEc2LaunchTemplateDataInstanceRequirementsDetailsMarshaller();

    public static AwsEc2LaunchTemplateDataInstanceRequirementsDetailsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AwsEc2LaunchTemplateDataInstanceRequirementsDetails awsEc2LaunchTemplateDataInstanceRequirementsDetails,
            ProtocolMarshaller protocolMarshaller) {

        if (awsEc2LaunchTemplateDataInstanceRequirementsDetails == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(awsEc2LaunchTemplateDataInstanceRequirementsDetails.getAcceleratorCount(), ACCELERATORCOUNT_BINDING);
            protocolMarshaller.marshall(awsEc2LaunchTemplateDataInstanceRequirementsDetails.getAcceleratorManufacturers(), ACCELERATORMANUFACTURERS_BINDING);
            protocolMarshaller.marshall(awsEc2LaunchTemplateDataInstanceRequirementsDetails.getAcceleratorNames(), ACCELERATORNAMES_BINDING);
            protocolMarshaller.marshall(awsEc2LaunchTemplateDataInstanceRequirementsDetails.getAcceleratorTotalMemoryMiB(), ACCELERATORTOTALMEMORYMIB_BINDING);
            protocolMarshaller.marshall(awsEc2LaunchTemplateDataInstanceRequirementsDetails.getAcceleratorTypes(), ACCELERATORTYPES_BINDING);
            protocolMarshaller.marshall(awsEc2LaunchTemplateDataInstanceRequirementsDetails.getBareMetal(), BAREMETAL_BINDING);
            protocolMarshaller.marshall(awsEc2LaunchTemplateDataInstanceRequirementsDetails.getBaselineEbsBandwidthMbps(), BASELINEEBSBANDWIDTHMBPS_BINDING);
            protocolMarshaller.marshall(awsEc2LaunchTemplateDataInstanceRequirementsDetails.getBurstablePerformance(), BURSTABLEPERFORMANCE_BINDING);
            protocolMarshaller.marshall(awsEc2LaunchTemplateDataInstanceRequirementsDetails.getCpuManufacturers(), CPUMANUFACTURERS_BINDING);
            protocolMarshaller.marshall(awsEc2LaunchTemplateDataInstanceRequirementsDetails.getExcludedInstanceTypes(), EXCLUDEDINSTANCETYPES_BINDING);
            protocolMarshaller.marshall(awsEc2LaunchTemplateDataInstanceRequirementsDetails.getInstanceGenerations(), INSTANCEGENERATIONS_BINDING);
            protocolMarshaller.marshall(awsEc2LaunchTemplateDataInstanceRequirementsDetails.getLocalStorage(), LOCALSTORAGE_BINDING);
            protocolMarshaller.marshall(awsEc2LaunchTemplateDataInstanceRequirementsDetails.getLocalStorageTypes(), LOCALSTORAGETYPES_BINDING);
            protocolMarshaller.marshall(awsEc2LaunchTemplateDataInstanceRequirementsDetails.getMemoryGiBPerVCpu(), MEMORYGIBPERVCPU_BINDING);
            protocolMarshaller.marshall(awsEc2LaunchTemplateDataInstanceRequirementsDetails.getMemoryMiB(), MEMORYMIB_BINDING);
            protocolMarshaller.marshall(awsEc2LaunchTemplateDataInstanceRequirementsDetails.getNetworkInterfaceCount(), NETWORKINTERFACECOUNT_BINDING);
            protocolMarshaller.marshall(awsEc2LaunchTemplateDataInstanceRequirementsDetails.getOnDemandMaxPricePercentageOverLowestPrice(),
                    ONDEMANDMAXPRICEPERCENTAGEOVERLOWESTPRICE_BINDING);
            protocolMarshaller.marshall(awsEc2LaunchTemplateDataInstanceRequirementsDetails.getRequireHibernateSupport(), REQUIREHIBERNATESUPPORT_BINDING);
            protocolMarshaller.marshall(awsEc2LaunchTemplateDataInstanceRequirementsDetails.getSpotMaxPricePercentageOverLowestPrice(),
                    SPOTMAXPRICEPERCENTAGEOVERLOWESTPRICE_BINDING);
            protocolMarshaller.marshall(awsEc2LaunchTemplateDataInstanceRequirementsDetails.getTotalLocalStorageGB(), TOTALLOCALSTORAGEGB_BINDING);
            protocolMarshaller.marshall(awsEc2LaunchTemplateDataInstanceRequirementsDetails.getVCpuCount(), VCPUCOUNT_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
