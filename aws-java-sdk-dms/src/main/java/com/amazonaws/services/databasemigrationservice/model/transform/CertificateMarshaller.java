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
package com.amazonaws.services.databasemigrationservice.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.databasemigrationservice.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CertificateMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CertificateMarshaller {

    private static final MarshallingInfo<String> CERTIFICATEIDENTIFIER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CertificateIdentifier").build();
    private static final MarshallingInfo<java.util.Date> CERTIFICATECREATIONDATE_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CertificateCreationDate").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> CERTIFICATEPEM_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CertificatePem").build();
    private static final MarshallingInfo<java.nio.ByteBuffer> CERTIFICATEWALLET_BINDING = MarshallingInfo.builder(MarshallingType.BYTE_BUFFER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CertificateWallet").build();
    private static final MarshallingInfo<String> CERTIFICATEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CertificateArn").build();
    private static final MarshallingInfo<String> CERTIFICATEOWNER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CertificateOwner").build();
    private static final MarshallingInfo<java.util.Date> VALIDFROMDATE_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ValidFromDate").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> VALIDTODATE_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ValidToDate").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> SIGNINGALGORITHM_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SigningAlgorithm").build();
    private static final MarshallingInfo<Integer> KEYLENGTH_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("KeyLength").build();

    private static final CertificateMarshaller instance = new CertificateMarshaller();

    public static CertificateMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(Certificate certificate, ProtocolMarshaller protocolMarshaller) {

        if (certificate == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(certificate.getCertificateIdentifier(), CERTIFICATEIDENTIFIER_BINDING);
            protocolMarshaller.marshall(certificate.getCertificateCreationDate(), CERTIFICATECREATIONDATE_BINDING);
            protocolMarshaller.marshall(certificate.getCertificatePem(), CERTIFICATEPEM_BINDING);
            protocolMarshaller.marshall(certificate.getCertificateWallet(), CERTIFICATEWALLET_BINDING);
            protocolMarshaller.marshall(certificate.getCertificateArn(), CERTIFICATEARN_BINDING);
            protocolMarshaller.marshall(certificate.getCertificateOwner(), CERTIFICATEOWNER_BINDING);
            protocolMarshaller.marshall(certificate.getValidFromDate(), VALIDFROMDATE_BINDING);
            protocolMarshaller.marshall(certificate.getValidToDate(), VALIDTODATE_BINDING);
            protocolMarshaller.marshall(certificate.getSigningAlgorithm(), SIGNINGALGORITHM_BINDING);
            protocolMarshaller.marshall(certificate.getKeyLength(), KEYLENGTH_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
