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
package com.amazonaws.services.certificatemanager.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.certificatemanager.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CertificateSummaryMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CertificateSummaryMarshaller {

    private static final MarshallingInfo<String> CERTIFICATEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CertificateArn").build();
    private static final MarshallingInfo<String> DOMAINNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DomainName").build();
    private static final MarshallingInfo<List> SUBJECTALTERNATIVENAMESUMMARIES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SubjectAlternativeNameSummaries").build();
    private static final MarshallingInfo<Boolean> HASADDITIONALSUBJECTALTERNATIVENAMES_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("HasAdditionalSubjectAlternativeNames").build();
    private static final MarshallingInfo<String> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Status").build();
    private static final MarshallingInfo<String> TYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Type").build();
    private static final MarshallingInfo<String> KEYALGORITHM_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("KeyAlgorithm").build();
    private static final MarshallingInfo<List> KEYUSAGES_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("KeyUsages").build();
    private static final MarshallingInfo<List> EXTENDEDKEYUSAGES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ExtendedKeyUsages").build();
    private static final MarshallingInfo<Boolean> INUSE_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("InUse").build();
    private static final MarshallingInfo<Boolean> EXPORTED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Exported").build();
    private static final MarshallingInfo<String> RENEWALELIGIBILITY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RenewalEligibility").build();
    private static final MarshallingInfo<java.util.Date> NOTBEFORE_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("NotBefore").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> NOTAFTER_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("NotAfter").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> CREATEDAT_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CreatedAt").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> ISSUEDAT_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("IssuedAt").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> IMPORTEDAT_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ImportedAt").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> REVOKEDAT_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RevokedAt").timestampFormat("unixTimestamp").build();

    private static final CertificateSummaryMarshaller instance = new CertificateSummaryMarshaller();

    public static CertificateSummaryMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CertificateSummary certificateSummary, ProtocolMarshaller protocolMarshaller) {

        if (certificateSummary == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(certificateSummary.getCertificateArn(), CERTIFICATEARN_BINDING);
            protocolMarshaller.marshall(certificateSummary.getDomainName(), DOMAINNAME_BINDING);
            protocolMarshaller.marshall(certificateSummary.getSubjectAlternativeNameSummaries(), SUBJECTALTERNATIVENAMESUMMARIES_BINDING);
            protocolMarshaller.marshall(certificateSummary.getHasAdditionalSubjectAlternativeNames(), HASADDITIONALSUBJECTALTERNATIVENAMES_BINDING);
            protocolMarshaller.marshall(certificateSummary.getStatus(), STATUS_BINDING);
            protocolMarshaller.marshall(certificateSummary.getType(), TYPE_BINDING);
            protocolMarshaller.marshall(certificateSummary.getKeyAlgorithm(), KEYALGORITHM_BINDING);
            protocolMarshaller.marshall(certificateSummary.getKeyUsages(), KEYUSAGES_BINDING);
            protocolMarshaller.marshall(certificateSummary.getExtendedKeyUsages(), EXTENDEDKEYUSAGES_BINDING);
            protocolMarshaller.marshall(certificateSummary.getInUse(), INUSE_BINDING);
            protocolMarshaller.marshall(certificateSummary.getExported(), EXPORTED_BINDING);
            protocolMarshaller.marshall(certificateSummary.getRenewalEligibility(), RENEWALELIGIBILITY_BINDING);
            protocolMarshaller.marshall(certificateSummary.getNotBefore(), NOTBEFORE_BINDING);
            protocolMarshaller.marshall(certificateSummary.getNotAfter(), NOTAFTER_BINDING);
            protocolMarshaller.marshall(certificateSummary.getCreatedAt(), CREATEDAT_BINDING);
            protocolMarshaller.marshall(certificateSummary.getIssuedAt(), ISSUEDAT_BINDING);
            protocolMarshaller.marshall(certificateSummary.getImportedAt(), IMPORTEDAT_BINDING);
            protocolMarshaller.marshall(certificateSummary.getRevokedAt(), REVOKEDAT_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
