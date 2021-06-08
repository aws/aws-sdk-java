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
package com.amazonaws.services.codeguruprofiler.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.codeguruprofiler.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * FindingsReportSummaryMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class FindingsReportSummaryMarshaller {

    private static final MarshallingInfo<String> ID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("id").build();
    private static final MarshallingInfo<java.util.Date> PROFILEENDTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("profileEndTime").timestampFormat("iso8601").build();
    private static final MarshallingInfo<java.util.Date> PROFILESTARTTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("profileStartTime").timestampFormat("iso8601").build();
    private static final MarshallingInfo<String> PROFILINGGROUPNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("profilingGroupName").build();
    private static final MarshallingInfo<Integer> TOTALNUMBEROFFINDINGS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("totalNumberOfFindings").build();

    private static final FindingsReportSummaryMarshaller instance = new FindingsReportSummaryMarshaller();

    public static FindingsReportSummaryMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(FindingsReportSummary findingsReportSummary, ProtocolMarshaller protocolMarshaller) {

        if (findingsReportSummary == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(findingsReportSummary.getId(), ID_BINDING);
            protocolMarshaller.marshall(findingsReportSummary.getProfileEndTime(), PROFILEENDTIME_BINDING);
            protocolMarshaller.marshall(findingsReportSummary.getProfileStartTime(), PROFILESTARTTIME_BINDING);
            protocolMarshaller.marshall(findingsReportSummary.getProfilingGroupName(), PROFILINGGROUPNAME_BINDING);
            protocolMarshaller.marshall(findingsReportSummary.getTotalNumberOfFindings(), TOTALNUMBEROFFINDINGS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
