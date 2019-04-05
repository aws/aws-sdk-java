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
package com.amazonaws.services.costexplorer.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.costexplorer.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * GetReservationPurchaseRecommendationRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class GetReservationPurchaseRecommendationRequestMarshaller {

    private static final MarshallingInfo<String> ACCOUNTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("AccountId").build();
    private static final MarshallingInfo<String> SERVICE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Service").build();
    private static final MarshallingInfo<String> ACCOUNTSCOPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AccountScope").build();
    private static final MarshallingInfo<String> LOOKBACKPERIODINDAYS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LookbackPeriodInDays").build();
    private static final MarshallingInfo<String> TERMINYEARS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TermInYears").build();
    private static final MarshallingInfo<String> PAYMENTOPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PaymentOption").build();
    private static final MarshallingInfo<StructuredPojo> SERVICESPECIFICATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ServiceSpecification").build();
    private static final MarshallingInfo<Integer> PAGESIZE_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PageSize").build();
    private static final MarshallingInfo<String> NEXTPAGETOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("NextPageToken").build();

    private static final GetReservationPurchaseRecommendationRequestMarshaller instance = new GetReservationPurchaseRecommendationRequestMarshaller();

    public static GetReservationPurchaseRecommendationRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(GetReservationPurchaseRecommendationRequest getReservationPurchaseRecommendationRequest, ProtocolMarshaller protocolMarshaller) {

        if (getReservationPurchaseRecommendationRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(getReservationPurchaseRecommendationRequest.getAccountId(), ACCOUNTID_BINDING);
            protocolMarshaller.marshall(getReservationPurchaseRecommendationRequest.getService(), SERVICE_BINDING);
            protocolMarshaller.marshall(getReservationPurchaseRecommendationRequest.getAccountScope(), ACCOUNTSCOPE_BINDING);
            protocolMarshaller.marshall(getReservationPurchaseRecommendationRequest.getLookbackPeriodInDays(), LOOKBACKPERIODINDAYS_BINDING);
            protocolMarshaller.marshall(getReservationPurchaseRecommendationRequest.getTermInYears(), TERMINYEARS_BINDING);
            protocolMarshaller.marshall(getReservationPurchaseRecommendationRequest.getPaymentOption(), PAYMENTOPTION_BINDING);
            protocolMarshaller.marshall(getReservationPurchaseRecommendationRequest.getServiceSpecification(), SERVICESPECIFICATION_BINDING);
            protocolMarshaller.marshall(getReservationPurchaseRecommendationRequest.getPageSize(), PAGESIZE_BINDING);
            protocolMarshaller.marshall(getReservationPurchaseRecommendationRequest.getNextPageToken(), NEXTPAGETOKEN_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
