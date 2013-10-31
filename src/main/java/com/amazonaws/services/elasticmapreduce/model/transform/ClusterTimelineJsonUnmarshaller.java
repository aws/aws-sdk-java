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

package com.amazonaws.services.elasticmapreduce.model.transform;

import java.util.Map;
import java.util.Map.Entry;

import com.amazonaws.services.elasticmapreduce.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;


/**
 * Cluster Timeline JSON Unmarshaller
 */
public class ClusterTimelineJsonUnmarshaller implements Unmarshaller<ClusterTimeline, JsonUnmarshallerContext> {

    

    public ClusterTimeline unmarshall(JsonUnmarshallerContext context) throws Exception {
        ClusterTimeline clusterTimeline = new ClusterTimeline();

        
        
        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.currentToken;
        if (token == null) token = context.nextToken();
        if (token == VALUE_NULL) return null;

        while (true) {
            if (token == null) break;

            
            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("CreationDateTime", targetDepth)) {
                    context.nextToken();
                    clusterTimeline.setCreationDateTime(DateJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ReadyDateTime", targetDepth)) {
                    context.nextToken();
                    clusterTimeline.setReadyDateTime(DateJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("EndDateTime", targetDepth)) {
                    context.nextToken();
                    clusterTimeline.setEndDateTime(DateJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth) break;
                }
            }
            

            token = context.nextToken();
        }
        
        return clusterTimeline;
    }

    private static ClusterTimelineJsonUnmarshaller instance;
    public static ClusterTimelineJsonUnmarshaller getInstance() {
        if (instance == null) instance = new ClusterTimelineJsonUnmarshaller();
        return instance;
    }
}
    