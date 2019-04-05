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
package com.amazonaws.services.elastictranscoder.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.elastictranscoder.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CreateJobOutputMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreateJobOutputMarshaller {

    private static final MarshallingInfo<String> KEY_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Key").build();
    private static final MarshallingInfo<String> THUMBNAILPATTERN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ThumbnailPattern").build();
    private static final MarshallingInfo<StructuredPojo> THUMBNAILENCRYPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ThumbnailEncryption").build();
    private static final MarshallingInfo<String> ROTATE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Rotate").build();
    private static final MarshallingInfo<String> PRESETID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("PresetId").build();
    private static final MarshallingInfo<String> SEGMENTDURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SegmentDuration").build();
    private static final MarshallingInfo<List> WATERMARKS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Watermarks").build();
    private static final MarshallingInfo<StructuredPojo> ALBUMART_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AlbumArt").build();
    private static final MarshallingInfo<List> COMPOSITION_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Composition").build();
    private static final MarshallingInfo<StructuredPojo> CAPTIONS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Captions").build();
    private static final MarshallingInfo<StructuredPojo> ENCRYPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Encryption").build();

    private static final CreateJobOutputMarshaller instance = new CreateJobOutputMarshaller();

    public static CreateJobOutputMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreateJobOutput createJobOutput, ProtocolMarshaller protocolMarshaller) {

        if (createJobOutput == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createJobOutput.getKey(), KEY_BINDING);
            protocolMarshaller.marshall(createJobOutput.getThumbnailPattern(), THUMBNAILPATTERN_BINDING);
            protocolMarshaller.marshall(createJobOutput.getThumbnailEncryption(), THUMBNAILENCRYPTION_BINDING);
            protocolMarshaller.marshall(createJobOutput.getRotate(), ROTATE_BINDING);
            protocolMarshaller.marshall(createJobOutput.getPresetId(), PRESETID_BINDING);
            protocolMarshaller.marshall(createJobOutput.getSegmentDuration(), SEGMENTDURATION_BINDING);
            protocolMarshaller.marshall(createJobOutput.getWatermarks(), WATERMARKS_BINDING);
            protocolMarshaller.marshall(createJobOutput.getAlbumArt(), ALBUMART_BINDING);
            protocolMarshaller.marshall(createJobOutput.getComposition(), COMPOSITION_BINDING);
            protocolMarshaller.marshall(createJobOutput.getCaptions(), CAPTIONS_BINDING);
            protocolMarshaller.marshall(createJobOutput.getEncryption(), ENCRYPTION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
