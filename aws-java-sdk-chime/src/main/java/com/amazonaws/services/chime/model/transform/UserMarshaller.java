/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.chime.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.chime.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * UserMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UserMarshaller {

    private static final MarshallingInfo<String> USERID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("UserId").build();
    private static final MarshallingInfo<String> ACCOUNTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("AccountId").build();
    private static final MarshallingInfo<String> PRIMARYEMAIL_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PrimaryEmail").build();
    private static final MarshallingInfo<String> PRIMARYPROVISIONEDNUMBER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PrimaryProvisionedNumber").build();
    private static final MarshallingInfo<String> DISPLAYNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DisplayName").build();
    private static final MarshallingInfo<String> LICENSETYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LicenseType").build();
    private static final MarshallingInfo<String> USERREGISTRATIONSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("UserRegistrationStatus").build();
    private static final MarshallingInfo<String> USERINVITATIONSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("UserInvitationStatus").build();
    private static final MarshallingInfo<java.util.Date> REGISTEREDON_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RegisteredOn").timestampFormat("iso8601").build();
    private static final MarshallingInfo<java.util.Date> INVITEDON_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("InvitedOn").timestampFormat("iso8601").build();
    private static final MarshallingInfo<String> PERSONALPIN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PersonalPIN").build();

    private static final UserMarshaller instance = new UserMarshaller();

    public static UserMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(User user, ProtocolMarshaller protocolMarshaller) {

        if (user == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(user.getUserId(), USERID_BINDING);
            protocolMarshaller.marshall(user.getAccountId(), ACCOUNTID_BINDING);
            protocolMarshaller.marshall(user.getPrimaryEmail(), PRIMARYEMAIL_BINDING);
            protocolMarshaller.marshall(user.getPrimaryProvisionedNumber(), PRIMARYPROVISIONEDNUMBER_BINDING);
            protocolMarshaller.marshall(user.getDisplayName(), DISPLAYNAME_BINDING);
            protocolMarshaller.marshall(user.getLicenseType(), LICENSETYPE_BINDING);
            protocolMarshaller.marshall(user.getUserRegistrationStatus(), USERREGISTRATIONSTATUS_BINDING);
            protocolMarshaller.marshall(user.getUserInvitationStatus(), USERINVITATIONSTATUS_BINDING);
            protocolMarshaller.marshall(user.getRegisteredOn(), REGISTEREDON_BINDING);
            protocolMarshaller.marshall(user.getInvitedOn(), INVITEDON_BINDING);
            protocolMarshaller.marshall(user.getPersonalPIN(), PERSONALPIN_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
