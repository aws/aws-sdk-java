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
package com.amazonaws.services.connect.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.connect.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * RealTimeContactAnalysisSegmentAttachmentsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class RealTimeContactAnalysisSegmentAttachmentsMarshaller {

    private static final MarshallingInfo<String> ID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Id").build();
    private static final MarshallingInfo<String> PARTICIPANTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ParticipantId").build();
    private static final MarshallingInfo<String> PARTICIPANTROLE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ParticipantRole").build();
    private static final MarshallingInfo<String> DISPLAYNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DisplayName").build();
    private static final MarshallingInfo<List> ATTACHMENTS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Attachments").build();
    private static final MarshallingInfo<StructuredPojo> TIME_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Time").build();

    private static final RealTimeContactAnalysisSegmentAttachmentsMarshaller instance = new RealTimeContactAnalysisSegmentAttachmentsMarshaller();

    public static RealTimeContactAnalysisSegmentAttachmentsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(RealTimeContactAnalysisSegmentAttachments realTimeContactAnalysisSegmentAttachments, ProtocolMarshaller protocolMarshaller) {

        if (realTimeContactAnalysisSegmentAttachments == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(realTimeContactAnalysisSegmentAttachments.getId(), ID_BINDING);
            protocolMarshaller.marshall(realTimeContactAnalysisSegmentAttachments.getParticipantId(), PARTICIPANTID_BINDING);
            protocolMarshaller.marshall(realTimeContactAnalysisSegmentAttachments.getParticipantRole(), PARTICIPANTROLE_BINDING);
            protocolMarshaller.marshall(realTimeContactAnalysisSegmentAttachments.getDisplayName(), DISPLAYNAME_BINDING);
            protocolMarshaller.marshall(realTimeContactAnalysisSegmentAttachments.getAttachments(), ATTACHMENTS_BINDING);
            protocolMarshaller.marshall(realTimeContactAnalysisSegmentAttachments.getTime(), TIME_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
