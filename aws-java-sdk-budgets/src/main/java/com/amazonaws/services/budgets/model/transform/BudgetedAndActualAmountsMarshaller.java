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
package com.amazonaws.services.budgets.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.budgets.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * BudgetedAndActualAmountsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class BudgetedAndActualAmountsMarshaller {

    private static final MarshallingInfo<StructuredPojo> BUDGETEDAMOUNT_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("BudgetedAmount").build();
    private static final MarshallingInfo<StructuredPojo> ACTUALAMOUNT_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ActualAmount").build();
    private static final MarshallingInfo<StructuredPojo> TIMEPERIOD_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TimePeriod").build();

    private static final BudgetedAndActualAmountsMarshaller instance = new BudgetedAndActualAmountsMarshaller();

    public static BudgetedAndActualAmountsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(BudgetedAndActualAmounts budgetedAndActualAmounts, ProtocolMarshaller protocolMarshaller) {

        if (budgetedAndActualAmounts == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(budgetedAndActualAmounts.getBudgetedAmount(), BUDGETEDAMOUNT_BINDING);
            protocolMarshaller.marshall(budgetedAndActualAmounts.getActualAmount(), ACTUALAMOUNT_BINDING);
            protocolMarshaller.marshall(budgetedAndActualAmounts.getTimePeriod(), TIMEPERIOD_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
