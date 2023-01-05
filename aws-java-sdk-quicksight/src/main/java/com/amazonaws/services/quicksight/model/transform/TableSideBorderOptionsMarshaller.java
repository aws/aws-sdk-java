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
 * TableSideBorderOptionsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class TableSideBorderOptionsMarshaller {

    private static final MarshallingInfo<StructuredPojo> INNERVERTICAL_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("InnerVertical").build();
    private static final MarshallingInfo<StructuredPojo> INNERHORIZONTAL_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("InnerHorizontal").build();
    private static final MarshallingInfo<StructuredPojo> LEFT_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Left").build();
    private static final MarshallingInfo<StructuredPojo> RIGHT_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Right").build();
    private static final MarshallingInfo<StructuredPojo> TOP_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Top").build();
    private static final MarshallingInfo<StructuredPojo> BOTTOM_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Bottom").build();

    private static final TableSideBorderOptionsMarshaller instance = new TableSideBorderOptionsMarshaller();

    public static TableSideBorderOptionsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(TableSideBorderOptions tableSideBorderOptions, ProtocolMarshaller protocolMarshaller) {

        if (tableSideBorderOptions == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(tableSideBorderOptions.getInnerVertical(), INNERVERTICAL_BINDING);
            protocolMarshaller.marshall(tableSideBorderOptions.getInnerHorizontal(), INNERHORIZONTAL_BINDING);
            protocolMarshaller.marshall(tableSideBorderOptions.getLeft(), LEFT_BINDING);
            protocolMarshaller.marshall(tableSideBorderOptions.getRight(), RIGHT_BINDING);
            protocolMarshaller.marshall(tableSideBorderOptions.getTop(), TOP_BINDING);
            protocolMarshaller.marshall(tableSideBorderOptions.getBottom(), BOTTOM_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
