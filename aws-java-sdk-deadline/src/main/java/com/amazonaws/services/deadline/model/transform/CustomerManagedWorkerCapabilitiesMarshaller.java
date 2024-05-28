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
package com.amazonaws.services.deadline.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.deadline.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CustomerManagedWorkerCapabilitiesMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CustomerManagedWorkerCapabilitiesMarshaller {

    private static final MarshallingInfo<StructuredPojo> ACCELERATORCOUNT_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("acceleratorCount").build();
    private static final MarshallingInfo<StructuredPojo> ACCELERATORTOTALMEMORYMIB_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("acceleratorTotalMemoryMiB").build();
    private static final MarshallingInfo<List> ACCELERATORTYPES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("acceleratorTypes").build();
    private static final MarshallingInfo<String> CPUARCHITECTURETYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("cpuArchitectureType").build();
    private static final MarshallingInfo<List> CUSTOMAMOUNTS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("customAmounts").build();
    private static final MarshallingInfo<List> CUSTOMATTRIBUTES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("customAttributes").build();
    private static final MarshallingInfo<StructuredPojo> MEMORYMIB_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("memoryMiB").build();
    private static final MarshallingInfo<String> OSFAMILY_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("osFamily").build();
    private static final MarshallingInfo<StructuredPojo> VCPUCOUNT_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("vCpuCount").build();

    private static final CustomerManagedWorkerCapabilitiesMarshaller instance = new CustomerManagedWorkerCapabilitiesMarshaller();

    public static CustomerManagedWorkerCapabilitiesMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CustomerManagedWorkerCapabilities customerManagedWorkerCapabilities, ProtocolMarshaller protocolMarshaller) {

        if (customerManagedWorkerCapabilities == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(customerManagedWorkerCapabilities.getAcceleratorCount(), ACCELERATORCOUNT_BINDING);
            protocolMarshaller.marshall(customerManagedWorkerCapabilities.getAcceleratorTotalMemoryMiB(), ACCELERATORTOTALMEMORYMIB_BINDING);
            protocolMarshaller.marshall(customerManagedWorkerCapabilities.getAcceleratorTypes(), ACCELERATORTYPES_BINDING);
            protocolMarshaller.marshall(customerManagedWorkerCapabilities.getCpuArchitectureType(), CPUARCHITECTURETYPE_BINDING);
            protocolMarshaller.marshall(customerManagedWorkerCapabilities.getCustomAmounts(), CUSTOMAMOUNTS_BINDING);
            protocolMarshaller.marshall(customerManagedWorkerCapabilities.getCustomAttributes(), CUSTOMATTRIBUTES_BINDING);
            protocolMarshaller.marshall(customerManagedWorkerCapabilities.getMemoryMiB(), MEMORYMIB_BINDING);
            protocolMarshaller.marshall(customerManagedWorkerCapabilities.getOsFamily(), OSFAMILY_BINDING);
            protocolMarshaller.marshall(customerManagedWorkerCapabilities.getVCpuCount(), VCPUCOUNT_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
