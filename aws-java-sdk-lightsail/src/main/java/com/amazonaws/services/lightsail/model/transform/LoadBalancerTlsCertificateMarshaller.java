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
package com.amazonaws.services.lightsail.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.lightsail.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * LoadBalancerTlsCertificateMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class LoadBalancerTlsCertificateMarshaller {

    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("name").build();
    private static final MarshallingInfo<String> ARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("arn").build();
    private static final MarshallingInfo<String> SUPPORTCODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("supportCode").build();
    private static final MarshallingInfo<java.util.Date> CREATEDAT_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("createdAt").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<StructuredPojo> LOCATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("location").build();
    private static final MarshallingInfo<String> RESOURCETYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("resourceType").build();
    private static final MarshallingInfo<List> TAGS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("tags").build();
    private static final MarshallingInfo<String> LOADBALANCERNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("loadBalancerName").build();
    private static final MarshallingInfo<Boolean> ISATTACHED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("isAttached").build();
    private static final MarshallingInfo<String> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("status").build();
    private static final MarshallingInfo<String> DOMAINNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("domainName").build();
    private static final MarshallingInfo<List> DOMAINVALIDATIONRECORDS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("domainValidationRecords").build();
    private static final MarshallingInfo<String> FAILUREREASON_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("failureReason").build();
    private static final MarshallingInfo<java.util.Date> ISSUEDAT_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("issuedAt").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> ISSUER_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("issuer").build();
    private static final MarshallingInfo<String> KEYALGORITHM_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("keyAlgorithm").build();
    private static final MarshallingInfo<java.util.Date> NOTAFTER_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("notAfter").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> NOTBEFORE_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("notBefore").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<StructuredPojo> RENEWALSUMMARY_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("renewalSummary").build();
    private static final MarshallingInfo<String> REVOCATIONREASON_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("revocationReason").build();
    private static final MarshallingInfo<java.util.Date> REVOKEDAT_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("revokedAt").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> SERIAL_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("serial").build();
    private static final MarshallingInfo<String> SIGNATUREALGORITHM_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("signatureAlgorithm").build();
    private static final MarshallingInfo<String> SUBJECT_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("subject").build();
    private static final MarshallingInfo<List> SUBJECTALTERNATIVENAMES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("subjectAlternativeNames").build();

    private static final LoadBalancerTlsCertificateMarshaller instance = new LoadBalancerTlsCertificateMarshaller();

    public static LoadBalancerTlsCertificateMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(LoadBalancerTlsCertificate loadBalancerTlsCertificate, ProtocolMarshaller protocolMarshaller) {

        if (loadBalancerTlsCertificate == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(loadBalancerTlsCertificate.getName(), NAME_BINDING);
            protocolMarshaller.marshall(loadBalancerTlsCertificate.getArn(), ARN_BINDING);
            protocolMarshaller.marshall(loadBalancerTlsCertificate.getSupportCode(), SUPPORTCODE_BINDING);
            protocolMarshaller.marshall(loadBalancerTlsCertificate.getCreatedAt(), CREATEDAT_BINDING);
            protocolMarshaller.marshall(loadBalancerTlsCertificate.getLocation(), LOCATION_BINDING);
            protocolMarshaller.marshall(loadBalancerTlsCertificate.getResourceType(), RESOURCETYPE_BINDING);
            protocolMarshaller.marshall(loadBalancerTlsCertificate.getTags(), TAGS_BINDING);
            protocolMarshaller.marshall(loadBalancerTlsCertificate.getLoadBalancerName(), LOADBALANCERNAME_BINDING);
            protocolMarshaller.marshall(loadBalancerTlsCertificate.getIsAttached(), ISATTACHED_BINDING);
            protocolMarshaller.marshall(loadBalancerTlsCertificate.getStatus(), STATUS_BINDING);
            protocolMarshaller.marshall(loadBalancerTlsCertificate.getDomainName(), DOMAINNAME_BINDING);
            protocolMarshaller.marshall(loadBalancerTlsCertificate.getDomainValidationRecords(), DOMAINVALIDATIONRECORDS_BINDING);
            protocolMarshaller.marshall(loadBalancerTlsCertificate.getFailureReason(), FAILUREREASON_BINDING);
            protocolMarshaller.marshall(loadBalancerTlsCertificate.getIssuedAt(), ISSUEDAT_BINDING);
            protocolMarshaller.marshall(loadBalancerTlsCertificate.getIssuer(), ISSUER_BINDING);
            protocolMarshaller.marshall(loadBalancerTlsCertificate.getKeyAlgorithm(), KEYALGORITHM_BINDING);
            protocolMarshaller.marshall(loadBalancerTlsCertificate.getNotAfter(), NOTAFTER_BINDING);
            protocolMarshaller.marshall(loadBalancerTlsCertificate.getNotBefore(), NOTBEFORE_BINDING);
            protocolMarshaller.marshall(loadBalancerTlsCertificate.getRenewalSummary(), RENEWALSUMMARY_BINDING);
            protocolMarshaller.marshall(loadBalancerTlsCertificate.getRevocationReason(), REVOCATIONREASON_BINDING);
            protocolMarshaller.marshall(loadBalancerTlsCertificate.getRevokedAt(), REVOKEDAT_BINDING);
            protocolMarshaller.marshall(loadBalancerTlsCertificate.getSerial(), SERIAL_BINDING);
            protocolMarshaller.marshall(loadBalancerTlsCertificate.getSignatureAlgorithm(), SIGNATUREALGORITHM_BINDING);
            protocolMarshaller.marshall(loadBalancerTlsCertificate.getSubject(), SUBJECT_BINDING);
            protocolMarshaller.marshall(loadBalancerTlsCertificate.getSubjectAlternativeNames(), SUBJECTALTERNATIVENAMES_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
