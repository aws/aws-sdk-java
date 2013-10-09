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
 * App JSON Unmarshaller
 */
public class AppJsonUnmarshaller implements Unmarshaller<App, JsonUnmarshallerContext> {

    

    public App unmarshall(JsonUnmarshallerContext context) throws Exception {
        App app = new App();

        
        
        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.currentToken;
        if (token == null) token = context.nextToken();
        if (token == VALUE_NULL) return null;

        while (true) {
            if (token == null) break;

            
            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("AppId", targetDepth)) {
                    context.nextToken();
                    app.setAppId(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("StackId", targetDepth)) {
                    context.nextToken();
                    app.setStackId(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Shortname", targetDepth)) {
                    context.nextToken();
                    app.setShortname(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Name", targetDepth)) {
                    context.nextToken();
                    app.setName(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Description", targetDepth)) {
                    context.nextToken();
                    app.setDescription(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Type", targetDepth)) {
                    context.nextToken();
                    app.setType(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("AppSource", targetDepth)) {
                    context.nextToken();
                    app.setAppSource(SourceJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Domains", targetDepth)) {
                    app.setDomains(new ListUnmarshaller<String>(StringJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("EnableSsl", targetDepth)) {
                    context.nextToken();
                    app.setEnableSsl(BooleanJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("SslConfiguration", targetDepth)) {
                    context.nextToken();
                    app.setSslConfiguration(SslConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Attributes", targetDepth)) {
                    app.setAttributes(new MapUnmarshaller<String,String>(StringJsonUnmarshaller.getInstance(), StringJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("CreatedAt", targetDepth)) {
                    context.nextToken();
                    app.setCreatedAt(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth) break;
                }
            }
            

            token = context.nextToken();
        }
        
        return app;
    }

    private static AppJsonUnmarshaller instance;
    public static AppJsonUnmarshaller getInstance() {
        if (instance == null) instance = new AppJsonUnmarshaller();
        return instance;
    }
}
    