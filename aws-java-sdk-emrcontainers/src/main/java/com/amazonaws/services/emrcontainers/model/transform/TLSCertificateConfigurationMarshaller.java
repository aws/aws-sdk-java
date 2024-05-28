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
package com.amazonaws.services.emrcontainers.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.emrcontainers.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * TLSCertificateConfigurationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class TLSCertificateConfigurationMarshaller {

    private static final MarshallingInfo<String> CERTIFICATEPROVIDERTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("certificateProviderType").build();
    private static final MarshallingInfo<String> PUBLICCERTIFICATESECRETARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("publicCertificateSecretArn").build();
    private static final MarshallingInfo<String> PRIVATECERTIFICATESECRETARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("privateCertificateSecretArn").build();

    private static final TLSCertificateConfigurationMarshaller instance = new TLSCertificateConfigurationMarshaller();

    public static TLSCertificateConfigurationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(TLSCertificateConfiguration tLSCertificateConfiguration, ProtocolMarshaller protocolMarshaller) {

        if (tLSCertificateConfiguration == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(tLSCertificateConfiguration.getCertificateProviderType(), CERTIFICATEPROVIDERTYPE_BINDING);
            protocolMarshaller.marshall(tLSCertificateConfiguration.getPublicCertificateSecretArn(), PUBLICCERTIFICATESECRETARN_BINDING);
            protocolMarshaller.marshall(tLSCertificateConfiguration.getPrivateCertificateSecretArn(), PRIVATECERTIFICATESECRETARN_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
