/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * TransformOperationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class TransformOperationMarshaller {

    private static final MarshallingInfo<StructuredPojo> PROJECTOPERATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ProjectOperation").build();
    private static final MarshallingInfo<StructuredPojo> FILTEROPERATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FilterOperation").build();
    private static final MarshallingInfo<StructuredPojo> CREATECOLUMNSOPERATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CreateColumnsOperation").build();
    private static final MarshallingInfo<StructuredPojo> RENAMECOLUMNOPERATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RenameColumnOperation").build();
    private static final MarshallingInfo<StructuredPojo> CASTCOLUMNTYPEOPERATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CastColumnTypeOperation").build();
    private static final MarshallingInfo<StructuredPojo> TAGCOLUMNOPERATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TagColumnOperation").build();

    private static final TransformOperationMarshaller instance = new TransformOperationMarshaller();

    public static TransformOperationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(TransformOperation transformOperation, ProtocolMarshaller protocolMarshaller) {

        if (transformOperation == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(transformOperation.getProjectOperation(), PROJECTOPERATION_BINDING);
            protocolMarshaller.marshall(transformOperation.getFilterOperation(), FILTEROPERATION_BINDING);
            protocolMarshaller.marshall(transformOperation.getCreateColumnsOperation(), CREATECOLUMNSOPERATION_BINDING);
            protocolMarshaller.marshall(transformOperation.getRenameColumnOperation(), RENAMECOLUMNOPERATION_BINDING);
            protocolMarshaller.marshall(transformOperation.getCastColumnTypeOperation(), CASTCOLUMNTYPEOPERATION_BINDING);
            protocolMarshaller.marshall(transformOperation.getTagColumnOperation(), TAGCOLUMNOPERATION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
