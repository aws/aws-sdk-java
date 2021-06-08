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
package com.amazonaws.services.codebuild.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.codebuild.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * BuildBatchPhaseMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class BuildBatchPhaseMarshaller {

    private static final MarshallingInfo<String> PHASETYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("phaseType").build();
    private static final MarshallingInfo<String> PHASESTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("phaseStatus").build();
    private static final MarshallingInfo<java.util.Date> STARTTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("startTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> ENDTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("endTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<Long> DURATIONINSECONDS_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("durationInSeconds").build();
    private static final MarshallingInfo<List> CONTEXTS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("contexts").build();

    private static final BuildBatchPhaseMarshaller instance = new BuildBatchPhaseMarshaller();

    public static BuildBatchPhaseMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(BuildBatchPhase buildBatchPhase, ProtocolMarshaller protocolMarshaller) {

        if (buildBatchPhase == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(buildBatchPhase.getPhaseType(), PHASETYPE_BINDING);
            protocolMarshaller.marshall(buildBatchPhase.getPhaseStatus(), PHASESTATUS_BINDING);
            protocolMarshaller.marshall(buildBatchPhase.getStartTime(), STARTTIME_BINDING);
            protocolMarshaller.marshall(buildBatchPhase.getEndTime(), ENDTIME_BINDING);
            protocolMarshaller.marshall(buildBatchPhase.getDurationInSeconds(), DURATIONINSECONDS_BINDING);
            protocolMarshaller.marshall(buildBatchPhase.getContexts(), CONTEXTS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
