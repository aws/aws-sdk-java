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
package com.amazonaws.services.transfer.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.transfer.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * DescribedCertificateMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class DescribedCertificateMarshaller {

    private static final MarshallingInfo<String> ARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Arn").build();
    private static final MarshallingInfo<String> CERTIFICATEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CertificateId").build();
    private static final MarshallingInfo<String> USAGE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Usage").build();
    private static final MarshallingInfo<String> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Status").build();
    private static final MarshallingInfo<String> CERTIFICATE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Certificate").build();
    private static final MarshallingInfo<String> CERTIFICATECHAIN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CertificateChain").build();
    private static final MarshallingInfo<java.util.Date> ACTIVEDATE_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ActiveDate").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> INACTIVEDATE_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("InactiveDate").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> SERIAL_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Serial").build();
    private static final MarshallingInfo<java.util.Date> NOTBEFOREDATE_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("NotBeforeDate").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> NOTAFTERDATE_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("NotAfterDate").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> TYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Type").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Description").build();
    private static final MarshallingInfo<List> TAGS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Tags").build();

    private static final DescribedCertificateMarshaller instance = new DescribedCertificateMarshaller();

    public static DescribedCertificateMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(DescribedCertificate describedCertificate, ProtocolMarshaller protocolMarshaller) {

        if (describedCertificate == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(describedCertificate.getArn(), ARN_BINDING);
            protocolMarshaller.marshall(describedCertificate.getCertificateId(), CERTIFICATEID_BINDING);
            protocolMarshaller.marshall(describedCertificate.getUsage(), USAGE_BINDING);
            protocolMarshaller.marshall(describedCertificate.getStatus(), STATUS_BINDING);
            protocolMarshaller.marshall(describedCertificate.getCertificate(), CERTIFICATE_BINDING);
            protocolMarshaller.marshall(describedCertificate.getCertificateChain(), CERTIFICATECHAIN_BINDING);
            protocolMarshaller.marshall(describedCertificate.getActiveDate(), ACTIVEDATE_BINDING);
            protocolMarshaller.marshall(describedCertificate.getInactiveDate(), INACTIVEDATE_BINDING);
            protocolMarshaller.marshall(describedCertificate.getSerial(), SERIAL_BINDING);
            protocolMarshaller.marshall(describedCertificate.getNotBeforeDate(), NOTBEFOREDATE_BINDING);
            protocolMarshaller.marshall(describedCertificate.getNotAfterDate(), NOTAFTERDATE_BINDING);
            protocolMarshaller.marshall(describedCertificate.getType(), TYPE_BINDING);
            protocolMarshaller.marshall(describedCertificate.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(describedCertificate.getTags(), TAGS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
