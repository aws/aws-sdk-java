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
package com.amazonaws.services.acmpca.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.acmpca.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CertificateAuthorityMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CertificateAuthorityMarshaller {

    private static final MarshallingInfo<String> ARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Arn").build();
    private static final MarshallingInfo<java.util.Date> CREATEDAT_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CreatedAt").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> LASTSTATECHANGEAT_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LastStateChangeAt").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> TYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Type").build();
    private static final MarshallingInfo<String> SERIAL_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Serial").build();
    private static final MarshallingInfo<String> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Status").build();
    private static final MarshallingInfo<java.util.Date> NOTBEFORE_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("NotBefore").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> NOTAFTER_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("NotAfter").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> FAILUREREASON_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FailureReason").build();
    private static final MarshallingInfo<StructuredPojo> CERTIFICATEAUTHORITYCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CertificateAuthorityConfiguration").build();
    private static final MarshallingInfo<StructuredPojo> REVOCATIONCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RevocationConfiguration").build();
    private static final MarshallingInfo<java.util.Date> RESTORABLEUNTIL_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RestorableUntil").timestampFormat("unixTimestamp").build();

    private static final CertificateAuthorityMarshaller instance = new CertificateAuthorityMarshaller();

    public static CertificateAuthorityMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CertificateAuthority certificateAuthority, ProtocolMarshaller protocolMarshaller) {

        if (certificateAuthority == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(certificateAuthority.getArn(), ARN_BINDING);
            protocolMarshaller.marshall(certificateAuthority.getCreatedAt(), CREATEDAT_BINDING);
            protocolMarshaller.marshall(certificateAuthority.getLastStateChangeAt(), LASTSTATECHANGEAT_BINDING);
            protocolMarshaller.marshall(certificateAuthority.getType(), TYPE_BINDING);
            protocolMarshaller.marshall(certificateAuthority.getSerial(), SERIAL_BINDING);
            protocolMarshaller.marshall(certificateAuthority.getStatus(), STATUS_BINDING);
            protocolMarshaller.marshall(certificateAuthority.getNotBefore(), NOTBEFORE_BINDING);
            protocolMarshaller.marshall(certificateAuthority.getNotAfter(), NOTAFTER_BINDING);
            protocolMarshaller.marshall(certificateAuthority.getFailureReason(), FAILUREREASON_BINDING);
            protocolMarshaller.marshall(certificateAuthority.getCertificateAuthorityConfiguration(), CERTIFICATEAUTHORITYCONFIGURATION_BINDING);
            protocolMarshaller.marshall(certificateAuthority.getRevocationConfiguration(), REVOCATIONCONFIGURATION_BINDING);
            protocolMarshaller.marshall(certificateAuthority.getRestorableUntil(), RESTORABLEUNTIL_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
