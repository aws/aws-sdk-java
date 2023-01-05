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
package com.amazonaws.services.private5g.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.private5g.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ConfigureAccessPointRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ConfigureAccessPointRequestMarshaller {

    private static final MarshallingInfo<String> ACCESSPOINTARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("accessPointArn").build();
    private static final MarshallingInfo<String> CPISECRETKEY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("cpiSecretKey").build();
    private static final MarshallingInfo<String> CPIUSERID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("cpiUserId").build();
    private static final MarshallingInfo<String> CPIUSERPASSWORD_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("cpiUserPassword").build();
    private static final MarshallingInfo<String> CPIUSERNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("cpiUsername").build();
    private static final MarshallingInfo<StructuredPojo> POSITION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("position").build();

    private static final ConfigureAccessPointRequestMarshaller instance = new ConfigureAccessPointRequestMarshaller();

    public static ConfigureAccessPointRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ConfigureAccessPointRequest configureAccessPointRequest, ProtocolMarshaller protocolMarshaller) {

        if (configureAccessPointRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(configureAccessPointRequest.getAccessPointArn(), ACCESSPOINTARN_BINDING);
            protocolMarshaller.marshall(configureAccessPointRequest.getCpiSecretKey(), CPISECRETKEY_BINDING);
            protocolMarshaller.marshall(configureAccessPointRequest.getCpiUserId(), CPIUSERID_BINDING);
            protocolMarshaller.marshall(configureAccessPointRequest.getCpiUserPassword(), CPIUSERPASSWORD_BINDING);
            protocolMarshaller.marshall(configureAccessPointRequest.getCpiUsername(), CPIUSERNAME_BINDING);
            protocolMarshaller.marshall(configureAccessPointRequest.getPosition(), POSITION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
