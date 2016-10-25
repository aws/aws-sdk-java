/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import java.util.Map;
import java.util.List;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.elastictranscoder.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * JobOutputMarshaller
 */
public class JobOutputJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(JobOutput jobOutput, StructuredJsonGenerator jsonGenerator) {

        if (jobOutput == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (jobOutput.getId() != null) {
                jsonGenerator.writeFieldName("Id").writeValue(jobOutput.getId());
            }
            if (jobOutput.getKey() != null) {
                jsonGenerator.writeFieldName("Key").writeValue(jobOutput.getKey());
            }
            if (jobOutput.getThumbnailPattern() != null) {
                jsonGenerator.writeFieldName("ThumbnailPattern").writeValue(jobOutput.getThumbnailPattern());
            }
            if (jobOutput.getThumbnailEncryption() != null) {
                jsonGenerator.writeFieldName("ThumbnailEncryption");
                EncryptionJsonMarshaller.getInstance().marshall(jobOutput.getThumbnailEncryption(), jsonGenerator);
            }
            if (jobOutput.getRotate() != null) {
                jsonGenerator.writeFieldName("Rotate").writeValue(jobOutput.getRotate());
            }
            if (jobOutput.getPresetId() != null) {
                jsonGenerator.writeFieldName("PresetId").writeValue(jobOutput.getPresetId());
            }
            if (jobOutput.getSegmentDuration() != null) {
                jsonGenerator.writeFieldName("SegmentDuration").writeValue(jobOutput.getSegmentDuration());
            }
            if (jobOutput.getStatus() != null) {
                jsonGenerator.writeFieldName("Status").writeValue(jobOutput.getStatus());
            }
            if (jobOutput.getStatusDetail() != null) {
                jsonGenerator.writeFieldName("StatusDetail").writeValue(jobOutput.getStatusDetail());
            }
            if (jobOutput.getDuration() != null) {
                jsonGenerator.writeFieldName("Duration").writeValue(jobOutput.getDuration());
            }
            if (jobOutput.getWidth() != null) {
                jsonGenerator.writeFieldName("Width").writeValue(jobOutput.getWidth());
            }
            if (jobOutput.getHeight() != null) {
                jsonGenerator.writeFieldName("Height").writeValue(jobOutput.getHeight());
            }
            if (jobOutput.getFrameRate() != null) {
                jsonGenerator.writeFieldName("FrameRate").writeValue(jobOutput.getFrameRate());
            }
            if (jobOutput.getFileSize() != null) {
                jsonGenerator.writeFieldName("FileSize").writeValue(jobOutput.getFileSize());
            }
            if (jobOutput.getDurationMillis() != null) {
                jsonGenerator.writeFieldName("DurationMillis").writeValue(jobOutput.getDurationMillis());
            }

            com.amazonaws.internal.SdkInternalList<JobWatermark> watermarksList = (com.amazonaws.internal.SdkInternalList<JobWatermark>) jobOutput
                    .getWatermarks();
            if (!watermarksList.isEmpty() || !watermarksList.isAutoConstruct()) {
                jsonGenerator.writeFieldName("Watermarks");
                jsonGenerator.writeStartArray();
                for (JobWatermark watermarksListValue : watermarksList) {
                    if (watermarksListValue != null) {

                        JobWatermarkJsonMarshaller.getInstance().marshall(watermarksListValue, jsonGenerator);
                    }
                }
                jsonGenerator.writeEndArray();
            }
            if (jobOutput.getAlbumArt() != null) {
                jsonGenerator.writeFieldName("AlbumArt");
                JobAlbumArtJsonMarshaller.getInstance().marshall(jobOutput.getAlbumArt(), jsonGenerator);
            }

            com.amazonaws.internal.SdkInternalList<Clip> compositionList = (com.amazonaws.internal.SdkInternalList<Clip>) jobOutput.getComposition();
            if (!compositionList.isEmpty() || !compositionList.isAutoConstruct()) {
                jsonGenerator.writeFieldName("Composition");
                jsonGenerator.writeStartArray();
                for (Clip compositionListValue : compositionList) {
                    if (compositionListValue != null) {

                        ClipJsonMarshaller.getInstance().marshall(compositionListValue, jsonGenerator);
                    }
                }
                jsonGenerator.writeEndArray();
            }
            if (jobOutput.getCaptions() != null) {
                jsonGenerator.writeFieldName("Captions");
                CaptionsJsonMarshaller.getInstance().marshall(jobOutput.getCaptions(), jsonGenerator);
            }
            if (jobOutput.getEncryption() != null) {
                jsonGenerator.writeFieldName("Encryption");
                EncryptionJsonMarshaller.getInstance().marshall(jobOutput.getEncryption(), jsonGenerator);
            }
            if (jobOutput.getAppliedColorSpaceConversion() != null) {
                jsonGenerator.writeFieldName("AppliedColorSpaceConversion").writeValue(jobOutput.getAppliedColorSpaceConversion());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static JobOutputJsonMarshaller instance;

    public static JobOutputJsonMarshaller getInstance() {
        if (instance == null)
            instance = new JobOutputJsonMarshaller();
        return instance;
    }

}
