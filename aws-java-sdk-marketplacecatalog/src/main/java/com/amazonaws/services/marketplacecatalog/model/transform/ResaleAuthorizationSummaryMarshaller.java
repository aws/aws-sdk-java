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
 * ResaleAuthorizationSummaryMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ResaleAuthorizationSummaryMarshaller {

    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Name").build();
    private static final MarshallingInfo<String> PRODUCTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("ProductId").build();
    private static final MarshallingInfo<String> PRODUCTNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ProductName").build();
    private static final MarshallingInfo<String> MANUFACTURERACCOUNTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ManufacturerAccountId").build();
    private static final MarshallingInfo<String> MANUFACTURERLEGALNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ManufacturerLegalName").build();
    private static final MarshallingInfo<String> RESELLERACCOUNTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ResellerAccountID").build();
    private static final MarshallingInfo<String> RESELLERLEGALNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ResellerLegalName").build();
    private static final MarshallingInfo<String> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Status").build();
    private static final MarshallingInfo<String> OFFEREXTENDEDSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("OfferExtendedStatus").build();
    private static final MarshallingInfo<String> CREATEDDATE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CreatedDate").build();
    private static final MarshallingInfo<String> AVAILABILITYENDDATE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AvailabilityEndDate").build();

    private static final ResaleAuthorizationSummaryMarshaller instance = new ResaleAuthorizationSummaryMarshaller();

    public static ResaleAuthorizationSummaryMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ResaleAuthorizationSummary resaleAuthorizationSummary, ProtocolMarshaller protocolMarshaller) {

        if (resaleAuthorizationSummary == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(resaleAuthorizationSummary.getName(), NAME_BINDING);
            protocolMarshaller.marshall(resaleAuthorizationSummary.getProductId(), PRODUCTID_BINDING);
            protocolMarshaller.marshall(resaleAuthorizationSummary.getProductName(), PRODUCTNAME_BINDING);
            protocolMarshaller.marshall(resaleAuthorizationSummary.getManufacturerAccountId(), MANUFACTURERACCOUNTID_BINDING);
            protocolMarshaller.marshall(resaleAuthorizationSummary.getManufacturerLegalName(), MANUFACTURERLEGALNAME_BINDING);
            protocolMarshaller.marshall(resaleAuthorizationSummary.getResellerAccountID(), RESELLERACCOUNTID_BINDING);
            protocolMarshaller.marshall(resaleAuthorizationSummary.getResellerLegalName(), RESELLERLEGALNAME_BINDING);
            protocolMarshaller.marshall(resaleAuthorizationSummary.getStatus(), STATUS_BINDING);
            protocolMarshaller.marshall(resaleAuthorizationSummary.getOfferExtendedStatus(), OFFEREXTENDEDSTATUS_BINDING);
            protocolMarshaller.marshall(resaleAuthorizationSummary.getCreatedDate(), CREATEDDATE_BINDING);
            protocolMarshaller.marshall(resaleAuthorizationSummary.getAvailabilityEndDate(), AVAILABILITYENDDATE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
