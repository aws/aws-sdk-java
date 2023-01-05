/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.private5g.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.private5g.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * NetworkSite JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class NetworkSiteJsonUnmarshaller implements Unmarshaller<NetworkSite, JsonUnmarshallerContext> {

    public NetworkSite unmarshall(JsonUnmarshallerContext context) throws Exception {
        NetworkSite networkSite = new NetworkSite();

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
                if (context.testExpression("availabilityZone", targetDepth)) {
                    context.nextToken();
                    networkSite.setAvailabilityZone(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("availabilityZoneId", targetDepth)) {
                    context.nextToken();
                    networkSite.setAvailabilityZoneId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("createdAt", targetDepth)) {
                    context.nextToken();
                    networkSite.setCreatedAt(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("currentPlan", targetDepth)) {
                    context.nextToken();
                    networkSite.setCurrentPlan(SitePlanJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("description", targetDepth)) {
                    context.nextToken();
                    networkSite.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("networkArn", targetDepth)) {
                    context.nextToken();
                    networkSite.setNetworkArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("networkSiteArn", targetDepth)) {
                    context.nextToken();
                    networkSite.setNetworkSiteArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("networkSiteName", targetDepth)) {
                    context.nextToken();
                    networkSite.setNetworkSiteName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("pendingPlan", targetDepth)) {
                    context.nextToken();
                    networkSite.setPendingPlan(SitePlanJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("status", targetDepth)) {
                    context.nextToken();
                    networkSite.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("statusReason", targetDepth)) {
                    context.nextToken();
                    networkSite.setStatusReason(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return networkSite;
    }

    private static NetworkSiteJsonUnmarshaller instance;

    public static NetworkSiteJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new NetworkSiteJsonUnmarshaller();
        return instance;
    }
}
