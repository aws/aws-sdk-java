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
 * AudioParametersMarshaller
 */
public class AudioParametersJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a JSONWriter
     */
    public void marshall(AudioParameters audioParameters, JSONWriter jsonWriter) {
        if (audioParameters == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        try {
            jsonWriter.object();

            if (audioParameters.getCodec() != null) {
                jsonWriter.key("Codec").value(audioParameters.getCodec());
            }

            if (audioParameters.getSampleRate() != null) {
                jsonWriter.key("SampleRate").value(
                        audioParameters.getSampleRate());
            }

            if (audioParameters.getBitRate() != null) {
                jsonWriter.key("BitRate").value(audioParameters.getBitRate());
            }

            if (audioParameters.getChannels() != null) {
                jsonWriter.key("Channels").value(audioParameters.getChannels());
            }

            if (audioParameters.getAudioPackingMode() != null) {
                jsonWriter.key("AudioPackingMode").value(
                        audioParameters.getAudioPackingMode());
            }

            if (audioParameters.getCodecOptions() != null) {
                jsonWriter.key("CodecOptions");
                AudioCodecOptionsJsonMarshaller.getInstance().marshall(
                        audioParameters.getCodecOptions(), jsonWriter);
            }

            jsonWriter.endObject();
        } catch (Throwable t) {
            throw new AmazonClientException(
                    "Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static AudioParametersJsonMarshaller instance;

    public static AudioParametersJsonMarshaller getInstance() {
        if (instance == null)
            instance = new AudioParametersJsonMarshaller();
        return instance;
    }

}
