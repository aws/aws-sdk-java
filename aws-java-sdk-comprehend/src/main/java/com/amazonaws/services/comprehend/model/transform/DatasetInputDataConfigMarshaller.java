/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * DatasetInputDataConfigMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class DatasetInputDataConfigMarshaller {

    private static final MarshallingInfo<List> AUGMENTEDMANIFESTS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AugmentedManifests").build();
    private static final MarshallingInfo<String> DATAFORMAT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DataFormat").build();
    private static final MarshallingInfo<StructuredPojo> DOCUMENTCLASSIFIERINPUTDATACONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DocumentClassifierInputDataConfig").build();
    private static final MarshallingInfo<StructuredPojo> ENTITYRECOGNIZERINPUTDATACONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EntityRecognizerInputDataConfig").build();

    private static final DatasetInputDataConfigMarshaller instance = new DatasetInputDataConfigMarshaller();

    public static DatasetInputDataConfigMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(DatasetInputDataConfig datasetInputDataConfig, ProtocolMarshaller protocolMarshaller) {

        if (datasetInputDataConfig == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(datasetInputDataConfig.getAugmentedManifests(), AUGMENTEDMANIFESTS_BINDING);
            protocolMarshaller.marshall(datasetInputDataConfig.getDataFormat(), DATAFORMAT_BINDING);
            protocolMarshaller.marshall(datasetInputDataConfig.getDocumentClassifierInputDataConfig(), DOCUMENTCLASSIFIERINPUTDATACONFIG_BINDING);
            protocolMarshaller.marshall(datasetInputDataConfig.getEntityRecognizerInputDataConfig(), ENTITYRECOGNIZERINPUTDATACONFIG_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
