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
package com.amazonaws.services.iotwireless.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.iotwireless.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * SidewalkAccountInfoWithFingerprintMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class SidewalkAccountInfoWithFingerprintMarshaller {

    private static final MarshallingInfo<String> AMAZONID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("AmazonId").build();
    private static final MarshallingInfo<String> FINGERPRINT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Fingerprint").build();
    private static final MarshallingInfo<String> ARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Arn").build();

    private static final SidewalkAccountInfoWithFingerprintMarshaller instance = new SidewalkAccountInfoWithFingerprintMarshaller();

    public static SidewalkAccountInfoWithFingerprintMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(SidewalkAccountInfoWithFingerprint sidewalkAccountInfoWithFingerprint, ProtocolMarshaller protocolMarshaller) {

        if (sidewalkAccountInfoWithFingerprint == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(sidewalkAccountInfoWithFingerprint.getAmazonId(), AMAZONID_BINDING);
            protocolMarshaller.marshall(sidewalkAccountInfoWithFingerprint.getFingerprint(), FINGERPRINT_BINDING);
            protocolMarshaller.marshall(sidewalkAccountInfoWithFingerprint.getArn(), ARN_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
