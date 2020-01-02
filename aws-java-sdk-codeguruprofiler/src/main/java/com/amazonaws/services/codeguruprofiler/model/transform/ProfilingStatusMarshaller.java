/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.codeguruprofiler.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.codeguruprofiler.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ProfilingStatusMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ProfilingStatusMarshaller {

    private static final MarshallingInfo<java.util.Date> LATESTAGENTORCHESTRATEDAT_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("latestAgentOrchestratedAt").timestampFormat("iso8601").build();
    private static final MarshallingInfo<java.util.Date> LATESTAGENTPROFILEREPORTEDAT_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("latestAgentProfileReportedAt").timestampFormat("iso8601").build();
    private static final MarshallingInfo<StructuredPojo> LATESTAGGREGATEDPROFILE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("latestAggregatedProfile").build();

    private static final ProfilingStatusMarshaller instance = new ProfilingStatusMarshaller();

    public static ProfilingStatusMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ProfilingStatus profilingStatus, ProtocolMarshaller protocolMarshaller) {

        if (profilingStatus == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(profilingStatus.getLatestAgentOrchestratedAt(), LATESTAGENTORCHESTRATEDAT_BINDING);
            protocolMarshaller.marshall(profilingStatus.getLatestAgentProfileReportedAt(), LATESTAGENTPROFILEREPORTEDAT_BINDING);
            protocolMarshaller.marshall(profilingStatus.getLatestAggregatedProfile(), LATESTAGGREGATEDPROFILE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
