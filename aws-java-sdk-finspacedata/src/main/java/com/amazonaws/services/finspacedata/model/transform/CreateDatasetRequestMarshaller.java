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
package com.amazonaws.services.finspacedata.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.finspacedata.model.*;

import com.amazonaws.util.IdempotentUtils;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CreateDatasetRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreateDatasetRequestMarshaller {

    private static final MarshallingInfo<String> CLIENTTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("clientToken")
            .defaultValueSupplier(com.amazonaws.util.IdempotentUtils.getGenerator()).build();
    private static final MarshallingInfo<String> DATASETTITLE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("datasetTitle").build();
    private static final MarshallingInfo<String> KIND_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("kind").build();
    private static final MarshallingInfo<String> DATASETDESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("datasetDescription").build();
    private static final MarshallingInfo<StructuredPojo> OWNERINFO_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ownerInfo").build();
    private static final MarshallingInfo<StructuredPojo> PERMISSIONGROUPPARAMS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("permissionGroupParams").build();
    private static final MarshallingInfo<String> ALIAS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("alias").build();
    private static final MarshallingInfo<StructuredPojo> SCHEMADEFINITION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("schemaDefinition").build();

    private static final CreateDatasetRequestMarshaller instance = new CreateDatasetRequestMarshaller();

    public static CreateDatasetRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreateDatasetRequest createDatasetRequest, ProtocolMarshaller protocolMarshaller) {

        if (createDatasetRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createDatasetRequest.getClientToken(), CLIENTTOKEN_BINDING);
            protocolMarshaller.marshall(createDatasetRequest.getDatasetTitle(), DATASETTITLE_BINDING);
            protocolMarshaller.marshall(createDatasetRequest.getKind(), KIND_BINDING);
            protocolMarshaller.marshall(createDatasetRequest.getDatasetDescription(), DATASETDESCRIPTION_BINDING);
            protocolMarshaller.marshall(createDatasetRequest.getOwnerInfo(), OWNERINFO_BINDING);
            protocolMarshaller.marshall(createDatasetRequest.getPermissionGroupParams(), PERMISSIONGROUPPARAMS_BINDING);
            protocolMarshaller.marshall(createDatasetRequest.getAlias(), ALIAS_BINDING);
            protocolMarshaller.marshall(createDatasetRequest.getSchemaDefinition(), SCHEMADEFINITION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
