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
package com.amazonaws.services.athena.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.athena.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * WorkGroupConfigurationUpdatesMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class WorkGroupConfigurationUpdatesMarshaller {

    private static final MarshallingInfo<Boolean> ENFORCEWORKGROUPCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EnforceWorkGroupConfiguration").build();
    private static final MarshallingInfo<StructuredPojo> RESULTCONFIGURATIONUPDATES_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ResultConfigurationUpdates").build();
    private static final MarshallingInfo<Boolean> PUBLISHCLOUDWATCHMETRICSENABLED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PublishCloudWatchMetricsEnabled").build();
    private static final MarshallingInfo<Long> BYTESSCANNEDCUTOFFPERQUERY_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("BytesScannedCutoffPerQuery").build();
    private static final MarshallingInfo<Boolean> REMOVEBYTESSCANNEDCUTOFFPERQUERY_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RemoveBytesScannedCutoffPerQuery").build();

    private static final WorkGroupConfigurationUpdatesMarshaller instance = new WorkGroupConfigurationUpdatesMarshaller();

    public static WorkGroupConfigurationUpdatesMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(WorkGroupConfigurationUpdates workGroupConfigurationUpdates, ProtocolMarshaller protocolMarshaller) {

        if (workGroupConfigurationUpdates == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(workGroupConfigurationUpdates.getEnforceWorkGroupConfiguration(), ENFORCEWORKGROUPCONFIGURATION_BINDING);
            protocolMarshaller.marshall(workGroupConfigurationUpdates.getResultConfigurationUpdates(), RESULTCONFIGURATIONUPDATES_BINDING);
            protocolMarshaller.marshall(workGroupConfigurationUpdates.getPublishCloudWatchMetricsEnabled(), PUBLISHCLOUDWATCHMETRICSENABLED_BINDING);
            protocolMarshaller.marshall(workGroupConfigurationUpdates.getBytesScannedCutoffPerQuery(), BYTESSCANNEDCUTOFFPERQUERY_BINDING);
            protocolMarshaller.marshall(workGroupConfigurationUpdates.getRemoveBytesScannedCutoffPerQuery(), REMOVEBYTESSCANNEDCUTOFFPERQUERY_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
