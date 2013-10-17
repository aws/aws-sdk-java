/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;


/**
 * Create Storedi S C S I Volume Result JSON Unmarshaller
 */
public class CreateStorediSCSIVolumeResultJsonUnmarshaller implements Unmarshaller<CreateStorediSCSIVolumeResult, JsonUnmarshallerContext> {

    

    public CreateStorediSCSIVolumeResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        CreateStorediSCSIVolumeResult createStorediSCSIVolumeResult = new CreateStorediSCSIVolumeResult();

        
        
        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.currentToken;
        if (token == null) token = context.nextToken();
        if (token == VALUE_NULL) return null;

        while (true) {
            if (token == null) break;

            
            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("VolumeARN", targetDepth)) {
                    context.nextToken();
                    createStorediSCSIVolumeResult.setVolumeARN(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("VolumeSizeInBytes", targetDepth)) {
                    context.nextToken();
                    createStorediSCSIVolumeResult.setVolumeSizeInBytes(LongJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("TargetARN", targetDepth)) {
                    context.nextToken();
                    createStorediSCSIVolumeResult.setTargetARN(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth) break;
                }
            }
            

            token = context.nextToken();
        }
        
        return createStorediSCSIVolumeResult;
    }

    private static CreateStorediSCSIVolumeResultJsonUnmarshaller instance;
    public static CreateStorediSCSIVolumeResultJsonUnmarshaller getInstance() {
        if (instance == null) instance = new CreateStorediSCSIVolumeResultJsonUnmarshaller();
        return instance;
    }
}
    