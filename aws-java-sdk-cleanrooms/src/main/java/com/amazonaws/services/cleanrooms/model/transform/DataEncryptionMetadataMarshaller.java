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
package com.amazonaws.services.cleanrooms.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.cleanrooms.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * DataEncryptionMetadataMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class DataEncryptionMetadataMarshaller {

    private static final MarshallingInfo<Boolean> ALLOWCLEARTEXT_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("allowCleartext").build();
    private static final MarshallingInfo<Boolean> ALLOWDUPLICATES_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("allowDuplicates").build();
    private static final MarshallingInfo<Boolean> ALLOWJOINSONCOLUMNSWITHDIFFERENTNAMES_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("allowJoinsOnColumnsWithDifferentNames").build();
    private static final MarshallingInfo<Boolean> PRESERVENULLS_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("preserveNulls").build();

    private static final DataEncryptionMetadataMarshaller instance = new DataEncryptionMetadataMarshaller();

    public static DataEncryptionMetadataMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(DataEncryptionMetadata dataEncryptionMetadata, ProtocolMarshaller protocolMarshaller) {

        if (dataEncryptionMetadata == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(dataEncryptionMetadata.getAllowCleartext(), ALLOWCLEARTEXT_BINDING);
            protocolMarshaller.marshall(dataEncryptionMetadata.getAllowDuplicates(), ALLOWDUPLICATES_BINDING);
            protocolMarshaller.marshall(dataEncryptionMetadata.getAllowJoinsOnColumnsWithDifferentNames(), ALLOWJOINSONCOLUMNSWITHDIFFERENTNAMES_BINDING);
            protocolMarshaller.marshall(dataEncryptionMetadata.getPreserveNulls(), PRESERVENULLS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
