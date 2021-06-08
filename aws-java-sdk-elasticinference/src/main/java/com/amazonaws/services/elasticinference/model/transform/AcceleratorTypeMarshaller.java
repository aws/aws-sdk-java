/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.elasticinference.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.elasticinference.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * AcceleratorTypeMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AcceleratorTypeMarshaller {

    private static final MarshallingInfo<String> ACCELERATORTYPENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("acceleratorTypeName").build();
    private static final MarshallingInfo<StructuredPojo> MEMORYINFO_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("memoryInfo").build();
    private static final MarshallingInfo<List> THROUGHPUTINFO_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("throughputInfo").build();

    private static final AcceleratorTypeMarshaller instance = new AcceleratorTypeMarshaller();

    public static AcceleratorTypeMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AcceleratorType acceleratorType, ProtocolMarshaller protocolMarshaller) {

        if (acceleratorType == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(acceleratorType.getAcceleratorTypeName(), ACCELERATORTYPENAME_BINDING);
            protocolMarshaller.marshall(acceleratorType.getMemoryInfo(), MEMORYINFO_BINDING);
            protocolMarshaller.marshall(acceleratorType.getThroughputInfo(), THROUGHPUTINFO_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
