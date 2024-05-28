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

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.connect.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * RealTimeContactAnalysisCharacterIntervalMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class RealTimeContactAnalysisCharacterIntervalMarshaller {

    private static final MarshallingInfo<Integer> BEGINOFFSETCHAR_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("BeginOffsetChar").build();
    private static final MarshallingInfo<Integer> ENDOFFSETCHAR_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EndOffsetChar").build();

    private static final RealTimeContactAnalysisCharacterIntervalMarshaller instance = new RealTimeContactAnalysisCharacterIntervalMarshaller();

    public static RealTimeContactAnalysisCharacterIntervalMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(RealTimeContactAnalysisCharacterInterval realTimeContactAnalysisCharacterInterval, ProtocolMarshaller protocolMarshaller) {

        if (realTimeContactAnalysisCharacterInterval == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(realTimeContactAnalysisCharacterInterval.getBeginOffsetChar(), BEGINOFFSETCHAR_BINDING);
            protocolMarshaller.marshall(realTimeContactAnalysisCharacterInterval.getEndOffsetChar(), ENDOFFSETCHAR_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
