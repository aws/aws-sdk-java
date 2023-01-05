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
package com.amazonaws.services.iotfleetwise.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.iotfleetwise.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ObdSignalMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ObdSignalMarshaller {

    private static final MarshallingInfo<Integer> PIDRESPONSELENGTH_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("pidResponseLength").build();
    private static final MarshallingInfo<Integer> SERVICEMODE_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("serviceMode").build();
    private static final MarshallingInfo<Integer> PID_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("pid").build();
    private static final MarshallingInfo<Double> SCALING_BINDING = MarshallingInfo.builder(MarshallingType.DOUBLE).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("scaling").build();
    private static final MarshallingInfo<Double> OFFSET_BINDING = MarshallingInfo.builder(MarshallingType.DOUBLE).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("offset").build();
    private static final MarshallingInfo<Integer> STARTBYTE_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("startByte").build();
    private static final MarshallingInfo<Integer> BYTELENGTH_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("byteLength").build();
    private static final MarshallingInfo<Integer> BITRIGHTSHIFT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("bitRightShift").build();
    private static final MarshallingInfo<Integer> BITMASKLENGTH_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("bitMaskLength").build();

    private static final ObdSignalMarshaller instance = new ObdSignalMarshaller();

    public static ObdSignalMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ObdSignal obdSignal, ProtocolMarshaller protocolMarshaller) {

        if (obdSignal == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(obdSignal.getPidResponseLength(), PIDRESPONSELENGTH_BINDING);
            protocolMarshaller.marshall(obdSignal.getServiceMode(), SERVICEMODE_BINDING);
            protocolMarshaller.marshall(obdSignal.getPid(), PID_BINDING);
            protocolMarshaller.marshall(obdSignal.getScaling(), SCALING_BINDING);
            protocolMarshaller.marshall(obdSignal.getOffset(), OFFSET_BINDING);
            protocolMarshaller.marshall(obdSignal.getStartByte(), STARTBYTE_BINDING);
            protocolMarshaller.marshall(obdSignal.getByteLength(), BYTELENGTH_BINDING);
            protocolMarshaller.marshall(obdSignal.getBitRightShift(), BITRIGHTSHIFT_BINDING);
            protocolMarshaller.marshall(obdSignal.getBitMaskLength(), BITMASKLENGTH_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
