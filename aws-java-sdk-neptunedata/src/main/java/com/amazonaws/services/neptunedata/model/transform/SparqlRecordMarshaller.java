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
package com.amazonaws.services.neptunedata.model.transform;

import java.util.Map;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.neptunedata.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * SparqlRecordMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class SparqlRecordMarshaller {

    private static final MarshallingInfo<Long> COMMITTIMESTAMPINMILLIS_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("commitTimestamp").build();
    private static final MarshallingInfo<Map> EVENTID_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("eventId").build();
    private static final MarshallingInfo<StructuredPojo> DATA_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("data").build();
    private static final MarshallingInfo<String> OP_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("op").build();
    private static final MarshallingInfo<Boolean> ISLASTOP_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("isLastOp").build();

    private static final SparqlRecordMarshaller instance = new SparqlRecordMarshaller();

    public static SparqlRecordMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(SparqlRecord sparqlRecord, ProtocolMarshaller protocolMarshaller) {

        if (sparqlRecord == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(sparqlRecord.getCommitTimestampInMillis(), COMMITTIMESTAMPINMILLIS_BINDING);
            protocolMarshaller.marshall(sparqlRecord.getEventId(), EVENTID_BINDING);
            protocolMarshaller.marshall(sparqlRecord.getData(), DATA_BINDING);
            protocolMarshaller.marshall(sparqlRecord.getOp(), OP_BINDING);
            protocolMarshaller.marshall(sparqlRecord.getIsLastOp(), ISLASTOP_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
