/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.datasync.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.datasync.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * NetAppONTAPVolume JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class NetAppONTAPVolumeJsonUnmarshaller implements Unmarshaller<NetAppONTAPVolume, JsonUnmarshallerContext> {

    public NetAppONTAPVolume unmarshall(JsonUnmarshallerContext context) throws Exception {
        NetAppONTAPVolume netAppONTAPVolume = new NetAppONTAPVolume();

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
                if (context.testExpression("VolumeName", targetDepth)) {
                    context.nextToken();
                    netAppONTAPVolume.setVolumeName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ResourceId", targetDepth)) {
                    context.nextToken();
                    netAppONTAPVolume.setResourceId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CifsShareCount", targetDepth)) {
                    context.nextToken();
                    netAppONTAPVolume.setCifsShareCount(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("SecurityStyle", targetDepth)) {
                    context.nextToken();
                    netAppONTAPVolume.setSecurityStyle(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SvmUuid", targetDepth)) {
                    context.nextToken();
                    netAppONTAPVolume.setSvmUuid(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SvmName", targetDepth)) {
                    context.nextToken();
                    netAppONTAPVolume.setSvmName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CapacityUsed", targetDepth)) {
                    context.nextToken();
                    netAppONTAPVolume.setCapacityUsed(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("CapacityProvisioned", targetDepth)) {
                    context.nextToken();
                    netAppONTAPVolume.setCapacityProvisioned(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("LogicalCapacityUsed", targetDepth)) {
                    context.nextToken();
                    netAppONTAPVolume.setLogicalCapacityUsed(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("NfsExported", targetDepth)) {
                    context.nextToken();
                    netAppONTAPVolume.setNfsExported(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("SnapshotCapacityUsed", targetDepth)) {
                    context.nextToken();
                    netAppONTAPVolume.setSnapshotCapacityUsed(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("MaxP95Performance", targetDepth)) {
                    context.nextToken();
                    netAppONTAPVolume.setMaxP95Performance(MaxP95PerformanceJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Recommendations", targetDepth)) {
                    context.nextToken();
                    netAppONTAPVolume.setRecommendations(new ListUnmarshaller<Recommendation>(RecommendationJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("RecommendationStatus", targetDepth)) {
                    context.nextToken();
                    netAppONTAPVolume.setRecommendationStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LunCount", targetDepth)) {
                    context.nextToken();
                    netAppONTAPVolume.setLunCount(context.getUnmarshaller(Long.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return netAppONTAPVolume;
    }

    private static NetAppONTAPVolumeJsonUnmarshaller instance;

    public static NetAppONTAPVolumeJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new NetAppONTAPVolumeJsonUnmarshaller();
        return instance;
    }
}
