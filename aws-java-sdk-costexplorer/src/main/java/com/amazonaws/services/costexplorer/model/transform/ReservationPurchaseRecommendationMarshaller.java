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

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.costexplorer.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ReservationPurchaseRecommendationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ReservationPurchaseRecommendationMarshaller {

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
    private static final MarshallingInfo<List> RECOMMENDATIONDETAILS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RecommendationDetails").build();
    private static final MarshallingInfo<StructuredPojo> RECOMMENDATIONSUMMARY_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RecommendationSummary").build();

    private static final ReservationPurchaseRecommendationMarshaller instance = new ReservationPurchaseRecommendationMarshaller();

    public static ReservationPurchaseRecommendationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ReservationPurchaseRecommendation reservationPurchaseRecommendation, ProtocolMarshaller protocolMarshaller) {

        if (reservationPurchaseRecommendation == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(reservationPurchaseRecommendation.getAccountScope(), ACCOUNTSCOPE_BINDING);
            protocolMarshaller.marshall(reservationPurchaseRecommendation.getLookbackPeriodInDays(), LOOKBACKPERIODINDAYS_BINDING);
            protocolMarshaller.marshall(reservationPurchaseRecommendation.getTermInYears(), TERMINYEARS_BINDING);
            protocolMarshaller.marshall(reservationPurchaseRecommendation.getPaymentOption(), PAYMENTOPTION_BINDING);
            protocolMarshaller.marshall(reservationPurchaseRecommendation.getServiceSpecification(), SERVICESPECIFICATION_BINDING);
            protocolMarshaller.marshall(reservationPurchaseRecommendation.getRecommendationDetails(), RECOMMENDATIONDETAILS_BINDING);
            protocolMarshaller.marshall(reservationPurchaseRecommendation.getRecommendationSummary(), RECOMMENDATIONSUMMARY_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
