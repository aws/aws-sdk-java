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
 * AccountJiraConfigurationOutputMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AccountJiraConfigurationOutputMarshaller {

    private static final MarshallingInfo<String> INTEGRATIONSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("IntegrationStatus").build();
    private static final MarshallingInfo<String> ISSUEMANAGEMENTSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("IssueManagementStatus").build();
    private static final MarshallingInfo<String> ISSUEMANAGEMENTTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("IssueManagementType").build();
    private static final MarshallingInfo<String> SUBDOMAIN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Subdomain").build();
    private static final MarshallingInfo<String> JIRAPROJECTKEY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("JiraProjectKey").build();
    private static final MarshallingInfo<String> STATUSMESSAGE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StatusMessage").build();

    private static final AccountJiraConfigurationOutputMarshaller instance = new AccountJiraConfigurationOutputMarshaller();

    public static AccountJiraConfigurationOutputMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AccountJiraConfigurationOutput accountJiraConfigurationOutput, ProtocolMarshaller protocolMarshaller) {

        if (accountJiraConfigurationOutput == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(accountJiraConfigurationOutput.getIntegrationStatus(), INTEGRATIONSTATUS_BINDING);
            protocolMarshaller.marshall(accountJiraConfigurationOutput.getIssueManagementStatus(), ISSUEMANAGEMENTSTATUS_BINDING);
            protocolMarshaller.marshall(accountJiraConfigurationOutput.getIssueManagementType(), ISSUEMANAGEMENTTYPE_BINDING);
            protocolMarshaller.marshall(accountJiraConfigurationOutput.getSubdomain(), SUBDOMAIN_BINDING);
            protocolMarshaller.marshall(accountJiraConfigurationOutput.getJiraProjectKey(), JIRAPROJECTKEY_BINDING);
            protocolMarshaller.marshall(accountJiraConfigurationOutput.getStatusMessage(), STATUSMESSAGE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
