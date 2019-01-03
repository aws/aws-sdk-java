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
package com.amazonaws.services.kinesisanalyticsv2.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.kinesisanalyticsv2.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CodeContentUpdateMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CodeContentUpdateMarshaller {

    private static final MarshallingInfo<String> TEXTCONTENTUPDATE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TextContentUpdate").build();
    private static final MarshallingInfo<java.nio.ByteBuffer> ZIPFILECONTENTUPDATE_BINDING = MarshallingInfo.builder(MarshallingType.BYTE_BUFFER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ZipFileContentUpdate").build();
    private static final MarshallingInfo<StructuredPojo> S3CONTENTLOCATIONUPDATE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("S3ContentLocationUpdate").build();

    private static final CodeContentUpdateMarshaller instance = new CodeContentUpdateMarshaller();

    public static CodeContentUpdateMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CodeContentUpdate codeContentUpdate, ProtocolMarshaller protocolMarshaller) {

        if (codeContentUpdate == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(codeContentUpdate.getTextContentUpdate(), TEXTCONTENTUPDATE_BINDING);
            protocolMarshaller.marshall(codeContentUpdate.getZipFileContentUpdate(), ZIPFILECONTENTUPDATE_BINDING);
            protocolMarshaller.marshall(codeContentUpdate.getS3ContentLocationUpdate(), S3CONTENTLOCATIONUPDATE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
