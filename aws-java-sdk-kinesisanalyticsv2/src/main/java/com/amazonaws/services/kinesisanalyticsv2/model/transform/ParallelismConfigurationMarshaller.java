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
 * ParallelismConfigurationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ParallelismConfigurationMarshaller {

    private static final MarshallingInfo<String> CONFIGURATIONTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ConfigurationType").build();
    private static final MarshallingInfo<Integer> PARALLELISM_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Parallelism").build();
    private static final MarshallingInfo<Integer> PARALLELISMPERKPU_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ParallelismPerKPU").build();
    private static final MarshallingInfo<Boolean> AUTOSCALINGENABLED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AutoScalingEnabled").build();

    private static final ParallelismConfigurationMarshaller instance = new ParallelismConfigurationMarshaller();

    public static ParallelismConfigurationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ParallelismConfiguration parallelismConfiguration, ProtocolMarshaller protocolMarshaller) {

        if (parallelismConfiguration == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(parallelismConfiguration.getConfigurationType(), CONFIGURATIONTYPE_BINDING);
            protocolMarshaller.marshall(parallelismConfiguration.getParallelism(), PARALLELISM_BINDING);
            protocolMarshaller.marshall(parallelismConfiguration.getParallelismPerKPU(), PARALLELISMPERKPU_BINDING);
            protocolMarshaller.marshall(parallelismConfiguration.getAutoScalingEnabled(), AUTOSCALINGENABLED_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
