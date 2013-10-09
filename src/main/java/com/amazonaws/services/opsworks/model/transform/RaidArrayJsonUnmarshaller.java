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

package com.amazonaws.services.opsworks.model.transform;

import java.util.Map;
import java.util.Map.Entry;

import com.amazonaws.services.opsworks.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;


/**
 * Raid Array JSON Unmarshaller
 */
public class RaidArrayJsonUnmarshaller implements Unmarshaller<RaidArray, JsonUnmarshallerContext> {

    

    public RaidArray unmarshall(JsonUnmarshallerContext context) throws Exception {
        RaidArray raidArray = new RaidArray();

        
        
        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.currentToken;
        if (token == null) token = context.nextToken();
        if (token == VALUE_NULL) return null;

        while (true) {
            if (token == null) break;

            
            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("RaidArrayId", targetDepth)) {
                    context.nextToken();
                    raidArray.setRaidArrayId(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("InstanceId", targetDepth)) {
                    context.nextToken();
                    raidArray.setInstanceId(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Name", targetDepth)) {
                    context.nextToken();
                    raidArray.setName(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("RaidLevel", targetDepth)) {
                    context.nextToken();
                    raidArray.setRaidLevel(IntegerJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("NumberOfDisks", targetDepth)) {
                    context.nextToken();
                    raidArray.setNumberOfDisks(IntegerJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Size", targetDepth)) {
                    context.nextToken();
                    raidArray.setSize(IntegerJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Device", targetDepth)) {
                    context.nextToken();
                    raidArray.setDevice(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("MountPoint", targetDepth)) {
                    context.nextToken();
                    raidArray.setMountPoint(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("AvailabilityZone", targetDepth)) {
                    context.nextToken();
                    raidArray.setAvailabilityZone(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("CreatedAt", targetDepth)) {
                    context.nextToken();
                    raidArray.setCreatedAt(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth) break;
                }
            }
            

            token = context.nextToken();
        }
        
        return raidArray;
    }

    private static RaidArrayJsonUnmarshaller instance;
    public static RaidArrayJsonUnmarshaller getInstance() {
        if (instance == null) instance = new RaidArrayJsonUnmarshaller();
        return instance;
    }
}
    