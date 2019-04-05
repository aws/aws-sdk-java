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
 * JobOutputMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class JobOutputMarshaller {

    private static final MarshallingInfo<String> ID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Id").build();
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
    private static final MarshallingInfo<String> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Status").build();
    private static final MarshallingInfo<String> STATUSDETAIL_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StatusDetail").build();
    private static final MarshallingInfo<Long> DURATION_BINDING = MarshallingInfo.builder(MarshallingType.LONG).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Duration").build();
    private static final MarshallingInfo<Integer> WIDTH_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Width").build();
    private static final MarshallingInfo<Integer> HEIGHT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Height").build();
    private static final MarshallingInfo<String> FRAMERATE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("FrameRate").build();
    private static final MarshallingInfo<Long> FILESIZE_BINDING = MarshallingInfo.builder(MarshallingType.LONG).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("FileSize").build();
    private static final MarshallingInfo<Long> DURATIONMILLIS_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DurationMillis").build();
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
    private static final MarshallingInfo<String> APPLIEDCOLORSPACECONVERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AppliedColorSpaceConversion").build();

    private static final JobOutputMarshaller instance = new JobOutputMarshaller();

    public static JobOutputMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(JobOutput jobOutput, ProtocolMarshaller protocolMarshaller) {

        if (jobOutput == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(jobOutput.getId(), ID_BINDING);
            protocolMarshaller.marshall(jobOutput.getKey(), KEY_BINDING);
            protocolMarshaller.marshall(jobOutput.getThumbnailPattern(), THUMBNAILPATTERN_BINDING);
            protocolMarshaller.marshall(jobOutput.getThumbnailEncryption(), THUMBNAILENCRYPTION_BINDING);
            protocolMarshaller.marshall(jobOutput.getRotate(), ROTATE_BINDING);
            protocolMarshaller.marshall(jobOutput.getPresetId(), PRESETID_BINDING);
            protocolMarshaller.marshall(jobOutput.getSegmentDuration(), SEGMENTDURATION_BINDING);
            protocolMarshaller.marshall(jobOutput.getStatus(), STATUS_BINDING);
            protocolMarshaller.marshall(jobOutput.getStatusDetail(), STATUSDETAIL_BINDING);
            protocolMarshaller.marshall(jobOutput.getDuration(), DURATION_BINDING);
            protocolMarshaller.marshall(jobOutput.getWidth(), WIDTH_BINDING);
            protocolMarshaller.marshall(jobOutput.getHeight(), HEIGHT_BINDING);
            protocolMarshaller.marshall(jobOutput.getFrameRate(), FRAMERATE_BINDING);
            protocolMarshaller.marshall(jobOutput.getFileSize(), FILESIZE_BINDING);
            protocolMarshaller.marshall(jobOutput.getDurationMillis(), DURATIONMILLIS_BINDING);
            protocolMarshaller.marshall(jobOutput.getWatermarks(), WATERMARKS_BINDING);
            protocolMarshaller.marshall(jobOutput.getAlbumArt(), ALBUMART_BINDING);
            protocolMarshaller.marshall(jobOutput.getComposition(), COMPOSITION_BINDING);
            protocolMarshaller.marshall(jobOutput.getCaptions(), CAPTIONS_BINDING);
            protocolMarshaller.marshall(jobOutput.getEncryption(), ENCRYPTION_BINDING);
            protocolMarshaller.marshall(jobOutput.getAppliedColorSpaceConversion(), APPLIEDCOLORSPACECONVERSION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
