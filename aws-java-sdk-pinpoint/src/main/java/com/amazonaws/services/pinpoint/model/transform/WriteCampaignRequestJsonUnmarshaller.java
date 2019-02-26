/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * WriteCampaignRequest JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class WriteCampaignRequestJsonUnmarshaller implements Unmarshaller<WriteCampaignRequest, JsonUnmarshallerContext> {

    public WriteCampaignRequest unmarshall(JsonUnmarshallerContext context) throws Exception {
        WriteCampaignRequest writeCampaignRequest = new WriteCampaignRequest();

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
                if (context.testExpression("AdditionalTreatments", targetDepth)) {
                    context.nextToken();
                    writeCampaignRequest.setAdditionalTreatments(new ListUnmarshaller<WriteTreatmentResource>(WriteTreatmentResourceJsonUnmarshaller
                            .getInstance()).unmarshall(context));
                }
                if (context.testExpression("Description", targetDepth)) {
                    context.nextToken();
                    writeCampaignRequest.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("HoldoutPercent", targetDepth)) {
                    context.nextToken();
                    writeCampaignRequest.setHoldoutPercent(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("Hook", targetDepth)) {
                    context.nextToken();
                    writeCampaignRequest.setHook(CampaignHookJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("IsPaused", targetDepth)) {
                    context.nextToken();
                    writeCampaignRequest.setIsPaused(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("Limits", targetDepth)) {
                    context.nextToken();
                    writeCampaignRequest.setLimits(CampaignLimitsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("MessageConfiguration", targetDepth)) {
                    context.nextToken();
                    writeCampaignRequest.setMessageConfiguration(MessageConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Name", targetDepth)) {
                    context.nextToken();
                    writeCampaignRequest.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Schedule", targetDepth)) {
                    context.nextToken();
                    writeCampaignRequest.setSchedule(ScheduleJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("SegmentId", targetDepth)) {
                    context.nextToken();
                    writeCampaignRequest.setSegmentId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SegmentVersion", targetDepth)) {
                    context.nextToken();
                    writeCampaignRequest.setSegmentVersion(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("tags", targetDepth)) {
                    context.nextToken();
                    writeCampaignRequest.setTags(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context
                            .getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("TreatmentDescription", targetDepth)) {
                    context.nextToken();
                    writeCampaignRequest.setTreatmentDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("TreatmentName", targetDepth)) {
                    context.nextToken();
                    writeCampaignRequest.setTreatmentName(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return writeCampaignRequest;
    }

    private static WriteCampaignRequestJsonUnmarshaller instance;

    public static WriteCampaignRequestJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new WriteCampaignRequestJsonUnmarshaller();
        return instance;
    }
}
