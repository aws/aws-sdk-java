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
 * CancelJournalKinesisStreamRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CancelJournalKinesisStreamRequestMarshaller {

    private static final MarshallingInfo<String> LEDGERNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("name").build();
    private static final MarshallingInfo<String> STREAMID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("streamId").build();

    private static final CancelJournalKinesisStreamRequestMarshaller instance = new CancelJournalKinesisStreamRequestMarshaller();

    public static CancelJournalKinesisStreamRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CancelJournalKinesisStreamRequest cancelJournalKinesisStreamRequest, ProtocolMarshaller protocolMarshaller) {

        if (cancelJournalKinesisStreamRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(cancelJournalKinesisStreamRequest.getLedgerName(), LEDGERNAME_BINDING);
            protocolMarshaller.marshall(cancelJournalKinesisStreamRequest.getStreamId(), STREAMID_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
