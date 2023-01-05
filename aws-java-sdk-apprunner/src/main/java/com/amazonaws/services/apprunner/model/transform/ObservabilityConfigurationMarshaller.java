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
package com.amazonaws.services.apprunner.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.apprunner.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ObservabilityConfigurationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ObservabilityConfigurationMarshaller {

    private static final MarshallingInfo<String> OBSERVABILITYCONFIGURATIONARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ObservabilityConfigurationArn").build();
    private static final MarshallingInfo<String> OBSERVABILITYCONFIGURATIONNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ObservabilityConfigurationName").build();
    private static final MarshallingInfo<StructuredPojo> TRACECONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TraceConfiguration").build();
    private static final MarshallingInfo<Integer> OBSERVABILITYCONFIGURATIONREVISION_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ObservabilityConfigurationRevision").build();
    private static final MarshallingInfo<Boolean> LATEST_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Latest").build();
    private static final MarshallingInfo<String> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Status").build();
    private static final MarshallingInfo<java.util.Date> CREATEDAT_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CreatedAt").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> DELETEDAT_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DeletedAt").timestampFormat("unixTimestamp").build();

    private static final ObservabilityConfigurationMarshaller instance = new ObservabilityConfigurationMarshaller();

    public static ObservabilityConfigurationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ObservabilityConfiguration observabilityConfiguration, ProtocolMarshaller protocolMarshaller) {

        if (observabilityConfiguration == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(observabilityConfiguration.getObservabilityConfigurationArn(), OBSERVABILITYCONFIGURATIONARN_BINDING);
            protocolMarshaller.marshall(observabilityConfiguration.getObservabilityConfigurationName(), OBSERVABILITYCONFIGURATIONNAME_BINDING);
            protocolMarshaller.marshall(observabilityConfiguration.getTraceConfiguration(), TRACECONFIGURATION_BINDING);
            protocolMarshaller.marshall(observabilityConfiguration.getObservabilityConfigurationRevision(), OBSERVABILITYCONFIGURATIONREVISION_BINDING);
            protocolMarshaller.marshall(observabilityConfiguration.getLatest(), LATEST_BINDING);
            protocolMarshaller.marshall(observabilityConfiguration.getStatus(), STATUS_BINDING);
            protocolMarshaller.marshall(observabilityConfiguration.getCreatedAt(), CREATEDAT_BINDING);
            protocolMarshaller.marshall(observabilityConfiguration.getDeletedAt(), DELETEDAT_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
