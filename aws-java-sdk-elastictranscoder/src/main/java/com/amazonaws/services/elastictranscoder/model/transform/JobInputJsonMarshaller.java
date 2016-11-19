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
 * JobInputMarshaller
 */
public class JobInputJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(JobInput jobInput, StructuredJsonGenerator jsonGenerator) {

        if (jobInput == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (jobInput.getKey() != null) {
                jsonGenerator.writeFieldName("Key").writeValue(jobInput.getKey());
            }
            if (jobInput.getFrameRate() != null) {
                jsonGenerator.writeFieldName("FrameRate").writeValue(jobInput.getFrameRate());
            }
            if (jobInput.getResolution() != null) {
                jsonGenerator.writeFieldName("Resolution").writeValue(jobInput.getResolution());
            }
            if (jobInput.getAspectRatio() != null) {
                jsonGenerator.writeFieldName("AspectRatio").writeValue(jobInput.getAspectRatio());
            }
            if (jobInput.getInterlaced() != null) {
                jsonGenerator.writeFieldName("Interlaced").writeValue(jobInput.getInterlaced());
            }
            if (jobInput.getContainer() != null) {
                jsonGenerator.writeFieldName("Container").writeValue(jobInput.getContainer());
            }
            if (jobInput.getEncryption() != null) {
                jsonGenerator.writeFieldName("Encryption");
                EncryptionJsonMarshaller.getInstance().marshall(jobInput.getEncryption(), jsonGenerator);
            }
            if (jobInput.getTimeSpan() != null) {
                jsonGenerator.writeFieldName("TimeSpan");
                TimeSpanJsonMarshaller.getInstance().marshall(jobInput.getTimeSpan(), jsonGenerator);
            }
            if (jobInput.getInputCaptions() != null) {
                jsonGenerator.writeFieldName("InputCaptions");
                InputCaptionsJsonMarshaller.getInstance().marshall(jobInput.getInputCaptions(), jsonGenerator);
            }
            if (jobInput.getDetectedProperties() != null) {
                jsonGenerator.writeFieldName("DetectedProperties");
                DetectedPropertiesJsonMarshaller.getInstance().marshall(jobInput.getDetectedProperties(), jsonGenerator);
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static JobInputJsonMarshaller instance;

    public static JobInputJsonMarshaller getInstance() {
        if (instance == null)
            instance = new JobInputJsonMarshaller();
        return instance;
    }

}
