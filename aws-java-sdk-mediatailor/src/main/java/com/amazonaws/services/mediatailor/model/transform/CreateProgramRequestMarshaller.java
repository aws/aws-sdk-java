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
package com.amazonaws.services.mediatailor.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.mediatailor.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CreateProgramRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreateProgramRequestMarshaller {

    private static final MarshallingInfo<List> ADBREAKS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("AdBreaks").build();
    private static final MarshallingInfo<String> CHANNELNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("channelName").build();
    private static final MarshallingInfo<String> PROGRAMNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("programName").build();
    private static final MarshallingInfo<StructuredPojo> SCHEDULECONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ScheduleConfiguration").build();
    private static final MarshallingInfo<String> SOURCELOCATIONNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SourceLocationName").build();
    private static final MarshallingInfo<String> VODSOURCENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("VodSourceName").build();

    private static final CreateProgramRequestMarshaller instance = new CreateProgramRequestMarshaller();

    public static CreateProgramRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreateProgramRequest createProgramRequest, ProtocolMarshaller protocolMarshaller) {

        if (createProgramRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createProgramRequest.getAdBreaks(), ADBREAKS_BINDING);
            protocolMarshaller.marshall(createProgramRequest.getChannelName(), CHANNELNAME_BINDING);
            protocolMarshaller.marshall(createProgramRequest.getProgramName(), PROGRAMNAME_BINDING);
            protocolMarshaller.marshall(createProgramRequest.getScheduleConfiguration(), SCHEDULECONFIGURATION_BINDING);
            protocolMarshaller.marshall(createProgramRequest.getSourceLocationName(), SOURCELOCATIONNAME_BINDING);
            protocolMarshaller.marshall(createProgramRequest.getVodSourceName(), VODSOURCENAME_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
