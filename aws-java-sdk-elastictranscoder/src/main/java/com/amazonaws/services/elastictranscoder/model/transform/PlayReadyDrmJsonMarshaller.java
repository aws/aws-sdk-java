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
 * PlayReadyDrmMarshaller
 */
public class PlayReadyDrmJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(PlayReadyDrm playReadyDrm, StructuredJsonGenerator jsonGenerator) {

        if (playReadyDrm == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (playReadyDrm.getFormat() != null) {
                jsonGenerator.writeFieldName("Format").writeValue(playReadyDrm.getFormat());
            }
            if (playReadyDrm.getKey() != null) {
                jsonGenerator.writeFieldName("Key").writeValue(playReadyDrm.getKey());
            }
            if (playReadyDrm.getKeyMd5() != null) {
                jsonGenerator.writeFieldName("KeyMd5").writeValue(playReadyDrm.getKeyMd5());
            }
            if (playReadyDrm.getKeyId() != null) {
                jsonGenerator.writeFieldName("KeyId").writeValue(playReadyDrm.getKeyId());
            }
            if (playReadyDrm.getInitializationVector() != null) {
                jsonGenerator.writeFieldName("InitializationVector").writeValue(playReadyDrm.getInitializationVector());
            }
            if (playReadyDrm.getLicenseAcquisitionUrl() != null) {
                jsonGenerator.writeFieldName("LicenseAcquisitionUrl").writeValue(playReadyDrm.getLicenseAcquisitionUrl());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static PlayReadyDrmJsonMarshaller instance;

    public static PlayReadyDrmJsonMarshaller getInstance() {
        if (instance == null)
            instance = new PlayReadyDrmJsonMarshaller();
        return instance;
    }

}
