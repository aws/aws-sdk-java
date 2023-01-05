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
package com.amazonaws.services.kinesisvideo.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.kinesisvideo.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * DeletionConfigMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class DeletionConfigMarshaller {

    private static final MarshallingInfo<Integer> EDGERETENTIONINHOURS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EdgeRetentionInHours").build();
    private static final MarshallingInfo<StructuredPojo> LOCALSIZECONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LocalSizeConfig").build();
    private static final MarshallingInfo<Boolean> DELETEAFTERUPLOAD_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DeleteAfterUpload").build();

    private static final DeletionConfigMarshaller instance = new DeletionConfigMarshaller();

    public static DeletionConfigMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(DeletionConfig deletionConfig, ProtocolMarshaller protocolMarshaller) {

        if (deletionConfig == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(deletionConfig.getEdgeRetentionInHours(), EDGERETENTIONINHOURS_BINDING);
            protocolMarshaller.marshall(deletionConfig.getLocalSizeConfig(), LOCALSIZECONFIG_BINDING);
            protocolMarshaller.marshall(deletionConfig.getDeleteAfterUpload(), DELETEAFTERUPLOAD_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
