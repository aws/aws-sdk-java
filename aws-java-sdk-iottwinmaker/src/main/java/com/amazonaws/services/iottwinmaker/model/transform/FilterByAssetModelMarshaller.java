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
package com.amazonaws.services.iottwinmaker.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.iottwinmaker.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * FilterByAssetModelMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class FilterByAssetModelMarshaller {

    private static final MarshallingInfo<String> ASSETMODELID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("assetModelId").build();
    private static final MarshallingInfo<String> ASSETMODELEXTERNALID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("assetModelExternalId").build();
    private static final MarshallingInfo<Boolean> INCLUDEOFFSPRING_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("includeOffspring").build();
    private static final MarshallingInfo<Boolean> INCLUDEASSETS_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("includeAssets").build();

    private static final FilterByAssetModelMarshaller instance = new FilterByAssetModelMarshaller();

    public static FilterByAssetModelMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(FilterByAssetModel filterByAssetModel, ProtocolMarshaller protocolMarshaller) {

        if (filterByAssetModel == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(filterByAssetModel.getAssetModelId(), ASSETMODELID_BINDING);
            protocolMarshaller.marshall(filterByAssetModel.getAssetModelExternalId(), ASSETMODELEXTERNALID_BINDING);
            protocolMarshaller.marshall(filterByAssetModel.getIncludeOffspring(), INCLUDEOFFSPRING_BINDING);
            protocolMarshaller.marshall(filterByAssetModel.getIncludeAssets(), INCLUDEASSETS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
