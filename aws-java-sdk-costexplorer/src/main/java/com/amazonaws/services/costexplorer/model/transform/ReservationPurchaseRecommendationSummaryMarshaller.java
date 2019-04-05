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
 * ReservationPurchaseRecommendationSummaryMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ReservationPurchaseRecommendationSummaryMarshaller {

    private static final MarshallingInfo<String> TOTALESTIMATEDMONTHLYSAVINGSAMOUNT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TotalEstimatedMonthlySavingsAmount").build();
    private static final MarshallingInfo<String> TOTALESTIMATEDMONTHLYSAVINGSPERCENTAGE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TotalEstimatedMonthlySavingsPercentage").build();
    private static final MarshallingInfo<String> CURRENCYCODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CurrencyCode").build();

    private static final ReservationPurchaseRecommendationSummaryMarshaller instance = new ReservationPurchaseRecommendationSummaryMarshaller();

    public static ReservationPurchaseRecommendationSummaryMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ReservationPurchaseRecommendationSummary reservationPurchaseRecommendationSummary, ProtocolMarshaller protocolMarshaller) {

        if (reservationPurchaseRecommendationSummary == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(reservationPurchaseRecommendationSummary.getTotalEstimatedMonthlySavingsAmount(),
                    TOTALESTIMATEDMONTHLYSAVINGSAMOUNT_BINDING);
            protocolMarshaller.marshall(reservationPurchaseRecommendationSummary.getTotalEstimatedMonthlySavingsPercentage(),
                    TOTALESTIMATEDMONTHLYSAVINGSPERCENTAGE_BINDING);
            protocolMarshaller.marshall(reservationPurchaseRecommendationSummary.getCurrencyCode(), CURRENCYCODE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
