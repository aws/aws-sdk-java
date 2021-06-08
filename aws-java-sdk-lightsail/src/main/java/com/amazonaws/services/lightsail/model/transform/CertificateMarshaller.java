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
package com.amazonaws.services.lightsail.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.lightsail.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CertificateMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CertificateMarshaller {

    private static final MarshallingInfo<String> ARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("arn").build();
    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("name").build();
    private static final MarshallingInfo<String> DOMAINNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("domainName").build();
    private static final MarshallingInfo<String> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("status").build();
    private static final MarshallingInfo<String> SERIALNUMBER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("serialNumber").build();
    private static final MarshallingInfo<List> SUBJECTALTERNATIVENAMES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("subjectAlternativeNames").build();
    private static final MarshallingInfo<List> DOMAINVALIDATIONRECORDS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("domainValidationRecords").build();
    private static final MarshallingInfo<String> REQUESTFAILUREREASON_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("requestFailureReason").build();
    private static final MarshallingInfo<Integer> INUSERESOURCECOUNT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("inUseResourceCount").build();
    private static final MarshallingInfo<String> KEYALGORITHM_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("keyAlgorithm").build();
    private static final MarshallingInfo<java.util.Date> CREATEDAT_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("createdAt").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> ISSUEDAT_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("issuedAt").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> ISSUERCA_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("issuerCA").build();
    private static final MarshallingInfo<java.util.Date> NOTBEFORE_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("notBefore").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> NOTAFTER_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("notAfter").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> ELIGIBLETORENEW_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("eligibleToRenew").build();
    private static final MarshallingInfo<StructuredPojo> RENEWALSUMMARY_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("renewalSummary").build();
    private static final MarshallingInfo<java.util.Date> REVOKEDAT_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("revokedAt").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> REVOCATIONREASON_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("revocationReason").build();
    private static final MarshallingInfo<List> TAGS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("tags").build();
    private static final MarshallingInfo<String> SUPPORTCODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("supportCode").build();

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
            protocolMarshaller.marshall(certificate.getArn(), ARN_BINDING);
            protocolMarshaller.marshall(certificate.getName(), NAME_BINDING);
            protocolMarshaller.marshall(certificate.getDomainName(), DOMAINNAME_BINDING);
            protocolMarshaller.marshall(certificate.getStatus(), STATUS_BINDING);
            protocolMarshaller.marshall(certificate.getSerialNumber(), SERIALNUMBER_BINDING);
            protocolMarshaller.marshall(certificate.getSubjectAlternativeNames(), SUBJECTALTERNATIVENAMES_BINDING);
            protocolMarshaller.marshall(certificate.getDomainValidationRecords(), DOMAINVALIDATIONRECORDS_BINDING);
            protocolMarshaller.marshall(certificate.getRequestFailureReason(), REQUESTFAILUREREASON_BINDING);
            protocolMarshaller.marshall(certificate.getInUseResourceCount(), INUSERESOURCECOUNT_BINDING);
            protocolMarshaller.marshall(certificate.getKeyAlgorithm(), KEYALGORITHM_BINDING);
            protocolMarshaller.marshall(certificate.getCreatedAt(), CREATEDAT_BINDING);
            protocolMarshaller.marshall(certificate.getIssuedAt(), ISSUEDAT_BINDING);
            protocolMarshaller.marshall(certificate.getIssuerCA(), ISSUERCA_BINDING);
            protocolMarshaller.marshall(certificate.getNotBefore(), NOTBEFORE_BINDING);
            protocolMarshaller.marshall(certificate.getNotAfter(), NOTAFTER_BINDING);
            protocolMarshaller.marshall(certificate.getEligibleToRenew(), ELIGIBLETORENEW_BINDING);
            protocolMarshaller.marshall(certificate.getRenewalSummary(), RENEWALSUMMARY_BINDING);
            protocolMarshaller.marshall(certificate.getRevokedAt(), REVOKEDAT_BINDING);
            protocolMarshaller.marshall(certificate.getRevocationReason(), REVOCATIONREASON_BINDING);
            protocolMarshaller.marshall(certificate.getTags(), TAGS_BINDING);
            protocolMarshaller.marshall(certificate.getSupportCode(), SUPPORTCODE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
