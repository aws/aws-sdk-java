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
package com.amazonaws.services.amplifyuibuilder.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.amplifyuibuilder.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CodegenGenericDataRelationshipTypeMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CodegenGenericDataRelationshipTypeMarshaller {

    private static final MarshallingInfo<String> TYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("type").build();
    private static final MarshallingInfo<String> RELATEDMODELNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("relatedModelName").build();
    private static final MarshallingInfo<List> RELATEDMODELFIELDS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("relatedModelFields").build();
    private static final MarshallingInfo<Boolean> CANUNLINKASSOCIATEDMODEL_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("canUnlinkAssociatedModel").build();
    private static final MarshallingInfo<String> RELATEDJOINFIELDNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("relatedJoinFieldName").build();
    private static final MarshallingInfo<String> RELATEDJOINTABLENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("relatedJoinTableName").build();
    private static final MarshallingInfo<String> BELONGSTOFIELDONRELATEDMODEL_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("belongsToFieldOnRelatedModel").build();
    private static final MarshallingInfo<List> ASSOCIATEDFIELDS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("associatedFields").build();
    private static final MarshallingInfo<Boolean> ISHASMANYINDEX_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("isHasManyIndex").build();

    private static final CodegenGenericDataRelationshipTypeMarshaller instance = new CodegenGenericDataRelationshipTypeMarshaller();

    public static CodegenGenericDataRelationshipTypeMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CodegenGenericDataRelationshipType codegenGenericDataRelationshipType, ProtocolMarshaller protocolMarshaller) {

        if (codegenGenericDataRelationshipType == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(codegenGenericDataRelationshipType.getType(), TYPE_BINDING);
            protocolMarshaller.marshall(codegenGenericDataRelationshipType.getRelatedModelName(), RELATEDMODELNAME_BINDING);
            protocolMarshaller.marshall(codegenGenericDataRelationshipType.getRelatedModelFields(), RELATEDMODELFIELDS_BINDING);
            protocolMarshaller.marshall(codegenGenericDataRelationshipType.getCanUnlinkAssociatedModel(), CANUNLINKASSOCIATEDMODEL_BINDING);
            protocolMarshaller.marshall(codegenGenericDataRelationshipType.getRelatedJoinFieldName(), RELATEDJOINFIELDNAME_BINDING);
            protocolMarshaller.marshall(codegenGenericDataRelationshipType.getRelatedJoinTableName(), RELATEDJOINTABLENAME_BINDING);
            protocolMarshaller.marshall(codegenGenericDataRelationshipType.getBelongsToFieldOnRelatedModel(), BELONGSTOFIELDONRELATEDMODEL_BINDING);
            protocolMarshaller.marshall(codegenGenericDataRelationshipType.getAssociatedFields(), ASSOCIATEDFIELDS_BINDING);
            protocolMarshaller.marshall(codegenGenericDataRelationshipType.getIsHasManyIndex(), ISHASMANYINDEX_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
