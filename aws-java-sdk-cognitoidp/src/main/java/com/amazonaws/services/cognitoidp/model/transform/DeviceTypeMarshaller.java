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
package com.amazonaws.services.cognitoidp.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.cognitoidp.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * DeviceTypeMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class DeviceTypeMarshaller {

    private static final MarshallingInfo<String> DEVICEKEY_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("DeviceKey").build();
    private static final MarshallingInfo<List> DEVICEATTRIBUTES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DeviceAttributes").build();
    private static final MarshallingInfo<java.util.Date> DEVICECREATEDATE_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DeviceCreateDate").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> DEVICELASTMODIFIEDDATE_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DeviceLastModifiedDate").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> DEVICELASTAUTHENTICATEDDATE_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DeviceLastAuthenticatedDate").timestampFormat("unixTimestamp").build();

    private static final DeviceTypeMarshaller instance = new DeviceTypeMarshaller();

    public static DeviceTypeMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(DeviceType deviceType, ProtocolMarshaller protocolMarshaller) {

        if (deviceType == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(deviceType.getDeviceKey(), DEVICEKEY_BINDING);
            protocolMarshaller.marshall(deviceType.getDeviceAttributes(), DEVICEATTRIBUTES_BINDING);
            protocolMarshaller.marshall(deviceType.getDeviceCreateDate(), DEVICECREATEDATE_BINDING);
            protocolMarshaller.marshall(deviceType.getDeviceLastModifiedDate(), DEVICELASTMODIFIEDDATE_BINDING);
            protocolMarshaller.marshall(deviceType.getDeviceLastAuthenticatedDate(), DEVICELASTAUTHENTICATEDDATE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
