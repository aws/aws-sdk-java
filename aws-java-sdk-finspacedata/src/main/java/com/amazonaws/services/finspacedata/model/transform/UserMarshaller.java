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
package com.amazonaws.services.finspacedata.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.finspacedata.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * UserMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UserMarshaller {

    private static final MarshallingInfo<String> USERID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("userId").build();
    private static final MarshallingInfo<String> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("status").build();
    private static final MarshallingInfo<String> FIRSTNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("firstName").build();
    private static final MarshallingInfo<String> LASTNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("lastName").build();
    private static final MarshallingInfo<String> EMAILADDRESS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("emailAddress").build();
    private static final MarshallingInfo<String> TYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("type").build();
    private static final MarshallingInfo<String> APIACCESS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("apiAccess").build();
    private static final MarshallingInfo<String> APIACCESSPRINCIPALARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("apiAccessPrincipalArn").build();
    private static final MarshallingInfo<Long> CREATETIME_BINDING = MarshallingInfo.builder(MarshallingType.LONG).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("createTime").build();
    private static final MarshallingInfo<Long> LASTENABLEDTIME_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("lastEnabledTime").build();
    private static final MarshallingInfo<Long> LASTDISABLEDTIME_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("lastDisabledTime").build();
    private static final MarshallingInfo<Long> LASTMODIFIEDTIME_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("lastModifiedTime").build();
    private static final MarshallingInfo<Long> LASTLOGINTIME_BINDING = MarshallingInfo.builder(MarshallingType.LONG).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("lastLoginTime").build();

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
            protocolMarshaller.marshall(user.getStatus(), STATUS_BINDING);
            protocolMarshaller.marshall(user.getFirstName(), FIRSTNAME_BINDING);
            protocolMarshaller.marshall(user.getLastName(), LASTNAME_BINDING);
            protocolMarshaller.marshall(user.getEmailAddress(), EMAILADDRESS_BINDING);
            protocolMarshaller.marshall(user.getType(), TYPE_BINDING);
            protocolMarshaller.marshall(user.getApiAccess(), APIACCESS_BINDING);
            protocolMarshaller.marshall(user.getApiAccessPrincipalArn(), APIACCESSPRINCIPALARN_BINDING);
            protocolMarshaller.marshall(user.getCreateTime(), CREATETIME_BINDING);
            protocolMarshaller.marshall(user.getLastEnabledTime(), LASTENABLEDTIME_BINDING);
            protocolMarshaller.marshall(user.getLastDisabledTime(), LASTDISABLEDTIME_BINDING);
            protocolMarshaller.marshall(user.getLastModifiedTime(), LASTMODIFIEDTIME_BINDING);
            protocolMarshaller.marshall(user.getLastLoginTime(), LASTLOGINTIME_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
