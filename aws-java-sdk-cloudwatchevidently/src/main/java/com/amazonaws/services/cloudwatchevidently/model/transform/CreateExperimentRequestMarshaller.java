/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.cloudwatchevidently.model.transform;

import java.util.Map;
import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.cloudwatchevidently.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CreateExperimentRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreateExperimentRequestMarshaller {

    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("description").build();
    private static final MarshallingInfo<List> METRICGOALS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("metricGoals").build();
    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("name").build();
    private static final MarshallingInfo<StructuredPojo> ONLINEABCONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("onlineAbConfig").build();
    private static final MarshallingInfo<String> PROJECT_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("project").build();
    private static final MarshallingInfo<String> RANDOMIZATIONSALT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("randomizationSalt").build();
    private static final MarshallingInfo<Long> SAMPLINGRATE_BINDING = MarshallingInfo.builder(MarshallingType.LONG).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("samplingRate").build();
    private static final MarshallingInfo<String> SEGMENT_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("segment").build();
    private static final MarshallingInfo<Map> TAGS_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("tags").build();
    private static final MarshallingInfo<List> TREATMENTS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("treatments").build();

    private static final CreateExperimentRequestMarshaller instance = new CreateExperimentRequestMarshaller();

    public static CreateExperimentRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreateExperimentRequest createExperimentRequest, ProtocolMarshaller protocolMarshaller) {

        if (createExperimentRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createExperimentRequest.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(createExperimentRequest.getMetricGoals(), METRICGOALS_BINDING);
            protocolMarshaller.marshall(createExperimentRequest.getName(), NAME_BINDING);
            protocolMarshaller.marshall(createExperimentRequest.getOnlineAbConfig(), ONLINEABCONFIG_BINDING);
            protocolMarshaller.marshall(createExperimentRequest.getProject(), PROJECT_BINDING);
            protocolMarshaller.marshall(createExperimentRequest.getRandomizationSalt(), RANDOMIZATIONSALT_BINDING);
            protocolMarshaller.marshall(createExperimentRequest.getSamplingRate(), SAMPLINGRATE_BINDING);
            protocolMarshaller.marshall(createExperimentRequest.getSegment(), SEGMENT_BINDING);
            protocolMarshaller.marshall(createExperimentRequest.getTags(), TAGS_BINDING);
            protocolMarshaller.marshall(createExperimentRequest.getTreatments(), TREATMENTS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
