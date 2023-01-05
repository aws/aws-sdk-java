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
 * InAppMessageCampaign JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InAppMessageCampaignJsonUnmarshaller implements Unmarshaller<InAppMessageCampaign, JsonUnmarshallerContext> {

    public InAppMessageCampaign unmarshall(JsonUnmarshallerContext context) throws Exception {
        InAppMessageCampaign inAppMessageCampaign = new InAppMessageCampaign();

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
                if (context.testExpression("CampaignId", targetDepth)) {
                    context.nextToken();
                    inAppMessageCampaign.setCampaignId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DailyCap", targetDepth)) {
                    context.nextToken();
                    inAppMessageCampaign.setDailyCap(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("InAppMessage", targetDepth)) {
                    context.nextToken();
                    inAppMessageCampaign.setInAppMessage(InAppMessageJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Priority", targetDepth)) {
                    context.nextToken();
                    inAppMessageCampaign.setPriority(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("Schedule", targetDepth)) {
                    context.nextToken();
                    inAppMessageCampaign.setSchedule(InAppCampaignScheduleJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("SessionCap", targetDepth)) {
                    context.nextToken();
                    inAppMessageCampaign.setSessionCap(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("TotalCap", targetDepth)) {
                    context.nextToken();
                    inAppMessageCampaign.setTotalCap(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("TreatmentId", targetDepth)) {
                    context.nextToken();
                    inAppMessageCampaign.setTreatmentId(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return inAppMessageCampaign;
    }

    private static InAppMessageCampaignJsonUnmarshaller instance;

    public static InAppMessageCampaignJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new InAppMessageCampaignJsonUnmarshaller();
        return instance;
    }
}
