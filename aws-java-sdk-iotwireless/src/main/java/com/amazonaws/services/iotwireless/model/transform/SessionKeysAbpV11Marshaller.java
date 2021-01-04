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
package com.amazonaws.services.iotwireless.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.iotwireless.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * SessionKeysAbpV11Marshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class SessionKeysAbpV11Marshaller {

    private static final MarshallingInfo<String> FNWKSINTKEY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FNwkSIntKey").build();
    private static final MarshallingInfo<String> SNWKSINTKEY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SNwkSIntKey").build();
    private static final MarshallingInfo<String> NWKSENCKEY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("NwkSEncKey").build();
    private static final MarshallingInfo<String> APPSKEY_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("AppSKey").build();

    private static final SessionKeysAbpV11Marshaller instance = new SessionKeysAbpV11Marshaller();

    public static SessionKeysAbpV11Marshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(SessionKeysAbpV11 sessionKeysAbpV11, ProtocolMarshaller protocolMarshaller) {

        if (sessionKeysAbpV11 == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(sessionKeysAbpV11.getFNwkSIntKey(), FNWKSINTKEY_BINDING);
            protocolMarshaller.marshall(sessionKeysAbpV11.getSNwkSIntKey(), SNWKSINTKEY_BINDING);
            protocolMarshaller.marshall(sessionKeysAbpV11.getNwkSEncKey(), NWKSENCKEY_BINDING);
            protocolMarshaller.marshall(sessionKeysAbpV11.getAppSKey(), APPSKEY_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
