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
package com.amazonaws.services.lookoutmetrics.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.lookoutmetrics.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * UpdateAnomalyDetectorRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UpdateAnomalyDetectorRequestMarshaller {

    private static final MarshallingInfo<String> ANOMALYDETECTORARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AnomalyDetectorArn").build();
    private static final MarshallingInfo<String> KMSKEYARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("KmsKeyArn").build();
    private static final MarshallingInfo<String> ANOMALYDETECTORDESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AnomalyDetectorDescription").build();
    private static final MarshallingInfo<StructuredPojo> ANOMALYDETECTORCONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AnomalyDetectorConfig").build();

    private static final UpdateAnomalyDetectorRequestMarshaller instance = new UpdateAnomalyDetectorRequestMarshaller();

    public static UpdateAnomalyDetectorRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UpdateAnomalyDetectorRequest updateAnomalyDetectorRequest, ProtocolMarshaller protocolMarshaller) {

        if (updateAnomalyDetectorRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(updateAnomalyDetectorRequest.getAnomalyDetectorArn(), ANOMALYDETECTORARN_BINDING);
            protocolMarshaller.marshall(updateAnomalyDetectorRequest.getKmsKeyArn(), KMSKEYARN_BINDING);
            protocolMarshaller.marshall(updateAnomalyDetectorRequest.getAnomalyDetectorDescription(), ANOMALYDETECTORDESCRIPTION_BINDING);
            protocolMarshaller.marshall(updateAnomalyDetectorRequest.getAnomalyDetectorConfig(), ANOMALYDETECTORCONFIG_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
