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
package com.amazonaws.services.workspacesweb.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.workspacesweb.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CertificateSummaryMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CertificateSummaryMarshaller {

    private static final MarshallingInfo<String> ISSUER_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("issuer").build();
    private static final MarshallingInfo<java.util.Date> NOTVALIDAFTER_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("notValidAfter").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> NOTVALIDBEFORE_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("notValidBefore").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> SUBJECT_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("subject").build();
    private static final MarshallingInfo<String> THUMBPRINT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("thumbprint").build();

    private static final CertificateSummaryMarshaller instance = new CertificateSummaryMarshaller();

    public static CertificateSummaryMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CertificateSummary certificateSummary, ProtocolMarshaller protocolMarshaller) {

        if (certificateSummary == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(certificateSummary.getIssuer(), ISSUER_BINDING);
            protocolMarshaller.marshall(certificateSummary.getNotValidAfter(), NOTVALIDAFTER_BINDING);
            protocolMarshaller.marshall(certificateSummary.getNotValidBefore(), NOTVALIDBEFORE_BINDING);
            protocolMarshaller.marshall(certificateSummary.getSubject(), SUBJECT_BINDING);
            protocolMarshaller.marshall(certificateSummary.getThumbprint(), THUMBPRINT_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
