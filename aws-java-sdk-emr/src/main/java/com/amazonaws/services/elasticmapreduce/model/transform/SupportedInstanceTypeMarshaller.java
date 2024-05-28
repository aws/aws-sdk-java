/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.elasticmapreduce.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.elasticmapreduce.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * SupportedInstanceTypeMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class SupportedInstanceTypeMarshaller {

    private static final MarshallingInfo<String> TYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Type").build();
    private static final MarshallingInfo<Float> MEMORYGB_BINDING = MarshallingInfo.builder(MarshallingType.FLOAT).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("MemoryGB").build();
    private static final MarshallingInfo<Integer> STORAGEGB_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StorageGB").build();
    private static final MarshallingInfo<Integer> VCPU_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("VCPU").build();
    private static final MarshallingInfo<Boolean> IS64BITSONLY_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Is64BitsOnly").build();
    private static final MarshallingInfo<String> INSTANCEFAMILYID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("InstanceFamilyId").build();
    private static final MarshallingInfo<Boolean> EBSOPTIMIZEDAVAILABLE_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EbsOptimizedAvailable").build();
    private static final MarshallingInfo<Boolean> EBSOPTIMIZEDBYDEFAULT_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EbsOptimizedByDefault").build();
    private static final MarshallingInfo<Integer> NUMBEROFDISKS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("NumberOfDisks").build();
    private static final MarshallingInfo<Boolean> EBSSTORAGEONLY_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EbsStorageOnly").build();
    private static final MarshallingInfo<String> ARCHITECTURE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Architecture").build();

    private static final SupportedInstanceTypeMarshaller instance = new SupportedInstanceTypeMarshaller();

    public static SupportedInstanceTypeMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(SupportedInstanceType supportedInstanceType, ProtocolMarshaller protocolMarshaller) {

        if (supportedInstanceType == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(supportedInstanceType.getType(), TYPE_BINDING);
            protocolMarshaller.marshall(supportedInstanceType.getMemoryGB(), MEMORYGB_BINDING);
            protocolMarshaller.marshall(supportedInstanceType.getStorageGB(), STORAGEGB_BINDING);
            protocolMarshaller.marshall(supportedInstanceType.getVCPU(), VCPU_BINDING);
            protocolMarshaller.marshall(supportedInstanceType.getIs64BitsOnly(), IS64BITSONLY_BINDING);
            protocolMarshaller.marshall(supportedInstanceType.getInstanceFamilyId(), INSTANCEFAMILYID_BINDING);
            protocolMarshaller.marshall(supportedInstanceType.getEbsOptimizedAvailable(), EBSOPTIMIZEDAVAILABLE_BINDING);
            protocolMarshaller.marshall(supportedInstanceType.getEbsOptimizedByDefault(), EBSOPTIMIZEDBYDEFAULT_BINDING);
            protocolMarshaller.marshall(supportedInstanceType.getNumberOfDisks(), NUMBEROFDISKS_BINDING);
            protocolMarshaller.marshall(supportedInstanceType.getEbsStorageOnly(), EBSSTORAGEONLY_BINDING);
            protocolMarshaller.marshall(supportedInstanceType.getArchitecture(), ARCHITECTURE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
