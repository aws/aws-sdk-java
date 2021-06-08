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
package com.amazonaws.services.comprehend.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.comprehend.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * DocumentClassifierInputDataConfigMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class DocumentClassifierInputDataConfigMarshaller {

    private static final MarshallingInfo<String> DATAFORMAT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DataFormat").build();
    private static final MarshallingInfo<String> S3URI_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("S3Uri").build();
    private static final MarshallingInfo<String> LABELDELIMITER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LabelDelimiter").build();
    private static final MarshallingInfo<List> AUGMENTEDMANIFESTS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AugmentedManifests").build();

    private static final DocumentClassifierInputDataConfigMarshaller instance = new DocumentClassifierInputDataConfigMarshaller();

    public static DocumentClassifierInputDataConfigMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(DocumentClassifierInputDataConfig documentClassifierInputDataConfig, ProtocolMarshaller protocolMarshaller) {

        if (documentClassifierInputDataConfig == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(documentClassifierInputDataConfig.getDataFormat(), DATAFORMAT_BINDING);
            protocolMarshaller.marshall(documentClassifierInputDataConfig.getS3Uri(), S3URI_BINDING);
            protocolMarshaller.marshall(documentClassifierInputDataConfig.getLabelDelimiter(), LABELDELIMITER_BINDING);
            protocolMarshaller.marshall(documentClassifierInputDataConfig.getAugmentedManifests(), AUGMENTEDMANIFESTS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
