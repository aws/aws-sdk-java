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
 * AwsCertificateManagerCertificateRenewalSummaryMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AwsCertificateManagerCertificateRenewalSummaryMarshaller {

    private static final MarshallingInfo<List> DOMAINVALIDATIONOPTIONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DomainValidationOptions").build();
    private static final MarshallingInfo<String> RENEWALSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RenewalStatus").build();
    private static final MarshallingInfo<String> RENEWALSTATUSREASON_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RenewalStatusReason").build();
    private static final MarshallingInfo<String> UPDATEDAT_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("UpdatedAt").build();

    private static final AwsCertificateManagerCertificateRenewalSummaryMarshaller instance = new AwsCertificateManagerCertificateRenewalSummaryMarshaller();

    public static AwsCertificateManagerCertificateRenewalSummaryMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AwsCertificateManagerCertificateRenewalSummary awsCertificateManagerCertificateRenewalSummary, ProtocolMarshaller protocolMarshaller) {

        if (awsCertificateManagerCertificateRenewalSummary == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(awsCertificateManagerCertificateRenewalSummary.getDomainValidationOptions(), DOMAINVALIDATIONOPTIONS_BINDING);
            protocolMarshaller.marshall(awsCertificateManagerCertificateRenewalSummary.getRenewalStatus(), RENEWALSTATUS_BINDING);
            protocolMarshaller.marshall(awsCertificateManagerCertificateRenewalSummary.getRenewalStatusReason(), RENEWALSTATUSREASON_BINDING);
            protocolMarshaller.marshall(awsCertificateManagerCertificateRenewalSummary.getUpdatedAt(), UPDATEDAT_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
