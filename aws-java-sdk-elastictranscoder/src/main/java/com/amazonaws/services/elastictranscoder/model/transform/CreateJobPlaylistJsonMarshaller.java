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
 * CreateJobPlaylistMarshaller
 */
public class CreateJobPlaylistJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(CreateJobPlaylist createJobPlaylist, StructuredJsonGenerator jsonGenerator) {

        if (createJobPlaylist == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (createJobPlaylist.getName() != null) {
                jsonGenerator.writeFieldName("Name").writeValue(createJobPlaylist.getName());
            }
            if (createJobPlaylist.getFormat() != null) {
                jsonGenerator.writeFieldName("Format").writeValue(createJobPlaylist.getFormat());
            }

            com.amazonaws.internal.SdkInternalList<String> outputKeysList = (com.amazonaws.internal.SdkInternalList<String>) createJobPlaylist.getOutputKeys();
            if (!outputKeysList.isEmpty() || !outputKeysList.isAutoConstruct()) {
                jsonGenerator.writeFieldName("OutputKeys");
                jsonGenerator.writeStartArray();
                for (String outputKeysListValue : outputKeysList) {
                    if (outputKeysListValue != null) {
                        jsonGenerator.writeValue(outputKeysListValue);
                    }
                }
                jsonGenerator.writeEndArray();
            }
            if (createJobPlaylist.getHlsContentProtection() != null) {
                jsonGenerator.writeFieldName("HlsContentProtection");
                HlsContentProtectionJsonMarshaller.getInstance().marshall(createJobPlaylist.getHlsContentProtection(), jsonGenerator);
            }
            if (createJobPlaylist.getPlayReadyDrm() != null) {
                jsonGenerator.writeFieldName("PlayReadyDrm");
                PlayReadyDrmJsonMarshaller.getInstance().marshall(createJobPlaylist.getPlayReadyDrm(), jsonGenerator);
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static CreateJobPlaylistJsonMarshaller instance;

    public static CreateJobPlaylistJsonMarshaller getInstance() {
        if (instance == null)
            instance = new CreateJobPlaylistJsonMarshaller();
        return instance;
    }

}
