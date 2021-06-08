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

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.elasticinference.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * AcceleratorTypeOfferingMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AcceleratorTypeOfferingMarshaller {

    private static final MarshallingInfo<String> ACCELERATORTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("acceleratorType").build();
    private static final MarshallingInfo<String> LOCATIONTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("locationType").build();
    private static final MarshallingInfo<String> LOCATION_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("location").build();

    private static final AcceleratorTypeOfferingMarshaller instance = new AcceleratorTypeOfferingMarshaller();

    public static AcceleratorTypeOfferingMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AcceleratorTypeOffering acceleratorTypeOffering, ProtocolMarshaller protocolMarshaller) {

        if (acceleratorTypeOffering == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(acceleratorTypeOffering.getAcceleratorType(), ACCELERATORTYPE_BINDING);
            protocolMarshaller.marshall(acceleratorTypeOffering.getLocationType(), LOCATIONTYPE_BINDING);
            protocolMarshaller.marshall(acceleratorTypeOffering.getLocation(), LOCATION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
