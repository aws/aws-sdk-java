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
 * Create Private Virtual Interface Result JSON Unmarshaller
 */
public class CreatePrivateVirtualInterfaceResultJsonUnmarshaller implements Unmarshaller<CreatePrivateVirtualInterfaceResult, JsonUnmarshallerContext> {

    

    public CreatePrivateVirtualInterfaceResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        CreatePrivateVirtualInterfaceResult createPrivateVirtualInterfaceResult = new CreatePrivateVirtualInterfaceResult();

        
        
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
                    createPrivateVirtualInterfaceResult.setOwnerAccount(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("virtualInterfaceId", targetDepth)) {
                    context.nextToken();
                    createPrivateVirtualInterfaceResult.setVirtualInterfaceId(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("location", targetDepth)) {
                    context.nextToken();
                    createPrivateVirtualInterfaceResult.setLocation(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("connectionId", targetDepth)) {
                    context.nextToken();
                    createPrivateVirtualInterfaceResult.setConnectionId(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("virtualInterfaceType", targetDepth)) {
                    context.nextToken();
                    createPrivateVirtualInterfaceResult.setVirtualInterfaceType(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("virtualInterfaceName", targetDepth)) {
                    context.nextToken();
                    createPrivateVirtualInterfaceResult.setVirtualInterfaceName(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("vlan", targetDepth)) {
                    context.nextToken();
                    createPrivateVirtualInterfaceResult.setVlan(IntegerJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("asn", targetDepth)) {
                    context.nextToken();
                    createPrivateVirtualInterfaceResult.setAsn(IntegerJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("authKey", targetDepth)) {
                    context.nextToken();
                    createPrivateVirtualInterfaceResult.setAuthKey(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("amazonAddress", targetDepth)) {
                    context.nextToken();
                    createPrivateVirtualInterfaceResult.setAmazonAddress(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("customerAddress", targetDepth)) {
                    context.nextToken();
                    createPrivateVirtualInterfaceResult.setCustomerAddress(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("virtualInterfaceState", targetDepth)) {
                    context.nextToken();
                    createPrivateVirtualInterfaceResult.setVirtualInterfaceState(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("customerRouterConfig", targetDepth)) {
                    context.nextToken();
                    createPrivateVirtualInterfaceResult.setCustomerRouterConfig(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("virtualGatewayId", targetDepth)) {
                    context.nextToken();
                    createPrivateVirtualInterfaceResult.setVirtualGatewayId(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("routeFilterPrefixes", targetDepth)) {
                    createPrivateVirtualInterfaceResult.setRouteFilterPrefixes(new ListUnmarshaller<RouteFilterPrefix>(RouteFilterPrefixJsonUnmarshaller.getInstance()).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth) break;
                }
            }
            

            token = context.nextToken();
        }
        
        return createPrivateVirtualInterfaceResult;
    }

    private static CreatePrivateVirtualInterfaceResultJsonUnmarshaller instance;
    public static CreatePrivateVirtualInterfaceResultJsonUnmarshaller getInstance() {
        if (instance == null) instance = new CreatePrivateVirtualInterfaceResultJsonUnmarshaller();
        return instance;
    }
}
    