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
 * NetAppONTAPCluster JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class NetAppONTAPClusterJsonUnmarshaller implements Unmarshaller<NetAppONTAPCluster, JsonUnmarshallerContext> {

    public NetAppONTAPCluster unmarshall(JsonUnmarshallerContext context) throws Exception {
        NetAppONTAPCluster netAppONTAPCluster = new NetAppONTAPCluster();

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
                if (context.testExpression("CifsShareCount", targetDepth)) {
                    context.nextToken();
                    netAppONTAPCluster.setCifsShareCount(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("NfsExportedVolumes", targetDepth)) {
                    context.nextToken();
                    netAppONTAPCluster.setNfsExportedVolumes(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("ResourceId", targetDepth)) {
                    context.nextToken();
                    netAppONTAPCluster.setResourceId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ClusterName", targetDepth)) {
                    context.nextToken();
                    netAppONTAPCluster.setClusterName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("MaxP95Performance", targetDepth)) {
                    context.nextToken();
                    netAppONTAPCluster.setMaxP95Performance(MaxP95PerformanceJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ClusterBlockStorageSize", targetDepth)) {
                    context.nextToken();
                    netAppONTAPCluster.setClusterBlockStorageSize(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("ClusterBlockStorageUsed", targetDepth)) {
                    context.nextToken();
                    netAppONTAPCluster.setClusterBlockStorageUsed(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("ClusterBlockStorageLogicalUsed", targetDepth)) {
                    context.nextToken();
                    netAppONTAPCluster.setClusterBlockStorageLogicalUsed(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("Recommendations", targetDepth)) {
                    context.nextToken();
                    netAppONTAPCluster.setRecommendations(new ListUnmarshaller<Recommendation>(RecommendationJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("RecommendationStatus", targetDepth)) {
                    context.nextToken();
                    netAppONTAPCluster.setRecommendationStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LunCount", targetDepth)) {
                    context.nextToken();
                    netAppONTAPCluster.setLunCount(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("ClusterCloudStorageUsed", targetDepth)) {
                    context.nextToken();
                    netAppONTAPCluster.setClusterCloudStorageUsed(context.getUnmarshaller(Long.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return netAppONTAPCluster;
    }

    private static NetAppONTAPClusterJsonUnmarshaller instance;

    public static NetAppONTAPClusterJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new NetAppONTAPClusterJsonUnmarshaller();
        return instance;
    }
}
