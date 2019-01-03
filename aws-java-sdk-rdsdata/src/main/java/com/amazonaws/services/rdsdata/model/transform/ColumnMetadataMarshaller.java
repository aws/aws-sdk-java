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
package com.amazonaws.services.rdsdata.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.rdsdata.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ColumnMetadataMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ColumnMetadataMarshaller {

    private static final MarshallingInfo<Integer> ARRAYBASECOLUMNTYPE_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("arrayBaseColumnType").build();
    private static final MarshallingInfo<Boolean> ISAUTOINCREMENT_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("isAutoIncrement").build();
    private static final MarshallingInfo<Boolean> ISCASESENSITIVE_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("isCaseSensitive").build();
    private static final MarshallingInfo<Boolean> ISCURRENCY_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("isCurrency").build();
    private static final MarshallingInfo<Boolean> ISSIGNED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("isSigned").build();
    private static final MarshallingInfo<String> LABEL_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("label").build();
    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("name").build();
    private static final MarshallingInfo<Integer> NULLABLE_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("nullable").build();
    private static final MarshallingInfo<Integer> PRECISION_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("precision").build();
    private static final MarshallingInfo<Integer> SCALE_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("scale").build();
    private static final MarshallingInfo<String> SCHEMANAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("schemaName").build();
    private static final MarshallingInfo<String> TABLENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("tableName").build();
    private static final MarshallingInfo<Integer> TYPE_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("type").build();
    private static final MarshallingInfo<String> TYPENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("typeName").build();

    private static final ColumnMetadataMarshaller instance = new ColumnMetadataMarshaller();

    public static ColumnMetadataMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ColumnMetadata columnMetadata, ProtocolMarshaller protocolMarshaller) {

        if (columnMetadata == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(columnMetadata.getArrayBaseColumnType(), ARRAYBASECOLUMNTYPE_BINDING);
            protocolMarshaller.marshall(columnMetadata.getIsAutoIncrement(), ISAUTOINCREMENT_BINDING);
            protocolMarshaller.marshall(columnMetadata.getIsCaseSensitive(), ISCASESENSITIVE_BINDING);
            protocolMarshaller.marshall(columnMetadata.getIsCurrency(), ISCURRENCY_BINDING);
            protocolMarshaller.marshall(columnMetadata.getIsSigned(), ISSIGNED_BINDING);
            protocolMarshaller.marshall(columnMetadata.getLabel(), LABEL_BINDING);
            protocolMarshaller.marshall(columnMetadata.getName(), NAME_BINDING);
            protocolMarshaller.marshall(columnMetadata.getNullable(), NULLABLE_BINDING);
            protocolMarshaller.marshall(columnMetadata.getPrecision(), PRECISION_BINDING);
            protocolMarshaller.marshall(columnMetadata.getScale(), SCALE_BINDING);
            protocolMarshaller.marshall(columnMetadata.getSchemaName(), SCHEMANAME_BINDING);
            protocolMarshaller.marshall(columnMetadata.getTableName(), TABLENAME_BINDING);
            protocolMarshaller.marshall(columnMetadata.getType(), TYPE_BINDING);
            protocolMarshaller.marshall(columnMetadata.getTypeName(), TYPENAME_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
