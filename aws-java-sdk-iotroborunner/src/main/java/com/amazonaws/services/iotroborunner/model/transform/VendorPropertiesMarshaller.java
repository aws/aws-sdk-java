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
package com.amazonaws.services.iotroborunner.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.iotroborunner.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * VendorPropertiesMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class VendorPropertiesMarshaller {

    private static final MarshallingInfo<String> VENDORWORKERID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("vendorWorkerId").build();
    private static final MarshallingInfo<String> VENDORWORKERIPADDRESS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("vendorWorkerIpAddress").build();
    private static final MarshallingInfo<String> VENDORADDITIONALTRANSIENTPROPERTIES_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("vendorAdditionalTransientProperties").build();
    private static final MarshallingInfo<String> VENDORADDITIONALFIXEDPROPERTIES_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("vendorAdditionalFixedProperties").build();

    private static final VendorPropertiesMarshaller instance = new VendorPropertiesMarshaller();

    public static VendorPropertiesMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(VendorProperties vendorProperties, ProtocolMarshaller protocolMarshaller) {

        if (vendorProperties == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(vendorProperties.getVendorWorkerId(), VENDORWORKERID_BINDING);
            protocolMarshaller.marshall(vendorProperties.getVendorWorkerIpAddress(), VENDORWORKERIPADDRESS_BINDING);
            protocolMarshaller.marshall(vendorProperties.getVendorAdditionalTransientProperties(), VENDORADDITIONALTRANSIENTPROPERTIES_BINDING);
            protocolMarshaller.marshall(vendorProperties.getVendorAdditionalFixedProperties(), VENDORADDITIONALFIXEDPROPERTIES_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
