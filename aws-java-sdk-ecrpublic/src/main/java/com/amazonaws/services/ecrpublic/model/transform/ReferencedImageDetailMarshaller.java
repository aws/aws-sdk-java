/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ecrpublic.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.ecrpublic.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ReferencedImageDetailMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ReferencedImageDetailMarshaller {

    private static final MarshallingInfo<String> IMAGEDIGEST_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("imageDigest").build();
    private static final MarshallingInfo<Long> IMAGESIZEINBYTES_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("imageSizeInBytes").build();
    private static final MarshallingInfo<java.util.Date> IMAGEPUSHEDAT_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("imagePushedAt").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> IMAGEMANIFESTMEDIATYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("imageManifestMediaType").build();
    private static final MarshallingInfo<String> ARTIFACTMEDIATYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("artifactMediaType").build();

    private static final ReferencedImageDetailMarshaller instance = new ReferencedImageDetailMarshaller();

    public static ReferencedImageDetailMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ReferencedImageDetail referencedImageDetail, ProtocolMarshaller protocolMarshaller) {

        if (referencedImageDetail == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(referencedImageDetail.getImageDigest(), IMAGEDIGEST_BINDING);
            protocolMarshaller.marshall(referencedImageDetail.getImageSizeInBytes(), IMAGESIZEINBYTES_BINDING);
            protocolMarshaller.marshall(referencedImageDetail.getImagePushedAt(), IMAGEPUSHEDAT_BINDING);
            protocolMarshaller.marshall(referencedImageDetail.getImageManifestMediaType(), IMAGEMANIFESTMEDIATYPE_BINDING);
            protocolMarshaller.marshall(referencedImageDetail.getArtifactMediaType(), ARTIFACTMEDIATYPE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
