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
package com.amazonaws.services.costexplorer.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.costexplorer.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * EC2ResourceDetailsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class EC2ResourceDetailsMarshaller {

    private static final MarshallingInfo<String> HOURLYONDEMANDRATE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("HourlyOnDemandRate").build();
    private static final MarshallingInfo<String> INSTANCETYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("InstanceType").build();
    private static final MarshallingInfo<String> PLATFORM_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Platform").build();
    private static final MarshallingInfo<String> REGION_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Region").build();
    private static final MarshallingInfo<String> SKU_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Sku").build();
    private static final MarshallingInfo<String> MEMORY_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Memory").build();
    private static final MarshallingInfo<String> NETWORKPERFORMANCE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("NetworkPerformance").build();
    private static final MarshallingInfo<String> STORAGE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Storage").build();
    private static final MarshallingInfo<String> VCPU_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Vcpu").build();

    private static final EC2ResourceDetailsMarshaller instance = new EC2ResourceDetailsMarshaller();

    public static EC2ResourceDetailsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(EC2ResourceDetails eC2ResourceDetails, ProtocolMarshaller protocolMarshaller) {

        if (eC2ResourceDetails == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(eC2ResourceDetails.getHourlyOnDemandRate(), HOURLYONDEMANDRATE_BINDING);
            protocolMarshaller.marshall(eC2ResourceDetails.getInstanceType(), INSTANCETYPE_BINDING);
            protocolMarshaller.marshall(eC2ResourceDetails.getPlatform(), PLATFORM_BINDING);
            protocolMarshaller.marshall(eC2ResourceDetails.getRegion(), REGION_BINDING);
            protocolMarshaller.marshall(eC2ResourceDetails.getSku(), SKU_BINDING);
            protocolMarshaller.marshall(eC2ResourceDetails.getMemory(), MEMORY_BINDING);
            protocolMarshaller.marshall(eC2ResourceDetails.getNetworkPerformance(), NETWORKPERFORMANCE_BINDING);
            protocolMarshaller.marshall(eC2ResourceDetails.getStorage(), STORAGE_BINDING);
            protocolMarshaller.marshall(eC2ResourceDetails.getVcpu(), VCPU_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
