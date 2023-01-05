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
package com.amazonaws.services.glue.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.glue.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * EvaluateDataQualityMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class EvaluateDataQualityMarshaller {

    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Name").build();
    private static final MarshallingInfo<List> INPUTS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Inputs").build();
    private static final MarshallingInfo<String> RULESET_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Ruleset").build();
    private static final MarshallingInfo<String> OUTPUT_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Output").build();
    private static final MarshallingInfo<StructuredPojo> PUBLISHINGOPTIONS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PublishingOptions").build();
    private static final MarshallingInfo<StructuredPojo> STOPJOBONFAILUREOPTIONS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StopJobOnFailureOptions").build();

    private static final EvaluateDataQualityMarshaller instance = new EvaluateDataQualityMarshaller();

    public static EvaluateDataQualityMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(EvaluateDataQuality evaluateDataQuality, ProtocolMarshaller protocolMarshaller) {

        if (evaluateDataQuality == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(evaluateDataQuality.getName(), NAME_BINDING);
            protocolMarshaller.marshall(evaluateDataQuality.getInputs(), INPUTS_BINDING);
            protocolMarshaller.marshall(evaluateDataQuality.getRuleset(), RULESET_BINDING);
            protocolMarshaller.marshall(evaluateDataQuality.getOutput(), OUTPUT_BINDING);
            protocolMarshaller.marshall(evaluateDataQuality.getPublishingOptions(), PUBLISHINGOPTIONS_BINDING);
            protocolMarshaller.marshall(evaluateDataQuality.getStopJobOnFailureOptions(), STOPJOBONFAILUREOPTIONS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
