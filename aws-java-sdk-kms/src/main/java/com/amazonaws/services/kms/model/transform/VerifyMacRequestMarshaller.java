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
package com.amazonaws.services.kms.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.kms.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * VerifyMacRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class VerifyMacRequestMarshaller {

    private static final MarshallingInfo<java.nio.ByteBuffer> MESSAGE_BINDING = MarshallingInfo.builder(MarshallingType.BYTE_BUFFER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Message").build();
    private static final MarshallingInfo<String> KEYID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("KeyId").build();
    private static final MarshallingInfo<String> MACALGORITHM_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MacAlgorithm").build();
    private static final MarshallingInfo<java.nio.ByteBuffer> MAC_BINDING = MarshallingInfo.builder(MarshallingType.BYTE_BUFFER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Mac").build();
    private static final MarshallingInfo<List> GRANTTOKENS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("GrantTokens").build();

    private static final VerifyMacRequestMarshaller instance = new VerifyMacRequestMarshaller();

    public static VerifyMacRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(VerifyMacRequest verifyMacRequest, ProtocolMarshaller protocolMarshaller) {

        if (verifyMacRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(verifyMacRequest.getMessage(), MESSAGE_BINDING);
            protocolMarshaller.marshall(verifyMacRequest.getKeyId(), KEYID_BINDING);
            protocolMarshaller.marshall(verifyMacRequest.getMacAlgorithm(), MACALGORITHM_BINDING);
            protocolMarshaller.marshall(verifyMacRequest.getMac(), MAC_BINDING);
            protocolMarshaller.marshall(verifyMacRequest.getGrantTokens(), GRANTTOKENS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
