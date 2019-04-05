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
package com.amazonaws.services.acmpca.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.acmpca.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CertificateAuthorityConfigurationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CertificateAuthorityConfigurationMarshaller {

    private static final MarshallingInfo<String> KEYALGORITHM_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("KeyAlgorithm").build();
    private static final MarshallingInfo<String> SIGNINGALGORITHM_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SigningAlgorithm").build();
    private static final MarshallingInfo<StructuredPojo> SUBJECT_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Subject").build();

    private static final CertificateAuthorityConfigurationMarshaller instance = new CertificateAuthorityConfigurationMarshaller();

    public static CertificateAuthorityConfigurationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CertificateAuthorityConfiguration certificateAuthorityConfiguration, ProtocolMarshaller protocolMarshaller) {

        if (certificateAuthorityConfiguration == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(certificateAuthorityConfiguration.getKeyAlgorithm(), KEYALGORITHM_BINDING);
            protocolMarshaller.marshall(certificateAuthorityConfiguration.getSigningAlgorithm(), SIGNINGALGORITHM_BINDING);
            protocolMarshaller.marshall(certificateAuthorityConfiguration.getSubject(), SUBJECT_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
