/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.quicksight.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.quicksight.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * StartDashboardSnapshotJobRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class StartDashboardSnapshotJobRequestMarshaller {

    private static final MarshallingInfo<String> AWSACCOUNTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("AwsAccountId").build();
    private static final MarshallingInfo<String> DASHBOARDID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("DashboardId").build();
    private static final MarshallingInfo<String> SNAPSHOTJOBID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SnapshotJobId").build();
    private static final MarshallingInfo<StructuredPojo> USERCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("UserConfiguration").build();
    private static final MarshallingInfo<StructuredPojo> SNAPSHOTCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SnapshotConfiguration").build();

    private static final StartDashboardSnapshotJobRequestMarshaller instance = new StartDashboardSnapshotJobRequestMarshaller();

    public static StartDashboardSnapshotJobRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(StartDashboardSnapshotJobRequest startDashboardSnapshotJobRequest, ProtocolMarshaller protocolMarshaller) {

        if (startDashboardSnapshotJobRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(startDashboardSnapshotJobRequest.getAwsAccountId(), AWSACCOUNTID_BINDING);
            protocolMarshaller.marshall(startDashboardSnapshotJobRequest.getDashboardId(), DASHBOARDID_BINDING);
            protocolMarshaller.marshall(startDashboardSnapshotJobRequest.getSnapshotJobId(), SNAPSHOTJOBID_BINDING);
            protocolMarshaller.marshall(startDashboardSnapshotJobRequest.getUserConfiguration(), USERCONFIGURATION_BINDING);
            protocolMarshaller.marshall(startDashboardSnapshotJobRequest.getSnapshotConfiguration(), SNAPSHOTCONFIGURATION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
