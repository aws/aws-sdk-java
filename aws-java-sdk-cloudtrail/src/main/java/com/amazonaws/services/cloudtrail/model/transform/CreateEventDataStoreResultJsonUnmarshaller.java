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
 * CreateEventDataStoreResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateEventDataStoreResultJsonUnmarshaller implements Unmarshaller<CreateEventDataStoreResult, JsonUnmarshallerContext> {

    public CreateEventDataStoreResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        CreateEventDataStoreResult createEventDataStoreResult = new CreateEventDataStoreResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return createEventDataStoreResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("EventDataStoreArn", targetDepth)) {
                    context.nextToken();
                    createEventDataStoreResult.setEventDataStoreArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Name", targetDepth)) {
                    context.nextToken();
                    createEventDataStoreResult.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    context.nextToken();
                    createEventDataStoreResult.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("AdvancedEventSelectors", targetDepth)) {
                    context.nextToken();
                    createEventDataStoreResult.setAdvancedEventSelectors(new ListUnmarshaller<AdvancedEventSelector>(AdvancedEventSelectorJsonUnmarshaller
                            .getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("MultiRegionEnabled", targetDepth)) {
                    context.nextToken();
                    createEventDataStoreResult.setMultiRegionEnabled(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("OrganizationEnabled", targetDepth)) {
                    context.nextToken();
                    createEventDataStoreResult.setOrganizationEnabled(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("RetentionPeriod", targetDepth)) {
                    context.nextToken();
                    createEventDataStoreResult.setRetentionPeriod(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("TerminationProtectionEnabled", targetDepth)) {
                    context.nextToken();
                    createEventDataStoreResult.setTerminationProtectionEnabled(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("TagsList", targetDepth)) {
                    context.nextToken();
                    createEventDataStoreResult.setTagsList(new ListUnmarshaller<Tag>(TagJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("CreatedTimestamp", targetDepth)) {
                    context.nextToken();
                    createEventDataStoreResult.setCreatedTimestamp(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("UpdatedTimestamp", targetDepth)) {
                    context.nextToken();
                    createEventDataStoreResult.setUpdatedTimestamp(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("KmsKeyId", targetDepth)) {
                    context.nextToken();
                    createEventDataStoreResult.setKmsKeyId(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return createEventDataStoreResult;
    }

    private static CreateEventDataStoreResultJsonUnmarshaller instance;

    public static CreateEventDataStoreResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CreateEventDataStoreResultJsonUnmarshaller();
        return instance;
    }
}
