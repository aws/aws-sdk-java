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
 * JobAlbumArtMarshaller
 */
public class JobAlbumArtJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(JobAlbumArt jobAlbumArt, StructuredJsonGenerator jsonGenerator) {

        if (jobAlbumArt == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (jobAlbumArt.getMergePolicy() != null) {
                jsonGenerator.writeFieldName("MergePolicy").writeValue(jobAlbumArt.getMergePolicy());
            }

            com.amazonaws.internal.SdkInternalList<Artwork> artworkList = (com.amazonaws.internal.SdkInternalList<Artwork>) jobAlbumArt.getArtwork();
            if (!artworkList.isEmpty() || !artworkList.isAutoConstruct()) {
                jsonGenerator.writeFieldName("Artwork");
                jsonGenerator.writeStartArray();
                for (Artwork artworkListValue : artworkList) {
                    if (artworkListValue != null) {

                        ArtworkJsonMarshaller.getInstance().marshall(artworkListValue, jsonGenerator);
                    }
                }
                jsonGenerator.writeEndArray();
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static JobAlbumArtJsonMarshaller instance;

    public static JobAlbumArtJsonMarshaller getInstance() {
        if (instance == null)
            instance = new JobAlbumArtJsonMarshaller();
        return instance;
    }

}
