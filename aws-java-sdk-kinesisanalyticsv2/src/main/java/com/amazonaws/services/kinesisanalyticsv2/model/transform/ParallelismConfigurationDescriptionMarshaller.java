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
package com.amazonaws.services.kinesisanalyticsv2.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.kinesisanalyticsv2.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ParallelismConfigurationDescriptionMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ParallelismConfigurationDescriptionMarshaller {

    private static final MarshallingInfo<String> CONFIGURATIONTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ConfigurationType").build();
    private static final MarshallingInfo<Integer> PARALLELISM_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Parallelism").build();
    private static final MarshallingInfo<Integer> PARALLELISMPERKPU_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ParallelismPerKPU").build();
    private static final MarshallingInfo<Integer> CURRENTPARALLELISM_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CurrentParallelism").build();
    private static final MarshallingInfo<Boolean> AUTOSCALINGENABLED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AutoScalingEnabled").build();

    private static final ParallelismConfigurationDescriptionMarshaller instance = new ParallelismConfigurationDescriptionMarshaller();

    public static ParallelismConfigurationDescriptionMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ParallelismConfigurationDescription parallelismConfigurationDescription, ProtocolMarshaller protocolMarshaller) {

        if (parallelismConfigurationDescription == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(parallelismConfigurationDescription.getConfigurationType(), CONFIGURATIONTYPE_BINDING);
            protocolMarshaller.marshall(parallelismConfigurationDescription.getParallelism(), PARALLELISM_BINDING);
            protocolMarshaller.marshall(parallelismConfigurationDescription.getParallelismPerKPU(), PARALLELISMPERKPU_BINDING);
            protocolMarshaller.marshall(parallelismConfigurationDescription.getCurrentParallelism(), CURRENTPARALLELISM_BINDING);
            protocolMarshaller.marshall(parallelismConfigurationDescription.getAutoScalingEnabled(), AUTOSCALINGENABLED_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
