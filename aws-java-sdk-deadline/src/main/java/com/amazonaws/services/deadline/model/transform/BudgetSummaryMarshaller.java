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
package com.amazonaws.services.deadline.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.deadline.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * BudgetSummaryMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class BudgetSummaryMarshaller {

    private static final MarshallingInfo<Float> APPROXIMATEDOLLARLIMIT_BINDING = MarshallingInfo.builder(MarshallingType.FLOAT)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("approximateDollarLimit").build();
    private static final MarshallingInfo<String> BUDGETID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("budgetId").build();
    private static final MarshallingInfo<java.util.Date> CREATEDAT_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("createdAt").timestampFormat("iso8601").build();
    private static final MarshallingInfo<String> CREATEDBY_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("createdBy").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("description").build();
    private static final MarshallingInfo<String> DISPLAYNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("displayName").build();
    private static final MarshallingInfo<String> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("status").build();
    private static final MarshallingInfo<java.util.Date> UPDATEDAT_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("updatedAt").timestampFormat("iso8601").build();
    private static final MarshallingInfo<String> UPDATEDBY_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("updatedBy").build();
    private static final MarshallingInfo<StructuredPojo> USAGETRACKINGRESOURCE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("usageTrackingResource").build();
    private static final MarshallingInfo<StructuredPojo> USAGES_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("usages").build();

    private static final BudgetSummaryMarshaller instance = new BudgetSummaryMarshaller();

    public static BudgetSummaryMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(BudgetSummary budgetSummary, ProtocolMarshaller protocolMarshaller) {

        if (budgetSummary == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(budgetSummary.getApproximateDollarLimit(), APPROXIMATEDOLLARLIMIT_BINDING);
            protocolMarshaller.marshall(budgetSummary.getBudgetId(), BUDGETID_BINDING);
            protocolMarshaller.marshall(budgetSummary.getCreatedAt(), CREATEDAT_BINDING);
            protocolMarshaller.marshall(budgetSummary.getCreatedBy(), CREATEDBY_BINDING);
            protocolMarshaller.marshall(budgetSummary.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(budgetSummary.getDisplayName(), DISPLAYNAME_BINDING);
            protocolMarshaller.marshall(budgetSummary.getStatus(), STATUS_BINDING);
            protocolMarshaller.marshall(budgetSummary.getUpdatedAt(), UPDATEDAT_BINDING);
            protocolMarshaller.marshall(budgetSummary.getUpdatedBy(), UPDATEDBY_BINDING);
            protocolMarshaller.marshall(budgetSummary.getUsageTrackingResource(), USAGETRACKINGRESOURCE_BINDING);
            protocolMarshaller.marshall(budgetSummary.getUsages(), USAGES_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
