/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.savingsplans.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.savingsplans.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * DescribeSavingsPlansOfferingsRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class DescribeSavingsPlansOfferingsRequestMarshaller {

    private static final MarshallingInfo<List> OFFERINGIDS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("offeringIds").build();
    private static final MarshallingInfo<List> PAYMENTOPTIONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("paymentOptions").build();
    private static final MarshallingInfo<String> PRODUCTTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("productType").build();
    private static final MarshallingInfo<List> PLANTYPES_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("planTypes").build();
    private static final MarshallingInfo<List> DURATIONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("durations").build();
    private static final MarshallingInfo<List> CURRENCIES_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("currencies").build();
    private static final MarshallingInfo<List> DESCRIPTIONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("descriptions").build();
    private static final MarshallingInfo<List> SERVICECODES_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("serviceCodes").build();
    private static final MarshallingInfo<List> USAGETYPES_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("usageTypes").build();
    private static final MarshallingInfo<List> OPERATIONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("operations").build();
    private static final MarshallingInfo<List> FILTERS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("filters").build();
    private static final MarshallingInfo<String> NEXTTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("nextToken").build();
    private static final MarshallingInfo<Integer> MAXRESULTS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("maxResults").build();

    private static final DescribeSavingsPlansOfferingsRequestMarshaller instance = new DescribeSavingsPlansOfferingsRequestMarshaller();

    public static DescribeSavingsPlansOfferingsRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(DescribeSavingsPlansOfferingsRequest describeSavingsPlansOfferingsRequest, ProtocolMarshaller protocolMarshaller) {

        if (describeSavingsPlansOfferingsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(describeSavingsPlansOfferingsRequest.getOfferingIds(), OFFERINGIDS_BINDING);
            protocolMarshaller.marshall(describeSavingsPlansOfferingsRequest.getPaymentOptions(), PAYMENTOPTIONS_BINDING);
            protocolMarshaller.marshall(describeSavingsPlansOfferingsRequest.getProductType(), PRODUCTTYPE_BINDING);
            protocolMarshaller.marshall(describeSavingsPlansOfferingsRequest.getPlanTypes(), PLANTYPES_BINDING);
            protocolMarshaller.marshall(describeSavingsPlansOfferingsRequest.getDurations(), DURATIONS_BINDING);
            protocolMarshaller.marshall(describeSavingsPlansOfferingsRequest.getCurrencies(), CURRENCIES_BINDING);
            protocolMarshaller.marshall(describeSavingsPlansOfferingsRequest.getDescriptions(), DESCRIPTIONS_BINDING);
            protocolMarshaller.marshall(describeSavingsPlansOfferingsRequest.getServiceCodes(), SERVICECODES_BINDING);
            protocolMarshaller.marshall(describeSavingsPlansOfferingsRequest.getUsageTypes(), USAGETYPES_BINDING);
            protocolMarshaller.marshall(describeSavingsPlansOfferingsRequest.getOperations(), OPERATIONS_BINDING);
            protocolMarshaller.marshall(describeSavingsPlansOfferingsRequest.getFilters(), FILTERS_BINDING);
            protocolMarshaller.marshall(describeSavingsPlansOfferingsRequest.getNextToken(), NEXTTOKEN_BINDING);
            protocolMarshaller.marshall(describeSavingsPlansOfferingsRequest.getMaxResults(), MAXRESULTS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
