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
package com.amazonaws.services.medialive.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.medialive.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * OfferingMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class OfferingMarshaller {

    private static final MarshallingInfo<String> ARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("arn").build();
    private static final MarshallingInfo<String> CURRENCYCODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("currencyCode").build();
    private static final MarshallingInfo<Integer> DURATION_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("duration").build();
    private static final MarshallingInfo<String> DURATIONUNITS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("durationUnits").build();
    private static final MarshallingInfo<Double> FIXEDPRICE_BINDING = MarshallingInfo.builder(MarshallingType.DOUBLE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("fixedPrice").build();
    private static final MarshallingInfo<String> OFFERINGDESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("offeringDescription").build();
    private static final MarshallingInfo<String> OFFERINGID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("offeringId").build();
    private static final MarshallingInfo<String> OFFERINGTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("offeringType").build();
    private static final MarshallingInfo<String> REGION_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("region").build();
    private static final MarshallingInfo<StructuredPojo> RESOURCESPECIFICATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("resourceSpecification").build();
    private static final MarshallingInfo<Double> USAGEPRICE_BINDING = MarshallingInfo.builder(MarshallingType.DOUBLE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("usagePrice").build();

    private static final OfferingMarshaller instance = new OfferingMarshaller();

    public static OfferingMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(Offering offering, ProtocolMarshaller protocolMarshaller) {

        if (offering == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(offering.getArn(), ARN_BINDING);
            protocolMarshaller.marshall(offering.getCurrencyCode(), CURRENCYCODE_BINDING);
            protocolMarshaller.marshall(offering.getDuration(), DURATION_BINDING);
            protocolMarshaller.marshall(offering.getDurationUnits(), DURATIONUNITS_BINDING);
            protocolMarshaller.marshall(offering.getFixedPrice(), FIXEDPRICE_BINDING);
            protocolMarshaller.marshall(offering.getOfferingDescription(), OFFERINGDESCRIPTION_BINDING);
            protocolMarshaller.marshall(offering.getOfferingId(), OFFERINGID_BINDING);
            protocolMarshaller.marshall(offering.getOfferingType(), OFFERINGTYPE_BINDING);
            protocolMarshaller.marshall(offering.getRegion(), REGION_BINDING);
            protocolMarshaller.marshall(offering.getResourceSpecification(), RESOURCESPECIFICATION_BINDING);
            protocolMarshaller.marshall(offering.getUsagePrice(), USAGEPRICE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
