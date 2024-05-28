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
package com.amazonaws.services.trustedadvisor.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.trustedadvisor.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * AccountRecommendationLifecycleSummaryMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AccountRecommendationLifecycleSummaryMarshaller {

    private static final MarshallingInfo<String> ACCOUNTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("accountId").build();
    private static final MarshallingInfo<String> ACCOUNTRECOMMENDATIONARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("accountRecommendationArn").build();
    private static final MarshallingInfo<java.util.Date> LASTUPDATEDAT_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("lastUpdatedAt").timestampFormat("iso8601").build();
    private static final MarshallingInfo<String> LIFECYCLESTAGE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("lifecycleStage").build();
    private static final MarshallingInfo<String> UPDATEREASON_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("updateReason").build();
    private static final MarshallingInfo<String> UPDATEREASONCODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("updateReasonCode").build();
    private static final MarshallingInfo<String> UPDATEDONBEHALFOF_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("updatedOnBehalfOf").build();
    private static final MarshallingInfo<String> UPDATEDONBEHALFOFJOBTITLE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("updatedOnBehalfOfJobTitle").build();

    private static final AccountRecommendationLifecycleSummaryMarshaller instance = new AccountRecommendationLifecycleSummaryMarshaller();

    public static AccountRecommendationLifecycleSummaryMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AccountRecommendationLifecycleSummary accountRecommendationLifecycleSummary, ProtocolMarshaller protocolMarshaller) {

        if (accountRecommendationLifecycleSummary == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(accountRecommendationLifecycleSummary.getAccountId(), ACCOUNTID_BINDING);
            protocolMarshaller.marshall(accountRecommendationLifecycleSummary.getAccountRecommendationArn(), ACCOUNTRECOMMENDATIONARN_BINDING);
            protocolMarshaller.marshall(accountRecommendationLifecycleSummary.getLastUpdatedAt(), LASTUPDATEDAT_BINDING);
            protocolMarshaller.marshall(accountRecommendationLifecycleSummary.getLifecycleStage(), LIFECYCLESTAGE_BINDING);
            protocolMarshaller.marshall(accountRecommendationLifecycleSummary.getUpdateReason(), UPDATEREASON_BINDING);
            protocolMarshaller.marshall(accountRecommendationLifecycleSummary.getUpdateReasonCode(), UPDATEREASONCODE_BINDING);
            protocolMarshaller.marshall(accountRecommendationLifecycleSummary.getUpdatedOnBehalfOf(), UPDATEDONBEHALFOF_BINDING);
            protocolMarshaller.marshall(accountRecommendationLifecycleSummary.getUpdatedOnBehalfOfJobTitle(), UPDATEDONBEHALFOFJOBTITLE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
