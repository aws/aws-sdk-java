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
package com.amazonaws.services.iot.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.iot.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * OutgoingCertificateMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class OutgoingCertificateMarshaller {

    private static final MarshallingInfo<String> CERTIFICATEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("certificateArn").build();
    private static final MarshallingInfo<String> CERTIFICATEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("certificateId").build();
    private static final MarshallingInfo<String> TRANSFERREDTO_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("transferredTo").build();
    private static final MarshallingInfo<java.util.Date> TRANSFERDATE_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("transferDate").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> TRANSFERMESSAGE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("transferMessage").build();
    private static final MarshallingInfo<java.util.Date> CREATIONDATE_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("creationDate").timestampFormat("unixTimestamp").build();

    private static final OutgoingCertificateMarshaller instance = new OutgoingCertificateMarshaller();

    public static OutgoingCertificateMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(OutgoingCertificate outgoingCertificate, ProtocolMarshaller protocolMarshaller) {

        if (outgoingCertificate == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(outgoingCertificate.getCertificateArn(), CERTIFICATEARN_BINDING);
            protocolMarshaller.marshall(outgoingCertificate.getCertificateId(), CERTIFICATEID_BINDING);
            protocolMarshaller.marshall(outgoingCertificate.getTransferredTo(), TRANSFERREDTO_BINDING);
            protocolMarshaller.marshall(outgoingCertificate.getTransferDate(), TRANSFERDATE_BINDING);
            protocolMarshaller.marshall(outgoingCertificate.getTransferMessage(), TRANSFERMESSAGE_BINDING);
            protocolMarshaller.marshall(outgoingCertificate.getCreationDate(), CREATIONDATE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
