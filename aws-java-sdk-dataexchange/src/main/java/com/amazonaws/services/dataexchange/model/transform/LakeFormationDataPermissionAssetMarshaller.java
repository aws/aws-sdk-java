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
package com.amazonaws.services.dataexchange.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.dataexchange.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * LakeFormationDataPermissionAssetMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class LakeFormationDataPermissionAssetMarshaller {

    private static final MarshallingInfo<StructuredPojo> LAKEFORMATIONDATAPERMISSIONDETAILS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LakeFormationDataPermissionDetails").build();
    private static final MarshallingInfo<String> LAKEFORMATIONDATAPERMISSIONTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LakeFormationDataPermissionType").build();
    private static final MarshallingInfo<List> PERMISSIONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Permissions").build();
    private static final MarshallingInfo<String> ROLEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("RoleArn").build();

    private static final LakeFormationDataPermissionAssetMarshaller instance = new LakeFormationDataPermissionAssetMarshaller();

    public static LakeFormationDataPermissionAssetMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(LakeFormationDataPermissionAsset lakeFormationDataPermissionAsset, ProtocolMarshaller protocolMarshaller) {

        if (lakeFormationDataPermissionAsset == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(lakeFormationDataPermissionAsset.getLakeFormationDataPermissionDetails(), LAKEFORMATIONDATAPERMISSIONDETAILS_BINDING);
            protocolMarshaller.marshall(lakeFormationDataPermissionAsset.getLakeFormationDataPermissionType(), LAKEFORMATIONDATAPERMISSIONTYPE_BINDING);
            protocolMarshaller.marshall(lakeFormationDataPermissionAsset.getPermissions(), PERMISSIONS_BINDING);
            protocolMarshaller.marshall(lakeFormationDataPermissionAsset.getRoleArn(), ROLEARN_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
