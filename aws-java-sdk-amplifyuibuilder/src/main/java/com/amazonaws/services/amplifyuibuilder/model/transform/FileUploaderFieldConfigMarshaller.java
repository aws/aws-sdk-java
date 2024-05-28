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
package com.amazonaws.services.amplifyuibuilder.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.amplifyuibuilder.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * FileUploaderFieldConfigMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class FileUploaderFieldConfigMarshaller {

    private static final MarshallingInfo<String> ACCESSLEVEL_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("accessLevel").build();
    private static final MarshallingInfo<List> ACCEPTEDFILETYPES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("acceptedFileTypes").build();
    private static final MarshallingInfo<Boolean> SHOWTHUMBNAILS_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("showThumbnails").build();
    private static final MarshallingInfo<Boolean> ISRESUMABLE_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("isResumable").build();
    private static final MarshallingInfo<Integer> MAXFILECOUNT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("maxFileCount").build();
    private static final MarshallingInfo<Integer> MAXSIZE_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("maxSize").build();

    private static final FileUploaderFieldConfigMarshaller instance = new FileUploaderFieldConfigMarshaller();

    public static FileUploaderFieldConfigMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(FileUploaderFieldConfig fileUploaderFieldConfig, ProtocolMarshaller protocolMarshaller) {

        if (fileUploaderFieldConfig == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(fileUploaderFieldConfig.getAccessLevel(), ACCESSLEVEL_BINDING);
            protocolMarshaller.marshall(fileUploaderFieldConfig.getAcceptedFileTypes(), ACCEPTEDFILETYPES_BINDING);
            protocolMarshaller.marshall(fileUploaderFieldConfig.getShowThumbnails(), SHOWTHUMBNAILS_BINDING);
            protocolMarshaller.marshall(fileUploaderFieldConfig.getIsResumable(), ISRESUMABLE_BINDING);
            protocolMarshaller.marshall(fileUploaderFieldConfig.getMaxFileCount(), MAXFILECOUNT_BINDING);
            protocolMarshaller.marshall(fileUploaderFieldConfig.getMaxSize(), MAXSIZE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
