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
package com.amazonaws.services.backupgateway.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.backupgateway.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * HypervisorDetailsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class HypervisorDetailsMarshaller {

    private static final MarshallingInfo<String> HOST_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Host").build();
    private static final MarshallingInfo<String> HYPERVISORARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("HypervisorArn").build();
    private static final MarshallingInfo<String> KMSKEYARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("KmsKeyArn").build();
    private static final MarshallingInfo<java.util.Date> LASTSUCCESSFULMETADATASYNCTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LastSuccessfulMetadataSyncTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> LATESTMETADATASYNCSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LatestMetadataSyncStatus").build();
    private static final MarshallingInfo<String> LATESTMETADATASYNCSTATUSMESSAGE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LatestMetadataSyncStatusMessage").build();
    private static final MarshallingInfo<String> LOGGROUPARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LogGroupArn").build();
    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Name").build();
    private static final MarshallingInfo<String> STATE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("State").build();

    private static final HypervisorDetailsMarshaller instance = new HypervisorDetailsMarshaller();

    public static HypervisorDetailsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(HypervisorDetails hypervisorDetails, ProtocolMarshaller protocolMarshaller) {

        if (hypervisorDetails == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(hypervisorDetails.getHost(), HOST_BINDING);
            protocolMarshaller.marshall(hypervisorDetails.getHypervisorArn(), HYPERVISORARN_BINDING);
            protocolMarshaller.marshall(hypervisorDetails.getKmsKeyArn(), KMSKEYARN_BINDING);
            protocolMarshaller.marshall(hypervisorDetails.getLastSuccessfulMetadataSyncTime(), LASTSUCCESSFULMETADATASYNCTIME_BINDING);
            protocolMarshaller.marshall(hypervisorDetails.getLatestMetadataSyncStatus(), LATESTMETADATASYNCSTATUS_BINDING);
            protocolMarshaller.marshall(hypervisorDetails.getLatestMetadataSyncStatusMessage(), LATESTMETADATASYNCSTATUSMESSAGE_BINDING);
            protocolMarshaller.marshall(hypervisorDetails.getLogGroupArn(), LOGGROUPARN_BINDING);
            protocolMarshaller.marshall(hypervisorDetails.getName(), NAME_BINDING);
            protocolMarshaller.marshall(hypervisorDetails.getState(), STATE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
