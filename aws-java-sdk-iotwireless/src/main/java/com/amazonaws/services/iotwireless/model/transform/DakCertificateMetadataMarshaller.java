/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.iotwireless.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.iotwireless.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * DakCertificateMetadataMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class DakCertificateMetadataMarshaller {

    private static final MarshallingInfo<String> CERTIFICATEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CertificateId").build();
    private static final MarshallingInfo<Integer> MAXALLOWEDSIGNATURE_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MaxAllowedSignature").build();
    private static final MarshallingInfo<Boolean> FACTORYSUPPORT_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FactorySupport").build();
    private static final MarshallingInfo<String> APID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("ApId").build();
    private static final MarshallingInfo<String> DEVICETYPEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DeviceTypeId").build();

    private static final DakCertificateMetadataMarshaller instance = new DakCertificateMetadataMarshaller();

    public static DakCertificateMetadataMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(DakCertificateMetadata dakCertificateMetadata, ProtocolMarshaller protocolMarshaller) {

        if (dakCertificateMetadata == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(dakCertificateMetadata.getCertificateId(), CERTIFICATEID_BINDING);
            protocolMarshaller.marshall(dakCertificateMetadata.getMaxAllowedSignature(), MAXALLOWEDSIGNATURE_BINDING);
            protocolMarshaller.marshall(dakCertificateMetadata.getFactorySupport(), FACTORYSUPPORT_BINDING);
            protocolMarshaller.marshall(dakCertificateMetadata.getApId(), APID_BINDING);
            protocolMarshaller.marshall(dakCertificateMetadata.getDeviceTypeId(), DEVICETYPEID_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
