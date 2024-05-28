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
package com.amazonaws.services.iotsitewise.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.iotsitewise.model.*;

import com.amazonaws.util.IdempotentUtils;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CreateAssetModelCompositeModelRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreateAssetModelCompositeModelRequestMarshaller {

    private static final MarshallingInfo<String> ASSETMODELID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("assetModelId").build();
    private static final MarshallingInfo<String> PARENTASSETMODELCOMPOSITEMODELID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("parentAssetModelCompositeModelId").build();
    private static final MarshallingInfo<String> ASSETMODELCOMPOSITEMODELEXTERNALID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("assetModelCompositeModelExternalId").build();
    private static final MarshallingInfo<String> ASSETMODELCOMPOSITEMODELID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("assetModelCompositeModelId").build();
    private static final MarshallingInfo<String> ASSETMODELCOMPOSITEMODELDESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("assetModelCompositeModelDescription").build();
    private static final MarshallingInfo<String> ASSETMODELCOMPOSITEMODELNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("assetModelCompositeModelName").build();
    private static final MarshallingInfo<String> ASSETMODELCOMPOSITEMODELTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("assetModelCompositeModelType").build();
    private static final MarshallingInfo<String> CLIENTTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("clientToken")
            .defaultValueSupplier(com.amazonaws.util.IdempotentUtils.getGenerator()).build();
    private static final MarshallingInfo<String> COMPOSEDASSETMODELID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("composedAssetModelId").build();
    private static final MarshallingInfo<List> ASSETMODELCOMPOSITEMODELPROPERTIES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("assetModelCompositeModelProperties").build();

    private static final CreateAssetModelCompositeModelRequestMarshaller instance = new CreateAssetModelCompositeModelRequestMarshaller();

    public static CreateAssetModelCompositeModelRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreateAssetModelCompositeModelRequest createAssetModelCompositeModelRequest, ProtocolMarshaller protocolMarshaller) {

        if (createAssetModelCompositeModelRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createAssetModelCompositeModelRequest.getAssetModelId(), ASSETMODELID_BINDING);
            protocolMarshaller.marshall(createAssetModelCompositeModelRequest.getParentAssetModelCompositeModelId(), PARENTASSETMODELCOMPOSITEMODELID_BINDING);
            protocolMarshaller.marshall(createAssetModelCompositeModelRequest.getAssetModelCompositeModelExternalId(),
                    ASSETMODELCOMPOSITEMODELEXTERNALID_BINDING);
            protocolMarshaller.marshall(createAssetModelCompositeModelRequest.getAssetModelCompositeModelId(), ASSETMODELCOMPOSITEMODELID_BINDING);
            protocolMarshaller.marshall(createAssetModelCompositeModelRequest.getAssetModelCompositeModelDescription(),
                    ASSETMODELCOMPOSITEMODELDESCRIPTION_BINDING);
            protocolMarshaller.marshall(createAssetModelCompositeModelRequest.getAssetModelCompositeModelName(), ASSETMODELCOMPOSITEMODELNAME_BINDING);
            protocolMarshaller.marshall(createAssetModelCompositeModelRequest.getAssetModelCompositeModelType(), ASSETMODELCOMPOSITEMODELTYPE_BINDING);
            protocolMarshaller.marshall(createAssetModelCompositeModelRequest.getClientToken(), CLIENTTOKEN_BINDING);
            protocolMarshaller.marshall(createAssetModelCompositeModelRequest.getComposedAssetModelId(), COMPOSEDASSETMODELID_BINDING);
            protocolMarshaller.marshall(createAssetModelCompositeModelRequest.getAssetModelCompositeModelProperties(),
                    ASSETMODELCOMPOSITEMODELPROPERTIES_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
