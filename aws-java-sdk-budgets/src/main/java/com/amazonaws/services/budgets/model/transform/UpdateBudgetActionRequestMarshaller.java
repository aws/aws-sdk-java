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

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.budgets.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * UpdateBudgetActionRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UpdateBudgetActionRequestMarshaller {

    private static final MarshallingInfo<String> ACCOUNTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("AccountId").build();
    private static final MarshallingInfo<String> BUDGETNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("BudgetName").build();
    private static final MarshallingInfo<String> ACTIONID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("ActionId").build();
    private static final MarshallingInfo<String> NOTIFICATIONTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("NotificationType").build();
    private static final MarshallingInfo<StructuredPojo> ACTIONTHRESHOLD_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ActionThreshold").build();
    private static final MarshallingInfo<StructuredPojo> DEFINITION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Definition").build();
    private static final MarshallingInfo<String> EXECUTIONROLEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ExecutionRoleArn").build();
    private static final MarshallingInfo<String> APPROVALMODEL_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ApprovalModel").build();
    private static final MarshallingInfo<List> SUBSCRIBERS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Subscribers").build();

    private static final UpdateBudgetActionRequestMarshaller instance = new UpdateBudgetActionRequestMarshaller();

    public static UpdateBudgetActionRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UpdateBudgetActionRequest updateBudgetActionRequest, ProtocolMarshaller protocolMarshaller) {

        if (updateBudgetActionRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(updateBudgetActionRequest.getAccountId(), ACCOUNTID_BINDING);
            protocolMarshaller.marshall(updateBudgetActionRequest.getBudgetName(), BUDGETNAME_BINDING);
            protocolMarshaller.marshall(updateBudgetActionRequest.getActionId(), ACTIONID_BINDING);
            protocolMarshaller.marshall(updateBudgetActionRequest.getNotificationType(), NOTIFICATIONTYPE_BINDING);
            protocolMarshaller.marshall(updateBudgetActionRequest.getActionThreshold(), ACTIONTHRESHOLD_BINDING);
            protocolMarshaller.marshall(updateBudgetActionRequest.getDefinition(), DEFINITION_BINDING);
            protocolMarshaller.marshall(updateBudgetActionRequest.getExecutionRoleArn(), EXECUTIONROLEARN_BINDING);
            protocolMarshaller.marshall(updateBudgetActionRequest.getApprovalModel(), APPROVALMODEL_BINDING);
            protocolMarshaller.marshall(updateBudgetActionRequest.getSubscribers(), SUBSCRIBERS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
