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
package com.amazonaws.services.quicksight.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.quicksight.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * IngestionMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class IngestionMarshaller {

    private static final MarshallingInfo<String> ARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Arn").build();
    private static final MarshallingInfo<String> INGESTIONID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("IngestionId").build();
    private static final MarshallingInfo<String> INGESTIONSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("IngestionStatus").build();
    private static final MarshallingInfo<StructuredPojo> ERRORINFO_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ErrorInfo").build();
    private static final MarshallingInfo<StructuredPojo> ROWINFO_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RowInfo").build();
    private static final MarshallingInfo<StructuredPojo> QUEUEINFO_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("QueueInfo").build();
    private static final MarshallingInfo<java.util.Date> CREATEDTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CreatedTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<Long> INGESTIONTIMEINSECONDS_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("IngestionTimeInSeconds").build();
    private static final MarshallingInfo<Long> INGESTIONSIZEINBYTES_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("IngestionSizeInBytes").build();
    private static final MarshallingInfo<String> REQUESTSOURCE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RequestSource").build();
    private static final MarshallingInfo<String> REQUESTTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RequestType").build();

    private static final IngestionMarshaller instance = new IngestionMarshaller();

    public static IngestionMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(Ingestion ingestion, ProtocolMarshaller protocolMarshaller) {

        if (ingestion == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(ingestion.getArn(), ARN_BINDING);
            protocolMarshaller.marshall(ingestion.getIngestionId(), INGESTIONID_BINDING);
            protocolMarshaller.marshall(ingestion.getIngestionStatus(), INGESTIONSTATUS_BINDING);
            protocolMarshaller.marshall(ingestion.getErrorInfo(), ERRORINFO_BINDING);
            protocolMarshaller.marshall(ingestion.getRowInfo(), ROWINFO_BINDING);
            protocolMarshaller.marshall(ingestion.getQueueInfo(), QUEUEINFO_BINDING);
            protocolMarshaller.marshall(ingestion.getCreatedTime(), CREATEDTIME_BINDING);
            protocolMarshaller.marshall(ingestion.getIngestionTimeInSeconds(), INGESTIONTIMEINSECONDS_BINDING);
            protocolMarshaller.marshall(ingestion.getIngestionSizeInBytes(), INGESTIONSIZEINBYTES_BINDING);
            protocolMarshaller.marshall(ingestion.getRequestSource(), REQUESTSOURCE_BINDING);
            protocolMarshaller.marshall(ingestion.getRequestType(), REQUESTTYPE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
