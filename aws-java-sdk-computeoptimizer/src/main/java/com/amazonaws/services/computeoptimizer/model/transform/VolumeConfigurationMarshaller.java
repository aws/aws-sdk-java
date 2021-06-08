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
package com.amazonaws.services.computeoptimizer.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.computeoptimizer.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * VolumeConfigurationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class VolumeConfigurationMarshaller {

    private static final MarshallingInfo<String> VOLUMETYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("volumeType").build();
    private static final MarshallingInfo<Integer> VOLUMESIZE_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("volumeSize").build();
    private static final MarshallingInfo<Integer> VOLUMEBASELINEIOPS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("volumeBaselineIOPS").build();
    private static final MarshallingInfo<Integer> VOLUMEBURSTIOPS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("volumeBurstIOPS").build();
    private static final MarshallingInfo<Integer> VOLUMEBASELINETHROUGHPUT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("volumeBaselineThroughput").build();
    private static final MarshallingInfo<Integer> VOLUMEBURSTTHROUGHPUT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("volumeBurstThroughput").build();

    private static final VolumeConfigurationMarshaller instance = new VolumeConfigurationMarshaller();

    public static VolumeConfigurationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(VolumeConfiguration volumeConfiguration, ProtocolMarshaller protocolMarshaller) {

        if (volumeConfiguration == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(volumeConfiguration.getVolumeType(), VOLUMETYPE_BINDING);
            protocolMarshaller.marshall(volumeConfiguration.getVolumeSize(), VOLUMESIZE_BINDING);
            protocolMarshaller.marshall(volumeConfiguration.getVolumeBaselineIOPS(), VOLUMEBASELINEIOPS_BINDING);
            protocolMarshaller.marshall(volumeConfiguration.getVolumeBurstIOPS(), VOLUMEBURSTIOPS_BINDING);
            protocolMarshaller.marshall(volumeConfiguration.getVolumeBaselineThroughput(), VOLUMEBASELINETHROUGHPUT_BINDING);
            protocolMarshaller.marshall(volumeConfiguration.getVolumeBurstThroughput(), VOLUMEBURSTTHROUGHPUT_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
