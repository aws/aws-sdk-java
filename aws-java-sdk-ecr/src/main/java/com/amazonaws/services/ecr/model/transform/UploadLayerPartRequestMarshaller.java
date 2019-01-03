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
package com.amazonaws.services.ecr.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.ecr.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * UploadLayerPartRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UploadLayerPartRequestMarshaller {

    private static final MarshallingInfo<String> REGISTRYID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("registryId").build();
    private static final MarshallingInfo<String> REPOSITORYNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("repositoryName").build();
    private static final MarshallingInfo<String> UPLOADID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("uploadId").build();
    private static final MarshallingInfo<Long> PARTFIRSTBYTE_BINDING = MarshallingInfo.builder(MarshallingType.LONG).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("partFirstByte").build();
    private static final MarshallingInfo<Long> PARTLASTBYTE_BINDING = MarshallingInfo.builder(MarshallingType.LONG).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("partLastByte").build();
    private static final MarshallingInfo<java.nio.ByteBuffer> LAYERPARTBLOB_BINDING = MarshallingInfo.builder(MarshallingType.BYTE_BUFFER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("layerPartBlob").build();

    private static final UploadLayerPartRequestMarshaller instance = new UploadLayerPartRequestMarshaller();

    public static UploadLayerPartRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UploadLayerPartRequest uploadLayerPartRequest, ProtocolMarshaller protocolMarshaller) {

        if (uploadLayerPartRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(uploadLayerPartRequest.getRegistryId(), REGISTRYID_BINDING);
            protocolMarshaller.marshall(uploadLayerPartRequest.getRepositoryName(), REPOSITORYNAME_BINDING);
            protocolMarshaller.marshall(uploadLayerPartRequest.getUploadId(), UPLOADID_BINDING);
            protocolMarshaller.marshall(uploadLayerPartRequest.getPartFirstByte(), PARTFIRSTBYTE_BINDING);
            protocolMarshaller.marshall(uploadLayerPartRequest.getPartLastByte(), PARTLASTBYTE_BINDING);
            protocolMarshaller.marshall(uploadLayerPartRequest.getLayerPartBlob(), LAYERPARTBLOB_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
