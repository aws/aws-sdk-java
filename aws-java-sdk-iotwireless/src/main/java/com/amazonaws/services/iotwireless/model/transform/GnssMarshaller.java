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
package com.amazonaws.services.iotwireless.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.iotwireless.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * GnssMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class GnssMarshaller {

    private static final MarshallingInfo<String> PAYLOAD_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Payload").build();
    private static final MarshallingInfo<Float> CAPTURETIME_BINDING = MarshallingInfo.builder(MarshallingType.FLOAT).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("CaptureTime").build();
    private static final MarshallingInfo<Float> CAPTURETIMEACCURACY_BINDING = MarshallingInfo.builder(MarshallingType.FLOAT)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CaptureTimeAccuracy").build();
    private static final MarshallingInfo<List> ASSISTPOSITION_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AssistPosition").build();
    private static final MarshallingInfo<Float> ASSISTALTITUDE_BINDING = MarshallingInfo.builder(MarshallingType.FLOAT)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AssistAltitude").build();
    private static final MarshallingInfo<Boolean> USE2DSOLVER_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Use2DSolver").build();

    private static final GnssMarshaller instance = new GnssMarshaller();

    public static GnssMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(Gnss gnss, ProtocolMarshaller protocolMarshaller) {

        if (gnss == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(gnss.getPayload(), PAYLOAD_BINDING);
            protocolMarshaller.marshall(gnss.getCaptureTime(), CAPTURETIME_BINDING);
            protocolMarshaller.marshall(gnss.getCaptureTimeAccuracy(), CAPTURETIMEACCURACY_BINDING);
            protocolMarshaller.marshall(gnss.getAssistPosition(), ASSISTPOSITION_BINDING);
            protocolMarshaller.marshall(gnss.getAssistAltitude(), ASSISTALTITUDE_BINDING);
            protocolMarshaller.marshall(gnss.getUse2DSolver(), USE2DSOLVER_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
