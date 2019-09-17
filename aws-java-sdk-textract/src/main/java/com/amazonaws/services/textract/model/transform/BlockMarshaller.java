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
package com.amazonaws.services.textract.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.textract.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * BlockMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class BlockMarshaller {

    private static final MarshallingInfo<String> BLOCKTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("BlockType").build();
    private static final MarshallingInfo<Float> CONFIDENCE_BINDING = MarshallingInfo.builder(MarshallingType.FLOAT).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Confidence").build();
    private static final MarshallingInfo<String> TEXT_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Text").build();
    private static final MarshallingInfo<Integer> ROWINDEX_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RowIndex").build();
    private static final MarshallingInfo<Integer> COLUMNINDEX_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ColumnIndex").build();
    private static final MarshallingInfo<Integer> ROWSPAN_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("RowSpan").build();
    private static final MarshallingInfo<Integer> COLUMNSPAN_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ColumnSpan").build();
    private static final MarshallingInfo<StructuredPojo> GEOMETRY_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Geometry").build();
    private static final MarshallingInfo<String> ID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Id").build();
    private static final MarshallingInfo<List> RELATIONSHIPS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Relationships").build();
    private static final MarshallingInfo<List> ENTITYTYPES_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("EntityTypes").build();
    private static final MarshallingInfo<String> SELECTIONSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SelectionStatus").build();
    private static final MarshallingInfo<Integer> PAGE_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Page").build();

    private static final BlockMarshaller instance = new BlockMarshaller();

    public static BlockMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(Block block, ProtocolMarshaller protocolMarshaller) {

        if (block == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(block.getBlockType(), BLOCKTYPE_BINDING);
            protocolMarshaller.marshall(block.getConfidence(), CONFIDENCE_BINDING);
            protocolMarshaller.marshall(block.getText(), TEXT_BINDING);
            protocolMarshaller.marshall(block.getRowIndex(), ROWINDEX_BINDING);
            protocolMarshaller.marshall(block.getColumnIndex(), COLUMNINDEX_BINDING);
            protocolMarshaller.marshall(block.getRowSpan(), ROWSPAN_BINDING);
            protocolMarshaller.marshall(block.getColumnSpan(), COLUMNSPAN_BINDING);
            protocolMarshaller.marshall(block.getGeometry(), GEOMETRY_BINDING);
            protocolMarshaller.marshall(block.getId(), ID_BINDING);
            protocolMarshaller.marshall(block.getRelationships(), RELATIONSHIPS_BINDING);
            protocolMarshaller.marshall(block.getEntityTypes(), ENTITYTYPES_BINDING);
            protocolMarshaller.marshall(block.getSelectionStatus(), SELECTIONSTATUS_BINDING);
            protocolMarshaller.marshall(block.getPage(), PAGE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
