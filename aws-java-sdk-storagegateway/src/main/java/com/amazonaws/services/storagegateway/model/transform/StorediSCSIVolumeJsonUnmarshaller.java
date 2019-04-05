/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.storagegateway.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * StorediSCSIVolume JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StorediSCSIVolumeJsonUnmarshaller implements Unmarshaller<StorediSCSIVolume, JsonUnmarshallerContext> {

    public StorediSCSIVolume unmarshall(JsonUnmarshallerContext context) throws Exception {
        StorediSCSIVolume storediSCSIVolume = new StorediSCSIVolume();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return null;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("VolumeARN", targetDepth)) {
                    context.nextToken();
                    storediSCSIVolume.setVolumeARN(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("VolumeId", targetDepth)) {
                    context.nextToken();
                    storediSCSIVolume.setVolumeId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("VolumeType", targetDepth)) {
                    context.nextToken();
                    storediSCSIVolume.setVolumeType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("VolumeStatus", targetDepth)) {
                    context.nextToken();
                    storediSCSIVolume.setVolumeStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("VolumeAttachmentStatus", targetDepth)) {
                    context.nextToken();
                    storediSCSIVolume.setVolumeAttachmentStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("VolumeSizeInBytes", targetDepth)) {
                    context.nextToken();
                    storediSCSIVolume.setVolumeSizeInBytes(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("VolumeProgress", targetDepth)) {
                    context.nextToken();
                    storediSCSIVolume.setVolumeProgress(context.getUnmarshaller(Double.class).unmarshall(context));
                }
                if (context.testExpression("VolumeDiskId", targetDepth)) {
                    context.nextToken();
                    storediSCSIVolume.setVolumeDiskId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SourceSnapshotId", targetDepth)) {
                    context.nextToken();
                    storediSCSIVolume.setSourceSnapshotId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PreservedExistingData", targetDepth)) {
                    context.nextToken();
                    storediSCSIVolume.setPreservedExistingData(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("VolumeiSCSIAttributes", targetDepth)) {
                    context.nextToken();
                    storediSCSIVolume.setVolumeiSCSIAttributes(VolumeiSCSIAttributesJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("CreatedDate", targetDepth)) {
                    context.nextToken();
                    storediSCSIVolume.setCreatedDate(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("VolumeUsedInBytes", targetDepth)) {
                    context.nextToken();
                    storediSCSIVolume.setVolumeUsedInBytes(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("KMSKey", targetDepth)) {
                    context.nextToken();
                    storediSCSIVolume.setKMSKey(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("TargetName", targetDepth)) {
                    context.nextToken();
                    storediSCSIVolume.setTargetName(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return storediSCSIVolume;
    }

    private static StorediSCSIVolumeJsonUnmarshaller instance;

    public static StorediSCSIVolumeJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new StorediSCSIVolumeJsonUnmarshaller();
        return instance;
    }
}
