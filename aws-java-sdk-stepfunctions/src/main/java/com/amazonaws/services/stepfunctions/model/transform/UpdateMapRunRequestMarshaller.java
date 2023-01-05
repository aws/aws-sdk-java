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
package com.amazonaws.services.stepfunctions.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.stepfunctions.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * UpdateMapRunRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UpdateMapRunRequestMarshaller {

    private static final MarshallingInfo<String> MAPRUNARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("mapRunArn").build();
    private static final MarshallingInfo<Integer> MAXCONCURRENCY_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("maxConcurrency").build();
    private static final MarshallingInfo<Float> TOLERATEDFAILUREPERCENTAGE_BINDING = MarshallingInfo.builder(MarshallingType.FLOAT)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("toleratedFailurePercentage").build();
    private static final MarshallingInfo<Long> TOLERATEDFAILURECOUNT_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("toleratedFailureCount").build();

    private static final UpdateMapRunRequestMarshaller instance = new UpdateMapRunRequestMarshaller();

    public static UpdateMapRunRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UpdateMapRunRequest updateMapRunRequest, ProtocolMarshaller protocolMarshaller) {

        if (updateMapRunRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(updateMapRunRequest.getMapRunArn(), MAPRUNARN_BINDING);
            protocolMarshaller.marshall(updateMapRunRequest.getMaxConcurrency(), MAXCONCURRENCY_BINDING);
            protocolMarshaller.marshall(updateMapRunRequest.getToleratedFailurePercentage(), TOLERATEDFAILUREPERCENTAGE_BINDING);
            protocolMarshaller.marshall(updateMapRunRequest.getToleratedFailureCount(), TOLERATEDFAILURECOUNT_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
