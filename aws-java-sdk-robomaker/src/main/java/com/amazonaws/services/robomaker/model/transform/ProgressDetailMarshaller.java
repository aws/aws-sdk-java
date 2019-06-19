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
package com.amazonaws.services.robomaker.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.robomaker.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ProgressDetailMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ProgressDetailMarshaller {

    private static final MarshallingInfo<String> CURRENTPROGRESS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("currentProgress").build();
    private static final MarshallingInfo<Float> PERCENTDONE_BINDING = MarshallingInfo.builder(MarshallingType.FLOAT).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("percentDone").build();
    private static final MarshallingInfo<Integer> ESTIMATEDTIMEREMAININGSECONDS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("estimatedTimeRemainingSeconds").build();
    private static final MarshallingInfo<String> TARGETRESOURCE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("targetResource").build();

    private static final ProgressDetailMarshaller instance = new ProgressDetailMarshaller();

    public static ProgressDetailMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ProgressDetail progressDetail, ProtocolMarshaller protocolMarshaller) {

        if (progressDetail == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(progressDetail.getCurrentProgress(), CURRENTPROGRESS_BINDING);
            protocolMarshaller.marshall(progressDetail.getPercentDone(), PERCENTDONE_BINDING);
            protocolMarshaller.marshall(progressDetail.getEstimatedTimeRemainingSeconds(), ESTIMATEDTIMEREMAININGSECONDS_BINDING);
            protocolMarshaller.marshall(progressDetail.getTargetResource(), TARGETRESOURCE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
