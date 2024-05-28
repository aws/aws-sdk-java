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
package com.amazonaws.services.pcaconnectorad.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.pcaconnectorad.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * EnrollmentFlagsV3Marshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class EnrollmentFlagsV3Marshaller {

    private static final MarshallingInfo<Boolean> ENABLEKEYREUSEONNTTOKENKEYSETSTORAGEFULL_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EnableKeyReuseOnNtTokenKeysetStorageFull").build();
    private static final MarshallingInfo<Boolean> INCLUDESYMMETRICALGORITHMS_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("IncludeSymmetricAlgorithms").build();
    private static final MarshallingInfo<Boolean> NOSECURITYEXTENSION_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("NoSecurityExtension").build();
    private static final MarshallingInfo<Boolean> REMOVEINVALIDCERTIFICATEFROMPERSONALSTORE_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RemoveInvalidCertificateFromPersonalStore").build();
    private static final MarshallingInfo<Boolean> USERINTERACTIONREQUIRED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("UserInteractionRequired").build();

    private static final EnrollmentFlagsV3Marshaller instance = new EnrollmentFlagsV3Marshaller();

    public static EnrollmentFlagsV3Marshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(EnrollmentFlagsV3 enrollmentFlagsV3, ProtocolMarshaller protocolMarshaller) {

        if (enrollmentFlagsV3 == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(enrollmentFlagsV3.getEnableKeyReuseOnNtTokenKeysetStorageFull(), ENABLEKEYREUSEONNTTOKENKEYSETSTORAGEFULL_BINDING);
            protocolMarshaller.marshall(enrollmentFlagsV3.getIncludeSymmetricAlgorithms(), INCLUDESYMMETRICALGORITHMS_BINDING);
            protocolMarshaller.marshall(enrollmentFlagsV3.getNoSecurityExtension(), NOSECURITYEXTENSION_BINDING);
            protocolMarshaller.marshall(enrollmentFlagsV3.getRemoveInvalidCertificateFromPersonalStore(), REMOVEINVALIDCERTIFICATEFROMPERSONALSTORE_BINDING);
            protocolMarshaller.marshall(enrollmentFlagsV3.getUserInteractionRequired(), USERINTERACTIONREQUIRED_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
