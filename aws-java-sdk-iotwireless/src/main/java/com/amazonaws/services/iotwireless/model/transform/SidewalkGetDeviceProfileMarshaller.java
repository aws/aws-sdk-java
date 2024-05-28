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

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.iotwireless.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * SidewalkGetDeviceProfileMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class SidewalkGetDeviceProfileMarshaller {

    private static final MarshallingInfo<String> APPLICATIONSERVERPUBLICKEY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ApplicationServerPublicKey").build();
    private static final MarshallingInfo<Boolean> QUALIFICATIONSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("QualificationStatus").build();
    private static final MarshallingInfo<List> DAKCERTIFICATEMETADATA_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DakCertificateMetadata").build();

    private static final SidewalkGetDeviceProfileMarshaller instance = new SidewalkGetDeviceProfileMarshaller();

    public static SidewalkGetDeviceProfileMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(SidewalkGetDeviceProfile sidewalkGetDeviceProfile, ProtocolMarshaller protocolMarshaller) {

        if (sidewalkGetDeviceProfile == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(sidewalkGetDeviceProfile.getApplicationServerPublicKey(), APPLICATIONSERVERPUBLICKEY_BINDING);
            protocolMarshaller.marshall(sidewalkGetDeviceProfile.getQualificationStatus(), QUALIFICATIONSTATUS_BINDING);
            protocolMarshaller.marshall(sidewalkGetDeviceProfile.getDakCertificateMetadata(), DAKCERTIFICATEMETADATA_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
