/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * DescribeBudgetActionHistoriesRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class DescribeBudgetActionHistoriesRequestMarshaller {

    private static final MarshallingInfo<String> ACCOUNTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("AccountId").build();
    private static final MarshallingInfo<String> BUDGETNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("BudgetName").build();
    private static final MarshallingInfo<String> ACTIONID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("ActionId").build();
    private static final MarshallingInfo<StructuredPojo> TIMEPERIOD_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TimePeriod").build();
    private static final MarshallingInfo<Integer> MAXRESULTS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MaxResults").build();
    private static final MarshallingInfo<String> NEXTTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("NextToken").build();

    private static final DescribeBudgetActionHistoriesRequestMarshaller instance = new DescribeBudgetActionHistoriesRequestMarshaller();

    public static DescribeBudgetActionHistoriesRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(DescribeBudgetActionHistoriesRequest describeBudgetActionHistoriesRequest, ProtocolMarshaller protocolMarshaller) {

        if (describeBudgetActionHistoriesRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(describeBudgetActionHistoriesRequest.getAccountId(), ACCOUNTID_BINDING);
            protocolMarshaller.marshall(describeBudgetActionHistoriesRequest.getBudgetName(), BUDGETNAME_BINDING);
            protocolMarshaller.marshall(describeBudgetActionHistoriesRequest.getActionId(), ACTIONID_BINDING);
            protocolMarshaller.marshall(describeBudgetActionHistoriesRequest.getTimePeriod(), TIMEPERIOD_BINDING);
            protocolMarshaller.marshall(describeBudgetActionHistoriesRequest.getMaxResults(), MAXRESULTS_BINDING);
            protocolMarshaller.marshall(describeBudgetActionHistoriesRequest.getNextToken(), NEXTTOKEN_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
