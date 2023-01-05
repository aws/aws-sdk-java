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
package com.amazonaws.services.glue.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.glue.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * KinesisStreamingSourceOptionsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class KinesisStreamingSourceOptionsMarshaller {

    private static final MarshallingInfo<String> ENDPOINTURL_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EndpointUrl").build();
    private static final MarshallingInfo<String> STREAMNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StreamName").build();
    private static final MarshallingInfo<String> CLASSIFICATION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Classification").build();
    private static final MarshallingInfo<String> DELIMITER_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Delimiter").build();
    private static final MarshallingInfo<String> STARTINGPOSITION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StartingPosition").build();
    private static final MarshallingInfo<Long> MAXFETCHTIMEINMS_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MaxFetchTimeInMs").build();
    private static final MarshallingInfo<Long> MAXFETCHRECORDSPERSHARD_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MaxFetchRecordsPerShard").build();
    private static final MarshallingInfo<Long> MAXRECORDPERREAD_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MaxRecordPerRead").build();
    private static final MarshallingInfo<Boolean> ADDIDLETIMEBETWEENREADS_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AddIdleTimeBetweenReads").build();
    private static final MarshallingInfo<Long> IDLETIMEBETWEENREADSINMS_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("IdleTimeBetweenReadsInMs").build();
    private static final MarshallingInfo<Long> DESCRIBESHARDINTERVAL_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DescribeShardInterval").build();
    private static final MarshallingInfo<Integer> NUMRETRIES_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("NumRetries").build();
    private static final MarshallingInfo<Long> RETRYINTERVALMS_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RetryIntervalMs").build();
    private static final MarshallingInfo<Long> MAXRETRYINTERVALMS_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MaxRetryIntervalMs").build();
    private static final MarshallingInfo<Boolean> AVOIDEMPTYBATCHES_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AvoidEmptyBatches").build();
    private static final MarshallingInfo<String> STREAMARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("StreamArn").build();
    private static final MarshallingInfo<String> ROLEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("RoleArn").build();
    private static final MarshallingInfo<String> ROLESESSIONNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RoleSessionName").build();

    private static final KinesisStreamingSourceOptionsMarshaller instance = new KinesisStreamingSourceOptionsMarshaller();

    public static KinesisStreamingSourceOptionsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(KinesisStreamingSourceOptions kinesisStreamingSourceOptions, ProtocolMarshaller protocolMarshaller) {

        if (kinesisStreamingSourceOptions == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(kinesisStreamingSourceOptions.getEndpointUrl(), ENDPOINTURL_BINDING);
            protocolMarshaller.marshall(kinesisStreamingSourceOptions.getStreamName(), STREAMNAME_BINDING);
            protocolMarshaller.marshall(kinesisStreamingSourceOptions.getClassification(), CLASSIFICATION_BINDING);
            protocolMarshaller.marshall(kinesisStreamingSourceOptions.getDelimiter(), DELIMITER_BINDING);
            protocolMarshaller.marshall(kinesisStreamingSourceOptions.getStartingPosition(), STARTINGPOSITION_BINDING);
            protocolMarshaller.marshall(kinesisStreamingSourceOptions.getMaxFetchTimeInMs(), MAXFETCHTIMEINMS_BINDING);
            protocolMarshaller.marshall(kinesisStreamingSourceOptions.getMaxFetchRecordsPerShard(), MAXFETCHRECORDSPERSHARD_BINDING);
            protocolMarshaller.marshall(kinesisStreamingSourceOptions.getMaxRecordPerRead(), MAXRECORDPERREAD_BINDING);
            protocolMarshaller.marshall(kinesisStreamingSourceOptions.getAddIdleTimeBetweenReads(), ADDIDLETIMEBETWEENREADS_BINDING);
            protocolMarshaller.marshall(kinesisStreamingSourceOptions.getIdleTimeBetweenReadsInMs(), IDLETIMEBETWEENREADSINMS_BINDING);
            protocolMarshaller.marshall(kinesisStreamingSourceOptions.getDescribeShardInterval(), DESCRIBESHARDINTERVAL_BINDING);
            protocolMarshaller.marshall(kinesisStreamingSourceOptions.getNumRetries(), NUMRETRIES_BINDING);
            protocolMarshaller.marshall(kinesisStreamingSourceOptions.getRetryIntervalMs(), RETRYINTERVALMS_BINDING);
            protocolMarshaller.marshall(kinesisStreamingSourceOptions.getMaxRetryIntervalMs(), MAXRETRYINTERVALMS_BINDING);
            protocolMarshaller.marshall(kinesisStreamingSourceOptions.getAvoidEmptyBatches(), AVOIDEMPTYBATCHES_BINDING);
            protocolMarshaller.marshall(kinesisStreamingSourceOptions.getStreamArn(), STREAMARN_BINDING);
            protocolMarshaller.marshall(kinesisStreamingSourceOptions.getRoleArn(), ROLEARN_BINDING);
            protocolMarshaller.marshall(kinesisStreamingSourceOptions.getRoleSessionName(), ROLESESSIONNAME_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
