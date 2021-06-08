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
package com.amazonaws.services.quicksight.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.quicksight.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * AccountSettingsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AccountSettingsMarshaller {

    private static final MarshallingInfo<String> ACCOUNTNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AccountName").build();
    private static final MarshallingInfo<String> EDITION_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Edition").build();
    private static final MarshallingInfo<String> DEFAULTNAMESPACE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DefaultNamespace").build();
    private static final MarshallingInfo<String> NOTIFICATIONEMAIL_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("NotificationEmail").build();

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
            protocolMarshaller.marshall(accountSettings.getAccountName(), ACCOUNTNAME_BINDING);
            protocolMarshaller.marshall(accountSettings.getEdition(), EDITION_BINDING);
            protocolMarshaller.marshall(accountSettings.getDefaultNamespace(), DEFAULTNAMESPACE_BINDING);
            protocolMarshaller.marshall(accountSettings.getNotificationEmail(), NOTIFICATIONEMAIL_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
