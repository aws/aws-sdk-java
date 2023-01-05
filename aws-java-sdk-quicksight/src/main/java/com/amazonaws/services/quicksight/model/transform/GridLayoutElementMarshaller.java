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
 * GridLayoutElementMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class GridLayoutElementMarshaller {

    private static final MarshallingInfo<String> ELEMENTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("ElementId").build();
    private static final MarshallingInfo<String> ELEMENTTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ElementType").build();
    private static final MarshallingInfo<Integer> COLUMNINDEX_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ColumnIndex").build();
    private static final MarshallingInfo<Integer> COLUMNSPAN_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ColumnSpan").build();
    private static final MarshallingInfo<Integer> ROWINDEX_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RowIndex").build();
    private static final MarshallingInfo<Integer> ROWSPAN_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("RowSpan").build();

    private static final GridLayoutElementMarshaller instance = new GridLayoutElementMarshaller();

    public static GridLayoutElementMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(GridLayoutElement gridLayoutElement, ProtocolMarshaller protocolMarshaller) {

        if (gridLayoutElement == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(gridLayoutElement.getElementId(), ELEMENTID_BINDING);
            protocolMarshaller.marshall(gridLayoutElement.getElementType(), ELEMENTTYPE_BINDING);
            protocolMarshaller.marshall(gridLayoutElement.getColumnIndex(), COLUMNINDEX_BINDING);
            protocolMarshaller.marshall(gridLayoutElement.getColumnSpan(), COLUMNSPAN_BINDING);
            protocolMarshaller.marshall(gridLayoutElement.getRowIndex(), ROWINDEX_BINDING);
            protocolMarshaller.marshall(gridLayoutElement.getRowSpan(), ROWSPAN_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
