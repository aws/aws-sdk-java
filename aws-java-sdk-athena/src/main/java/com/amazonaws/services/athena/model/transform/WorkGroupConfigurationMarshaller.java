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
 * WorkGroupConfigurationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class WorkGroupConfigurationMarshaller {

    private static final MarshallingInfo<StructuredPojo> RESULTCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ResultConfiguration").build();
    private static final MarshallingInfo<Boolean> ENFORCEWORKGROUPCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EnforceWorkGroupConfiguration").build();
    private static final MarshallingInfo<Boolean> PUBLISHCLOUDWATCHMETRICSENABLED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PublishCloudWatchMetricsEnabled").build();
    private static final MarshallingInfo<Long> BYTESSCANNEDCUTOFFPERQUERY_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("BytesScannedCutoffPerQuery").build();

    private static final WorkGroupConfigurationMarshaller instance = new WorkGroupConfigurationMarshaller();

    public static WorkGroupConfigurationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(WorkGroupConfiguration workGroupConfiguration, ProtocolMarshaller protocolMarshaller) {

        if (workGroupConfiguration == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(workGroupConfiguration.getResultConfiguration(), RESULTCONFIGURATION_BINDING);
            protocolMarshaller.marshall(workGroupConfiguration.getEnforceWorkGroupConfiguration(), ENFORCEWORKGROUPCONFIGURATION_BINDING);
            protocolMarshaller.marshall(workGroupConfiguration.getPublishCloudWatchMetricsEnabled(), PUBLISHCLOUDWATCHMETRICSENABLED_BINDING);
            protocolMarshaller.marshall(workGroupConfiguration.getBytesScannedCutoffPerQuery(), BYTESSCANNEDCUTOFFPERQUERY_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
