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
package com.amazonaws.services.connectcontactlens.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.connectcontactlens.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * RealtimeContactAnalysisSegmentMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class RealtimeContactAnalysisSegmentMarshaller {

    private static final MarshallingInfo<StructuredPojo> TRANSCRIPT_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Transcript").build();
    private static final MarshallingInfo<StructuredPojo> CATEGORIES_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Categories").build();

    private static final RealtimeContactAnalysisSegmentMarshaller instance = new RealtimeContactAnalysisSegmentMarshaller();

    public static RealtimeContactAnalysisSegmentMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(RealtimeContactAnalysisSegment realtimeContactAnalysisSegment, ProtocolMarshaller protocolMarshaller) {

        if (realtimeContactAnalysisSegment == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(realtimeContactAnalysisSegment.getTranscript(), TRANSCRIPT_BINDING);
            protocolMarshaller.marshall(realtimeContactAnalysisSegment.getCategories(), CATEGORIES_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
