/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.snowball.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.snowball.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * LongTermPricingListEntry JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LongTermPricingListEntryJsonUnmarshaller implements Unmarshaller<LongTermPricingListEntry, JsonUnmarshallerContext> {

    public LongTermPricingListEntry unmarshall(JsonUnmarshallerContext context) throws Exception {
        LongTermPricingListEntry longTermPricingListEntry = new LongTermPricingListEntry();

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
                if (context.testExpression("LongTermPricingId", targetDepth)) {
                    context.nextToken();
                    longTermPricingListEntry.setLongTermPricingId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LongTermPricingEndDate", targetDepth)) {
                    context.nextToken();
                    longTermPricingListEntry.setLongTermPricingEndDate(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("LongTermPricingStartDate", targetDepth)) {
                    context.nextToken();
                    longTermPricingListEntry.setLongTermPricingStartDate(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("LongTermPricingType", targetDepth)) {
                    context.nextToken();
                    longTermPricingListEntry.setLongTermPricingType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CurrentActiveJob", targetDepth)) {
                    context.nextToken();
                    longTermPricingListEntry.setCurrentActiveJob(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ReplacementJob", targetDepth)) {
                    context.nextToken();
                    longTermPricingListEntry.setReplacementJob(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("IsLongTermPricingAutoRenew", targetDepth)) {
                    context.nextToken();
                    longTermPricingListEntry.setIsLongTermPricingAutoRenew(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("LongTermPricingStatus", targetDepth)) {
                    context.nextToken();
                    longTermPricingListEntry.setLongTermPricingStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SnowballType", targetDepth)) {
                    context.nextToken();
                    longTermPricingListEntry.setSnowballType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("JobIds", targetDepth)) {
                    context.nextToken();
                    longTermPricingListEntry.setJobIds(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return longTermPricingListEntry;
    }

    private static LongTermPricingListEntryJsonUnmarshaller instance;

    public static LongTermPricingListEntryJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new LongTermPricingListEntryJsonUnmarshaller();
        return instance;
    }
}
