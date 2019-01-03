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
package com.amazonaws.services.kms.model.transform;

import java.util.Map;
import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.kms.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ReEncryptRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ReEncryptRequestMarshaller {

    private static final MarshallingInfo<java.nio.ByteBuffer> CIPHERTEXTBLOB_BINDING = MarshallingInfo.builder(MarshallingType.BYTE_BUFFER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CiphertextBlob").build();
    private static final MarshallingInfo<Map> SOURCEENCRYPTIONCONTEXT_BINDING = MarshallingInfo.builder(MarshallingType.MAP)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SourceEncryptionContext").build();
    private static final MarshallingInfo<String> DESTINATIONKEYID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DestinationKeyId").build();
    private static final MarshallingInfo<Map> DESTINATIONENCRYPTIONCONTEXT_BINDING = MarshallingInfo.builder(MarshallingType.MAP)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DestinationEncryptionContext").build();
    private static final MarshallingInfo<List> GRANTTOKENS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("GrantTokens").build();

    private static final ReEncryptRequestMarshaller instance = new ReEncryptRequestMarshaller();

    public static ReEncryptRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ReEncryptRequest reEncryptRequest, ProtocolMarshaller protocolMarshaller) {

        if (reEncryptRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(reEncryptRequest.getCiphertextBlob(), CIPHERTEXTBLOB_BINDING);
            protocolMarshaller.marshall(reEncryptRequest.getSourceEncryptionContext(), SOURCEENCRYPTIONCONTEXT_BINDING);
            protocolMarshaller.marshall(reEncryptRequest.getDestinationKeyId(), DESTINATIONKEYID_BINDING);
            protocolMarshaller.marshall(reEncryptRequest.getDestinationEncryptionContext(), DESTINATIONENCRYPTIONCONTEXT_BINDING);
            protocolMarshaller.marshall(reEncryptRequest.getGrantTokens(), GRANTTOKENS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
