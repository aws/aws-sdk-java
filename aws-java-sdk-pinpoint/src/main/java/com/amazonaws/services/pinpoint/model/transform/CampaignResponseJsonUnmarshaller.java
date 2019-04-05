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
 * CampaignResponse JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CampaignResponseJsonUnmarshaller implements Unmarshaller<CampaignResponse, JsonUnmarshallerContext> {

    public CampaignResponse unmarshall(JsonUnmarshallerContext context) throws Exception {
        CampaignResponse campaignResponse = new CampaignResponse();

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
                    campaignResponse.setAdditionalTreatments(new ListUnmarshaller<TreatmentResource>(TreatmentResourceJsonUnmarshaller.getInstance())
                            .unmarshall(context));
                }
                if (context.testExpression("ApplicationId", targetDepth)) {
                    context.nextToken();
                    campaignResponse.setApplicationId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Arn", targetDepth)) {
                    context.nextToken();
                    campaignResponse.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreationDate", targetDepth)) {
                    context.nextToken();
                    campaignResponse.setCreationDate(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DefaultState", targetDepth)) {
                    context.nextToken();
                    campaignResponse.setDefaultState(CampaignStateJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Description", targetDepth)) {
                    context.nextToken();
                    campaignResponse.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("HoldoutPercent", targetDepth)) {
                    context.nextToken();
                    campaignResponse.setHoldoutPercent(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("Hook", targetDepth)) {
                    context.nextToken();
                    campaignResponse.setHook(CampaignHookJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Id", targetDepth)) {
                    context.nextToken();
                    campaignResponse.setId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("IsPaused", targetDepth)) {
                    context.nextToken();
                    campaignResponse.setIsPaused(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("LastModifiedDate", targetDepth)) {
                    context.nextToken();
                    campaignResponse.setLastModifiedDate(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Limits", targetDepth)) {
                    context.nextToken();
                    campaignResponse.setLimits(CampaignLimitsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("MessageConfiguration", targetDepth)) {
                    context.nextToken();
                    campaignResponse.setMessageConfiguration(MessageConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Name", targetDepth)) {
                    context.nextToken();
                    campaignResponse.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Schedule", targetDepth)) {
                    context.nextToken();
                    campaignResponse.setSchedule(ScheduleJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("SegmentId", targetDepth)) {
                    context.nextToken();
                    campaignResponse.setSegmentId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SegmentVersion", targetDepth)) {
                    context.nextToken();
                    campaignResponse.setSegmentVersion(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("State", targetDepth)) {
                    context.nextToken();
                    campaignResponse.setState(CampaignStateJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("tags", targetDepth)) {
                    context.nextToken();
                    campaignResponse.setTags(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context.getUnmarshaller(String.class))
                            .unmarshall(context));
                }
                if (context.testExpression("TreatmentDescription", targetDepth)) {
                    context.nextToken();
                    campaignResponse.setTreatmentDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("TreatmentName", targetDepth)) {
                    context.nextToken();
                    campaignResponse.setTreatmentName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Version", targetDepth)) {
                    context.nextToken();
                    campaignResponse.setVersion(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return campaignResponse;
    }

    private static CampaignResponseJsonUnmarshaller instance;

    public static CampaignResponseJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CampaignResponseJsonUnmarshaller();
        return instance;
    }
}
