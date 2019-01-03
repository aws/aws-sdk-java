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
package com.amazonaws.services.guardduty.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.guardduty.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * RemoteIpDetailsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class RemoteIpDetailsMarshaller {

    private static final MarshallingInfo<StructuredPojo> CITY_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("city").build();
    private static final MarshallingInfo<StructuredPojo> COUNTRY_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("country").build();
    private static final MarshallingInfo<StructuredPojo> GEOLOCATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("geoLocation").build();
    private static final MarshallingInfo<String> IPADDRESSV4_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ipAddressV4").build();
    private static final MarshallingInfo<StructuredPojo> ORGANIZATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("organization").build();

    private static final RemoteIpDetailsMarshaller instance = new RemoteIpDetailsMarshaller();

    public static RemoteIpDetailsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(RemoteIpDetails remoteIpDetails, ProtocolMarshaller protocolMarshaller) {

        if (remoteIpDetails == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(remoteIpDetails.getCity(), CITY_BINDING);
            protocolMarshaller.marshall(remoteIpDetails.getCountry(), COUNTRY_BINDING);
            protocolMarshaller.marshall(remoteIpDetails.getGeoLocation(), GEOLOCATION_BINDING);
            protocolMarshaller.marshall(remoteIpDetails.getIpAddressV4(), IPADDRESSV4_BINDING);
            protocolMarshaller.marshall(remoteIpDetails.getOrganization(), ORGANIZATION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
