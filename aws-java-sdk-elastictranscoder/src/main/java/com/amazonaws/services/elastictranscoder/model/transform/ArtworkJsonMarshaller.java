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
 * ArtworkMarshaller
 */
public class ArtworkJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(Artwork artwork, StructuredJsonGenerator jsonGenerator) {

        if (artwork == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (artwork.getInputKey() != null) {
                jsonGenerator.writeFieldName("InputKey").writeValue(artwork.getInputKey());
            }
            if (artwork.getMaxWidth() != null) {
                jsonGenerator.writeFieldName("MaxWidth").writeValue(artwork.getMaxWidth());
            }
            if (artwork.getMaxHeight() != null) {
                jsonGenerator.writeFieldName("MaxHeight").writeValue(artwork.getMaxHeight());
            }
            if (artwork.getSizingPolicy() != null) {
                jsonGenerator.writeFieldName("SizingPolicy").writeValue(artwork.getSizingPolicy());
            }
            if (artwork.getPaddingPolicy() != null) {
                jsonGenerator.writeFieldName("PaddingPolicy").writeValue(artwork.getPaddingPolicy());
            }
            if (artwork.getAlbumArtFormat() != null) {
                jsonGenerator.writeFieldName("AlbumArtFormat").writeValue(artwork.getAlbumArtFormat());
            }
            if (artwork.getEncryption() != null) {
                jsonGenerator.writeFieldName("Encryption");
                EncryptionJsonMarshaller.getInstance().marshall(artwork.getEncryption(), jsonGenerator);
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static ArtworkJsonMarshaller instance;

    public static ArtworkJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ArtworkJsonMarshaller();
        return instance;
    }

}
