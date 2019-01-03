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
package com.amazonaws.services.logs.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.logs.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * RejectedLogEventsInfoMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class RejectedLogEventsInfoMarshaller {

    private static final MarshallingInfo<Integer> TOONEWLOGEVENTSTARTINDEX_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("tooNewLogEventStartIndex").build();
    private static final MarshallingInfo<Integer> TOOOLDLOGEVENTENDINDEX_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("tooOldLogEventEndIndex").build();
    private static final MarshallingInfo<Integer> EXPIREDLOGEVENTENDINDEX_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("expiredLogEventEndIndex").build();

    private static final RejectedLogEventsInfoMarshaller instance = new RejectedLogEventsInfoMarshaller();

    public static RejectedLogEventsInfoMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(RejectedLogEventsInfo rejectedLogEventsInfo, ProtocolMarshaller protocolMarshaller) {

        if (rejectedLogEventsInfo == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(rejectedLogEventsInfo.getTooNewLogEventStartIndex(), TOONEWLOGEVENTSTARTINDEX_BINDING);
            protocolMarshaller.marshall(rejectedLogEventsInfo.getTooOldLogEventEndIndex(), TOOOLDLOGEVENTENDINDEX_BINDING);
            protocolMarshaller.marshall(rejectedLogEventsInfo.getExpiredLogEventEndIndex(), EXPIREDLOGEVENTENDINDEX_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
