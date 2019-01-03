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
package com.amazonaws.services.xray.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.xray.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * BackendConnectionErrorsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class BackendConnectionErrorsMarshaller {

    private static final MarshallingInfo<Integer> TIMEOUTCOUNT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TimeoutCount").build();
    private static final MarshallingInfo<Integer> CONNECTIONREFUSEDCOUNT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ConnectionRefusedCount").build();
    private static final MarshallingInfo<Integer> HTTPCODE4XXCOUNT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("HTTPCode4XXCount").build();
    private static final MarshallingInfo<Integer> HTTPCODE5XXCOUNT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("HTTPCode5XXCount").build();
    private static final MarshallingInfo<Integer> UNKNOWNHOSTCOUNT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("UnknownHostCount").build();
    private static final MarshallingInfo<Integer> OTHERCOUNT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("OtherCount").build();

    private static final BackendConnectionErrorsMarshaller instance = new BackendConnectionErrorsMarshaller();

    public static BackendConnectionErrorsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(BackendConnectionErrors backendConnectionErrors, ProtocolMarshaller protocolMarshaller) {

        if (backendConnectionErrors == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(backendConnectionErrors.getTimeoutCount(), TIMEOUTCOUNT_BINDING);
            protocolMarshaller.marshall(backendConnectionErrors.getConnectionRefusedCount(), CONNECTIONREFUSEDCOUNT_BINDING);
            protocolMarshaller.marshall(backendConnectionErrors.getHTTPCode4XXCount(), HTTPCODE4XXCOUNT_BINDING);
            protocolMarshaller.marshall(backendConnectionErrors.getHTTPCode5XXCount(), HTTPCODE5XXCOUNT_BINDING);
            protocolMarshaller.marshall(backendConnectionErrors.getUnknownHostCount(), UNKNOWNHOSTCOUNT_BINDING);
            protocolMarshaller.marshall(backendConnectionErrors.getOtherCount(), OTHERCOUNT_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
