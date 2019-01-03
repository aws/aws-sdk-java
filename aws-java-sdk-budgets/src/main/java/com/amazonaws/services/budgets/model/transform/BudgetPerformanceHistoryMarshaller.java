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

import java.util.Map;
import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.budgets.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * BudgetPerformanceHistoryMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class BudgetPerformanceHistoryMarshaller {

    private static final MarshallingInfo<String> BUDGETNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("BudgetName").build();
    private static final MarshallingInfo<String> BUDGETTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("BudgetType").build();
    private static final MarshallingInfo<Map> COSTFILTERS_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("CostFilters").build();
    private static final MarshallingInfo<StructuredPojo> COSTTYPES_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CostTypes").build();
    private static final MarshallingInfo<String> TIMEUNIT_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("TimeUnit").build();
    private static final MarshallingInfo<List> BUDGETEDANDACTUALAMOUNTSLIST_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("BudgetedAndActualAmountsList").build();

    private static final BudgetPerformanceHistoryMarshaller instance = new BudgetPerformanceHistoryMarshaller();

    public static BudgetPerformanceHistoryMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(BudgetPerformanceHistory budgetPerformanceHistory, ProtocolMarshaller protocolMarshaller) {

        if (budgetPerformanceHistory == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(budgetPerformanceHistory.getBudgetName(), BUDGETNAME_BINDING);
            protocolMarshaller.marshall(budgetPerformanceHistory.getBudgetType(), BUDGETTYPE_BINDING);
            protocolMarshaller.marshall(budgetPerformanceHistory.getCostFilters(), COSTFILTERS_BINDING);
            protocolMarshaller.marshall(budgetPerformanceHistory.getCostTypes(), COSTTYPES_BINDING);
            protocolMarshaller.marshall(budgetPerformanceHistory.getTimeUnit(), TIMEUNIT_BINDING);
            protocolMarshaller.marshall(budgetPerformanceHistory.getBudgetedAndActualAmountsList(), BUDGETEDANDACTUALAMOUNTSLIST_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
