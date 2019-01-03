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
package com.amazonaws.services.opsworks.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.opsworks.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * SetLoadBasedAutoScalingRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class SetLoadBasedAutoScalingRequestMarshaller {

    private static final MarshallingInfo<String> LAYERID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("LayerId").build();
    private static final MarshallingInfo<Boolean> ENABLE_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Enable").build();
    private static final MarshallingInfo<StructuredPojo> UPSCALING_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("UpScaling").build();
    private static final MarshallingInfo<StructuredPojo> DOWNSCALING_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DownScaling").build();

    private static final SetLoadBasedAutoScalingRequestMarshaller instance = new SetLoadBasedAutoScalingRequestMarshaller();

    public static SetLoadBasedAutoScalingRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(SetLoadBasedAutoScalingRequest setLoadBasedAutoScalingRequest, ProtocolMarshaller protocolMarshaller) {

        if (setLoadBasedAutoScalingRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(setLoadBasedAutoScalingRequest.getLayerId(), LAYERID_BINDING);
            protocolMarshaller.marshall(setLoadBasedAutoScalingRequest.getEnable(), ENABLE_BINDING);
            protocolMarshaller.marshall(setLoadBasedAutoScalingRequest.getUpScaling(), UPSCALING_BINDING);
            protocolMarshaller.marshall(setLoadBasedAutoScalingRequest.getDownScaling(), DOWNSCALING_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
