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
package com.amazonaws.services.kinesisvideo.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.kinesisvideo.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ListEdgeAgentConfigurationsEdgeConfigMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ListEdgeAgentConfigurationsEdgeConfigMarshaller {

    private static final MarshallingInfo<String> STREAMNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StreamName").build();
    private static final MarshallingInfo<String> STREAMARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("StreamARN").build();
    private static final MarshallingInfo<java.util.Date> CREATIONTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CreationTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> LASTUPDATEDTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LastUpdatedTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> SYNCSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SyncStatus").build();
    private static final MarshallingInfo<String> FAILEDSTATUSDETAILS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FailedStatusDetails").build();
    private static final MarshallingInfo<StructuredPojo> EDGECONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EdgeConfig").build();

    private static final ListEdgeAgentConfigurationsEdgeConfigMarshaller instance = new ListEdgeAgentConfigurationsEdgeConfigMarshaller();

    public static ListEdgeAgentConfigurationsEdgeConfigMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ListEdgeAgentConfigurationsEdgeConfig listEdgeAgentConfigurationsEdgeConfig, ProtocolMarshaller protocolMarshaller) {

        if (listEdgeAgentConfigurationsEdgeConfig == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(listEdgeAgentConfigurationsEdgeConfig.getStreamName(), STREAMNAME_BINDING);
            protocolMarshaller.marshall(listEdgeAgentConfigurationsEdgeConfig.getStreamARN(), STREAMARN_BINDING);
            protocolMarshaller.marshall(listEdgeAgentConfigurationsEdgeConfig.getCreationTime(), CREATIONTIME_BINDING);
            protocolMarshaller.marshall(listEdgeAgentConfigurationsEdgeConfig.getLastUpdatedTime(), LASTUPDATEDTIME_BINDING);
            protocolMarshaller.marshall(listEdgeAgentConfigurationsEdgeConfig.getSyncStatus(), SYNCSTATUS_BINDING);
            protocolMarshaller.marshall(listEdgeAgentConfigurationsEdgeConfig.getFailedStatusDetails(), FAILEDSTATUSDETAILS_BINDING);
            protocolMarshaller.marshall(listEdgeAgentConfigurationsEdgeConfig.getEdgeConfig(), EDGECONFIG_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
