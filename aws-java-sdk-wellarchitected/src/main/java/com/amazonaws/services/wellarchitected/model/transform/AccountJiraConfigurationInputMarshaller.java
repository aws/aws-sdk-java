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
package com.amazonaws.services.wellarchitected.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.wellarchitected.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * AccountJiraConfigurationInputMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AccountJiraConfigurationInputMarshaller {

    private static final MarshallingInfo<String> ISSUEMANAGEMENTSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("IssueManagementStatus").build();
    private static final MarshallingInfo<String> ISSUEMANAGEMENTTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("IssueManagementType").build();
    private static final MarshallingInfo<String> JIRAPROJECTKEY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("JiraProjectKey").build();
    private static final MarshallingInfo<String> INTEGRATIONSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("IntegrationStatus").build();

    private static final AccountJiraConfigurationInputMarshaller instance = new AccountJiraConfigurationInputMarshaller();

    public static AccountJiraConfigurationInputMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AccountJiraConfigurationInput accountJiraConfigurationInput, ProtocolMarshaller protocolMarshaller) {

        if (accountJiraConfigurationInput == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(accountJiraConfigurationInput.getIssueManagementStatus(), ISSUEMANAGEMENTSTATUS_BINDING);
            protocolMarshaller.marshall(accountJiraConfigurationInput.getIssueManagementType(), ISSUEMANAGEMENTTYPE_BINDING);
            protocolMarshaller.marshall(accountJiraConfigurationInput.getJiraProjectKey(), JIRAPROJECTKEY_BINDING);
            protocolMarshaller.marshall(accountJiraConfigurationInput.getIntegrationStatus(), INTEGRATIONSTATUS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
