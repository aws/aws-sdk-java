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
 * StorediSCSIVolumeMarshaller
 */
public class StorediSCSIVolumeJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(StorediSCSIVolume storediSCSIVolume, StructuredJsonGenerator jsonGenerator) {

        if (storediSCSIVolume == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (storediSCSIVolume.getVolumeARN() != null) {
                jsonGenerator.writeFieldName("VolumeARN").writeValue(storediSCSIVolume.getVolumeARN());
            }
            if (storediSCSIVolume.getVolumeId() != null) {
                jsonGenerator.writeFieldName("VolumeId").writeValue(storediSCSIVolume.getVolumeId());
            }
            if (storediSCSIVolume.getVolumeType() != null) {
                jsonGenerator.writeFieldName("VolumeType").writeValue(storediSCSIVolume.getVolumeType());
            }
            if (storediSCSIVolume.getVolumeStatus() != null) {
                jsonGenerator.writeFieldName("VolumeStatus").writeValue(storediSCSIVolume.getVolumeStatus());
            }
            if (storediSCSIVolume.getVolumeSizeInBytes() != null) {
                jsonGenerator.writeFieldName("VolumeSizeInBytes").writeValue(storediSCSIVolume.getVolumeSizeInBytes());
            }
            if (storediSCSIVolume.getVolumeProgress() != null) {
                jsonGenerator.writeFieldName("VolumeProgress").writeValue(storediSCSIVolume.getVolumeProgress());
            }
            if (storediSCSIVolume.getVolumeDiskId() != null) {
                jsonGenerator.writeFieldName("VolumeDiskId").writeValue(storediSCSIVolume.getVolumeDiskId());
            }
            if (storediSCSIVolume.getSourceSnapshotId() != null) {
                jsonGenerator.writeFieldName("SourceSnapshotId").writeValue(storediSCSIVolume.getSourceSnapshotId());
            }
            if (storediSCSIVolume.getPreservedExistingData() != null) {
                jsonGenerator.writeFieldName("PreservedExistingData").writeValue(storediSCSIVolume.getPreservedExistingData());
            }
            if (storediSCSIVolume.getVolumeiSCSIAttributes() != null) {
                jsonGenerator.writeFieldName("VolumeiSCSIAttributes");
                VolumeiSCSIAttributesJsonMarshaller.getInstance().marshall(storediSCSIVolume.getVolumeiSCSIAttributes(), jsonGenerator);
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static StorediSCSIVolumeJsonMarshaller instance;

    public static StorediSCSIVolumeJsonMarshaller getInstance() {
        if (instance == null)
            instance = new StorediSCSIVolumeJsonMarshaller();
        return instance;
    }

}
