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
package com.amazonaws.services.cloudwatchevidently.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.cloudwatchevidently.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * MetricDefinitionConfigMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class MetricDefinitionConfigMarshaller {

    private static final MarshallingInfo<String> ENTITYIDKEY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("entityIdKey").build();
    private static final MarshallingInfo<String> EVENTPATTERN_BINDING = MarshallingInfo.builder(MarshallingType.JSON_VALUE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("eventPattern").build();
    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("name").build();
    private static final MarshallingInfo<String> UNITLABEL_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("unitLabel").build();
    private static final MarshallingInfo<String> VALUEKEY_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("valueKey").build();

    private static final MetricDefinitionConfigMarshaller instance = new MetricDefinitionConfigMarshaller();

    public static MetricDefinitionConfigMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(MetricDefinitionConfig metricDefinitionConfig, ProtocolMarshaller protocolMarshaller) {

        if (metricDefinitionConfig == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(metricDefinitionConfig.getEntityIdKey(), ENTITYIDKEY_BINDING);
            protocolMarshaller.marshall(metricDefinitionConfig.getEventPattern(), EVENTPATTERN_BINDING);
            protocolMarshaller.marshall(metricDefinitionConfig.getName(), NAME_BINDING);
            protocolMarshaller.marshall(metricDefinitionConfig.getUnitLabel(), UNITLABEL_BINDING);
            protocolMarshaller.marshall(metricDefinitionConfig.getValueKey(), VALUEKEY_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
