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
package com.amazonaws.services.codecommit.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.codecommit.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * SymbolicLinkMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class SymbolicLinkMarshaller {

    private static final MarshallingInfo<String> BLOBID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("blobId").build();
    private static final MarshallingInfo<String> ABSOLUTEPATH_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("absolutePath").build();
    private static final MarshallingInfo<String> RELATIVEPATH_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("relativePath").build();
    private static final MarshallingInfo<String> FILEMODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("fileMode").build();

    private static final SymbolicLinkMarshaller instance = new SymbolicLinkMarshaller();

    public static SymbolicLinkMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(SymbolicLink symbolicLink, ProtocolMarshaller protocolMarshaller) {

        if (symbolicLink == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(symbolicLink.getBlobId(), BLOBID_BINDING);
            protocolMarshaller.marshall(symbolicLink.getAbsolutePath(), ABSOLUTEPATH_BINDING);
            protocolMarshaller.marshall(symbolicLink.getRelativePath(), RELATIVEPATH_BINDING);
            protocolMarshaller.marshall(symbolicLink.getFileMode(), FILEMODE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
