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
package com.amazonaws.services.securityhub.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.securityhub.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * AwsCertificateManagerCertificateDetailsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AwsCertificateManagerCertificateDetailsMarshaller {

    private static final MarshallingInfo<String> CERTIFICATEAUTHORITYARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CertificateAuthorityArn").build();
    private static final MarshallingInfo<String> CREATEDAT_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("CreatedAt").build();
    private static final MarshallingInfo<String> DOMAINNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DomainName").build();
    private static final MarshallingInfo<List> DOMAINVALIDATIONOPTIONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DomainValidationOptions").build();
    private static final MarshallingInfo<List> EXTENDEDKEYUSAGES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ExtendedKeyUsages").build();
    private static final MarshallingInfo<String> FAILUREREASON_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FailureReason").build();
    private static final MarshallingInfo<String> IMPORTEDAT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ImportedAt").build();
    private static final MarshallingInfo<List> INUSEBY_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("InUseBy").build();
    private static final MarshallingInfo<String> ISSUEDAT_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("IssuedAt").build();
    private static final MarshallingInfo<String> ISSUER_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Issuer").build();
    private static final MarshallingInfo<String> KEYALGORITHM_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("KeyAlgorithm").build();
    private static final MarshallingInfo<List> KEYUSAGES_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("KeyUsages").build();
    private static final MarshallingInfo<String> NOTAFTER_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("NotAfter").build();
    private static final MarshallingInfo<String> NOTBEFORE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("NotBefore").build();
    private static final MarshallingInfo<StructuredPojo> OPTIONS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Options").build();
    private static final MarshallingInfo<String> RENEWALELIGIBILITY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RenewalEligibility").build();
    private static final MarshallingInfo<StructuredPojo> RENEWALSUMMARY_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RenewalSummary").build();
    private static final MarshallingInfo<String> SERIAL_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Serial").build();
    private static final MarshallingInfo<String> SIGNATUREALGORITHM_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SignatureAlgorithm").build();
    private static final MarshallingInfo<String> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Status").build();
    private static final MarshallingInfo<String> SUBJECT_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Subject").build();
    private static final MarshallingInfo<List> SUBJECTALTERNATIVENAMES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SubjectAlternativeNames").build();
    private static final MarshallingInfo<String> TYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Type").build();

    private static final AwsCertificateManagerCertificateDetailsMarshaller instance = new AwsCertificateManagerCertificateDetailsMarshaller();

    public static AwsCertificateManagerCertificateDetailsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AwsCertificateManagerCertificateDetails awsCertificateManagerCertificateDetails, ProtocolMarshaller protocolMarshaller) {

        if (awsCertificateManagerCertificateDetails == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(awsCertificateManagerCertificateDetails.getCertificateAuthorityArn(), CERTIFICATEAUTHORITYARN_BINDING);
            protocolMarshaller.marshall(awsCertificateManagerCertificateDetails.getCreatedAt(), CREATEDAT_BINDING);
            protocolMarshaller.marshall(awsCertificateManagerCertificateDetails.getDomainName(), DOMAINNAME_BINDING);
            protocolMarshaller.marshall(awsCertificateManagerCertificateDetails.getDomainValidationOptions(), DOMAINVALIDATIONOPTIONS_BINDING);
            protocolMarshaller.marshall(awsCertificateManagerCertificateDetails.getExtendedKeyUsages(), EXTENDEDKEYUSAGES_BINDING);
            protocolMarshaller.marshall(awsCertificateManagerCertificateDetails.getFailureReason(), FAILUREREASON_BINDING);
            protocolMarshaller.marshall(awsCertificateManagerCertificateDetails.getImportedAt(), IMPORTEDAT_BINDING);
            protocolMarshaller.marshall(awsCertificateManagerCertificateDetails.getInUseBy(), INUSEBY_BINDING);
            protocolMarshaller.marshall(awsCertificateManagerCertificateDetails.getIssuedAt(), ISSUEDAT_BINDING);
            protocolMarshaller.marshall(awsCertificateManagerCertificateDetails.getIssuer(), ISSUER_BINDING);
            protocolMarshaller.marshall(awsCertificateManagerCertificateDetails.getKeyAlgorithm(), KEYALGORITHM_BINDING);
            protocolMarshaller.marshall(awsCertificateManagerCertificateDetails.getKeyUsages(), KEYUSAGES_BINDING);
            protocolMarshaller.marshall(awsCertificateManagerCertificateDetails.getNotAfter(), NOTAFTER_BINDING);
            protocolMarshaller.marshall(awsCertificateManagerCertificateDetails.getNotBefore(), NOTBEFORE_BINDING);
            protocolMarshaller.marshall(awsCertificateManagerCertificateDetails.getOptions(), OPTIONS_BINDING);
            protocolMarshaller.marshall(awsCertificateManagerCertificateDetails.getRenewalEligibility(), RENEWALELIGIBILITY_BINDING);
            protocolMarshaller.marshall(awsCertificateManagerCertificateDetails.getRenewalSummary(), RENEWALSUMMARY_BINDING);
            protocolMarshaller.marshall(awsCertificateManagerCertificateDetails.getSerial(), SERIAL_BINDING);
            protocolMarshaller.marshall(awsCertificateManagerCertificateDetails.getSignatureAlgorithm(), SIGNATUREALGORITHM_BINDING);
            protocolMarshaller.marshall(awsCertificateManagerCertificateDetails.getStatus(), STATUS_BINDING);
            protocolMarshaller.marshall(awsCertificateManagerCertificateDetails.getSubject(), SUBJECT_BINDING);
            protocolMarshaller.marshall(awsCertificateManagerCertificateDetails.getSubjectAlternativeNames(), SUBJECTALTERNATIVENAMES_BINDING);
            protocolMarshaller.marshall(awsCertificateManagerCertificateDetails.getType(), TYPE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
