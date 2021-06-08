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
package com.amazonaws.services.appstream.model.transform;

import java.util.Map;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.appstream.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CreateUpdatedImageRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreateUpdatedImageRequestMarshaller {

    private static final MarshallingInfo<String> EXISTINGIMAGENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("existingImageName").build();
    private static final MarshallingInfo<String> NEWIMAGENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("newImageName").build();
    private static final MarshallingInfo<String> NEWIMAGEDESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("newImageDescription").build();
    private static final MarshallingInfo<String> NEWIMAGEDISPLAYNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("newImageDisplayName").build();
    private static final MarshallingInfo<Map> NEWIMAGETAGS_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("newImageTags").build();
    private static final MarshallingInfo<Boolean> DRYRUN_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("dryRun").build();

    private static final CreateUpdatedImageRequestMarshaller instance = new CreateUpdatedImageRequestMarshaller();

    public static CreateUpdatedImageRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreateUpdatedImageRequest createUpdatedImageRequest, ProtocolMarshaller protocolMarshaller) {

        if (createUpdatedImageRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createUpdatedImageRequest.getExistingImageName(), EXISTINGIMAGENAME_BINDING);
            protocolMarshaller.marshall(createUpdatedImageRequest.getNewImageName(), NEWIMAGENAME_BINDING);
            protocolMarshaller.marshall(createUpdatedImageRequest.getNewImageDescription(), NEWIMAGEDESCRIPTION_BINDING);
            protocolMarshaller.marshall(createUpdatedImageRequest.getNewImageDisplayName(), NEWIMAGEDISPLAYNAME_BINDING);
            protocolMarshaller.marshall(createUpdatedImageRequest.getNewImageTags(), NEWIMAGETAGS_BINDING);
            protocolMarshaller.marshall(createUpdatedImageRequest.getDryRun(), DRYRUN_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
