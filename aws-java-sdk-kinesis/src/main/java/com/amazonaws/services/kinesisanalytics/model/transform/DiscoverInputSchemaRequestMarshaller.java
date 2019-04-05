/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.kinesisanalytics.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.kinesisanalytics.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * DiscoverInputSchemaRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class DiscoverInputSchemaRequestMarshaller {

    private static final MarshallingInfo<String> RESOURCEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ResourceARN").build();
    private static final MarshallingInfo<String> ROLEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("RoleARN").build();
    private static final MarshallingInfo<StructuredPojo> INPUTSTARTINGPOSITIONCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("InputStartingPositionConfiguration").build();
    private static final MarshallingInfo<StructuredPojo> S3CONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("S3Configuration").build();
    private static final MarshallingInfo<StructuredPojo> INPUTPROCESSINGCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("InputProcessingConfiguration").build();

    private static final DiscoverInputSchemaRequestMarshaller instance = new DiscoverInputSchemaRequestMarshaller();

    public static DiscoverInputSchemaRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(DiscoverInputSchemaRequest discoverInputSchemaRequest, ProtocolMarshaller protocolMarshaller) {

        if (discoverInputSchemaRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(discoverInputSchemaRequest.getResourceARN(), RESOURCEARN_BINDING);
            protocolMarshaller.marshall(discoverInputSchemaRequest.getRoleARN(), ROLEARN_BINDING);
            protocolMarshaller.marshall(discoverInputSchemaRequest.getInputStartingPositionConfiguration(), INPUTSTARTINGPOSITIONCONFIGURATION_BINDING);
            protocolMarshaller.marshall(discoverInputSchemaRequest.getS3Configuration(), S3CONFIGURATION_BINDING);
            protocolMarshaller.marshall(discoverInputSchemaRequest.getInputProcessingConfiguration(), INPUTPROCESSINGCONFIGURATION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
