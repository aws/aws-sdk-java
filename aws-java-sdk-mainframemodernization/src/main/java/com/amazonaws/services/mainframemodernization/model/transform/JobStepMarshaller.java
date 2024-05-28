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
package com.amazonaws.services.mainframemodernization.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.mainframemodernization.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * JobStepMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class JobStepMarshaller {

    private static final MarshallingInfo<String> PROCSTEPNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("procStepName").build();
    private static final MarshallingInfo<Integer> PROCSTEPNUMBER_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("procStepNumber").build();
    private static final MarshallingInfo<String> STEPCONDCODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("stepCondCode").build();
    private static final MarshallingInfo<String> STEPNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("stepName").build();
    private static final MarshallingInfo<Integer> STEPNUMBER_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("stepNumber").build();
    private static final MarshallingInfo<Boolean> STEPRESTARTABLE_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("stepRestartable").build();

    private static final JobStepMarshaller instance = new JobStepMarshaller();

    public static JobStepMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(JobStep jobStep, ProtocolMarshaller protocolMarshaller) {

        if (jobStep == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(jobStep.getProcStepName(), PROCSTEPNAME_BINDING);
            protocolMarshaller.marshall(jobStep.getProcStepNumber(), PROCSTEPNUMBER_BINDING);
            protocolMarshaller.marshall(jobStep.getStepCondCode(), STEPCONDCODE_BINDING);
            protocolMarshaller.marshall(jobStep.getStepName(), STEPNAME_BINDING);
            protocolMarshaller.marshall(jobStep.getStepNumber(), STEPNUMBER_BINDING);
            protocolMarshaller.marshall(jobStep.getStepRestartable(), STEPRESTARTABLE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
