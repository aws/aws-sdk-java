/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * ServerCertificateSummaryMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ServerCertificateSummaryMarshaller {

    private static final MarshallingInfo<String> SERVERCERTIFICATEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("serverCertificateArn").build();
    private static final MarshallingInfo<String> SERVERCERTIFICATESTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("serverCertificateStatus").build();
    private static final MarshallingInfo<String> SERVERCERTIFICATESTATUSDETAIL_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("serverCertificateStatusDetail").build();

    private static final ServerCertificateSummaryMarshaller instance = new ServerCertificateSummaryMarshaller();

    public static ServerCertificateSummaryMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ServerCertificateSummary serverCertificateSummary, ProtocolMarshaller protocolMarshaller) {

        if (serverCertificateSummary == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(serverCertificateSummary.getServerCertificateArn(), SERVERCERTIFICATEARN_BINDING);
            protocolMarshaller.marshall(serverCertificateSummary.getServerCertificateStatus(), SERVERCERTIFICATESTATUS_BINDING);
            protocolMarshaller.marshall(serverCertificateSummary.getServerCertificateStatusDetail(), SERVERCERTIFICATESTATUSDETAIL_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
