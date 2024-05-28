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
package com.amazonaws.services.costexplorer.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.costexplorer.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * MemoryDBInstanceDetailsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class MemoryDBInstanceDetailsMarshaller {

    private static final MarshallingInfo<String> FAMILY_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Family").build();
    private static final MarshallingInfo<String> NODETYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("NodeType").build();
    private static final MarshallingInfo<String> REGION_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Region").build();
    private static final MarshallingInfo<Boolean> CURRENTGENERATION_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CurrentGeneration").build();
    private static final MarshallingInfo<Boolean> SIZEFLEXELIGIBLE_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SizeFlexEligible").build();

    private static final MemoryDBInstanceDetailsMarshaller instance = new MemoryDBInstanceDetailsMarshaller();

    public static MemoryDBInstanceDetailsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(MemoryDBInstanceDetails memoryDBInstanceDetails, ProtocolMarshaller protocolMarshaller) {

        if (memoryDBInstanceDetails == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(memoryDBInstanceDetails.getFamily(), FAMILY_BINDING);
            protocolMarshaller.marshall(memoryDBInstanceDetails.getNodeType(), NODETYPE_BINDING);
            protocolMarshaller.marshall(memoryDBInstanceDetails.getRegion(), REGION_BINDING);
            protocolMarshaller.marshall(memoryDBInstanceDetails.getCurrentGeneration(), CURRENTGENERATION_BINDING);
            protocolMarshaller.marshall(memoryDBInstanceDetails.getSizeFlexEligible(), SIZEFLEXELIGIBLE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
