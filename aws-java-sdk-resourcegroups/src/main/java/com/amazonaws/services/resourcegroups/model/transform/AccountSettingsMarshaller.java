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
package com.amazonaws.services.resourcegroups.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.resourcegroups.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * AccountSettingsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AccountSettingsMarshaller {

    private static final MarshallingInfo<String> GROUPLIFECYCLEEVENTSDESIREDSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("GroupLifecycleEventsDesiredStatus").build();
    private static final MarshallingInfo<String> GROUPLIFECYCLEEVENTSSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("GroupLifecycleEventsStatus").build();
    private static final MarshallingInfo<String> GROUPLIFECYCLEEVENTSSTATUSMESSAGE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("GroupLifecycleEventsStatusMessage").build();

    private static final AccountSettingsMarshaller instance = new AccountSettingsMarshaller();

    public static AccountSettingsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AccountSettings accountSettings, ProtocolMarshaller protocolMarshaller) {

        if (accountSettings == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(accountSettings.getGroupLifecycleEventsDesiredStatus(), GROUPLIFECYCLEEVENTSDESIREDSTATUS_BINDING);
            protocolMarshaller.marshall(accountSettings.getGroupLifecycleEventsStatus(), GROUPLIFECYCLEEVENTSSTATUS_BINDING);
            protocolMarshaller.marshall(accountSettings.getGroupLifecycleEventsStatusMessage(), GROUPLIFECYCLEEVENTSSTATUSMESSAGE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
