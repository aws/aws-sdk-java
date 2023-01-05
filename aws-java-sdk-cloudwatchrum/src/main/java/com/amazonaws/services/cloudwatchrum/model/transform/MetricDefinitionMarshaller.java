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
package com.amazonaws.services.cloudwatchrum.model.transform;

import java.util.Map;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.cloudwatchrum.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * MetricDefinitionMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class MetricDefinitionMarshaller {

    private static final MarshallingInfo<Map> DIMENSIONKEYS_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("DimensionKeys").build();
    private static final MarshallingInfo<String> EVENTPATTERN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EventPattern").build();
    private static final MarshallingInfo<String> METRICDEFINITIONID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MetricDefinitionId").build();
    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Name").build();
    private static final MarshallingInfo<String> UNITLABEL_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("UnitLabel").build();
    private static final MarshallingInfo<String> VALUEKEY_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("ValueKey").build();

    private static final MetricDefinitionMarshaller instance = new MetricDefinitionMarshaller();

    public static MetricDefinitionMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(MetricDefinition metricDefinition, ProtocolMarshaller protocolMarshaller) {

        if (metricDefinition == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(metricDefinition.getDimensionKeys(), DIMENSIONKEYS_BINDING);
            protocolMarshaller.marshall(metricDefinition.getEventPattern(), EVENTPATTERN_BINDING);
            protocolMarshaller.marshall(metricDefinition.getMetricDefinitionId(), METRICDEFINITIONID_BINDING);
            protocolMarshaller.marshall(metricDefinition.getName(), NAME_BINDING);
            protocolMarshaller.marshall(metricDefinition.getUnitLabel(), UNITLABEL_BINDING);
            protocolMarshaller.marshall(metricDefinition.getValueKey(), VALUEKEY_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
