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
package com.amazonaws.services.marketplacecatalog.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.marketplacecatalog.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * OfferFiltersMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class OfferFiltersMarshaller {

    private static final MarshallingInfo<StructuredPojo> ENTITYID_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EntityId").build();
    private static final MarshallingInfo<StructuredPojo> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Name").build();
    private static final MarshallingInfo<StructuredPojo> PRODUCTID_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ProductId").build();
    private static final MarshallingInfo<StructuredPojo> RESALEAUTHORIZATIONID_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ResaleAuthorizationId").build();
    private static final MarshallingInfo<StructuredPojo> RELEASEDATE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ReleaseDate").build();
    private static final MarshallingInfo<StructuredPojo> AVAILABILITYENDDATE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AvailabilityEndDate").build();
    private static final MarshallingInfo<StructuredPojo> BUYERACCOUNTS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("BuyerAccounts").build();
    private static final MarshallingInfo<StructuredPojo> STATE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("State").build();
    private static final MarshallingInfo<StructuredPojo> TARGETING_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Targeting").build();
    private static final MarshallingInfo<StructuredPojo> LASTMODIFIEDDATE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LastModifiedDate").build();

    private static final OfferFiltersMarshaller instance = new OfferFiltersMarshaller();

    public static OfferFiltersMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(OfferFilters offerFilters, ProtocolMarshaller protocolMarshaller) {

        if (offerFilters == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(offerFilters.getEntityId(), ENTITYID_BINDING);
            protocolMarshaller.marshall(offerFilters.getName(), NAME_BINDING);
            protocolMarshaller.marshall(offerFilters.getProductId(), PRODUCTID_BINDING);
            protocolMarshaller.marshall(offerFilters.getResaleAuthorizationId(), RESALEAUTHORIZATIONID_BINDING);
            protocolMarshaller.marshall(offerFilters.getReleaseDate(), RELEASEDATE_BINDING);
            protocolMarshaller.marshall(offerFilters.getAvailabilityEndDate(), AVAILABILITYENDDATE_BINDING);
            protocolMarshaller.marshall(offerFilters.getBuyerAccounts(), BUYERACCOUNTS_BINDING);
            protocolMarshaller.marshall(offerFilters.getState(), STATE_BINDING);
            protocolMarshaller.marshall(offerFilters.getTargeting(), TARGETING_BINDING);
            protocolMarshaller.marshall(offerFilters.getLastModifiedDate(), LASTMODIFIEDDATE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
