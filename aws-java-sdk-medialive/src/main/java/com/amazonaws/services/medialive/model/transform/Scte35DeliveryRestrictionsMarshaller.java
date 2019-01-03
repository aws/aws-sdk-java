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
package com.amazonaws.services.medialive.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.medialive.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * Scte35DeliveryRestrictionsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class Scte35DeliveryRestrictionsMarshaller {

    private static final MarshallingInfo<String> ARCHIVEALLOWEDFLAG_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("archiveAllowedFlag").build();
    private static final MarshallingInfo<String> DEVICERESTRICTIONS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("deviceRestrictions").build();
    private static final MarshallingInfo<String> NOREGIONALBLACKOUTFLAG_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("noRegionalBlackoutFlag").build();
    private static final MarshallingInfo<String> WEBDELIVERYALLOWEDFLAG_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("webDeliveryAllowedFlag").build();

    private static final Scte35DeliveryRestrictionsMarshaller instance = new Scte35DeliveryRestrictionsMarshaller();

    public static Scte35DeliveryRestrictionsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(Scte35DeliveryRestrictions scte35DeliveryRestrictions, ProtocolMarshaller protocolMarshaller) {

        if (scte35DeliveryRestrictions == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(scte35DeliveryRestrictions.getArchiveAllowedFlag(), ARCHIVEALLOWEDFLAG_BINDING);
            protocolMarshaller.marshall(scte35DeliveryRestrictions.getDeviceRestrictions(), DEVICERESTRICTIONS_BINDING);
            protocolMarshaller.marshall(scte35DeliveryRestrictions.getNoRegionalBlackoutFlag(), NOREGIONALBLACKOUTFLAG_BINDING);
            protocolMarshaller.marshall(scte35DeliveryRestrictions.getWebDeliveryAllowedFlag(), WEBDELIVERYALLOWEDFLAG_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
