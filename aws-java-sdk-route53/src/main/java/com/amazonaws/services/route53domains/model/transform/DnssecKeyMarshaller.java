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
package com.amazonaws.services.route53domains.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.route53domains.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * DnssecKeyMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class DnssecKeyMarshaller {

    private static final MarshallingInfo<Integer> ALGORITHM_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Algorithm").build();
    private static final MarshallingInfo<Integer> FLAGS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Flags").build();
    private static final MarshallingInfo<String> PUBLICKEY_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("PublicKey").build();
    private static final MarshallingInfo<Integer> DIGESTTYPE_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DigestType").build();
    private static final MarshallingInfo<String> DIGEST_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Digest").build();
    private static final MarshallingInfo<Integer> KEYTAG_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("KeyTag").build();
    private static final MarshallingInfo<String> ID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Id").build();

    private static final DnssecKeyMarshaller instance = new DnssecKeyMarshaller();

    public static DnssecKeyMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(DnssecKey dnssecKey, ProtocolMarshaller protocolMarshaller) {

        if (dnssecKey == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(dnssecKey.getAlgorithm(), ALGORITHM_BINDING);
            protocolMarshaller.marshall(dnssecKey.getFlags(), FLAGS_BINDING);
            protocolMarshaller.marshall(dnssecKey.getPublicKey(), PUBLICKEY_BINDING);
            protocolMarshaller.marshall(dnssecKey.getDigestType(), DIGESTTYPE_BINDING);
            protocolMarshaller.marshall(dnssecKey.getDigest(), DIGEST_BINDING);
            protocolMarshaller.marshall(dnssecKey.getKeyTag(), KEYTAG_BINDING);
            protocolMarshaller.marshall(dnssecKey.getId(), ID_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
