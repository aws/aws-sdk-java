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
package com.amazonaws.services.workspacesweb.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.workspacesweb.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * PortalSummary JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PortalSummaryJsonUnmarshaller implements Unmarshaller<PortalSummary, JsonUnmarshallerContext> {

    public PortalSummary unmarshall(JsonUnmarshallerContext context) throws Exception {
        PortalSummary portalSummary = new PortalSummary();

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
                if (context.testExpression("browserSettingsArn", targetDepth)) {
                    context.nextToken();
                    portalSummary.setBrowserSettingsArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("browserType", targetDepth)) {
                    context.nextToken();
                    portalSummary.setBrowserType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("creationDate", targetDepth)) {
                    context.nextToken();
                    portalSummary.setCreationDate(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("displayName", targetDepth)) {
                    context.nextToken();
                    portalSummary.setDisplayName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("networkSettingsArn", targetDepth)) {
                    context.nextToken();
                    portalSummary.setNetworkSettingsArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("portalArn", targetDepth)) {
                    context.nextToken();
                    portalSummary.setPortalArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("portalEndpoint", targetDepth)) {
                    context.nextToken();
                    portalSummary.setPortalEndpoint(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("portalStatus", targetDepth)) {
                    context.nextToken();
                    portalSummary.setPortalStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("rendererType", targetDepth)) {
                    context.nextToken();
                    portalSummary.setRendererType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("trustStoreArn", targetDepth)) {
                    context.nextToken();
                    portalSummary.setTrustStoreArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("userAccessLoggingSettingsArn", targetDepth)) {
                    context.nextToken();
                    portalSummary.setUserAccessLoggingSettingsArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("userSettingsArn", targetDepth)) {
                    context.nextToken();
                    portalSummary.setUserSettingsArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return portalSummary;
    }

    private static PortalSummaryJsonUnmarshaller instance;

    public static PortalSummaryJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new PortalSummaryJsonUnmarshaller();
        return instance;
    }
}
