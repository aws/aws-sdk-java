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
 * RelativeTimeRangeMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class RelativeTimeRangeMarshaller {

    private static final MarshallingInfo<Integer> STARTPERCENTAGE_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StartPercentage").build();
    private static final MarshallingInfo<Integer> ENDPERCENTAGE_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EndPercentage").build();
    private static final MarshallingInfo<Integer> FIRST_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("First").build();
    private static final MarshallingInfo<Integer> LAST_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Last").build();

    private static final RelativeTimeRangeMarshaller instance = new RelativeTimeRangeMarshaller();

    public static RelativeTimeRangeMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(RelativeTimeRange relativeTimeRange, ProtocolMarshaller protocolMarshaller) {

        if (relativeTimeRange == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(relativeTimeRange.getStartPercentage(), STARTPERCENTAGE_BINDING);
            protocolMarshaller.marshall(relativeTimeRange.getEndPercentage(), ENDPERCENTAGE_BINDING);
            protocolMarshaller.marshall(relativeTimeRange.getFirst(), FIRST_BINDING);
            protocolMarshaller.marshall(relativeTimeRange.getLast(), LAST_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
