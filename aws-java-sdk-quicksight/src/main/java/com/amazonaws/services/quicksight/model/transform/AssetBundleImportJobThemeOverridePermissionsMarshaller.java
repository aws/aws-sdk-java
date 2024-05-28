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

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.quicksight.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * AssetBundleImportJobThemeOverridePermissionsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AssetBundleImportJobThemeOverridePermissionsMarshaller {

    private static final MarshallingInfo<List> THEMEIDS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("ThemeIds").build();
    private static final MarshallingInfo<StructuredPojo> PERMISSIONS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Permissions").build();

    private static final AssetBundleImportJobThemeOverridePermissionsMarshaller instance = new AssetBundleImportJobThemeOverridePermissionsMarshaller();

    public static AssetBundleImportJobThemeOverridePermissionsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AssetBundleImportJobThemeOverridePermissions assetBundleImportJobThemeOverridePermissions, ProtocolMarshaller protocolMarshaller) {

        if (assetBundleImportJobThemeOverridePermissions == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(assetBundleImportJobThemeOverridePermissions.getThemeIds(), THEMEIDS_BINDING);
            protocolMarshaller.marshall(assetBundleImportJobThemeOverridePermissions.getPermissions(), PERMISSIONS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
