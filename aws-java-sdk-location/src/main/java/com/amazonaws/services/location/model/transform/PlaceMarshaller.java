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
package com.amazonaws.services.location.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.location.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * PlaceMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class PlaceMarshaller {

    private static final MarshallingInfo<String> ADDRESSNUMBER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AddressNumber").build();
    private static final MarshallingInfo<String> COUNTRY_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Country").build();
    private static final MarshallingInfo<StructuredPojo> GEOMETRY_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Geometry").build();
    private static final MarshallingInfo<String> LABEL_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Label").build();
    private static final MarshallingInfo<String> MUNICIPALITY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Municipality").build();
    private static final MarshallingInfo<String> NEIGHBORHOOD_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Neighborhood").build();
    private static final MarshallingInfo<String> POSTALCODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PostalCode").build();
    private static final MarshallingInfo<String> REGION_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Region").build();
    private static final MarshallingInfo<String> STREET_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Street").build();
    private static final MarshallingInfo<String> SUBREGION_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("SubRegion").build();

    private static final PlaceMarshaller instance = new PlaceMarshaller();

    public static PlaceMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(Place place, ProtocolMarshaller protocolMarshaller) {

        if (place == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(place.getAddressNumber(), ADDRESSNUMBER_BINDING);
            protocolMarshaller.marshall(place.getCountry(), COUNTRY_BINDING);
            protocolMarshaller.marshall(place.getGeometry(), GEOMETRY_BINDING);
            protocolMarshaller.marshall(place.getLabel(), LABEL_BINDING);
            protocolMarshaller.marshall(place.getMunicipality(), MUNICIPALITY_BINDING);
            protocolMarshaller.marshall(place.getNeighborhood(), NEIGHBORHOOD_BINDING);
            protocolMarshaller.marshall(place.getPostalCode(), POSTALCODE_BINDING);
            protocolMarshaller.marshall(place.getRegion(), REGION_BINDING);
            protocolMarshaller.marshall(place.getStreet(), STREET_BINDING);
            protocolMarshaller.marshall(place.getSubRegion(), SUBREGION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
