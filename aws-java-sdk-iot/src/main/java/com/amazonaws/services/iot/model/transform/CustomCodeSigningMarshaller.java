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
package com.amazonaws.services.iot.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.iot.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CustomCodeSigningMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CustomCodeSigningMarshaller {

    private static final MarshallingInfo<StructuredPojo> SIGNATURE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("signature").build();
    private static final MarshallingInfo<StructuredPojo> CERTIFICATECHAIN_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("certificateChain").build();
    private static final MarshallingInfo<String> HASHALGORITHM_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("hashAlgorithm").build();
    private static final MarshallingInfo<String> SIGNATUREALGORITHM_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("signatureAlgorithm").build();

    private static final CustomCodeSigningMarshaller instance = new CustomCodeSigningMarshaller();

    public static CustomCodeSigningMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CustomCodeSigning customCodeSigning, ProtocolMarshaller protocolMarshaller) {

        if (customCodeSigning == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(customCodeSigning.getSignature(), SIGNATURE_BINDING);
            protocolMarshaller.marshall(customCodeSigning.getCertificateChain(), CERTIFICATECHAIN_BINDING);
            protocolMarshaller.marshall(customCodeSigning.getHashAlgorithm(), HASHALGORITHM_BINDING);
            protocolMarshaller.marshall(customCodeSigning.getSignatureAlgorithm(), SIGNATUREALGORITHM_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
