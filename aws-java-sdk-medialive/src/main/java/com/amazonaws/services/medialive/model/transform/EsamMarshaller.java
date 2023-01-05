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
package com.amazonaws.services.medialive.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.medialive.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * EsamMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class EsamMarshaller {

    private static final MarshallingInfo<String> ACQUISITIONPOINTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("acquisitionPointId").build();
    private static final MarshallingInfo<Integer> ADAVAILOFFSET_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("adAvailOffset").build();
    private static final MarshallingInfo<String> PASSWORDPARAM_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("passwordParam").build();
    private static final MarshallingInfo<String> POISENDPOINT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("poisEndpoint").build();
    private static final MarshallingInfo<String> USERNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("username").build();
    private static final MarshallingInfo<String> ZONEIDENTITY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("zoneIdentity").build();

    private static final EsamMarshaller instance = new EsamMarshaller();

    public static EsamMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(Esam esam, ProtocolMarshaller protocolMarshaller) {

        if (esam == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(esam.getAcquisitionPointId(), ACQUISITIONPOINTID_BINDING);
            protocolMarshaller.marshall(esam.getAdAvailOffset(), ADAVAILOFFSET_BINDING);
            protocolMarshaller.marshall(esam.getPasswordParam(), PASSWORDPARAM_BINDING);
            protocolMarshaller.marshall(esam.getPoisEndpoint(), POISENDPOINT_BINDING);
            protocolMarshaller.marshall(esam.getUsername(), USERNAME_BINDING);
            protocolMarshaller.marshall(esam.getZoneIdentity(), ZONEIDENTITY_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
