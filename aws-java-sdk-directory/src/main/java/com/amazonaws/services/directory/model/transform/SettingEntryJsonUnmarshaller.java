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
package com.amazonaws.services.directory.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.directory.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * SettingEntry JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SettingEntryJsonUnmarshaller implements Unmarshaller<SettingEntry, JsonUnmarshallerContext> {

    public SettingEntry unmarshall(JsonUnmarshallerContext context) throws Exception {
        SettingEntry settingEntry = new SettingEntry();

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
                if (context.testExpression("Type", targetDepth)) {
                    context.nextToken();
                    settingEntry.setType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Name", targetDepth)) {
                    context.nextToken();
                    settingEntry.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("AllowedValues", targetDepth)) {
                    context.nextToken();
                    settingEntry.setAllowedValues(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("AppliedValue", targetDepth)) {
                    context.nextToken();
                    settingEntry.setAppliedValue(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("RequestedValue", targetDepth)) {
                    context.nextToken();
                    settingEntry.setRequestedValue(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("RequestStatus", targetDepth)) {
                    context.nextToken();
                    settingEntry.setRequestStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("RequestDetailedStatus", targetDepth)) {
                    context.nextToken();
                    settingEntry.setRequestDetailedStatus(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context
                            .getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("RequestStatusMessage", targetDepth)) {
                    context.nextToken();
                    settingEntry.setRequestStatusMessage(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LastUpdatedDateTime", targetDepth)) {
                    context.nextToken();
                    settingEntry.setLastUpdatedDateTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("LastRequestedDateTime", targetDepth)) {
                    context.nextToken();
                    settingEntry.setLastRequestedDateTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return settingEntry;
    }

    private static SettingEntryJsonUnmarshaller instance;

    public static SettingEntryJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new SettingEntryJsonUnmarshaller();
        return instance;
    }
}
