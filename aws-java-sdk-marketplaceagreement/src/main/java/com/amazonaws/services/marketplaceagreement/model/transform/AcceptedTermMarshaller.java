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
package com.amazonaws.services.marketplaceagreement.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.marketplaceagreement.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * AcceptedTermMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AcceptedTermMarshaller {

    private static final MarshallingInfo<StructuredPojo> BYOLPRICINGTERM_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("byolPricingTerm").build();
    private static final MarshallingInfo<StructuredPojo> CONFIGURABLEUPFRONTPRICINGTERM_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("configurableUpfrontPricingTerm").build();
    private static final MarshallingInfo<StructuredPojo> FIXEDUPFRONTPRICINGTERM_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("fixedUpfrontPricingTerm").build();
    private static final MarshallingInfo<StructuredPojo> FREETRIALPRICINGTERM_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("freeTrialPricingTerm").build();
    private static final MarshallingInfo<StructuredPojo> LEGALTERM_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("legalTerm").build();
    private static final MarshallingInfo<StructuredPojo> PAYMENTSCHEDULETERM_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("paymentScheduleTerm").build();
    private static final MarshallingInfo<StructuredPojo> RECURRINGPAYMENTTERM_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("recurringPaymentTerm").build();
    private static final MarshallingInfo<StructuredPojo> RENEWALTERM_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("renewalTerm").build();
    private static final MarshallingInfo<StructuredPojo> SUPPORTTERM_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("supportTerm").build();
    private static final MarshallingInfo<StructuredPojo> USAGEBASEDPRICINGTERM_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("usageBasedPricingTerm").build();
    private static final MarshallingInfo<StructuredPojo> VALIDITYTERM_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("validityTerm").build();

    private static final AcceptedTermMarshaller instance = new AcceptedTermMarshaller();

    public static AcceptedTermMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AcceptedTerm acceptedTerm, ProtocolMarshaller protocolMarshaller) {

        if (acceptedTerm == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(acceptedTerm.getByolPricingTerm(), BYOLPRICINGTERM_BINDING);
            protocolMarshaller.marshall(acceptedTerm.getConfigurableUpfrontPricingTerm(), CONFIGURABLEUPFRONTPRICINGTERM_BINDING);
            protocolMarshaller.marshall(acceptedTerm.getFixedUpfrontPricingTerm(), FIXEDUPFRONTPRICINGTERM_BINDING);
            protocolMarshaller.marshall(acceptedTerm.getFreeTrialPricingTerm(), FREETRIALPRICINGTERM_BINDING);
            protocolMarshaller.marshall(acceptedTerm.getLegalTerm(), LEGALTERM_BINDING);
            protocolMarshaller.marshall(acceptedTerm.getPaymentScheduleTerm(), PAYMENTSCHEDULETERM_BINDING);
            protocolMarshaller.marshall(acceptedTerm.getRecurringPaymentTerm(), RECURRINGPAYMENTTERM_BINDING);
            protocolMarshaller.marshall(acceptedTerm.getRenewalTerm(), RENEWALTERM_BINDING);
            protocolMarshaller.marshall(acceptedTerm.getSupportTerm(), SUPPORTTERM_BINDING);
            protocolMarshaller.marshall(acceptedTerm.getUsageBasedPricingTerm(), USAGEBASEDPRICINGTERM_BINDING);
            protocolMarshaller.marshall(acceptedTerm.getValidityTerm(), VALIDITYTERM_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
