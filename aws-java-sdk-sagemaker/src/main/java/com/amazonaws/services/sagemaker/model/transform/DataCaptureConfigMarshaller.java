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
package com.amazonaws.services.sagemaker.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.sagemaker.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * DataCaptureConfigMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class DataCaptureConfigMarshaller {

    private static final MarshallingInfo<Boolean> ENABLECAPTURE_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EnableCapture").build();
    private static final MarshallingInfo<Integer> INITIALSAMPLINGPERCENTAGE_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("InitialSamplingPercentage").build();
    private static final MarshallingInfo<String> DESTINATIONS3URI_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DestinationS3Uri").build();
    private static final MarshallingInfo<String> KMSKEYID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("KmsKeyId").build();
    private static final MarshallingInfo<List> CAPTUREOPTIONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CaptureOptions").build();
    private static final MarshallingInfo<StructuredPojo> CAPTURECONTENTTYPEHEADER_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CaptureContentTypeHeader").build();

    private static final DataCaptureConfigMarshaller instance = new DataCaptureConfigMarshaller();

    public static DataCaptureConfigMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(DataCaptureConfig dataCaptureConfig, ProtocolMarshaller protocolMarshaller) {

        if (dataCaptureConfig == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(dataCaptureConfig.getEnableCapture(), ENABLECAPTURE_BINDING);
            protocolMarshaller.marshall(dataCaptureConfig.getInitialSamplingPercentage(), INITIALSAMPLINGPERCENTAGE_BINDING);
            protocolMarshaller.marshall(dataCaptureConfig.getDestinationS3Uri(), DESTINATIONS3URI_BINDING);
            protocolMarshaller.marshall(dataCaptureConfig.getKmsKeyId(), KMSKEYID_BINDING);
            protocolMarshaller.marshall(dataCaptureConfig.getCaptureOptions(), CAPTUREOPTIONS_BINDING);
            protocolMarshaller.marshall(dataCaptureConfig.getCaptureContentTypeHeader(), CAPTURECONTENTTYPEHEADER_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
