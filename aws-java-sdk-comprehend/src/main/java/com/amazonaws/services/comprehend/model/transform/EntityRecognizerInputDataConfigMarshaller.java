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
package com.amazonaws.services.comprehend.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.comprehend.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * EntityRecognizerInputDataConfigMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class EntityRecognizerInputDataConfigMarshaller {

    private static final MarshallingInfo<List> ENTITYTYPES_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("EntityTypes").build();
    private static final MarshallingInfo<StructuredPojo> DOCUMENTS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Documents").build();
    private static final MarshallingInfo<StructuredPojo> ANNOTATIONS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Annotations").build();
    private static final MarshallingInfo<StructuredPojo> ENTITYLIST_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EntityList").build();

    private static final EntityRecognizerInputDataConfigMarshaller instance = new EntityRecognizerInputDataConfigMarshaller();

    public static EntityRecognizerInputDataConfigMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(EntityRecognizerInputDataConfig entityRecognizerInputDataConfig, ProtocolMarshaller protocolMarshaller) {

        if (entityRecognizerInputDataConfig == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(entityRecognizerInputDataConfig.getEntityTypes(), ENTITYTYPES_BINDING);
            protocolMarshaller.marshall(entityRecognizerInputDataConfig.getDocuments(), DOCUMENTS_BINDING);
            protocolMarshaller.marshall(entityRecognizerInputDataConfig.getAnnotations(), ANNOTATIONS_BINDING);
            protocolMarshaller.marshall(entityRecognizerInputDataConfig.getEntityList(), ENTITYLIST_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
