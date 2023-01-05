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
package com.amazonaws.services.identitystore.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.identitystore.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CreateUserRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreateUserRequestMarshaller {

    private static final MarshallingInfo<String> IDENTITYSTOREID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("IdentityStoreId").build();
    private static final MarshallingInfo<String> USERNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("UserName").build();
    private static final MarshallingInfo<StructuredPojo> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Name").build();
    private static final MarshallingInfo<String> DISPLAYNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DisplayName").build();
    private static final MarshallingInfo<String> NICKNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("NickName").build();
    private static final MarshallingInfo<String> PROFILEURL_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ProfileUrl").build();
    private static final MarshallingInfo<List> EMAILS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Emails").build();
    private static final MarshallingInfo<List> ADDRESSES_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Addresses").build();
    private static final MarshallingInfo<List> PHONENUMBERS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("PhoneNumbers").build();
    private static final MarshallingInfo<String> USERTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("UserType").build();
    private static final MarshallingInfo<String> TITLE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Title").build();
    private static final MarshallingInfo<String> PREFERREDLANGUAGE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PreferredLanguage").build();
    private static final MarshallingInfo<String> LOCALE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Locale").build();
    private static final MarshallingInfo<String> TIMEZONE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Timezone").build();

    private static final CreateUserRequestMarshaller instance = new CreateUserRequestMarshaller();

    public static CreateUserRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreateUserRequest createUserRequest, ProtocolMarshaller protocolMarshaller) {

        if (createUserRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createUserRequest.getIdentityStoreId(), IDENTITYSTOREID_BINDING);
            protocolMarshaller.marshall(createUserRequest.getUserName(), USERNAME_BINDING);
            protocolMarshaller.marshall(createUserRequest.getName(), NAME_BINDING);
            protocolMarshaller.marshall(createUserRequest.getDisplayName(), DISPLAYNAME_BINDING);
            protocolMarshaller.marshall(createUserRequest.getNickName(), NICKNAME_BINDING);
            protocolMarshaller.marshall(createUserRequest.getProfileUrl(), PROFILEURL_BINDING);
            protocolMarshaller.marshall(createUserRequest.getEmails(), EMAILS_BINDING);
            protocolMarshaller.marshall(createUserRequest.getAddresses(), ADDRESSES_BINDING);
            protocolMarshaller.marshall(createUserRequest.getPhoneNumbers(), PHONENUMBERS_BINDING);
            protocolMarshaller.marshall(createUserRequest.getUserType(), USERTYPE_BINDING);
            protocolMarshaller.marshall(createUserRequest.getTitle(), TITLE_BINDING);
            protocolMarshaller.marshall(createUserRequest.getPreferredLanguage(), PREFERREDLANGUAGE_BINDING);
            protocolMarshaller.marshall(createUserRequest.getLocale(), LOCALE_BINDING);
            protocolMarshaller.marshall(createUserRequest.getTimezone(), TIMEZONE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
