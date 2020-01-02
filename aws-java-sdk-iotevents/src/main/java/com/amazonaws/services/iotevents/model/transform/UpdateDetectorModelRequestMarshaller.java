/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.iotevents.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.iotevents.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * UpdateDetectorModelRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UpdateDetectorModelRequestMarshaller {

    private static final MarshallingInfo<String> DETECTORMODELNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PATH).marshallLocationName("detectorModelName").build();
    private static final MarshallingInfo<StructuredPojo> DETECTORMODELDEFINITION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("detectorModelDefinition").build();
    private static final MarshallingInfo<String> DETECTORMODELDESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("detectorModelDescription").build();
    private static final MarshallingInfo<String> ROLEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("roleArn").build();
    private static final MarshallingInfo<String> EVALUATIONMETHOD_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("evaluationMethod").build();

    private static final UpdateDetectorModelRequestMarshaller instance = new UpdateDetectorModelRequestMarshaller();

    public static UpdateDetectorModelRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UpdateDetectorModelRequest updateDetectorModelRequest, ProtocolMarshaller protocolMarshaller) {

        if (updateDetectorModelRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(updateDetectorModelRequest.getDetectorModelName(), DETECTORMODELNAME_BINDING);
            protocolMarshaller.marshall(updateDetectorModelRequest.getDetectorModelDefinition(), DETECTORMODELDEFINITION_BINDING);
            protocolMarshaller.marshall(updateDetectorModelRequest.getDetectorModelDescription(), DETECTORMODELDESCRIPTION_BINDING);
            protocolMarshaller.marshall(updateDetectorModelRequest.getRoleArn(), ROLEARN_BINDING);
            protocolMarshaller.marshall(updateDetectorModelRequest.getEvaluationMethod(), EVALUATIONMETHOD_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
