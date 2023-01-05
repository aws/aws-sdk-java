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
package com.amazonaws.services.pinpoint.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.pinpoint.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * CampaignInAppMessage JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CampaignInAppMessageJsonUnmarshaller implements Unmarshaller<CampaignInAppMessage, JsonUnmarshallerContext> {

    public CampaignInAppMessage unmarshall(JsonUnmarshallerContext context) throws Exception {
        CampaignInAppMessage campaignInAppMessage = new CampaignInAppMessage();

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
                if (context.testExpression("Body", targetDepth)) {
                    context.nextToken();
                    campaignInAppMessage.setBody(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Content", targetDepth)) {
                    context.nextToken();
                    campaignInAppMessage.setContent(new ListUnmarshaller<InAppMessageContent>(InAppMessageContentJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("CustomConfig", targetDepth)) {
                    context.nextToken();
                    campaignInAppMessage.setCustomConfig(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context
                            .getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("Layout", targetDepth)) {
                    context.nextToken();
                    campaignInAppMessage.setLayout(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return campaignInAppMessage;
    }

    private static CampaignInAppMessageJsonUnmarshaller instance;

    public static CampaignInAppMessageJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CampaignInAppMessageJsonUnmarshaller();
        return instance;
    }
}
