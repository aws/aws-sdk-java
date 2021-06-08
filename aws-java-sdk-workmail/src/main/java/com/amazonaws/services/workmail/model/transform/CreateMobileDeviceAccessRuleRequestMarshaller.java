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

import com.amazonaws.util.IdempotentUtils;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CreateMobileDeviceAccessRuleRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreateMobileDeviceAccessRuleRequestMarshaller {

    private static final MarshallingInfo<String> ORGANIZATIONID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("OrganizationId").build();
    private static final MarshallingInfo<String> CLIENTTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ClientToken")
            .defaultValueSupplier(com.amazonaws.util.IdempotentUtils.getGenerator()).build();
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

    private static final CreateMobileDeviceAccessRuleRequestMarshaller instance = new CreateMobileDeviceAccessRuleRequestMarshaller();

    public static CreateMobileDeviceAccessRuleRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreateMobileDeviceAccessRuleRequest createMobileDeviceAccessRuleRequest, ProtocolMarshaller protocolMarshaller) {

        if (createMobileDeviceAccessRuleRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createMobileDeviceAccessRuleRequest.getOrganizationId(), ORGANIZATIONID_BINDING);
            protocolMarshaller.marshall(createMobileDeviceAccessRuleRequest.getClientToken(), CLIENTTOKEN_BINDING);
            protocolMarshaller.marshall(createMobileDeviceAccessRuleRequest.getName(), NAME_BINDING);
            protocolMarshaller.marshall(createMobileDeviceAccessRuleRequest.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(createMobileDeviceAccessRuleRequest.getEffect(), EFFECT_BINDING);
            protocolMarshaller.marshall(createMobileDeviceAccessRuleRequest.getDeviceTypes(), DEVICETYPES_BINDING);
            protocolMarshaller.marshall(createMobileDeviceAccessRuleRequest.getNotDeviceTypes(), NOTDEVICETYPES_BINDING);
            protocolMarshaller.marshall(createMobileDeviceAccessRuleRequest.getDeviceModels(), DEVICEMODELS_BINDING);
            protocolMarshaller.marshall(createMobileDeviceAccessRuleRequest.getNotDeviceModels(), NOTDEVICEMODELS_BINDING);
            protocolMarshaller.marshall(createMobileDeviceAccessRuleRequest.getDeviceOperatingSystems(), DEVICEOPERATINGSYSTEMS_BINDING);
            protocolMarshaller.marshall(createMobileDeviceAccessRuleRequest.getNotDeviceOperatingSystems(), NOTDEVICEOPERATINGSYSTEMS_BINDING);
            protocolMarshaller.marshall(createMobileDeviceAccessRuleRequest.getDeviceUserAgents(), DEVICEUSERAGENTS_BINDING);
            protocolMarshaller.marshall(createMobileDeviceAccessRuleRequest.getNotDeviceUserAgents(), NOTDEVICEUSERAGENTS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
