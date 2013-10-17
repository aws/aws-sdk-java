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
 * Instance Group Detail JSON Unmarshaller
 */
public class InstanceGroupDetailJsonUnmarshaller implements Unmarshaller<InstanceGroupDetail, JsonUnmarshallerContext> {

    

    public InstanceGroupDetail unmarshall(JsonUnmarshallerContext context) throws Exception {
        InstanceGroupDetail instanceGroupDetail = new InstanceGroupDetail();

        
        
        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.currentToken;
        if (token == null) token = context.nextToken();
        if (token == VALUE_NULL) return null;

        while (true) {
            if (token == null) break;

            
            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("InstanceGroupId", targetDepth)) {
                    context.nextToken();
                    instanceGroupDetail.setInstanceGroupId(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Name", targetDepth)) {
                    context.nextToken();
                    instanceGroupDetail.setName(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Market", targetDepth)) {
                    context.nextToken();
                    instanceGroupDetail.setMarket(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("InstanceRole", targetDepth)) {
                    context.nextToken();
                    instanceGroupDetail.setInstanceRole(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("BidPrice", targetDepth)) {
                    context.nextToken();
                    instanceGroupDetail.setBidPrice(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("InstanceType", targetDepth)) {
                    context.nextToken();
                    instanceGroupDetail.setInstanceType(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("InstanceRequestCount", targetDepth)) {
                    context.nextToken();
                    instanceGroupDetail.setInstanceRequestCount(IntegerJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("InstanceRunningCount", targetDepth)) {
                    context.nextToken();
                    instanceGroupDetail.setInstanceRunningCount(IntegerJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("State", targetDepth)) {
                    context.nextToken();
                    instanceGroupDetail.setState(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("LastStateChangeReason", targetDepth)) {
                    context.nextToken();
                    instanceGroupDetail.setLastStateChangeReason(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("CreationDateTime", targetDepth)) {
                    context.nextToken();
                    instanceGroupDetail.setCreationDateTime(DateJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("StartDateTime", targetDepth)) {
                    context.nextToken();
                    instanceGroupDetail.setStartDateTime(DateJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ReadyDateTime", targetDepth)) {
                    context.nextToken();
                    instanceGroupDetail.setReadyDateTime(DateJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("EndDateTime", targetDepth)) {
                    context.nextToken();
                    instanceGroupDetail.setEndDateTime(DateJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth) break;
                }
            }
            

            token = context.nextToken();
        }
        
        return instanceGroupDetail;
    }

    private static InstanceGroupDetailJsonUnmarshaller instance;
    public static InstanceGroupDetailJsonUnmarshaller getInstance() {
        if (instance == null) instance = new InstanceGroupDetailJsonUnmarshaller();
        return instance;
    }
}
    