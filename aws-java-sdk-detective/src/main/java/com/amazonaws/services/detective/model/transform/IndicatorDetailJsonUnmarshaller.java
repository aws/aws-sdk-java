/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.detective.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.detective.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * IndicatorDetail JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class IndicatorDetailJsonUnmarshaller implements Unmarshaller<IndicatorDetail, JsonUnmarshallerContext> {

    public IndicatorDetail unmarshall(JsonUnmarshallerContext context) throws Exception {
        IndicatorDetail indicatorDetail = new IndicatorDetail();

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
                if (context.testExpression("TTPsObservedDetail", targetDepth)) {
                    context.nextToken();
                    indicatorDetail.setTTPsObservedDetail(TTPsObservedDetailJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ImpossibleTravelDetail", targetDepth)) {
                    context.nextToken();
                    indicatorDetail.setImpossibleTravelDetail(ImpossibleTravelDetailJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("FlaggedIpAddressDetail", targetDepth)) {
                    context.nextToken();
                    indicatorDetail.setFlaggedIpAddressDetail(FlaggedIpAddressDetailJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("NewGeolocationDetail", targetDepth)) {
                    context.nextToken();
                    indicatorDetail.setNewGeolocationDetail(NewGeolocationDetailJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("NewAsoDetail", targetDepth)) {
                    context.nextToken();
                    indicatorDetail.setNewAsoDetail(NewAsoDetailJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("NewUserAgentDetail", targetDepth)) {
                    context.nextToken();
                    indicatorDetail.setNewUserAgentDetail(NewUserAgentDetailJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("RelatedFindingDetail", targetDepth)) {
                    context.nextToken();
                    indicatorDetail.setRelatedFindingDetail(RelatedFindingDetailJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("RelatedFindingGroupDetail", targetDepth)) {
                    context.nextToken();
                    indicatorDetail.setRelatedFindingGroupDetail(RelatedFindingGroupDetailJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return indicatorDetail;
    }

    private static IndicatorDetailJsonUnmarshaller instance;

    public static IndicatorDetailJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new IndicatorDetailJsonUnmarshaller();
        return instance;
    }
}
