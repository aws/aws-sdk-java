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
package com.amazonaws.services.cloudtrail.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.cloudtrail.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * UpdateEventDataStoreResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateEventDataStoreResultJsonUnmarshaller implements Unmarshaller<UpdateEventDataStoreResult, JsonUnmarshallerContext> {

    public UpdateEventDataStoreResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        UpdateEventDataStoreResult updateEventDataStoreResult = new UpdateEventDataStoreResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return updateEventDataStoreResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("EventDataStoreArn", targetDepth)) {
                    context.nextToken();
                    updateEventDataStoreResult.setEventDataStoreArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Name", targetDepth)) {
                    context.nextToken();
                    updateEventDataStoreResult.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    context.nextToken();
                    updateEventDataStoreResult.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("AdvancedEventSelectors", targetDepth)) {
                    context.nextToken();
                    updateEventDataStoreResult.setAdvancedEventSelectors(new ListUnmarshaller<AdvancedEventSelector>(AdvancedEventSelectorJsonUnmarshaller
                            .getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("MultiRegionEnabled", targetDepth)) {
                    context.nextToken();
                    updateEventDataStoreResult.setMultiRegionEnabled(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("OrganizationEnabled", targetDepth)) {
                    context.nextToken();
                    updateEventDataStoreResult.setOrganizationEnabled(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("RetentionPeriod", targetDepth)) {
                    context.nextToken();
                    updateEventDataStoreResult.setRetentionPeriod(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("TerminationProtectionEnabled", targetDepth)) {
                    context.nextToken();
                    updateEventDataStoreResult.setTerminationProtectionEnabled(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("CreatedTimestamp", targetDepth)) {
                    context.nextToken();
                    updateEventDataStoreResult.setCreatedTimestamp(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("UpdatedTimestamp", targetDepth)) {
                    context.nextToken();
                    updateEventDataStoreResult.setUpdatedTimestamp(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("KmsKeyId", targetDepth)) {
                    context.nextToken();
                    updateEventDataStoreResult.setKmsKeyId(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return updateEventDataStoreResult;
    }

    private static UpdateEventDataStoreResultJsonUnmarshaller instance;

    public static UpdateEventDataStoreResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new UpdateEventDataStoreResultJsonUnmarshaller();
        return instance;
    }
}
