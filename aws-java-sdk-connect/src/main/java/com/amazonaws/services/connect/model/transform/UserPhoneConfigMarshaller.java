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
package com.amazonaws.services.connect.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.connect.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * UserPhoneConfigMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UserPhoneConfigMarshaller {

    private static final MarshallingInfo<String> PHONETYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("PhoneType").build();
    private static final MarshallingInfo<Boolean> AUTOACCEPT_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AutoAccept").build();
    private static final MarshallingInfo<Integer> AFTERCONTACTWORKTIMELIMIT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AfterContactWorkTimeLimit").build();
    private static final MarshallingInfo<String> DESKPHONENUMBER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DeskPhoneNumber").build();

    private static final UserPhoneConfigMarshaller instance = new UserPhoneConfigMarshaller();

    public static UserPhoneConfigMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UserPhoneConfig userPhoneConfig, ProtocolMarshaller protocolMarshaller) {

        if (userPhoneConfig == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(userPhoneConfig.getPhoneType(), PHONETYPE_BINDING);
            protocolMarshaller.marshall(userPhoneConfig.getAutoAccept(), AUTOACCEPT_BINDING);
            protocolMarshaller.marshall(userPhoneConfig.getAfterContactWorkTimeLimit(), AFTERCONTACTWORKTIMELIMIT_BINDING);
            protocolMarshaller.marshall(userPhoneConfig.getDeskPhoneNumber(), DESKPHONENUMBER_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
