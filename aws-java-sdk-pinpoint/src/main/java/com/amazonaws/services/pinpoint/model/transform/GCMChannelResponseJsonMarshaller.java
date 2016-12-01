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
package com.amazonaws.services.pinpoint.model.transform;

import java.util.Map;
import java.util.List;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.pinpoint.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * GCMChannelResponseMarshaller
 */
public class GCMChannelResponseJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(GCMChannelResponse gCMChannelResponse, StructuredJsonGenerator jsonGenerator) {

        if (gCMChannelResponse == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (gCMChannelResponse.getApplicationId() != null) {
                jsonGenerator.writeFieldName("ApplicationId").writeValue(gCMChannelResponse.getApplicationId());
            }
            if (gCMChannelResponse.getCreationDate() != null) {
                jsonGenerator.writeFieldName("CreationDate").writeValue(gCMChannelResponse.getCreationDate());
            }
            if (gCMChannelResponse.getCredential() != null) {
                jsonGenerator.writeFieldName("Credential").writeValue(gCMChannelResponse.getCredential());
            }
            if (gCMChannelResponse.getId() != null) {
                jsonGenerator.writeFieldName("Id").writeValue(gCMChannelResponse.getId());
            }
            if (gCMChannelResponse.getIsArchived() != null) {
                jsonGenerator.writeFieldName("IsArchived").writeValue(gCMChannelResponse.getIsArchived());
            }
            if (gCMChannelResponse.getLastModifiedBy() != null) {
                jsonGenerator.writeFieldName("LastModifiedBy").writeValue(gCMChannelResponse.getLastModifiedBy());
            }
            if (gCMChannelResponse.getLastModifiedDate() != null) {
                jsonGenerator.writeFieldName("LastModifiedDate").writeValue(gCMChannelResponse.getLastModifiedDate());
            }
            if (gCMChannelResponse.getPlatform() != null) {
                jsonGenerator.writeFieldName("Platform").writeValue(gCMChannelResponse.getPlatform());
            }
            if (gCMChannelResponse.getVersion() != null) {
                jsonGenerator.writeFieldName("Version").writeValue(gCMChannelResponse.getVersion());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static GCMChannelResponseJsonMarshaller instance;

    public static GCMChannelResponseJsonMarshaller getInstance() {
        if (instance == null)
            instance = new GCMChannelResponseJsonMarshaller();
        return instance;
    }

}
