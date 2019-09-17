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
package com.amazonaws.services.medialive.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.medialive.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * GlobalConfigurationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class GlobalConfigurationMarshaller {

    private static final MarshallingInfo<Integer> INITIALAUDIOGAIN_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("initialAudioGain").build();
    private static final MarshallingInfo<String> INPUTENDACTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("inputEndAction").build();
    private static final MarshallingInfo<StructuredPojo> INPUTLOSSBEHAVIOR_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("inputLossBehavior").build();
    private static final MarshallingInfo<String> OUTPUTLOCKINGMODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("outputLockingMode").build();
    private static final MarshallingInfo<String> OUTPUTTIMINGSOURCE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("outputTimingSource").build();
    private static final MarshallingInfo<String> SUPPORTLOWFRAMERATEINPUTS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("supportLowFramerateInputs").build();

    private static final GlobalConfigurationMarshaller instance = new GlobalConfigurationMarshaller();

    public static GlobalConfigurationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(GlobalConfiguration globalConfiguration, ProtocolMarshaller protocolMarshaller) {

        if (globalConfiguration == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(globalConfiguration.getInitialAudioGain(), INITIALAUDIOGAIN_BINDING);
            protocolMarshaller.marshall(globalConfiguration.getInputEndAction(), INPUTENDACTION_BINDING);
            protocolMarshaller.marshall(globalConfiguration.getInputLossBehavior(), INPUTLOSSBEHAVIOR_BINDING);
            protocolMarshaller.marshall(globalConfiguration.getOutputLockingMode(), OUTPUTLOCKINGMODE_BINDING);
            protocolMarshaller.marshall(globalConfiguration.getOutputTimingSource(), OUTPUTTIMINGSOURCE_BINDING);
            protocolMarshaller.marshall(globalConfiguration.getSupportLowFramerateInputs(), SUPPORTLOWFRAMERATEINPUTS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
