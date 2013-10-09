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
 * Stack JSON Unmarshaller
 */
public class StackJsonUnmarshaller implements Unmarshaller<Stack, JsonUnmarshallerContext> {

    

    public Stack unmarshall(JsonUnmarshallerContext context) throws Exception {
        Stack stack = new Stack();

        
        
        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.currentToken;
        if (token == null) token = context.nextToken();
        if (token == VALUE_NULL) return null;

        while (true) {
            if (token == null) break;

            
            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("StackId", targetDepth)) {
                    context.nextToken();
                    stack.setStackId(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Name", targetDepth)) {
                    context.nextToken();
                    stack.setName(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Region", targetDepth)) {
                    context.nextToken();
                    stack.setRegion(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("VpcId", targetDepth)) {
                    context.nextToken();
                    stack.setVpcId(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Attributes", targetDepth)) {
                    stack.setAttributes(new MapUnmarshaller<String,String>(StringJsonUnmarshaller.getInstance(), StringJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("ServiceRoleArn", targetDepth)) {
                    context.nextToken();
                    stack.setServiceRoleArn(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("DefaultInstanceProfileArn", targetDepth)) {
                    context.nextToken();
                    stack.setDefaultInstanceProfileArn(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("DefaultOs", targetDepth)) {
                    context.nextToken();
                    stack.setDefaultOs(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("HostnameTheme", targetDepth)) {
                    context.nextToken();
                    stack.setHostnameTheme(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("DefaultAvailabilityZone", targetDepth)) {
                    context.nextToken();
                    stack.setDefaultAvailabilityZone(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("DefaultSubnetId", targetDepth)) {
                    context.nextToken();
                    stack.setDefaultSubnetId(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("CustomJson", targetDepth)) {
                    context.nextToken();
                    stack.setCustomJson(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ConfigurationManager", targetDepth)) {
                    context.nextToken();
                    stack.setConfigurationManager(StackConfigurationManagerJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("UseCustomCookbooks", targetDepth)) {
                    context.nextToken();
                    stack.setUseCustomCookbooks(BooleanJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("CustomCookbooksSource", targetDepth)) {
                    context.nextToken();
                    stack.setCustomCookbooksSource(SourceJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("DefaultSshKeyName", targetDepth)) {
                    context.nextToken();
                    stack.setDefaultSshKeyName(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("CreatedAt", targetDepth)) {
                    context.nextToken();
                    stack.setCreatedAt(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("DefaultRootDeviceType", targetDepth)) {
                    context.nextToken();
                    stack.setDefaultRootDeviceType(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth) break;
                }
            }
            

            token = context.nextToken();
        }
        
        return stack;
    }

    private static StackJsonUnmarshaller instance;
    public static StackJsonUnmarshaller getInstance() {
        if (instance == null) instance = new StackJsonUnmarshaller();
        return instance;
    }
}
    