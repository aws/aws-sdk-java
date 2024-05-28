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
package com.amazonaws.services.bedrockagent.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.bedrockagent.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * OpenSearchServerlessConfigurationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class OpenSearchServerlessConfigurationMarshaller {

    private static final MarshallingInfo<String> COLLECTIONARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("collectionArn").build();
    private static final MarshallingInfo<StructuredPojo> FIELDMAPPING_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("fieldMapping").build();
    private static final MarshallingInfo<String> VECTORINDEXNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("vectorIndexName").build();

    private static final OpenSearchServerlessConfigurationMarshaller instance = new OpenSearchServerlessConfigurationMarshaller();

    public static OpenSearchServerlessConfigurationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(OpenSearchServerlessConfiguration openSearchServerlessConfiguration, ProtocolMarshaller protocolMarshaller) {

        if (openSearchServerlessConfiguration == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(openSearchServerlessConfiguration.getCollectionArn(), COLLECTIONARN_BINDING);
            protocolMarshaller.marshall(openSearchServerlessConfiguration.getFieldMapping(), FIELDMAPPING_BINDING);
            protocolMarshaller.marshall(openSearchServerlessConfiguration.getVectorIndexName(), VECTORINDEXNAME_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
