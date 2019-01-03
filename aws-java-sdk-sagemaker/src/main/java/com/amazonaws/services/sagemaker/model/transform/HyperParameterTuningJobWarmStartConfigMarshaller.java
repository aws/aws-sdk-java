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
package com.amazonaws.services.sagemaker.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.sagemaker.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * HyperParameterTuningJobWarmStartConfigMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class HyperParameterTuningJobWarmStartConfigMarshaller {

    private static final MarshallingInfo<List> PARENTHYPERPARAMETERTUNINGJOBS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ParentHyperParameterTuningJobs").build();
    private static final MarshallingInfo<String> WARMSTARTTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("WarmStartType").build();

    private static final HyperParameterTuningJobWarmStartConfigMarshaller instance = new HyperParameterTuningJobWarmStartConfigMarshaller();

    public static HyperParameterTuningJobWarmStartConfigMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(HyperParameterTuningJobWarmStartConfig hyperParameterTuningJobWarmStartConfig, ProtocolMarshaller protocolMarshaller) {

        if (hyperParameterTuningJobWarmStartConfig == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(hyperParameterTuningJobWarmStartConfig.getParentHyperParameterTuningJobs(), PARENTHYPERPARAMETERTUNINGJOBS_BINDING);
            protocolMarshaller.marshall(hyperParameterTuningJobWarmStartConfig.getWarmStartType(), WARMSTARTTYPE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
