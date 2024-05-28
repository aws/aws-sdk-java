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
 * ResaleAuthorizationFiltersMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ResaleAuthorizationFiltersMarshaller {

    private static final MarshallingInfo<StructuredPojo> ENTITYID_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EntityId").build();
    private static final MarshallingInfo<StructuredPojo> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Name").build();
    private static final MarshallingInfo<StructuredPojo> PRODUCTID_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ProductId").build();
    private static final MarshallingInfo<StructuredPojo> CREATEDDATE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CreatedDate").build();
    private static final MarshallingInfo<StructuredPojo> AVAILABILITYENDDATE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AvailabilityEndDate").build();
    private static final MarshallingInfo<StructuredPojo> MANUFACTURERACCOUNTID_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ManufacturerAccountId").build();
    private static final MarshallingInfo<StructuredPojo> PRODUCTNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ProductName").build();
    private static final MarshallingInfo<StructuredPojo> MANUFACTURERLEGALNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ManufacturerLegalName").build();
    private static final MarshallingInfo<StructuredPojo> RESELLERACCOUNTID_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ResellerAccountID").build();
    private static final MarshallingInfo<StructuredPojo> RESELLERLEGALNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ResellerLegalName").build();
    private static final MarshallingInfo<StructuredPojo> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Status").build();
    private static final MarshallingInfo<StructuredPojo> OFFEREXTENDEDSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("OfferExtendedStatus").build();
    private static final MarshallingInfo<StructuredPojo> LASTMODIFIEDDATE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LastModifiedDate").build();

    private static final ResaleAuthorizationFiltersMarshaller instance = new ResaleAuthorizationFiltersMarshaller();

    public static ResaleAuthorizationFiltersMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ResaleAuthorizationFilters resaleAuthorizationFilters, ProtocolMarshaller protocolMarshaller) {

        if (resaleAuthorizationFilters == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(resaleAuthorizationFilters.getEntityId(), ENTITYID_BINDING);
            protocolMarshaller.marshall(resaleAuthorizationFilters.getName(), NAME_BINDING);
            protocolMarshaller.marshall(resaleAuthorizationFilters.getProductId(), PRODUCTID_BINDING);
            protocolMarshaller.marshall(resaleAuthorizationFilters.getCreatedDate(), CREATEDDATE_BINDING);
            protocolMarshaller.marshall(resaleAuthorizationFilters.getAvailabilityEndDate(), AVAILABILITYENDDATE_BINDING);
            protocolMarshaller.marshall(resaleAuthorizationFilters.getManufacturerAccountId(), MANUFACTURERACCOUNTID_BINDING);
            protocolMarshaller.marshall(resaleAuthorizationFilters.getProductName(), PRODUCTNAME_BINDING);
            protocolMarshaller.marshall(resaleAuthorizationFilters.getManufacturerLegalName(), MANUFACTURERLEGALNAME_BINDING);
            protocolMarshaller.marshall(resaleAuthorizationFilters.getResellerAccountID(), RESELLERACCOUNTID_BINDING);
            protocolMarshaller.marshall(resaleAuthorizationFilters.getResellerLegalName(), RESELLERLEGALNAME_BINDING);
            protocolMarshaller.marshall(resaleAuthorizationFilters.getStatus(), STATUS_BINDING);
            protocolMarshaller.marshall(resaleAuthorizationFilters.getOfferExtendedStatus(), OFFEREXTENDEDSTATUS_BINDING);
            protocolMarshaller.marshall(resaleAuthorizationFilters.getLastModifiedDate(), LASTMODIFIEDDATE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
