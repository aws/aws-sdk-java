/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.billingconductor.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.billingconductor.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ListCustomLineItemVersionsBillingPeriodRangeFilterMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ListCustomLineItemVersionsBillingPeriodRangeFilterMarshaller {

    private static final MarshallingInfo<String> STARTBILLINGPERIOD_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StartBillingPeriod").build();
    private static final MarshallingInfo<String> ENDBILLINGPERIOD_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EndBillingPeriod").build();

    private static final ListCustomLineItemVersionsBillingPeriodRangeFilterMarshaller instance = new ListCustomLineItemVersionsBillingPeriodRangeFilterMarshaller();

    public static ListCustomLineItemVersionsBillingPeriodRangeFilterMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ListCustomLineItemVersionsBillingPeriodRangeFilter listCustomLineItemVersionsBillingPeriodRangeFilter,
            ProtocolMarshaller protocolMarshaller) {

        if (listCustomLineItemVersionsBillingPeriodRangeFilter == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(listCustomLineItemVersionsBillingPeriodRangeFilter.getStartBillingPeriod(), STARTBILLINGPERIOD_BINDING);
            protocolMarshaller.marshall(listCustomLineItemVersionsBillingPeriodRangeFilter.getEndBillingPeriod(), ENDBILLINGPERIOD_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
