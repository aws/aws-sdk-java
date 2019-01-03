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
package com.amazonaws.services.certificatemanager.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.certificatemanager.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CertificateDetailMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CertificateDetailMarshaller {

    private static final MarshallingInfo<String> CERTIFICATEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CertificateArn").build();
    private static final MarshallingInfo<String> DOMAINNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DomainName").build();
    private static final MarshallingInfo<List> SUBJECTALTERNATIVENAMES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SubjectAlternativeNames").build();
    private static final MarshallingInfo<List> DOMAINVALIDATIONOPTIONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DomainValidationOptions").build();
    private static final MarshallingInfo<String> SERIAL_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Serial").build();
    private static final MarshallingInfo<String> SUBJECT_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Subject").build();
    private static final MarshallingInfo<String> ISSUER_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Issuer").build();
    private static final MarshallingInfo<java.util.Date> CREATEDAT_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CreatedAt").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> ISSUEDAT_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("IssuedAt").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> IMPORTEDAT_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ImportedAt").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Status").build();
    private static final MarshallingInfo<java.util.Date> REVOKEDAT_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RevokedAt").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> REVOCATIONREASON_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RevocationReason").build();
    private static final MarshallingInfo<java.util.Date> NOTBEFORE_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("NotBefore").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> NOTAFTER_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("NotAfter").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> KEYALGORITHM_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("KeyAlgorithm").build();
    private static final MarshallingInfo<String> SIGNATUREALGORITHM_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SignatureAlgorithm").build();
    private static final MarshallingInfo<List> INUSEBY_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("InUseBy").build();
    private static final MarshallingInfo<String> FAILUREREASON_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FailureReason").build();
    private static final MarshallingInfo<String> TYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Type").build();
    private static final MarshallingInfo<StructuredPojo> RENEWALSUMMARY_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RenewalSummary").build();
    private static final MarshallingInfo<List> KEYUSAGES_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("KeyUsages").build();
    private static final MarshallingInfo<List> EXTENDEDKEYUSAGES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ExtendedKeyUsages").build();
    private static final MarshallingInfo<String> CERTIFICATEAUTHORITYARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CertificateAuthorityArn").build();
    private static final MarshallingInfo<String> RENEWALELIGIBILITY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RenewalEligibility").build();
    private static final MarshallingInfo<StructuredPojo> OPTIONS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Options").build();

    private static final CertificateDetailMarshaller instance = new CertificateDetailMarshaller();

    public static CertificateDetailMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CertificateDetail certificateDetail, ProtocolMarshaller protocolMarshaller) {

        if (certificateDetail == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(certificateDetail.getCertificateArn(), CERTIFICATEARN_BINDING);
            protocolMarshaller.marshall(certificateDetail.getDomainName(), DOMAINNAME_BINDING);
            protocolMarshaller.marshall(certificateDetail.getSubjectAlternativeNames(), SUBJECTALTERNATIVENAMES_BINDING);
            protocolMarshaller.marshall(certificateDetail.getDomainValidationOptions(), DOMAINVALIDATIONOPTIONS_BINDING);
            protocolMarshaller.marshall(certificateDetail.getSerial(), SERIAL_BINDING);
            protocolMarshaller.marshall(certificateDetail.getSubject(), SUBJECT_BINDING);
            protocolMarshaller.marshall(certificateDetail.getIssuer(), ISSUER_BINDING);
            protocolMarshaller.marshall(certificateDetail.getCreatedAt(), CREATEDAT_BINDING);
            protocolMarshaller.marshall(certificateDetail.getIssuedAt(), ISSUEDAT_BINDING);
            protocolMarshaller.marshall(certificateDetail.getImportedAt(), IMPORTEDAT_BINDING);
            protocolMarshaller.marshall(certificateDetail.getStatus(), STATUS_BINDING);
            protocolMarshaller.marshall(certificateDetail.getRevokedAt(), REVOKEDAT_BINDING);
            protocolMarshaller.marshall(certificateDetail.getRevocationReason(), REVOCATIONREASON_BINDING);
            protocolMarshaller.marshall(certificateDetail.getNotBefore(), NOTBEFORE_BINDING);
            protocolMarshaller.marshall(certificateDetail.getNotAfter(), NOTAFTER_BINDING);
            protocolMarshaller.marshall(certificateDetail.getKeyAlgorithm(), KEYALGORITHM_BINDING);
            protocolMarshaller.marshall(certificateDetail.getSignatureAlgorithm(), SIGNATUREALGORITHM_BINDING);
            protocolMarshaller.marshall(certificateDetail.getInUseBy(), INUSEBY_BINDING);
            protocolMarshaller.marshall(certificateDetail.getFailureReason(), FAILUREREASON_BINDING);
            protocolMarshaller.marshall(certificateDetail.getType(), TYPE_BINDING);
            protocolMarshaller.marshall(certificateDetail.getRenewalSummary(), RENEWALSUMMARY_BINDING);
            protocolMarshaller.marshall(certificateDetail.getKeyUsages(), KEYUSAGES_BINDING);
            protocolMarshaller.marshall(certificateDetail.getExtendedKeyUsages(), EXTENDEDKEYUSAGES_BINDING);
            protocolMarshaller.marshall(certificateDetail.getCertificateAuthorityArn(), CERTIFICATEAUTHORITYARN_BINDING);
            protocolMarshaller.marshall(certificateDetail.getRenewalEligibility(), RENEWALELIGIBILITY_BINDING);
            protocolMarshaller.marshall(certificateDetail.getOptions(), OPTIONS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
