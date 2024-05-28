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
package com.amazonaws.services.inspector2.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.inspector2.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * SendCisSessionTelemetryRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class SendCisSessionTelemetryRequestMarshaller {

    private static final MarshallingInfo<List> MESSAGES_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("messages").build();
    private static final MarshallingInfo<String> SCANJOBID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("scanJobId").build();
    private static final MarshallingInfo<String> SESSIONTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("sessionToken").build();

    private static final SendCisSessionTelemetryRequestMarshaller instance = new SendCisSessionTelemetryRequestMarshaller();

    public static SendCisSessionTelemetryRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(SendCisSessionTelemetryRequest sendCisSessionTelemetryRequest, ProtocolMarshaller protocolMarshaller) {

        if (sendCisSessionTelemetryRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(sendCisSessionTelemetryRequest.getMessages(), MESSAGES_BINDING);
            protocolMarshaller.marshall(sendCisSessionTelemetryRequest.getScanJobId(), SCANJOBID_BINDING);
            protocolMarshaller.marshall(sendCisSessionTelemetryRequest.getSessionToken(), SESSIONTOKEN_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
