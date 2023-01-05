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
package com.amazonaws.services.quicksight.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.quicksight.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * TopBottomMoversComputationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class TopBottomMoversComputationMarshaller {

    private static final MarshallingInfo<String> COMPUTATIONID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ComputationId").build();
    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Name").build();
    private static final MarshallingInfo<StructuredPojo> TIME_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Time").build();
    private static final MarshallingInfo<StructuredPojo> CATEGORY_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Category").build();
    private static final MarshallingInfo<StructuredPojo> VALUE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Value").build();
    private static final MarshallingInfo<Integer> MOVERSIZE_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MoverSize").build();
    private static final MarshallingInfo<String> SORTORDER_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("SortOrder").build();
    private static final MarshallingInfo<String> TYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Type").build();

    private static final TopBottomMoversComputationMarshaller instance = new TopBottomMoversComputationMarshaller();

    public static TopBottomMoversComputationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(TopBottomMoversComputation topBottomMoversComputation, ProtocolMarshaller protocolMarshaller) {

        if (topBottomMoversComputation == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(topBottomMoversComputation.getComputationId(), COMPUTATIONID_BINDING);
            protocolMarshaller.marshall(topBottomMoversComputation.getName(), NAME_BINDING);
            protocolMarshaller.marshall(topBottomMoversComputation.getTime(), TIME_BINDING);
            protocolMarshaller.marshall(topBottomMoversComputation.getCategory(), CATEGORY_BINDING);
            protocolMarshaller.marshall(topBottomMoversComputation.getValue(), VALUE_BINDING);
            protocolMarshaller.marshall(topBottomMoversComputation.getMoverSize(), MOVERSIZE_BINDING);
            protocolMarshaller.marshall(topBottomMoversComputation.getSortOrder(), SORTORDER_BINDING);
            protocolMarshaller.marshall(topBottomMoversComputation.getType(), TYPE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
