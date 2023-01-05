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
package com.amazonaws.services.workmail.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.workmail.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * MobileDeviceAccessOverrideMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class MobileDeviceAccessOverrideMarshaller {

    private static final MarshallingInfo<String> USERID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("UserId").build();
    private static final MarshallingInfo<String> DEVICEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("DeviceId").build();
    private static final MarshallingInfo<String> EFFECT_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Effect").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Description").build();
    private static final MarshallingInfo<java.util.Date> DATECREATED_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DateCreated").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> DATEMODIFIED_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DateModified").timestampFormat("unixTimestamp").build();

    private static final MobileDeviceAccessOverrideMarshaller instance = new MobileDeviceAccessOverrideMarshaller();

    public static MobileDeviceAccessOverrideMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(MobileDeviceAccessOverride mobileDeviceAccessOverride, ProtocolMarshaller protocolMarshaller) {

        if (mobileDeviceAccessOverride == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(mobileDeviceAccessOverride.getUserId(), USERID_BINDING);
            protocolMarshaller.marshall(mobileDeviceAccessOverride.getDeviceId(), DEVICEID_BINDING);
            protocolMarshaller.marshall(mobileDeviceAccessOverride.getEffect(), EFFECT_BINDING);
            protocolMarshaller.marshall(mobileDeviceAccessOverride.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(mobileDeviceAccessOverride.getDateCreated(), DATECREATED_BINDING);
            protocolMarshaller.marshall(mobileDeviceAccessOverride.getDateModified(), DATEMODIFIED_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
