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
package com.amazonaws.services.quicksight.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.quicksight.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * TopicNamedEntityMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class TopicNamedEntityMarshaller {

    private static final MarshallingInfo<String> ENTITYNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EntityName").build();
    private static final MarshallingInfo<String> ENTITYDESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EntityDescription").build();
    private static final MarshallingInfo<List> ENTITYSYNONYMS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EntitySynonyms").build();
    private static final MarshallingInfo<StructuredPojo> SEMANTICENTITYTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SemanticEntityType").build();
    private static final MarshallingInfo<List> DEFINITION_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Definition").build();

    private static final TopicNamedEntityMarshaller instance = new TopicNamedEntityMarshaller();

    public static TopicNamedEntityMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(TopicNamedEntity topicNamedEntity, ProtocolMarshaller protocolMarshaller) {

        if (topicNamedEntity == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(topicNamedEntity.getEntityName(), ENTITYNAME_BINDING);
            protocolMarshaller.marshall(topicNamedEntity.getEntityDescription(), ENTITYDESCRIPTION_BINDING);
            protocolMarshaller.marshall(topicNamedEntity.getEntitySynonyms(), ENTITYSYNONYMS_BINDING);
            protocolMarshaller.marshall(topicNamedEntity.getSemanticEntityType(), SEMANTICENTITYTYPE_BINDING);
            protocolMarshaller.marshall(topicNamedEntity.getDefinition(), DEFINITION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
