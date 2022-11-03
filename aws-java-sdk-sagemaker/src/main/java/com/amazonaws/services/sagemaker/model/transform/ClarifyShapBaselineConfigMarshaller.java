/*
 * Copyright 2017-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.sagemaker.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ClarifyShapBaselineConfigMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ClarifyShapBaselineConfigMarshaller {

    private static final MarshallingInfo<String> MIMETYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("MimeType").build();
    private static final MarshallingInfo<String> SHAPBASELINE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ShapBaseline").build();
    private static final MarshallingInfo<String> SHAPBASELINEURI_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ShapBaselineUri").build();

    private static final ClarifyShapBaselineConfigMarshaller instance = new ClarifyShapBaselineConfigMarshaller();

    public static ClarifyShapBaselineConfigMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ClarifyShapBaselineConfig clarifyShapBaselineConfig, ProtocolMarshaller protocolMarshaller) {

        if (clarifyShapBaselineConfig == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(clarifyShapBaselineConfig.getMimeType(), MIMETYPE_BINDING);
            protocolMarshaller.marshall(clarifyShapBaselineConfig.getShapBaseline(), SHAPBASELINE_BINDING);
            protocolMarshaller.marshall(clarifyShapBaselineConfig.getShapBaselineUri(), SHAPBASELINEURI_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
