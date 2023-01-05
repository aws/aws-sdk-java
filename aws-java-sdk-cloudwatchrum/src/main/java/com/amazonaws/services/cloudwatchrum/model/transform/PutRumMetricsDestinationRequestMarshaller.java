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
package com.amazonaws.services.cloudwatchrum.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.cloudwatchrum.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * PutRumMetricsDestinationRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class PutRumMetricsDestinationRequestMarshaller {

    private static final MarshallingInfo<String> APPMONITORNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PATH).marshallLocationName("AppMonitorName").build();
    private static final MarshallingInfo<String> DESTINATION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Destination").build();
    private static final MarshallingInfo<String> DESTINATIONARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DestinationArn").build();
    private static final MarshallingInfo<String> IAMROLEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("IamRoleArn").build();

    private static final PutRumMetricsDestinationRequestMarshaller instance = new PutRumMetricsDestinationRequestMarshaller();

    public static PutRumMetricsDestinationRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(PutRumMetricsDestinationRequest putRumMetricsDestinationRequest, ProtocolMarshaller protocolMarshaller) {

        if (putRumMetricsDestinationRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(putRumMetricsDestinationRequest.getAppMonitorName(), APPMONITORNAME_BINDING);
            protocolMarshaller.marshall(putRumMetricsDestinationRequest.getDestination(), DESTINATION_BINDING);
            protocolMarshaller.marshall(putRumMetricsDestinationRequest.getDestinationArn(), DESTINATIONARN_BINDING);
            protocolMarshaller.marshall(putRumMetricsDestinationRequest.getIamRoleArn(), IAMROLEARN_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
