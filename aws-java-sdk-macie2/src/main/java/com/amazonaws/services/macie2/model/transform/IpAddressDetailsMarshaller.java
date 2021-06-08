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
package com.amazonaws.services.macie2.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.macie2.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * IpAddressDetailsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class IpAddressDetailsMarshaller {

    private static final MarshallingInfo<String> IPADDRESSV4_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ipAddressV4").build();
    private static final MarshallingInfo<StructuredPojo> IPCITY_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ipCity").build();
    private static final MarshallingInfo<StructuredPojo> IPCOUNTRY_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ipCountry").build();
    private static final MarshallingInfo<StructuredPojo> IPGEOLOCATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ipGeoLocation").build();
    private static final MarshallingInfo<StructuredPojo> IPOWNER_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ipOwner").build();

    private static final IpAddressDetailsMarshaller instance = new IpAddressDetailsMarshaller();

    public static IpAddressDetailsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(IpAddressDetails ipAddressDetails, ProtocolMarshaller protocolMarshaller) {

        if (ipAddressDetails == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(ipAddressDetails.getIpAddressV4(), IPADDRESSV4_BINDING);
            protocolMarshaller.marshall(ipAddressDetails.getIpCity(), IPCITY_BINDING);
            protocolMarshaller.marshall(ipAddressDetails.getIpCountry(), IPCOUNTRY_BINDING);
            protocolMarshaller.marshall(ipAddressDetails.getIpGeoLocation(), IPGEOLOCATION_BINDING);
            protocolMarshaller.marshall(ipAddressDetails.getIpOwner(), IPOWNER_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
