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
package com.amazonaws.services.timestreamquery.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.timestreamquery.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * MixedMeasureMappingMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class MixedMeasureMappingMarshaller {

    private static final MarshallingInfo<String> MEASURENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MeasureName").build();
    private static final MarshallingInfo<String> SOURCECOLUMN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SourceColumn").build();
    private static final MarshallingInfo<String> TARGETMEASURENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TargetMeasureName").build();
    private static final MarshallingInfo<String> MEASUREVALUETYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MeasureValueType").build();
    private static final MarshallingInfo<List> MULTIMEASUREATTRIBUTEMAPPINGS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MultiMeasureAttributeMappings").build();

    private static final MixedMeasureMappingMarshaller instance = new MixedMeasureMappingMarshaller();

    public static MixedMeasureMappingMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(MixedMeasureMapping mixedMeasureMapping, ProtocolMarshaller protocolMarshaller) {

        if (mixedMeasureMapping == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(mixedMeasureMapping.getMeasureName(), MEASURENAME_BINDING);
            protocolMarshaller.marshall(mixedMeasureMapping.getSourceColumn(), SOURCECOLUMN_BINDING);
            protocolMarshaller.marshall(mixedMeasureMapping.getTargetMeasureName(), TARGETMEASURENAME_BINDING);
            protocolMarshaller.marshall(mixedMeasureMapping.getMeasureValueType(), MEASUREVALUETYPE_BINDING);
            protocolMarshaller.marshall(mixedMeasureMapping.getMultiMeasureAttributeMappings(), MULTIMEASUREATTRIBUTEMAPPINGS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
