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
package com.amazonaws.services.workmail.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.workmail.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * GetMobileDeviceAccessEffectRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class GetMobileDeviceAccessEffectRequestMarshaller {

    private static final MarshallingInfo<String> ORGANIZATIONID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("OrganizationId").build();
    private static final MarshallingInfo<String> DEVICETYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DeviceType").build();
    private static final MarshallingInfo<String> DEVICEMODEL_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DeviceModel").build();
    private static final MarshallingInfo<String> DEVICEOPERATINGSYSTEM_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DeviceOperatingSystem").build();
    private static final MarshallingInfo<String> DEVICEUSERAGENT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DeviceUserAgent").build();

    private static final GetMobileDeviceAccessEffectRequestMarshaller instance = new GetMobileDeviceAccessEffectRequestMarshaller();

    public static GetMobileDeviceAccessEffectRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(GetMobileDeviceAccessEffectRequest getMobileDeviceAccessEffectRequest, ProtocolMarshaller protocolMarshaller) {

        if (getMobileDeviceAccessEffectRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(getMobileDeviceAccessEffectRequest.getOrganizationId(), ORGANIZATIONID_BINDING);
            protocolMarshaller.marshall(getMobileDeviceAccessEffectRequest.getDeviceType(), DEVICETYPE_BINDING);
            protocolMarshaller.marshall(getMobileDeviceAccessEffectRequest.getDeviceModel(), DEVICEMODEL_BINDING);
            protocolMarshaller.marshall(getMobileDeviceAccessEffectRequest.getDeviceOperatingSystem(), DEVICEOPERATINGSYSTEM_BINDING);
            protocolMarshaller.marshall(getMobileDeviceAccessEffectRequest.getDeviceUserAgent(), DEVICEUSERAGENT_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
