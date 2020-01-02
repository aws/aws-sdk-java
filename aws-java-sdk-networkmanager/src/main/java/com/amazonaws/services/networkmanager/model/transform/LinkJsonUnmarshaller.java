/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.networkmanager.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.networkmanager.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * Link JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LinkJsonUnmarshaller implements Unmarshaller<Link, JsonUnmarshallerContext> {

    public Link unmarshall(JsonUnmarshallerContext context) throws Exception {
        Link link = new Link();

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
                if (context.testExpression("LinkId", targetDepth)) {
                    context.nextToken();
                    link.setLinkId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LinkArn", targetDepth)) {
                    context.nextToken();
                    link.setLinkArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("GlobalNetworkId", targetDepth)) {
                    context.nextToken();
                    link.setGlobalNetworkId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SiteId", targetDepth)) {
                    context.nextToken();
                    link.setSiteId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Description", targetDepth)) {
                    context.nextToken();
                    link.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Type", targetDepth)) {
                    context.nextToken();
                    link.setType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Bandwidth", targetDepth)) {
                    context.nextToken();
                    link.setBandwidth(BandwidthJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Provider", targetDepth)) {
                    context.nextToken();
                    link.setProvider(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreatedAt", targetDepth)) {
                    context.nextToken();
                    link.setCreatedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("State", targetDepth)) {
                    context.nextToken();
                    link.setState(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Tags", targetDepth)) {
                    context.nextToken();
                    link.setTags(new ListUnmarshaller<Tag>(TagJsonUnmarshaller.getInstance()).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return link;
    }

    private static LinkJsonUnmarshaller instance;

    public static LinkJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new LinkJsonUnmarshaller();
        return instance;
    }
}
