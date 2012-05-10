/*
 * Copyright 2010-2012 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.storagegateway.model.transform;

import java.util.Map;
import java.util.Map.Entry;

import com.amazonaws.services.storagegateway.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import org.codehaus.jackson.JsonToken;
import static org.codehaus.jackson.JsonToken.*;

/**
 * Stored I S C S I Volume JSON Unmarshaller
 */
public class StoredISCSIVolumeJsonUnmarshaller implements Unmarshaller<StoredISCSIVolume, JsonUnmarshallerContext> {

    

    public StoredISCSIVolume unmarshall(JsonUnmarshallerContext context) throws Exception {
        StoredISCSIVolume storedISCSIVolume = new StoredISCSIVolume();

        
        
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.currentToken;
        if (token == null) token = context.nextToken();

        while (true) {
            if (token == null) break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("VolumeARN", targetDepth)) {
                    context.nextToken();
                    storedISCSIVolume.setVolumeARN(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("VolumeId", targetDepth)) {
                    context.nextToken();
                    storedISCSIVolume.setVolumeId(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("VolumeType", targetDepth)) {
                    context.nextToken();
                    storedISCSIVolume.setVolumeType(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("VolumeStatus", targetDepth)) {
                    context.nextToken();
                    storedISCSIVolume.setVolumeStatus(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("VolumeSizeInBytes", targetDepth)) {
                    context.nextToken();
                    storedISCSIVolume.setVolumeSizeInBytes(LongJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("VolumeProgress", targetDepth)) {
                    context.nextToken();
                    storedISCSIVolume.setVolumeProgress(DoubleJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("VolumeDiskId", targetDepth)) {
                    context.nextToken();
                    storedISCSIVolume.setVolumeDiskId(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("SourceSnapshotId", targetDepth)) {
                    context.nextToken();
                    storedISCSIVolume.setSourceSnapshotId(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("PreservedExistingData", targetDepth)) {
                    context.nextToken();
                    storedISCSIVolume.setPreservedExistingData(BooleanJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("VolumeiSCSIAttributes", targetDepth)) {
                    context.nextToken();
                    storedISCSIVolume.setVolumeISCSIAttributes(VolumeISCSIAttributesJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getCurrentDepth() <= originalDepth) break;
            }
            token = context.nextToken();
        }
        
        return storedISCSIVolume;
    }

    private static StoredISCSIVolumeJsonUnmarshaller instance;
    public static StoredISCSIVolumeJsonUnmarshaller getInstance() {
        if (instance == null) instance = new StoredISCSIVolumeJsonUnmarshaller();
        return instance;
    }
}
    