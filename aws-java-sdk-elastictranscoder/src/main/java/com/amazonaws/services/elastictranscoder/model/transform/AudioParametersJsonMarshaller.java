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
 * AudioParametersMarshaller
 */
public class AudioParametersJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(AudioParameters audioParameters, StructuredJsonGenerator jsonGenerator) {

        if (audioParameters == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (audioParameters.getCodec() != null) {
                jsonGenerator.writeFieldName("Codec").writeValue(audioParameters.getCodec());
            }
            if (audioParameters.getSampleRate() != null) {
                jsonGenerator.writeFieldName("SampleRate").writeValue(audioParameters.getSampleRate());
            }
            if (audioParameters.getBitRate() != null) {
                jsonGenerator.writeFieldName("BitRate").writeValue(audioParameters.getBitRate());
            }
            if (audioParameters.getChannels() != null) {
                jsonGenerator.writeFieldName("Channels").writeValue(audioParameters.getChannels());
            }
            if (audioParameters.getAudioPackingMode() != null) {
                jsonGenerator.writeFieldName("AudioPackingMode").writeValue(audioParameters.getAudioPackingMode());
            }
            if (audioParameters.getCodecOptions() != null) {
                jsonGenerator.writeFieldName("CodecOptions");
                AudioCodecOptionsJsonMarshaller.getInstance().marshall(audioParameters.getCodecOptions(), jsonGenerator);
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static AudioParametersJsonMarshaller instance;

    public static AudioParametersJsonMarshaller getInstance() {
        if (instance == null)
            instance = new AudioParametersJsonMarshaller();
        return instance;
    }

}
