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
 * CreateJobOutputMarshaller
 */
public class CreateJobOutputJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(CreateJobOutput createJobOutput, StructuredJsonGenerator jsonGenerator) {

        if (createJobOutput == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (createJobOutput.getKey() != null) {
                jsonGenerator.writeFieldName("Key").writeValue(createJobOutput.getKey());
            }
            if (createJobOutput.getThumbnailPattern() != null) {
                jsonGenerator.writeFieldName("ThumbnailPattern").writeValue(createJobOutput.getThumbnailPattern());
            }
            if (createJobOutput.getThumbnailEncryption() != null) {
                jsonGenerator.writeFieldName("ThumbnailEncryption");
                EncryptionJsonMarshaller.getInstance().marshall(createJobOutput.getThumbnailEncryption(), jsonGenerator);
            }
            if (createJobOutput.getRotate() != null) {
                jsonGenerator.writeFieldName("Rotate").writeValue(createJobOutput.getRotate());
            }
            if (createJobOutput.getPresetId() != null) {
                jsonGenerator.writeFieldName("PresetId").writeValue(createJobOutput.getPresetId());
            }
            if (createJobOutput.getSegmentDuration() != null) {
                jsonGenerator.writeFieldName("SegmentDuration").writeValue(createJobOutput.getSegmentDuration());
            }

            com.amazonaws.internal.SdkInternalList<JobWatermark> watermarksList = (com.amazonaws.internal.SdkInternalList<JobWatermark>) createJobOutput
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
            if (createJobOutput.getAlbumArt() != null) {
                jsonGenerator.writeFieldName("AlbumArt");
                JobAlbumArtJsonMarshaller.getInstance().marshall(createJobOutput.getAlbumArt(), jsonGenerator);
            }

            com.amazonaws.internal.SdkInternalList<Clip> compositionList = (com.amazonaws.internal.SdkInternalList<Clip>) createJobOutput.getComposition();
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
            if (createJobOutput.getCaptions() != null) {
                jsonGenerator.writeFieldName("Captions");
                CaptionsJsonMarshaller.getInstance().marshall(createJobOutput.getCaptions(), jsonGenerator);
            }
            if (createJobOutput.getEncryption() != null) {
                jsonGenerator.writeFieldName("Encryption");
                EncryptionJsonMarshaller.getInstance().marshall(createJobOutput.getEncryption(), jsonGenerator);
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static CreateJobOutputJsonMarshaller instance;

    public static CreateJobOutputJsonMarshaller getInstance() {
        if (instance == null)
            instance = new CreateJobOutputJsonMarshaller();
        return instance;
    }

}
