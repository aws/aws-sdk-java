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
 * TreatmentResource JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TreatmentResourceJsonUnmarshaller implements Unmarshaller<TreatmentResource, JsonUnmarshallerContext> {

    public TreatmentResource unmarshall(JsonUnmarshallerContext context) throws Exception {
        TreatmentResource treatmentResource = new TreatmentResource();

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
                if (context.testExpression("Id", targetDepth)) {
                    context.nextToken();
                    treatmentResource.setId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("MessageConfiguration", targetDepth)) {
                    context.nextToken();
                    treatmentResource.setMessageConfiguration(MessageConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Schedule", targetDepth)) {
                    context.nextToken();
                    treatmentResource.setSchedule(ScheduleJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("SizePercent", targetDepth)) {
                    context.nextToken();
                    treatmentResource.setSizePercent(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("State", targetDepth)) {
                    context.nextToken();
                    treatmentResource.setState(CampaignStateJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("TreatmentDescription", targetDepth)) {
                    context.nextToken();
                    treatmentResource.setTreatmentDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("TreatmentName", targetDepth)) {
                    context.nextToken();
                    treatmentResource.setTreatmentName(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return treatmentResource;
    }

    private static TreatmentResourceJsonUnmarshaller instance;

    public static TreatmentResourceJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new TreatmentResourceJsonUnmarshaller();
        return instance;
    }
}
