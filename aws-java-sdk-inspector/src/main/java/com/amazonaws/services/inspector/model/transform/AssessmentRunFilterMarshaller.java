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
package com.amazonaws.services.inspector.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.inspector.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * AssessmentRunFilterMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AssessmentRunFilterMarshaller {

    private static final MarshallingInfo<String> NAMEPATTERN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("namePattern").build();
    private static final MarshallingInfo<List> STATES_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("states").build();
    private static final MarshallingInfo<StructuredPojo> DURATIONRANGE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("durationRange").build();
    private static final MarshallingInfo<List> RULESPACKAGEARNS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("rulesPackageArns").build();
    private static final MarshallingInfo<StructuredPojo> STARTTIMERANGE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("startTimeRange").build();
    private static final MarshallingInfo<StructuredPojo> COMPLETIONTIMERANGE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("completionTimeRange").build();
    private static final MarshallingInfo<StructuredPojo> STATECHANGETIMERANGE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("stateChangeTimeRange").build();

    private static final AssessmentRunFilterMarshaller instance = new AssessmentRunFilterMarshaller();

    public static AssessmentRunFilterMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AssessmentRunFilter assessmentRunFilter, ProtocolMarshaller protocolMarshaller) {

        if (assessmentRunFilter == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(assessmentRunFilter.getNamePattern(), NAMEPATTERN_BINDING);
            protocolMarshaller.marshall(assessmentRunFilter.getStates(), STATES_BINDING);
            protocolMarshaller.marshall(assessmentRunFilter.getDurationRange(), DURATIONRANGE_BINDING);
            protocolMarshaller.marshall(assessmentRunFilter.getRulesPackageArns(), RULESPACKAGEARNS_BINDING);
            protocolMarshaller.marshall(assessmentRunFilter.getStartTimeRange(), STARTTIMERANGE_BINDING);
            protocolMarshaller.marshall(assessmentRunFilter.getCompletionTimeRange(), COMPLETIONTIMERANGE_BINDING);
            protocolMarshaller.marshall(assessmentRunFilter.getStateChangeTimeRange(), STATECHANGETIMERANGE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
