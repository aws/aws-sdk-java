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
 * RestoreEventDataStoreResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RestoreEventDataStoreResultJsonUnmarshaller implements Unmarshaller<RestoreEventDataStoreResult, JsonUnmarshallerContext> {

    public RestoreEventDataStoreResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        RestoreEventDataStoreResult restoreEventDataStoreResult = new RestoreEventDataStoreResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return restoreEventDataStoreResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("EventDataStoreArn", targetDepth)) {
                    context.nextToken();
                    restoreEventDataStoreResult.setEventDataStoreArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Name", targetDepth)) {
                    context.nextToken();
                    restoreEventDataStoreResult.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    context.nextToken();
                    restoreEventDataStoreResult.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("AdvancedEventSelectors", targetDepth)) {
                    context.nextToken();
                    restoreEventDataStoreResult.setAdvancedEventSelectors(new ListUnmarshaller<AdvancedEventSelector>(AdvancedEventSelectorJsonUnmarshaller
                            .getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("MultiRegionEnabled", targetDepth)) {
                    context.nextToken();
                    restoreEventDataStoreResult.setMultiRegionEnabled(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("OrganizationEnabled", targetDepth)) {
                    context.nextToken();
                    restoreEventDataStoreResult.setOrganizationEnabled(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("RetentionPeriod", targetDepth)) {
                    context.nextToken();
                    restoreEventDataStoreResult.setRetentionPeriod(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("TerminationProtectionEnabled", targetDepth)) {
                    context.nextToken();
                    restoreEventDataStoreResult.setTerminationProtectionEnabled(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("CreatedTimestamp", targetDepth)) {
                    context.nextToken();
                    restoreEventDataStoreResult.setCreatedTimestamp(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("UpdatedTimestamp", targetDepth)) {
                    context.nextToken();
                    restoreEventDataStoreResult.setUpdatedTimestamp(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("KmsKeyId", targetDepth)) {
                    context.nextToken();
                    restoreEventDataStoreResult.setKmsKeyId(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return restoreEventDataStoreResult;
    }

    private static RestoreEventDataStoreResultJsonUnmarshaller instance;

    public static RestoreEventDataStoreResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new RestoreEventDataStoreResultJsonUnmarshaller();
        return instance;
    }
}
