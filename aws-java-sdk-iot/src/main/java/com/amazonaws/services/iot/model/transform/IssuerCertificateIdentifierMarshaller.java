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
package com.amazonaws.services.iot.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.iot.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * IssuerCertificateIdentifierMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class IssuerCertificateIdentifierMarshaller {

    private static final MarshallingInfo<String> ISSUERCERTIFICATESUBJECT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("issuerCertificateSubject").build();
    private static final MarshallingInfo<String> ISSUERID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("issuerId").build();
    private static final MarshallingInfo<String> ISSUERCERTIFICATESERIALNUMBER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("issuerCertificateSerialNumber").build();

    private static final IssuerCertificateIdentifierMarshaller instance = new IssuerCertificateIdentifierMarshaller();

    public static IssuerCertificateIdentifierMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(IssuerCertificateIdentifier issuerCertificateIdentifier, ProtocolMarshaller protocolMarshaller) {

        if (issuerCertificateIdentifier == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(issuerCertificateIdentifier.getIssuerCertificateSubject(), ISSUERCERTIFICATESUBJECT_BINDING);
            protocolMarshaller.marshall(issuerCertificateIdentifier.getIssuerId(), ISSUERID_BINDING);
            protocolMarshaller.marshall(issuerCertificateIdentifier.getIssuerCertificateSerialNumber(), ISSUERCERTIFICATESERIALNUMBER_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
