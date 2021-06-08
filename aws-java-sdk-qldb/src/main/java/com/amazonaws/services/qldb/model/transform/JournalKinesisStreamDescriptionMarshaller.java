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
package com.amazonaws.services.qldb.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.qldb.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * JournalKinesisStreamDescriptionMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class JournalKinesisStreamDescriptionMarshaller {

    private static final MarshallingInfo<String> LEDGERNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LedgerName").build();
    private static final MarshallingInfo<java.util.Date> CREATIONTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CreationTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> INCLUSIVESTARTTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("InclusiveStartTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> EXCLUSIVEENDTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ExclusiveEndTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> ROLEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("RoleArn").build();
    private static final MarshallingInfo<String> STREAMID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("StreamId").build();
    private static final MarshallingInfo<String> ARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Arn").build();
    private static final MarshallingInfo<String> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Status").build();
    private static final MarshallingInfo<StructuredPojo> KINESISCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("KinesisConfiguration").build();
    private static final MarshallingInfo<String> ERRORCAUSE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ErrorCause").build();
    private static final MarshallingInfo<String> STREAMNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StreamName").build();

    private static final JournalKinesisStreamDescriptionMarshaller instance = new JournalKinesisStreamDescriptionMarshaller();

    public static JournalKinesisStreamDescriptionMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(JournalKinesisStreamDescription journalKinesisStreamDescription, ProtocolMarshaller protocolMarshaller) {

        if (journalKinesisStreamDescription == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(journalKinesisStreamDescription.getLedgerName(), LEDGERNAME_BINDING);
            protocolMarshaller.marshall(journalKinesisStreamDescription.getCreationTime(), CREATIONTIME_BINDING);
            protocolMarshaller.marshall(journalKinesisStreamDescription.getInclusiveStartTime(), INCLUSIVESTARTTIME_BINDING);
            protocolMarshaller.marshall(journalKinesisStreamDescription.getExclusiveEndTime(), EXCLUSIVEENDTIME_BINDING);
            protocolMarshaller.marshall(journalKinesisStreamDescription.getRoleArn(), ROLEARN_BINDING);
            protocolMarshaller.marshall(journalKinesisStreamDescription.getStreamId(), STREAMID_BINDING);
            protocolMarshaller.marshall(journalKinesisStreamDescription.getArn(), ARN_BINDING);
            protocolMarshaller.marshall(journalKinesisStreamDescription.getStatus(), STATUS_BINDING);
            protocolMarshaller.marshall(journalKinesisStreamDescription.getKinesisConfiguration(), KINESISCONFIGURATION_BINDING);
            protocolMarshaller.marshall(journalKinesisStreamDescription.getErrorCause(), ERRORCAUSE_BINDING);
            protocolMarshaller.marshall(journalKinesisStreamDescription.getStreamName(), STREAMNAME_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
