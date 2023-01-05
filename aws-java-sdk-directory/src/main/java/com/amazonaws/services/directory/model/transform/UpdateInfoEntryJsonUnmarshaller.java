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
 * UpdateInfoEntry JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateInfoEntryJsonUnmarshaller implements Unmarshaller<UpdateInfoEntry, JsonUnmarshallerContext> {

    public UpdateInfoEntry unmarshall(JsonUnmarshallerContext context) throws Exception {
        UpdateInfoEntry updateInfoEntry = new UpdateInfoEntry();

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
                if (context.testExpression("Region", targetDepth)) {
                    context.nextToken();
                    updateInfoEntry.setRegion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    context.nextToken();
                    updateInfoEntry.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("StatusReason", targetDepth)) {
                    context.nextToken();
                    updateInfoEntry.setStatusReason(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("InitiatedBy", targetDepth)) {
                    context.nextToken();
                    updateInfoEntry.setInitiatedBy(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("NewValue", targetDepth)) {
                    context.nextToken();
                    updateInfoEntry.setNewValue(UpdateValueJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("PreviousValue", targetDepth)) {
                    context.nextToken();
                    updateInfoEntry.setPreviousValue(UpdateValueJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("StartTime", targetDepth)) {
                    context.nextToken();
                    updateInfoEntry.setStartTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("LastUpdatedDateTime", targetDepth)) {
                    context.nextToken();
                    updateInfoEntry.setLastUpdatedDateTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return updateInfoEntry;
    }

    private static UpdateInfoEntryJsonUnmarshaller instance;

    public static UpdateInfoEntryJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new UpdateInfoEntryJsonUnmarshaller();
        return instance;
    }
}
