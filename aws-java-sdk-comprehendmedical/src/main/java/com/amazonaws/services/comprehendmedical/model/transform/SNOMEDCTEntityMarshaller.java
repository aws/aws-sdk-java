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
package com.amazonaws.services.comprehendmedical.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.comprehendmedical.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * SNOMEDCTEntityMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class SNOMEDCTEntityMarshaller {

    private static final MarshallingInfo<Integer> ID_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Id").build();
    private static final MarshallingInfo<String> TEXT_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Text").build();
    private static final MarshallingInfo<String> CATEGORY_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Category").build();
    private static final MarshallingInfo<String> TYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Type").build();
    private static final MarshallingInfo<Float> SCORE_BINDING = MarshallingInfo.builder(MarshallingType.FLOAT).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Score").build();
    private static final MarshallingInfo<Integer> BEGINOFFSET_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("BeginOffset").build();
    private static final MarshallingInfo<Integer> ENDOFFSET_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EndOffset").build();
    private static final MarshallingInfo<List> ATTRIBUTES_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Attributes").build();
    private static final MarshallingInfo<List> TRAITS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Traits").build();
    private static final MarshallingInfo<List> SNOMEDCTCONCEPTS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SNOMEDCTConcepts").build();

    private static final SNOMEDCTEntityMarshaller instance = new SNOMEDCTEntityMarshaller();

    public static SNOMEDCTEntityMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(SNOMEDCTEntity sNOMEDCTEntity, ProtocolMarshaller protocolMarshaller) {

        if (sNOMEDCTEntity == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(sNOMEDCTEntity.getId(), ID_BINDING);
            protocolMarshaller.marshall(sNOMEDCTEntity.getText(), TEXT_BINDING);
            protocolMarshaller.marshall(sNOMEDCTEntity.getCategory(), CATEGORY_BINDING);
            protocolMarshaller.marshall(sNOMEDCTEntity.getType(), TYPE_BINDING);
            protocolMarshaller.marshall(sNOMEDCTEntity.getScore(), SCORE_BINDING);
            protocolMarshaller.marshall(sNOMEDCTEntity.getBeginOffset(), BEGINOFFSET_BINDING);
            protocolMarshaller.marshall(sNOMEDCTEntity.getEndOffset(), ENDOFFSET_BINDING);
            protocolMarshaller.marshall(sNOMEDCTEntity.getAttributes(), ATTRIBUTES_BINDING);
            protocolMarshaller.marshall(sNOMEDCTEntity.getTraits(), TRAITS_BINDING);
            protocolMarshaller.marshall(sNOMEDCTEntity.getSNOMEDCTConcepts(), SNOMEDCTCONCEPTS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
