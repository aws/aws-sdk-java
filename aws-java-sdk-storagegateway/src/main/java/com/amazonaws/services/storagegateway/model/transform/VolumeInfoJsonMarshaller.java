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
package com.amazonaws.services.storagegateway.model.transform;

import java.util.Map;
import java.util.List;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.storagegateway.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * VolumeInfoMarshaller
 */
public class VolumeInfoJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(VolumeInfo volumeInfo, StructuredJsonGenerator jsonGenerator) {

        if (volumeInfo == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (volumeInfo.getVolumeARN() != null) {
                jsonGenerator.writeFieldName("VolumeARN").writeValue(volumeInfo.getVolumeARN());
            }
            if (volumeInfo.getVolumeId() != null) {
                jsonGenerator.writeFieldName("VolumeId").writeValue(volumeInfo.getVolumeId());
            }
            if (volumeInfo.getGatewayARN() != null) {
                jsonGenerator.writeFieldName("GatewayARN").writeValue(volumeInfo.getGatewayARN());
            }
            if (volumeInfo.getGatewayId() != null) {
                jsonGenerator.writeFieldName("GatewayId").writeValue(volumeInfo.getGatewayId());
            }
            if (volumeInfo.getVolumeType() != null) {
                jsonGenerator.writeFieldName("VolumeType").writeValue(volumeInfo.getVolumeType());
            }
            if (volumeInfo.getVolumeSizeInBytes() != null) {
                jsonGenerator.writeFieldName("VolumeSizeInBytes").writeValue(volumeInfo.getVolumeSizeInBytes());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static VolumeInfoJsonMarshaller instance;

    public static VolumeInfoJsonMarshaller getInstance() {
        if (instance == null)
            instance = new VolumeInfoJsonMarshaller();
        return instance;
    }

}
