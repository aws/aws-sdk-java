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
package com.amazonaws.services.mediaconvert.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.mediaconvert.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * JobSettingsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class JobSettingsMarshaller {

    private static final MarshallingInfo<Integer> ADAVAILOFFSET_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("adAvailOffset").build();
    private static final MarshallingInfo<StructuredPojo> AVAILBLANKING_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("availBlanking").build();
    private static final MarshallingInfo<StructuredPojo> ESAM_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("esam").build();
    private static final MarshallingInfo<List> INPUTS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("inputs").build();
    private static final MarshallingInfo<StructuredPojo> MOTIONIMAGEINSERTER_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("motionImageInserter").build();
    private static final MarshallingInfo<StructuredPojo> NIELSENCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("nielsenConfiguration").build();
    private static final MarshallingInfo<List> OUTPUTGROUPS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("outputGroups").build();
    private static final MarshallingInfo<StructuredPojo> TIMECODECONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("timecodeConfig").build();
    private static final MarshallingInfo<StructuredPojo> TIMEDMETADATAINSERTION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("timedMetadataInsertion").build();

    private static final JobSettingsMarshaller instance = new JobSettingsMarshaller();

    public static JobSettingsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(JobSettings jobSettings, ProtocolMarshaller protocolMarshaller) {

        if (jobSettings == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(jobSettings.getAdAvailOffset(), ADAVAILOFFSET_BINDING);
            protocolMarshaller.marshall(jobSettings.getAvailBlanking(), AVAILBLANKING_BINDING);
            protocolMarshaller.marshall(jobSettings.getEsam(), ESAM_BINDING);
            protocolMarshaller.marshall(jobSettings.getInputs(), INPUTS_BINDING);
            protocolMarshaller.marshall(jobSettings.getMotionImageInserter(), MOTIONIMAGEINSERTER_BINDING);
            protocolMarshaller.marshall(jobSettings.getNielsenConfiguration(), NIELSENCONFIGURATION_BINDING);
            protocolMarshaller.marshall(jobSettings.getOutputGroups(), OUTPUTGROUPS_BINDING);
            protocolMarshaller.marshall(jobSettings.getTimecodeConfig(), TIMECODECONFIG_BINDING);
            protocolMarshaller.marshall(jobSettings.getTimedMetadataInsertion(), TIMEDMETADATAINSERTION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
