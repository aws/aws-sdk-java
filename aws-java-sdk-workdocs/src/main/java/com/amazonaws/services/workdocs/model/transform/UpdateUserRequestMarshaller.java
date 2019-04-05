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
package com.amazonaws.services.workdocs.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.workdocs.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * UpdateUserRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UpdateUserRequestMarshaller {

    private static final MarshallingInfo<String> AUTHENTICATIONTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.HEADER).marshallLocationName("Authentication").build();
    private static final MarshallingInfo<String> USERID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("UserId").build();
    private static final MarshallingInfo<String> GIVENNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("GivenName").build();
    private static final MarshallingInfo<String> SURNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Surname").build();
    private static final MarshallingInfo<String> TYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Type").build();
    private static final MarshallingInfo<StructuredPojo> STORAGERULE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StorageRule").build();
    private static final MarshallingInfo<String> TIMEZONEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TimeZoneId").build();
    private static final MarshallingInfo<String> LOCALE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Locale").build();
    private static final MarshallingInfo<String> GRANTPOWERUSERPRIVILEGES_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("GrantPoweruserPrivileges").build();

    private static final UpdateUserRequestMarshaller instance = new UpdateUserRequestMarshaller();

    public static UpdateUserRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UpdateUserRequest updateUserRequest, ProtocolMarshaller protocolMarshaller) {

        if (updateUserRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(updateUserRequest.getAuthenticationToken(), AUTHENTICATIONTOKEN_BINDING);
            protocolMarshaller.marshall(updateUserRequest.getUserId(), USERID_BINDING);
            protocolMarshaller.marshall(updateUserRequest.getGivenName(), GIVENNAME_BINDING);
            protocolMarshaller.marshall(updateUserRequest.getSurname(), SURNAME_BINDING);
            protocolMarshaller.marshall(updateUserRequest.getType(), TYPE_BINDING);
            protocolMarshaller.marshall(updateUserRequest.getStorageRule(), STORAGERULE_BINDING);
            protocolMarshaller.marshall(updateUserRequest.getTimeZoneId(), TIMEZONEID_BINDING);
            protocolMarshaller.marshall(updateUserRequest.getLocale(), LOCALE_BINDING);
            protocolMarshaller.marshall(updateUserRequest.getGrantPoweruserPrivileges(), GRANTPOWERUSERPRIVILEGES_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
