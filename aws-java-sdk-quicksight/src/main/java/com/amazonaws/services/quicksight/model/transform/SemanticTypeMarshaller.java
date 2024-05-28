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

import java.util.Map;
import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.quicksight.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * SemanticTypeMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class SemanticTypeMarshaller {

    private static final MarshallingInfo<String> TYPENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("TypeName").build();
    private static final MarshallingInfo<String> SUBTYPENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SubTypeName").build();
    private static final MarshallingInfo<Map> TYPEPARAMETERS_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("TypeParameters").build();
    private static final MarshallingInfo<String> TRUTHYCELLVALUE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TruthyCellValue").build();
    private static final MarshallingInfo<List> TRUTHYCELLVALUESYNONYMS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TruthyCellValueSynonyms").build();
    private static final MarshallingInfo<String> FALSEYCELLVALUE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FalseyCellValue").build();
    private static final MarshallingInfo<List> FALSEYCELLVALUESYNONYMS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FalseyCellValueSynonyms").build();

    private static final SemanticTypeMarshaller instance = new SemanticTypeMarshaller();

    public static SemanticTypeMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(SemanticType semanticType, ProtocolMarshaller protocolMarshaller) {

        if (semanticType == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(semanticType.getTypeName(), TYPENAME_BINDING);
            protocolMarshaller.marshall(semanticType.getSubTypeName(), SUBTYPENAME_BINDING);
            protocolMarshaller.marshall(semanticType.getTypeParameters(), TYPEPARAMETERS_BINDING);
            protocolMarshaller.marshall(semanticType.getTruthyCellValue(), TRUTHYCELLVALUE_BINDING);
            protocolMarshaller.marshall(semanticType.getTruthyCellValueSynonyms(), TRUTHYCELLVALUESYNONYMS_BINDING);
            protocolMarshaller.marshall(semanticType.getFalseyCellValue(), FALSEYCELLVALUE_BINDING);
            protocolMarshaller.marshall(semanticType.getFalseyCellValueSynonyms(), FALSEYCELLVALUESYNONYMS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
