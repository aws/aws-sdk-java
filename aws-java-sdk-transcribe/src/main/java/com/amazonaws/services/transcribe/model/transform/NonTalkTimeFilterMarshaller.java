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
package com.amazonaws.services.transcribe.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.transcribe.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * NonTalkTimeFilterMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class NonTalkTimeFilterMarshaller {

    private static final MarshallingInfo<Long> THRESHOLD_BINDING = MarshallingInfo.builder(MarshallingType.LONG).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Threshold").build();
    private static final MarshallingInfo<StructuredPojo> ABSOLUTETIMERANGE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AbsoluteTimeRange").build();
    private static final MarshallingInfo<StructuredPojo> RELATIVETIMERANGE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RelativeTimeRange").build();
    private static final MarshallingInfo<Boolean> NEGATE_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Negate").build();

    private static final NonTalkTimeFilterMarshaller instance = new NonTalkTimeFilterMarshaller();

    public static NonTalkTimeFilterMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(NonTalkTimeFilter nonTalkTimeFilter, ProtocolMarshaller protocolMarshaller) {

        if (nonTalkTimeFilter == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(nonTalkTimeFilter.getThreshold(), THRESHOLD_BINDING);
            protocolMarshaller.marshall(nonTalkTimeFilter.getAbsoluteTimeRange(), ABSOLUTETIMERANGE_BINDING);
            protocolMarshaller.marshall(nonTalkTimeFilter.getRelativeTimeRange(), RELATIVETIMERANGE_BINDING);
            protocolMarshaller.marshall(nonTalkTimeFilter.getNegate(), NEGATE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
