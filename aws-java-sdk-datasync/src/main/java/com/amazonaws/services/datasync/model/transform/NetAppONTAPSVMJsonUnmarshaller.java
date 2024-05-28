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
 * NetAppONTAPSVM JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class NetAppONTAPSVMJsonUnmarshaller implements Unmarshaller<NetAppONTAPSVM, JsonUnmarshallerContext> {

    public NetAppONTAPSVM unmarshall(JsonUnmarshallerContext context) throws Exception {
        NetAppONTAPSVM netAppONTAPSVM = new NetAppONTAPSVM();

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
                if (context.testExpression("ClusterUuid", targetDepth)) {
                    context.nextToken();
                    netAppONTAPSVM.setClusterUuid(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ResourceId", targetDepth)) {
                    context.nextToken();
                    netAppONTAPSVM.setResourceId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SvmName", targetDepth)) {
                    context.nextToken();
                    netAppONTAPSVM.setSvmName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CifsShareCount", targetDepth)) {
                    context.nextToken();
                    netAppONTAPSVM.setCifsShareCount(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("EnabledProtocols", targetDepth)) {
                    context.nextToken();
                    netAppONTAPSVM.setEnabledProtocols(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("TotalCapacityUsed", targetDepth)) {
                    context.nextToken();
                    netAppONTAPSVM.setTotalCapacityUsed(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("TotalCapacityProvisioned", targetDepth)) {
                    context.nextToken();
                    netAppONTAPSVM.setTotalCapacityProvisioned(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("TotalLogicalCapacityUsed", targetDepth)) {
                    context.nextToken();
                    netAppONTAPSVM.setTotalLogicalCapacityUsed(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("MaxP95Performance", targetDepth)) {
                    context.nextToken();
                    netAppONTAPSVM.setMaxP95Performance(MaxP95PerformanceJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Recommendations", targetDepth)) {
                    context.nextToken();
                    netAppONTAPSVM.setRecommendations(new ListUnmarshaller<Recommendation>(RecommendationJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("NfsExportedVolumes", targetDepth)) {
                    context.nextToken();
                    netAppONTAPSVM.setNfsExportedVolumes(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("RecommendationStatus", targetDepth)) {
                    context.nextToken();
                    netAppONTAPSVM.setRecommendationStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("TotalSnapshotCapacityUsed", targetDepth)) {
                    context.nextToken();
                    netAppONTAPSVM.setTotalSnapshotCapacityUsed(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("LunCount", targetDepth)) {
                    context.nextToken();
                    netAppONTAPSVM.setLunCount(context.getUnmarshaller(Long.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return netAppONTAPSVM;
    }

    private static NetAppONTAPSVMJsonUnmarshaller instance;

    public static NetAppONTAPSVMJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new NetAppONTAPSVMJsonUnmarshaller();
        return instance;
    }
}
