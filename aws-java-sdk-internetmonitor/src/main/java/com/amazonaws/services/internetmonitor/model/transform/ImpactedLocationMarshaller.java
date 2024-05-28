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
package com.amazonaws.services.internetmonitor.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.internetmonitor.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ImpactedLocationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ImpactedLocationMarshaller {

    private static final MarshallingInfo<String> ASNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("ASName").build();
    private static final MarshallingInfo<Long> ASNUMBER_BINDING = MarshallingInfo.builder(MarshallingType.LONG).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("ASNumber").build();
    private static final MarshallingInfo<String> COUNTRY_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Country").build();
    private static final MarshallingInfo<String> SUBDIVISION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Subdivision").build();
    private static final MarshallingInfo<String> METRO_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Metro").build();
    private static final MarshallingInfo<String> CITY_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("City").build();
    private static final MarshallingInfo<Double> LATITUDE_BINDING = MarshallingInfo.builder(MarshallingType.DOUBLE).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Latitude").build();
    private static final MarshallingInfo<Double> LONGITUDE_BINDING = MarshallingInfo.builder(MarshallingType.DOUBLE).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Longitude").build();
    private static final MarshallingInfo<String> COUNTRYCODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CountryCode").build();
    private static final MarshallingInfo<String> SUBDIVISIONCODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SubdivisionCode").build();
    private static final MarshallingInfo<String> SERVICELOCATION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ServiceLocation").build();
    private static final MarshallingInfo<String> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Status").build();
    private static final MarshallingInfo<StructuredPojo> CAUSEDBY_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CausedBy").build();
    private static final MarshallingInfo<StructuredPojo> INTERNETHEALTH_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("InternetHealth").build();
    private static final MarshallingInfo<List> IPV4PREFIXES_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Ipv4Prefixes").build();

    private static final ImpactedLocationMarshaller instance = new ImpactedLocationMarshaller();

    public static ImpactedLocationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ImpactedLocation impactedLocation, ProtocolMarshaller protocolMarshaller) {

        if (impactedLocation == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(impactedLocation.getASName(), ASNAME_BINDING);
            protocolMarshaller.marshall(impactedLocation.getASNumber(), ASNUMBER_BINDING);
            protocolMarshaller.marshall(impactedLocation.getCountry(), COUNTRY_BINDING);
            protocolMarshaller.marshall(impactedLocation.getSubdivision(), SUBDIVISION_BINDING);
            protocolMarshaller.marshall(impactedLocation.getMetro(), METRO_BINDING);
            protocolMarshaller.marshall(impactedLocation.getCity(), CITY_BINDING);
            protocolMarshaller.marshall(impactedLocation.getLatitude(), LATITUDE_BINDING);
            protocolMarshaller.marshall(impactedLocation.getLongitude(), LONGITUDE_BINDING);
            protocolMarshaller.marshall(impactedLocation.getCountryCode(), COUNTRYCODE_BINDING);
            protocolMarshaller.marshall(impactedLocation.getSubdivisionCode(), SUBDIVISIONCODE_BINDING);
            protocolMarshaller.marshall(impactedLocation.getServiceLocation(), SERVICELOCATION_BINDING);
            protocolMarshaller.marshall(impactedLocation.getStatus(), STATUS_BINDING);
            protocolMarshaller.marshall(impactedLocation.getCausedBy(), CAUSEDBY_BINDING);
            protocolMarshaller.marshall(impactedLocation.getInternetHealth(), INTERNETHEALTH_BINDING);
            protocolMarshaller.marshall(impactedLocation.getIpv4Prefixes(), IPV4PREFIXES_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
