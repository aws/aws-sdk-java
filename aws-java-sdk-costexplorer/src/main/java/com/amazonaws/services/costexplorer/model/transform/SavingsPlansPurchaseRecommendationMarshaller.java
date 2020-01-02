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
package com.amazonaws.services.costexplorer.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.costexplorer.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * SavingsPlansPurchaseRecommendationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class SavingsPlansPurchaseRecommendationMarshaller {

    private static final MarshallingInfo<String> SAVINGSPLANSTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SavingsPlansType").build();
    private static final MarshallingInfo<String> TERMINYEARS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TermInYears").build();
    private static final MarshallingInfo<String> PAYMENTOPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PaymentOption").build();
    private static final MarshallingInfo<String> LOOKBACKPERIODINDAYS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LookbackPeriodInDays").build();
    private static final MarshallingInfo<List> SAVINGSPLANSPURCHASERECOMMENDATIONDETAILS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SavingsPlansPurchaseRecommendationDetails").build();
    private static final MarshallingInfo<StructuredPojo> SAVINGSPLANSPURCHASERECOMMENDATIONSUMMARY_BINDING = MarshallingInfo
            .builder(MarshallingType.STRUCTURED).marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SavingsPlansPurchaseRecommendationSummary")
            .build();

    private static final SavingsPlansPurchaseRecommendationMarshaller instance = new SavingsPlansPurchaseRecommendationMarshaller();

    public static SavingsPlansPurchaseRecommendationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(SavingsPlansPurchaseRecommendation savingsPlansPurchaseRecommendation, ProtocolMarshaller protocolMarshaller) {

        if (savingsPlansPurchaseRecommendation == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(savingsPlansPurchaseRecommendation.getSavingsPlansType(), SAVINGSPLANSTYPE_BINDING);
            protocolMarshaller.marshall(savingsPlansPurchaseRecommendation.getTermInYears(), TERMINYEARS_BINDING);
            protocolMarshaller.marshall(savingsPlansPurchaseRecommendation.getPaymentOption(), PAYMENTOPTION_BINDING);
            protocolMarshaller.marshall(savingsPlansPurchaseRecommendation.getLookbackPeriodInDays(), LOOKBACKPERIODINDAYS_BINDING);
            protocolMarshaller.marshall(savingsPlansPurchaseRecommendation.getSavingsPlansPurchaseRecommendationDetails(),
                    SAVINGSPLANSPURCHASERECOMMENDATIONDETAILS_BINDING);
            protocolMarshaller.marshall(savingsPlansPurchaseRecommendation.getSavingsPlansPurchaseRecommendationSummary(),
                    SAVINGSPLANSPURCHASERECOMMENDATIONSUMMARY_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
