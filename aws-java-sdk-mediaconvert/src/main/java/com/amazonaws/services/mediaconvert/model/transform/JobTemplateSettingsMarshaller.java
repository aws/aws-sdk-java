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
 * JobTemplateSettingsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class JobTemplateSettingsMarshaller {

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

    private static final JobTemplateSettingsMarshaller instance = new JobTemplateSettingsMarshaller();

    public static JobTemplateSettingsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(JobTemplateSettings jobTemplateSettings, ProtocolMarshaller protocolMarshaller) {

        if (jobTemplateSettings == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(jobTemplateSettings.getAdAvailOffset(), ADAVAILOFFSET_BINDING);
            protocolMarshaller.marshall(jobTemplateSettings.getAvailBlanking(), AVAILBLANKING_BINDING);
            protocolMarshaller.marshall(jobTemplateSettings.getEsam(), ESAM_BINDING);
            protocolMarshaller.marshall(jobTemplateSettings.getInputs(), INPUTS_BINDING);
            protocolMarshaller.marshall(jobTemplateSettings.getMotionImageInserter(), MOTIONIMAGEINSERTER_BINDING);
            protocolMarshaller.marshall(jobTemplateSettings.getNielsenConfiguration(), NIELSENCONFIGURATION_BINDING);
            protocolMarshaller.marshall(jobTemplateSettings.getOutputGroups(), OUTPUTGROUPS_BINDING);
            protocolMarshaller.marshall(jobTemplateSettings.getTimecodeConfig(), TIMECODECONFIG_BINDING);
            protocolMarshaller.marshall(jobTemplateSettings.getTimedMetadataInsertion(), TIMEDMETADATAINSERTION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
