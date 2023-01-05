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
 * CanSignalMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CanSignalMarshaller {

    private static final MarshallingInfo<Integer> MESSAGEID_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("messageId").build();
    private static final MarshallingInfo<Boolean> ISBIGENDIAN_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("isBigEndian").build();
    private static final MarshallingInfo<Boolean> ISSIGNED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("isSigned").build();
    private static final MarshallingInfo<Integer> STARTBIT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("startBit").build();
    private static final MarshallingInfo<Double> OFFSET_BINDING = MarshallingInfo.builder(MarshallingType.DOUBLE).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("offset").build();
    private static final MarshallingInfo<Double> FACTOR_BINDING = MarshallingInfo.builder(MarshallingType.DOUBLE).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("factor").build();
    private static final MarshallingInfo<Integer> LENGTH_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("length").build();
    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("name").build();

    private static final CanSignalMarshaller instance = new CanSignalMarshaller();

    public static CanSignalMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CanSignal canSignal, ProtocolMarshaller protocolMarshaller) {

        if (canSignal == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(canSignal.getMessageId(), MESSAGEID_BINDING);
            protocolMarshaller.marshall(canSignal.getIsBigEndian(), ISBIGENDIAN_BINDING);
            protocolMarshaller.marshall(canSignal.getIsSigned(), ISSIGNED_BINDING);
            protocolMarshaller.marshall(canSignal.getStartBit(), STARTBIT_BINDING);
            protocolMarshaller.marshall(canSignal.getOffset(), OFFSET_BINDING);
            protocolMarshaller.marshall(canSignal.getFactor(), FACTOR_BINDING);
            protocolMarshaller.marshall(canSignal.getLength(), LENGTH_BINDING);
            protocolMarshaller.marshall(canSignal.getName(), NAME_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
