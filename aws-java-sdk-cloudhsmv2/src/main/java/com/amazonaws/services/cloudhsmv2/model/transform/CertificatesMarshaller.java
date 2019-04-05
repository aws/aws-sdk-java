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
package com.amazonaws.services.cloudhsmv2.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.cloudhsmv2.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CertificatesMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CertificatesMarshaller {

    private static final MarshallingInfo<String> CLUSTERCSR_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ClusterCsr").build();
    private static final MarshallingInfo<String> HSMCERTIFICATE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("HsmCertificate").build();
    private static final MarshallingInfo<String> AWSHARDWARECERTIFICATE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AwsHardwareCertificate").build();
    private static final MarshallingInfo<String> MANUFACTURERHARDWARECERTIFICATE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ManufacturerHardwareCertificate").build();
    private static final MarshallingInfo<String> CLUSTERCERTIFICATE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ClusterCertificate").build();

    private static final CertificatesMarshaller instance = new CertificatesMarshaller();

    public static CertificatesMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(Certificates certificates, ProtocolMarshaller protocolMarshaller) {

        if (certificates == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(certificates.getClusterCsr(), CLUSTERCSR_BINDING);
            protocolMarshaller.marshall(certificates.getHsmCertificate(), HSMCERTIFICATE_BINDING);
            protocolMarshaller.marshall(certificates.getAwsHardwareCertificate(), AWSHARDWARECERTIFICATE_BINDING);
            protocolMarshaller.marshall(certificates.getManufacturerHardwareCertificate(), MANUFACTURERHARDWARECERTIFICATE_BINDING);
            protocolMarshaller.marshall(certificates.getClusterCertificate(), CLUSTERCERTIFICATE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
