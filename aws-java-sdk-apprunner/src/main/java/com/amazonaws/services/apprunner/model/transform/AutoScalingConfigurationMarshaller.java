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
package com.amazonaws.services.apprunner.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.apprunner.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * AutoScalingConfigurationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AutoScalingConfigurationMarshaller {

    private static final MarshallingInfo<String> AUTOSCALINGCONFIGURATIONARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AutoScalingConfigurationArn").build();
    private static final MarshallingInfo<String> AUTOSCALINGCONFIGURATIONNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AutoScalingConfigurationName").build();
    private static final MarshallingInfo<Integer> AUTOSCALINGCONFIGURATIONREVISION_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AutoScalingConfigurationRevision").build();
    private static final MarshallingInfo<Boolean> LATEST_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Latest").build();
    private static final MarshallingInfo<String> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Status").build();
    private static final MarshallingInfo<Integer> MAXCONCURRENCY_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MaxConcurrency").build();
    private static final MarshallingInfo<Integer> MINSIZE_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("MinSize").build();
    private static final MarshallingInfo<Integer> MAXSIZE_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("MaxSize").build();
    private static final MarshallingInfo<java.util.Date> CREATEDAT_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CreatedAt").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> DELETEDAT_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DeletedAt").timestampFormat("unixTimestamp").build();

    private static final AutoScalingConfigurationMarshaller instance = new AutoScalingConfigurationMarshaller();

    public static AutoScalingConfigurationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AutoScalingConfiguration autoScalingConfiguration, ProtocolMarshaller protocolMarshaller) {

        if (autoScalingConfiguration == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(autoScalingConfiguration.getAutoScalingConfigurationArn(), AUTOSCALINGCONFIGURATIONARN_BINDING);
            protocolMarshaller.marshall(autoScalingConfiguration.getAutoScalingConfigurationName(), AUTOSCALINGCONFIGURATIONNAME_BINDING);
            protocolMarshaller.marshall(autoScalingConfiguration.getAutoScalingConfigurationRevision(), AUTOSCALINGCONFIGURATIONREVISION_BINDING);
            protocolMarshaller.marshall(autoScalingConfiguration.getLatest(), LATEST_BINDING);
            protocolMarshaller.marshall(autoScalingConfiguration.getStatus(), STATUS_BINDING);
            protocolMarshaller.marshall(autoScalingConfiguration.getMaxConcurrency(), MAXCONCURRENCY_BINDING);
            protocolMarshaller.marshall(autoScalingConfiguration.getMinSize(), MINSIZE_BINDING);
            protocolMarshaller.marshall(autoScalingConfiguration.getMaxSize(), MAXSIZE_BINDING);
            protocolMarshaller.marshall(autoScalingConfiguration.getCreatedAt(), CREATEDAT_BINDING);
            protocolMarshaller.marshall(autoScalingConfiguration.getDeletedAt(), DELETEDAT_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
