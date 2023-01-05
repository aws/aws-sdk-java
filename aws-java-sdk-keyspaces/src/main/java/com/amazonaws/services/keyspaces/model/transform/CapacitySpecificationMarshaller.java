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
package com.amazonaws.services.keyspaces.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.keyspaces.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CapacitySpecificationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CapacitySpecificationMarshaller {

    private static final MarshallingInfo<String> THROUGHPUTMODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("throughputMode").build();
    private static final MarshallingInfo<Long> READCAPACITYUNITS_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("readCapacityUnits").build();
    private static final MarshallingInfo<Long> WRITECAPACITYUNITS_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("writeCapacityUnits").build();

    private static final CapacitySpecificationMarshaller instance = new CapacitySpecificationMarshaller();

    public static CapacitySpecificationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CapacitySpecification capacitySpecification, ProtocolMarshaller protocolMarshaller) {

        if (capacitySpecification == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(capacitySpecification.getThroughputMode(), THROUGHPUTMODE_BINDING);
            protocolMarshaller.marshall(capacitySpecification.getReadCapacityUnits(), READCAPACITYUNITS_BINDING);
            protocolMarshaller.marshall(capacitySpecification.getWriteCapacityUnits(), WRITECAPACITYUNITS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
