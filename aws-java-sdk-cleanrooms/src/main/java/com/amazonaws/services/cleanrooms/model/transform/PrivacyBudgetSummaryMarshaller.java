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
package com.amazonaws.services.cleanrooms.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.cleanrooms.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * PrivacyBudgetSummaryMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class PrivacyBudgetSummaryMarshaller {

    private static final MarshallingInfo<String> ID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("id").build();
    private static final MarshallingInfo<String> PRIVACYBUDGETTEMPLATEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("privacyBudgetTemplateId").build();
    private static final MarshallingInfo<String> PRIVACYBUDGETTEMPLATEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("privacyBudgetTemplateArn").build();
    private static final MarshallingInfo<String> MEMBERSHIPID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("membershipId").build();
    private static final MarshallingInfo<String> MEMBERSHIPARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("membershipArn").build();
    private static final MarshallingInfo<String> COLLABORATIONID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("collaborationId").build();
    private static final MarshallingInfo<String> COLLABORATIONARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("collaborationArn").build();
    private static final MarshallingInfo<String> TYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("type").build();
    private static final MarshallingInfo<java.util.Date> CREATETIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("createTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> UPDATETIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("updateTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<StructuredPojo> BUDGET_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("budget").build();

    private static final PrivacyBudgetSummaryMarshaller instance = new PrivacyBudgetSummaryMarshaller();

    public static PrivacyBudgetSummaryMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(PrivacyBudgetSummary privacyBudgetSummary, ProtocolMarshaller protocolMarshaller) {

        if (privacyBudgetSummary == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(privacyBudgetSummary.getId(), ID_BINDING);
            protocolMarshaller.marshall(privacyBudgetSummary.getPrivacyBudgetTemplateId(), PRIVACYBUDGETTEMPLATEID_BINDING);
            protocolMarshaller.marshall(privacyBudgetSummary.getPrivacyBudgetTemplateArn(), PRIVACYBUDGETTEMPLATEARN_BINDING);
            protocolMarshaller.marshall(privacyBudgetSummary.getMembershipId(), MEMBERSHIPID_BINDING);
            protocolMarshaller.marshall(privacyBudgetSummary.getMembershipArn(), MEMBERSHIPARN_BINDING);
            protocolMarshaller.marshall(privacyBudgetSummary.getCollaborationId(), COLLABORATIONID_BINDING);
            protocolMarshaller.marshall(privacyBudgetSummary.getCollaborationArn(), COLLABORATIONARN_BINDING);
            protocolMarshaller.marshall(privacyBudgetSummary.getType(), TYPE_BINDING);
            protocolMarshaller.marshall(privacyBudgetSummary.getCreateTime(), CREATETIME_BINDING);
            protocolMarshaller.marshall(privacyBudgetSummary.getUpdateTime(), UPDATETIME_BINDING);
            protocolMarshaller.marshall(privacyBudgetSummary.getBudget(), BUDGET_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
