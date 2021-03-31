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

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.workmail.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * MobileDeviceAccessRuleMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class MobileDeviceAccessRuleMarshaller {

    private static final MarshallingInfo<String> MOBILEDEVICEACCESSRULEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MobileDeviceAccessRuleId").build();
    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Name").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Description").build();
    private static final MarshallingInfo<String> EFFECT_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Effect").build();
    private static final MarshallingInfo<List> DEVICETYPES_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("DeviceTypes").build();
    private static final MarshallingInfo<List> NOTDEVICETYPES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("NotDeviceTypes").build();
    private static final MarshallingInfo<List> DEVICEMODELS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("DeviceModels").build();
    private static final MarshallingInfo<List> NOTDEVICEMODELS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("NotDeviceModels").build();
    private static final MarshallingInfo<List> DEVICEOPERATINGSYSTEMS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DeviceOperatingSystems").build();
    private static final MarshallingInfo<List> NOTDEVICEOPERATINGSYSTEMS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("NotDeviceOperatingSystems").build();
    private static final MarshallingInfo<List> DEVICEUSERAGENTS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DeviceUserAgents").build();
    private static final MarshallingInfo<List> NOTDEVICEUSERAGENTS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("NotDeviceUserAgents").build();
    private static final MarshallingInfo<java.util.Date> DATECREATED_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DateCreated").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> DATEMODIFIED_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DateModified").timestampFormat("unixTimestamp").build();

    private static final MobileDeviceAccessRuleMarshaller instance = new MobileDeviceAccessRuleMarshaller();

    public static MobileDeviceAccessRuleMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(MobileDeviceAccessRule mobileDeviceAccessRule, ProtocolMarshaller protocolMarshaller) {

        if (mobileDeviceAccessRule == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(mobileDeviceAccessRule.getMobileDeviceAccessRuleId(), MOBILEDEVICEACCESSRULEID_BINDING);
            protocolMarshaller.marshall(mobileDeviceAccessRule.getName(), NAME_BINDING);
            protocolMarshaller.marshall(mobileDeviceAccessRule.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(mobileDeviceAccessRule.getEffect(), EFFECT_BINDING);
            protocolMarshaller.marshall(mobileDeviceAccessRule.getDeviceTypes(), DEVICETYPES_BINDING);
            protocolMarshaller.marshall(mobileDeviceAccessRule.getNotDeviceTypes(), NOTDEVICETYPES_BINDING);
            protocolMarshaller.marshall(mobileDeviceAccessRule.getDeviceModels(), DEVICEMODELS_BINDING);
            protocolMarshaller.marshall(mobileDeviceAccessRule.getNotDeviceModels(), NOTDEVICEMODELS_BINDING);
            protocolMarshaller.marshall(mobileDeviceAccessRule.getDeviceOperatingSystems(), DEVICEOPERATINGSYSTEMS_BINDING);
            protocolMarshaller.marshall(mobileDeviceAccessRule.getNotDeviceOperatingSystems(), NOTDEVICEOPERATINGSYSTEMS_BINDING);
            protocolMarshaller.marshall(mobileDeviceAccessRule.getDeviceUserAgents(), DEVICEUSERAGENTS_BINDING);
            protocolMarshaller.marshall(mobileDeviceAccessRule.getNotDeviceUserAgents(), NOTDEVICEUSERAGENTS_BINDING);
            protocolMarshaller.marshall(mobileDeviceAccessRule.getDateCreated(), DATECREATED_BINDING);
            protocolMarshaller.marshall(mobileDeviceAccessRule.getDateModified(), DATEMODIFIED_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
