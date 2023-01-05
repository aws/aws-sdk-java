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
package com.amazonaws.services.budgets.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.budgets.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * HistoricalOptionsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class HistoricalOptionsMarshaller {

    private static final MarshallingInfo<Integer> BUDGETADJUSTMENTPERIOD_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("BudgetAdjustmentPeriod").build();
    private static final MarshallingInfo<Integer> LOOKBACKAVAILABLEPERIODS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LookBackAvailablePeriods").build();

    private static final HistoricalOptionsMarshaller instance = new HistoricalOptionsMarshaller();

    public static HistoricalOptionsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(HistoricalOptions historicalOptions, ProtocolMarshaller protocolMarshaller) {

        if (historicalOptions == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(historicalOptions.getBudgetAdjustmentPeriod(), BUDGETADJUSTMENTPERIOD_BINDING);
            protocolMarshaller.marshall(historicalOptions.getLookBackAvailablePeriods(), LOOKBACKAVAILABLEPERIODS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
