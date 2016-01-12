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
 * JobOutputMarshaller
 */
public class JobOutputJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a JSONWriter
     */
    public void marshall(JobOutput jobOutput, JSONWriter jsonWriter) {
        if (jobOutput == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        try {
            jsonWriter.object();

            if (jobOutput.getId() != null) {
                jsonWriter.key("Id").value(jobOutput.getId());
            }

            if (jobOutput.getKey() != null) {
                jsonWriter.key("Key").value(jobOutput.getKey());
            }

            if (jobOutput.getThumbnailPattern() != null) {
                jsonWriter.key("ThumbnailPattern").value(
                        jobOutput.getThumbnailPattern());
            }

            if (jobOutput.getThumbnailEncryption() != null) {
                jsonWriter.key("ThumbnailEncryption");
                EncryptionJsonMarshaller.getInstance().marshall(
                        jobOutput.getThumbnailEncryption(), jsonWriter);
            }

            if (jobOutput.getRotate() != null) {
                jsonWriter.key("Rotate").value(jobOutput.getRotate());
            }

            if (jobOutput.getPresetId() != null) {
                jsonWriter.key("PresetId").value(jobOutput.getPresetId());
            }

            if (jobOutput.getSegmentDuration() != null) {
                jsonWriter.key("SegmentDuration").value(
                        jobOutput.getSegmentDuration());
            }

            if (jobOutput.getStatus() != null) {
                jsonWriter.key("Status").value(jobOutput.getStatus());
            }

            if (jobOutput.getStatusDetail() != null) {
                jsonWriter.key("StatusDetail").value(
                        jobOutput.getStatusDetail());
            }

            if (jobOutput.getDuration() != null) {
                jsonWriter.key("Duration").value(jobOutput.getDuration());
            }

            if (jobOutput.getWidth() != null) {
                jsonWriter.key("Width").value(jobOutput.getWidth());
            }

            if (jobOutput.getHeight() != null) {
                jsonWriter.key("Height").value(jobOutput.getHeight());
            }

            if (jobOutput.getFrameRate() != null) {
                jsonWriter.key("FrameRate").value(jobOutput.getFrameRate());
            }

            if (jobOutput.getFileSize() != null) {
                jsonWriter.key("FileSize").value(jobOutput.getFileSize());
            }

            if (jobOutput.getDurationMillis() != null) {
                jsonWriter.key("DurationMillis").value(
                        jobOutput.getDurationMillis());
            }

            com.amazonaws.internal.SdkInternalList<JobWatermark> watermarksList = (com.amazonaws.internal.SdkInternalList<JobWatermark>) jobOutput
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

            if (jobOutput.getAlbumArt() != null) {
                jsonWriter.key("AlbumArt");
                JobAlbumArtJsonMarshaller.getInstance().marshall(
                        jobOutput.getAlbumArt(), jsonWriter);
            }

            com.amazonaws.internal.SdkInternalList<Clip> compositionList = (com.amazonaws.internal.SdkInternalList<Clip>) jobOutput
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

            if (jobOutput.getCaptions() != null) {
                jsonWriter.key("Captions");
                CaptionsJsonMarshaller.getInstance().marshall(
                        jobOutput.getCaptions(), jsonWriter);
            }

            if (jobOutput.getEncryption() != null) {
                jsonWriter.key("Encryption");
                EncryptionJsonMarshaller.getInstance().marshall(
                        jobOutput.getEncryption(), jsonWriter);
            }

            if (jobOutput.getAppliedColorSpaceConversion() != null) {
                jsonWriter.key("AppliedColorSpaceConversion").value(
                        jobOutput.getAppliedColorSpaceConversion());
            }

            jsonWriter.endObject();
        } catch (Throwable t) {
            throw new AmazonClientException(
                    "Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static JobOutputJsonMarshaller instance;

    public static JobOutputJsonMarshaller getInstance() {
        if (instance == null)
            instance = new JobOutputJsonMarshaller();
        return instance;
    }

}
