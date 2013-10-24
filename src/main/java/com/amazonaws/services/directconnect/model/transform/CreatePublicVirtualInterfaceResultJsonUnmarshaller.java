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

package com.amazonaws.services.directconnect.model.transform;

import java.util.Map;
import java.util.Map.Entry;

import com.amazonaws.services.directconnect.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;


/**
 * Create Public Virtual Interface Result JSON Unmarshaller
 */
public class CreatePublicVirtualInterfaceResultJsonUnmarshaller implements Unmarshaller<CreatePublicVirtualInterfaceResult, JsonUnmarshallerContext> {

    

    public CreatePublicVirtualInterfaceResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        CreatePublicVirtualInterfaceResult createPublicVirtualInterfaceResult = new CreatePublicVirtualInterfaceResult();

        
        
        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.currentToken;
        if (token == null) token = context.nextToken();
        if (token == VALUE_NULL) return null;

        while (true) {
            if (token == null) break;

            
            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("ownerAccount", targetDepth)) {
                    context.nextToken();
                    createPublicVirtualInterfaceResult.setOwnerAccount(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("virtualInterfaceId", targetDepth)) {
                    context.nextToken();
                    createPublicVirtualInterfaceResult.setVirtualInterfaceId(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("location", targetDepth)) {
                    context.nextToken();
                    createPublicVirtualInterfaceResult.setLocation(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("connectionId", targetDepth)) {
                    context.nextToken();
                    createPublicVirtualInterfaceResult.setConnectionId(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("virtualInterfaceType", targetDepth)) {
                    context.nextToken();
                    createPublicVirtualInterfaceResult.setVirtualInterfaceType(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("virtualInterfaceName", targetDepth)) {
                    context.nextToken();
                    createPublicVirtualInterfaceResult.setVirtualInterfaceName(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("vlan", targetDepth)) {
                    context.nextToken();
                    createPublicVirtualInterfaceResult.setVlan(IntegerJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("asn", targetDepth)) {
                    context.nextToken();
                    createPublicVirtualInterfaceResult.setAsn(IntegerJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("authKey", targetDepth)) {
                    context.nextToken();
                    createPublicVirtualInterfaceResult.setAuthKey(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("amazonAddress", targetDepth)) {
                    context.nextToken();
                    createPublicVirtualInterfaceResult.setAmazonAddress(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("customerAddress", targetDepth)) {
                    context.nextToken();
                    createPublicVirtualInterfaceResult.setCustomerAddress(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("virtualInterfaceState", targetDepth)) {
                    context.nextToken();
                    createPublicVirtualInterfaceResult.setVirtualInterfaceState(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("customerRouterConfig", targetDepth)) {
                    context.nextToken();
                    createPublicVirtualInterfaceResult.setCustomerRouterConfig(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("virtualGatewayId", targetDepth)) {
                    context.nextToken();
                    createPublicVirtualInterfaceResult.setVirtualGatewayId(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("routeFilterPrefixes", targetDepth)) {
                    createPublicVirtualInterfaceResult.setRouteFilterPrefixes(new ListUnmarshaller<RouteFilterPrefix>(RouteFilterPrefixJsonUnmarshaller.getInstance()).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth) break;
                }
            }
            

            token = context.nextToken();
        }
        
        return createPublicVirtualInterfaceResult;
    }

    private static CreatePublicVirtualInterfaceResultJsonUnmarshaller instance;
    public static CreatePublicVirtualInterfaceResultJsonUnmarshaller getInstance() {
        if (instance == null) instance = new CreatePublicVirtualInterfaceResultJsonUnmarshaller();
        return instance;
    }
}
    