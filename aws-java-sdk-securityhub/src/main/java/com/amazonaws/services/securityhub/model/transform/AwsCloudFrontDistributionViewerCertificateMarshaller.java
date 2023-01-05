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
package com.amazonaws.services.securityhub.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.securityhub.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * AwsCloudFrontDistributionViewerCertificateMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AwsCloudFrontDistributionViewerCertificateMarshaller {

    private static final MarshallingInfo<String> ACMCERTIFICATEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AcmCertificateArn").build();
    private static final MarshallingInfo<String> CERTIFICATE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Certificate").build();
    private static final MarshallingInfo<String> CERTIFICATESOURCE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CertificateSource").build();
    private static final MarshallingInfo<Boolean> CLOUDFRONTDEFAULTCERTIFICATE_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CloudFrontDefaultCertificate").build();
    private static final MarshallingInfo<String> IAMCERTIFICATEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("IamCertificateId").build();
    private static final MarshallingInfo<String> MINIMUMPROTOCOLVERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MinimumProtocolVersion").build();
    private static final MarshallingInfo<String> SSLSUPPORTMETHOD_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SslSupportMethod").build();

    private static final AwsCloudFrontDistributionViewerCertificateMarshaller instance = new AwsCloudFrontDistributionViewerCertificateMarshaller();

    public static AwsCloudFrontDistributionViewerCertificateMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AwsCloudFrontDistributionViewerCertificate awsCloudFrontDistributionViewerCertificate, ProtocolMarshaller protocolMarshaller) {

        if (awsCloudFrontDistributionViewerCertificate == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(awsCloudFrontDistributionViewerCertificate.getAcmCertificateArn(), ACMCERTIFICATEARN_BINDING);
            protocolMarshaller.marshall(awsCloudFrontDistributionViewerCertificate.getCertificate(), CERTIFICATE_BINDING);
            protocolMarshaller.marshall(awsCloudFrontDistributionViewerCertificate.getCertificateSource(), CERTIFICATESOURCE_BINDING);
            protocolMarshaller.marshall(awsCloudFrontDistributionViewerCertificate.getCloudFrontDefaultCertificate(), CLOUDFRONTDEFAULTCERTIFICATE_BINDING);
            protocolMarshaller.marshall(awsCloudFrontDistributionViewerCertificate.getIamCertificateId(), IAMCERTIFICATEID_BINDING);
            protocolMarshaller.marshall(awsCloudFrontDistributionViewerCertificate.getMinimumProtocolVersion(), MINIMUMPROTOCOLVERSION_BINDING);
            protocolMarshaller.marshall(awsCloudFrontDistributionViewerCertificate.getSslSupportMethod(), SSLSUPPORTMETHOD_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
