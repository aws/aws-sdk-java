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
 * PIIDetectionMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class PIIDetectionMarshaller {

    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Name").build();
    private static final MarshallingInfo<List> INPUTS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Inputs").build();
    private static final MarshallingInfo<String> PIITYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("PiiType").build();
    private static final MarshallingInfo<List> ENTITYTYPESTODETECT_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EntityTypesToDetect").build();
    private static final MarshallingInfo<String> OUTPUTCOLUMNNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("OutputColumnName").build();
    private static final MarshallingInfo<Double> SAMPLEFRACTION_BINDING = MarshallingInfo.builder(MarshallingType.DOUBLE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SampleFraction").build();
    private static final MarshallingInfo<Double> THRESHOLDFRACTION_BINDING = MarshallingInfo.builder(MarshallingType.DOUBLE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ThresholdFraction").build();
    private static final MarshallingInfo<String> MASKVALUE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("MaskValue").build();

    private static final PIIDetectionMarshaller instance = new PIIDetectionMarshaller();

    public static PIIDetectionMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(PIIDetection pIIDetection, ProtocolMarshaller protocolMarshaller) {

        if (pIIDetection == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(pIIDetection.getName(), NAME_BINDING);
            protocolMarshaller.marshall(pIIDetection.getInputs(), INPUTS_BINDING);
            protocolMarshaller.marshall(pIIDetection.getPiiType(), PIITYPE_BINDING);
            protocolMarshaller.marshall(pIIDetection.getEntityTypesToDetect(), ENTITYTYPESTODETECT_BINDING);
            protocolMarshaller.marshall(pIIDetection.getOutputColumnName(), OUTPUTCOLUMNNAME_BINDING);
            protocolMarshaller.marshall(pIIDetection.getSampleFraction(), SAMPLEFRACTION_BINDING);
            protocolMarshaller.marshall(pIIDetection.getThresholdFraction(), THRESHOLDFRACTION_BINDING);
            protocolMarshaller.marshall(pIIDetection.getMaskValue(), MASKVALUE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
