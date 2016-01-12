/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.elastictranscoder.model.transform;

import static com.amazonaws.util.StringUtils.UTF8;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Map;
import java.util.List;

import com.amazonaws.AmazonClientException;
import com.amazonaws.services.elastictranscoder.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.*;

/**
 * CreateJobOutputMarshaller
 */
public class CreateJobOutputJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a JSONWriter
     */
    public void marshall(CreateJobOutput createJobOutput, JSONWriter jsonWriter) {
        if (createJobOutput == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        try {
            jsonWriter.object();

            if (createJobOutput.getKey() != null) {
                jsonWriter.key("Key").value(createJobOutput.getKey());
            }

            if (createJobOutput.getThumbnailPattern() != null) {
                jsonWriter.key("ThumbnailPattern").value(
                        createJobOutput.getThumbnailPattern());
            }

            if (createJobOutput.getThumbnailEncryption() != null) {
                jsonWriter.key("ThumbnailEncryption");
                EncryptionJsonMarshaller.getInstance().marshall(
                        createJobOutput.getThumbnailEncryption(), jsonWriter);
            }

            if (createJobOutput.getRotate() != null) {
                jsonWriter.key("Rotate").value(createJobOutput.getRotate());
            }

            if (createJobOutput.getPresetId() != null) {
                jsonWriter.key("PresetId").value(createJobOutput.getPresetId());
            }

            if (createJobOutput.getSegmentDuration() != null) {
                jsonWriter.key("SegmentDuration").value(
                        createJobOutput.getSegmentDuration());
            }

            com.amazonaws.internal.SdkInternalList<JobWatermark> watermarksList = (com.amazonaws.internal.SdkInternalList<JobWatermark>) createJobOutput
                    .getWatermarks();
            if (!watermarksList.isEmpty() || !watermarksList.isAutoConstruct()) {
                jsonWriter.key("Watermarks");
                jsonWriter.array();
                for (JobWatermark watermarksListValue : watermarksList) {
                    if (watermarksListValue != null) {

                        JobWatermarkJsonMarshaller.getInstance().marshall(
                                watermarksListValue, jsonWriter);
                    }
                }
                jsonWriter.endArray();
            }

            if (createJobOutput.getAlbumArt() != null) {
                jsonWriter.key("AlbumArt");
                JobAlbumArtJsonMarshaller.getInstance().marshall(
                        createJobOutput.getAlbumArt(), jsonWriter);
            }

            com.amazonaws.internal.SdkInternalList<Clip> compositionList = (com.amazonaws.internal.SdkInternalList<Clip>) createJobOutput
                    .getComposition();
            if (!compositionList.isEmpty()
                    || !compositionList.isAutoConstruct()) {
                jsonWriter.key("Composition");
                jsonWriter.array();
                for (Clip compositionListValue : compositionList) {
                    if (compositionListValue != null) {

                        ClipJsonMarshaller.getInstance().marshall(
                                compositionListValue, jsonWriter);
                    }
                }
                jsonWriter.endArray();
            }

            if (createJobOutput.getCaptions() != null) {
                jsonWriter.key("Captions");
                CaptionsJsonMarshaller.getInstance().marshall(
                        createJobOutput.getCaptions(), jsonWriter);
            }

            if (createJobOutput.getEncryption() != null) {
                jsonWriter.key("Encryption");
                EncryptionJsonMarshaller.getInstance().marshall(
                        createJobOutput.getEncryption(), jsonWriter);
            }

            jsonWriter.endObject();
        } catch (Throwable t) {
            throw new AmazonClientException(
                    "Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static CreateJobOutputJsonMarshaller instance;

    public static CreateJobOutputJsonMarshaller getInstance() {
        if (instance == null)
            instance = new CreateJobOutputJsonMarshaller();
        return instance;
    }

}
