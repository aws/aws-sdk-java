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
package com.amazonaws.services.simplesystemsmanagement.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.simplesystemsmanagement.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * ResourceDataSyncItem JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResourceDataSyncItemJsonUnmarshaller implements Unmarshaller<ResourceDataSyncItem, JsonUnmarshallerContext> {

    public ResourceDataSyncItem unmarshall(JsonUnmarshallerContext context) throws Exception {
        ResourceDataSyncItem resourceDataSyncItem = new ResourceDataSyncItem();

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
                if (context.testExpression("SyncName", targetDepth)) {
                    context.nextToken();
                    resourceDataSyncItem.setSyncName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("S3Destination", targetDepth)) {
                    context.nextToken();
                    resourceDataSyncItem.setS3Destination(ResourceDataSyncS3DestinationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("LastSyncTime", targetDepth)) {
                    context.nextToken();
                    resourceDataSyncItem.setLastSyncTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("LastSuccessfulSyncTime", targetDepth)) {
                    context.nextToken();
                    resourceDataSyncItem.setLastSuccessfulSyncTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("LastStatus", targetDepth)) {
                    context.nextToken();
                    resourceDataSyncItem.setLastStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SyncCreatedTime", targetDepth)) {
                    context.nextToken();
                    resourceDataSyncItem.setSyncCreatedTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("LastSyncStatusMessage", targetDepth)) {
                    context.nextToken();
                    resourceDataSyncItem.setLastSyncStatusMessage(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return resourceDataSyncItem;
    }

    private static ResourceDataSyncItemJsonUnmarshaller instance;

    public static ResourceDataSyncItemJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ResourceDataSyncItemJsonUnmarshaller();
        return instance;
    }
}
