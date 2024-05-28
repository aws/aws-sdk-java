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
package com.amazonaws.services.ivsrealtime.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.ivsrealtime.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ListParticipantsRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ListParticipantsRequestMarshaller {

    private static final MarshallingInfo<Boolean> FILTERBYPUBLISHED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("filterByPublished").build();
    private static final MarshallingInfo<String> FILTERBYSTATE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("filterByState").build();
    private static final MarshallingInfo<String> FILTERBYUSERID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("filterByUserId").build();
    private static final MarshallingInfo<Integer> MAXRESULTS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("maxResults").build();
    private static final MarshallingInfo<String> NEXTTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("nextToken").build();
    private static final MarshallingInfo<String> SESSIONID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("sessionId").build();
    private static final MarshallingInfo<String> STAGEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("stageArn").build();

    private static final ListParticipantsRequestMarshaller instance = new ListParticipantsRequestMarshaller();

    public static ListParticipantsRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ListParticipantsRequest listParticipantsRequest, ProtocolMarshaller protocolMarshaller) {

        if (listParticipantsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(listParticipantsRequest.getFilterByPublished(), FILTERBYPUBLISHED_BINDING);
            protocolMarshaller.marshall(listParticipantsRequest.getFilterByState(), FILTERBYSTATE_BINDING);
            protocolMarshaller.marshall(listParticipantsRequest.getFilterByUserId(), FILTERBYUSERID_BINDING);
            protocolMarshaller.marshall(listParticipantsRequest.getMaxResults(), MAXRESULTS_BINDING);
            protocolMarshaller.marshall(listParticipantsRequest.getNextToken(), NEXTTOKEN_BINDING);
            protocolMarshaller.marshall(listParticipantsRequest.getSessionId(), SESSIONID_BINDING);
            protocolMarshaller.marshall(listParticipantsRequest.getStageArn(), STAGEARN_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
