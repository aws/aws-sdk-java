/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.paymentcryptography.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.paymentcryptography.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * KeyMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class KeyMarshaller {

    private static final MarshallingInfo<String> KEYARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("KeyArn").build();
    private static final MarshallingInfo<StructuredPojo> KEYATTRIBUTES_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("KeyAttributes").build();
    private static final MarshallingInfo<String> KEYCHECKVALUE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("KeyCheckValue").build();
    private static final MarshallingInfo<String> KEYCHECKVALUEALGORITHM_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("KeyCheckValueAlgorithm").build();
    private static final MarshallingInfo<Boolean> ENABLED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Enabled").build();
    private static final MarshallingInfo<Boolean> EXPORTABLE_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Exportable").build();
    private static final MarshallingInfo<String> KEYSTATE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("KeyState").build();
    private static final MarshallingInfo<String> KEYORIGIN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("KeyOrigin").build();
    private static final MarshallingInfo<java.util.Date> CREATETIMESTAMP_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CreateTimestamp").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> USAGESTARTTIMESTAMP_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("UsageStartTimestamp").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> USAGESTOPTIMESTAMP_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("UsageStopTimestamp").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> DELETEPENDINGTIMESTAMP_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DeletePendingTimestamp").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> DELETETIMESTAMP_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DeleteTimestamp").timestampFormat("unixTimestamp").build();

    private static final KeyMarshaller instance = new KeyMarshaller();

    public static KeyMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(Key key, ProtocolMarshaller protocolMarshaller) {

        if (key == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(key.getKeyArn(), KEYARN_BINDING);
            protocolMarshaller.marshall(key.getKeyAttributes(), KEYATTRIBUTES_BINDING);
            protocolMarshaller.marshall(key.getKeyCheckValue(), KEYCHECKVALUE_BINDING);
            protocolMarshaller.marshall(key.getKeyCheckValueAlgorithm(), KEYCHECKVALUEALGORITHM_BINDING);
            protocolMarshaller.marshall(key.getEnabled(), ENABLED_BINDING);
            protocolMarshaller.marshall(key.getExportable(), EXPORTABLE_BINDING);
            protocolMarshaller.marshall(key.getKeyState(), KEYSTATE_BINDING);
            protocolMarshaller.marshall(key.getKeyOrigin(), KEYORIGIN_BINDING);
            protocolMarshaller.marshall(key.getCreateTimestamp(), CREATETIMESTAMP_BINDING);
            protocolMarshaller.marshall(key.getUsageStartTimestamp(), USAGESTARTTIMESTAMP_BINDING);
            protocolMarshaller.marshall(key.getUsageStopTimestamp(), USAGESTOPTIMESTAMP_BINDING);
            protocolMarshaller.marshall(key.getDeletePendingTimestamp(), DELETEPENDINGTIMESTAMP_BINDING);
            protocolMarshaller.marshall(key.getDeleteTimestamp(), DELETETIMESTAMP_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
