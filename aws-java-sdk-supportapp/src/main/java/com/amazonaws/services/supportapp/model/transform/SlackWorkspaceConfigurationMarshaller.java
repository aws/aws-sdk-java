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
package com.amazonaws.services.supportapp.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.supportapp.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * SlackWorkspaceConfigurationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class SlackWorkspaceConfigurationMarshaller {

    private static final MarshallingInfo<Boolean> ALLOWORGANIZATIONMEMBERACCOUNT_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("allowOrganizationMemberAccount").build();
    private static final MarshallingInfo<String> TEAMID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("teamId").build();
    private static final MarshallingInfo<String> TEAMNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("teamName").build();

    private static final SlackWorkspaceConfigurationMarshaller instance = new SlackWorkspaceConfigurationMarshaller();

    public static SlackWorkspaceConfigurationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(SlackWorkspaceConfiguration slackWorkspaceConfiguration, ProtocolMarshaller protocolMarshaller) {

        if (slackWorkspaceConfiguration == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(slackWorkspaceConfiguration.getAllowOrganizationMemberAccount(), ALLOWORGANIZATIONMEMBERACCOUNT_BINDING);
            protocolMarshaller.marshall(slackWorkspaceConfiguration.getTeamId(), TEAMID_BINDING);
            protocolMarshaller.marshall(slackWorkspaceConfiguration.getTeamName(), TEAMNAME_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
