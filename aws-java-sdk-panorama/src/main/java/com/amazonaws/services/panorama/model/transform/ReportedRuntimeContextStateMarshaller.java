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
package com.amazonaws.services.panorama.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.panorama.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ReportedRuntimeContextStateMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ReportedRuntimeContextStateMarshaller {

    private static final MarshallingInfo<String> DESIREDSTATE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DesiredState").build();
    private static final MarshallingInfo<String> DEVICEREPORTEDSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DeviceReportedStatus").build();
    private static final MarshallingInfo<java.util.Date> DEVICEREPORTEDTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DeviceReportedTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> RUNTIMECONTEXTNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RuntimeContextName").build();

    private static final ReportedRuntimeContextStateMarshaller instance = new ReportedRuntimeContextStateMarshaller();

    public static ReportedRuntimeContextStateMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ReportedRuntimeContextState reportedRuntimeContextState, ProtocolMarshaller protocolMarshaller) {

        if (reportedRuntimeContextState == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(reportedRuntimeContextState.getDesiredState(), DESIREDSTATE_BINDING);
            protocolMarshaller.marshall(reportedRuntimeContextState.getDeviceReportedStatus(), DEVICEREPORTEDSTATUS_BINDING);
            protocolMarshaller.marshall(reportedRuntimeContextState.getDeviceReportedTime(), DEVICEREPORTEDTIME_BINDING);
            protocolMarshaller.marshall(reportedRuntimeContextState.getRuntimeContextName(), RUNTIMECONTEXTNAME_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
