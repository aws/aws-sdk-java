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

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.glue.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * S3DirectSourceAdditionalOptionsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class S3DirectSourceAdditionalOptionsMarshaller {

    private static final MarshallingInfo<Long> BOUNDEDSIZE_BINDING = MarshallingInfo.builder(MarshallingType.LONG).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("BoundedSize").build();
    private static final MarshallingInfo<Long> BOUNDEDFILES_BINDING = MarshallingInfo.builder(MarshallingType.LONG).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("BoundedFiles").build();
    private static final MarshallingInfo<Boolean> ENABLESAMPLEPATH_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EnableSamplePath").build();
    private static final MarshallingInfo<String> SAMPLEPATH_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SamplePath").build();

    private static final S3DirectSourceAdditionalOptionsMarshaller instance = new S3DirectSourceAdditionalOptionsMarshaller();

    public static S3DirectSourceAdditionalOptionsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(S3DirectSourceAdditionalOptions s3DirectSourceAdditionalOptions, ProtocolMarshaller protocolMarshaller) {

        if (s3DirectSourceAdditionalOptions == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(s3DirectSourceAdditionalOptions.getBoundedSize(), BOUNDEDSIZE_BINDING);
            protocolMarshaller.marshall(s3DirectSourceAdditionalOptions.getBoundedFiles(), BOUNDEDFILES_BINDING);
            protocolMarshaller.marshall(s3DirectSourceAdditionalOptions.getEnableSamplePath(), ENABLESAMPLEPATH_BINDING);
            protocolMarshaller.marshall(s3DirectSourceAdditionalOptions.getSamplePath(), SAMPLEPATH_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
