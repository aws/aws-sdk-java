/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.braket.model.transform;

import java.util.Map;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.braket.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * QuantumTaskSummaryMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class QuantumTaskSummaryMarshaller {

    private static final MarshallingInfo<java.util.Date> CREATEDAT_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("createdAt").timestampFormat("iso8601").build();
    private static final MarshallingInfo<String> DEVICEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("deviceArn").build();
    private static final MarshallingInfo<java.util.Date> ENDEDAT_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("endedAt").timestampFormat("iso8601").build();
    private static final MarshallingInfo<String> OUTPUTS3BUCKET_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("outputS3Bucket").build();
    private static final MarshallingInfo<String> OUTPUTS3DIRECTORY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("outputS3Directory").build();
    private static final MarshallingInfo<String> QUANTUMTASKARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("quantumTaskArn").build();
    private static final MarshallingInfo<Long> SHOTS_BINDING = MarshallingInfo.builder(MarshallingType.LONG).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("shots").build();
    private static final MarshallingInfo<String> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("status").build();
    private static final MarshallingInfo<Map> TAGS_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("tags").build();

    private static final QuantumTaskSummaryMarshaller instance = new QuantumTaskSummaryMarshaller();

    public static QuantumTaskSummaryMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(QuantumTaskSummary quantumTaskSummary, ProtocolMarshaller protocolMarshaller) {

        if (quantumTaskSummary == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(quantumTaskSummary.getCreatedAt(), CREATEDAT_BINDING);
            protocolMarshaller.marshall(quantumTaskSummary.getDeviceArn(), DEVICEARN_BINDING);
            protocolMarshaller.marshall(quantumTaskSummary.getEndedAt(), ENDEDAT_BINDING);
            protocolMarshaller.marshall(quantumTaskSummary.getOutputS3Bucket(), OUTPUTS3BUCKET_BINDING);
            protocolMarshaller.marshall(quantumTaskSummary.getOutputS3Directory(), OUTPUTS3DIRECTORY_BINDING);
            protocolMarshaller.marshall(quantumTaskSummary.getQuantumTaskArn(), QUANTUMTASKARN_BINDING);
            protocolMarshaller.marshall(quantumTaskSummary.getShots(), SHOTS_BINDING);
            protocolMarshaller.marshall(quantumTaskSummary.getStatus(), STATUS_BINDING);
            protocolMarshaller.marshall(quantumTaskSummary.getTags(), TAGS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
