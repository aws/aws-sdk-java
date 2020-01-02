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
 * DescribeSavingsPlansOfferingRatesRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class DescribeSavingsPlansOfferingRatesRequestMarshaller {

    private static final MarshallingInfo<List> SAVINGSPLANOFFERINGIDS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("savingsPlanOfferingIds").build();
    private static final MarshallingInfo<List> SAVINGSPLANPAYMENTOPTIONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("savingsPlanPaymentOptions").build();
    private static final MarshallingInfo<List> SAVINGSPLANTYPES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("savingsPlanTypes").build();
    private static final MarshallingInfo<List> PRODUCTS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("products").build();
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

    private static final DescribeSavingsPlansOfferingRatesRequestMarshaller instance = new DescribeSavingsPlansOfferingRatesRequestMarshaller();

    public static DescribeSavingsPlansOfferingRatesRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(DescribeSavingsPlansOfferingRatesRequest describeSavingsPlansOfferingRatesRequest, ProtocolMarshaller protocolMarshaller) {

        if (describeSavingsPlansOfferingRatesRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(describeSavingsPlansOfferingRatesRequest.getSavingsPlanOfferingIds(), SAVINGSPLANOFFERINGIDS_BINDING);
            protocolMarshaller.marshall(describeSavingsPlansOfferingRatesRequest.getSavingsPlanPaymentOptions(), SAVINGSPLANPAYMENTOPTIONS_BINDING);
            protocolMarshaller.marshall(describeSavingsPlansOfferingRatesRequest.getSavingsPlanTypes(), SAVINGSPLANTYPES_BINDING);
            protocolMarshaller.marshall(describeSavingsPlansOfferingRatesRequest.getProducts(), PRODUCTS_BINDING);
            protocolMarshaller.marshall(describeSavingsPlansOfferingRatesRequest.getServiceCodes(), SERVICECODES_BINDING);
            protocolMarshaller.marshall(describeSavingsPlansOfferingRatesRequest.getUsageTypes(), USAGETYPES_BINDING);
            protocolMarshaller.marshall(describeSavingsPlansOfferingRatesRequest.getOperations(), OPERATIONS_BINDING);
            protocolMarshaller.marshall(describeSavingsPlansOfferingRatesRequest.getFilters(), FILTERS_BINDING);
            protocolMarshaller.marshall(describeSavingsPlansOfferingRatesRequest.getNextToken(), NEXTTOKEN_BINDING);
            protocolMarshaller.marshall(describeSavingsPlansOfferingRatesRequest.getMaxResults(), MAXRESULTS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
