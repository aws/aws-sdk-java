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
 * Volumei S C S I Attributes JSON Unmarshaller
 */
public class VolumeiSCSIAttributesJsonUnmarshaller implements Unmarshaller<VolumeiSCSIAttributes, JsonUnmarshallerContext> {

    

    public VolumeiSCSIAttributes unmarshall(JsonUnmarshallerContext context) throws Exception {
        VolumeiSCSIAttributes volumeiSCSIAttributes = new VolumeiSCSIAttributes();

        
        
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.currentToken;
        if (token == null) token = context.nextToken();

        while (true) {
            if (token == null) break;

            
            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("TargetARN", targetDepth)) {
                    context.nextToken();
                    volumeiSCSIAttributes.setTargetARN(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("NetworkInterfaceId", targetDepth)) {
                    context.nextToken();
                    volumeiSCSIAttributes.setNetworkInterfaceId(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("NetworkInterfacePort", targetDepth)) {
                    context.nextToken();
                    volumeiSCSIAttributes.setNetworkInterfacePort(IntegerJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("LunNumber", targetDepth)) {
                    context.nextToken();
                    volumeiSCSIAttributes.setLunNumber(IntegerJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ChapEnabled", targetDepth)) {
                    context.nextToken();
                    volumeiSCSIAttributes.setChapEnabled(BooleanJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getCurrentDepth() <= originalDepth) break;
            }
            

            token = context.nextToken();
        }
        
        return volumeiSCSIAttributes;
    }

    private static VolumeiSCSIAttributesJsonUnmarshaller instance;
    public static VolumeiSCSIAttributesJsonUnmarshaller getInstance() {
        if (instance == null) instance = new VolumeiSCSIAttributesJsonUnmarshaller();
        return instance;
    }
}
    