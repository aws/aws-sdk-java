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
package com.amazonaws.services.finspace.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.finspace.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * KxDataviewListEntry JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class KxDataviewListEntryJsonUnmarshaller implements Unmarshaller<KxDataviewListEntry, JsonUnmarshallerContext> {

    public KxDataviewListEntry unmarshall(JsonUnmarshallerContext context) throws Exception {
        KxDataviewListEntry kxDataviewListEntry = new KxDataviewListEntry();

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
                if (context.testExpression("environmentId", targetDepth)) {
                    context.nextToken();
                    kxDataviewListEntry.setEnvironmentId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("databaseName", targetDepth)) {
                    context.nextToken();
                    kxDataviewListEntry.setDatabaseName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("dataviewName", targetDepth)) {
                    context.nextToken();
                    kxDataviewListEntry.setDataviewName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("azMode", targetDepth)) {
                    context.nextToken();
                    kxDataviewListEntry.setAzMode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("availabilityZoneId", targetDepth)) {
                    context.nextToken();
                    kxDataviewListEntry.setAvailabilityZoneId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("changesetId", targetDepth)) {
                    context.nextToken();
                    kxDataviewListEntry.setChangesetId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("segmentConfigurations", targetDepth)) {
                    context.nextToken();
                    kxDataviewListEntry.setSegmentConfigurations(new ListUnmarshaller<KxDataviewSegmentConfiguration>(
                            KxDataviewSegmentConfigurationJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("activeVersions", targetDepth)) {
                    context.nextToken();
                    kxDataviewListEntry.setActiveVersions(new ListUnmarshaller<KxDataviewActiveVersion>(KxDataviewActiveVersionJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("status", targetDepth)) {
                    context.nextToken();
                    kxDataviewListEntry.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("description", targetDepth)) {
                    context.nextToken();
                    kxDataviewListEntry.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("autoUpdate", targetDepth)) {
                    context.nextToken();
                    kxDataviewListEntry.setAutoUpdate(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("readWrite", targetDepth)) {
                    context.nextToken();
                    kxDataviewListEntry.setReadWrite(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("createdTimestamp", targetDepth)) {
                    context.nextToken();
                    kxDataviewListEntry.setCreatedTimestamp(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("lastModifiedTimestamp", targetDepth)) {
                    context.nextToken();
                    kxDataviewListEntry.setLastModifiedTimestamp(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("statusReason", targetDepth)) {
                    context.nextToken();
                    kxDataviewListEntry.setStatusReason(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return kxDataviewListEntry;
    }

    private static KxDataviewListEntryJsonUnmarshaller instance;

    public static KxDataviewListEntryJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new KxDataviewListEntryJsonUnmarshaller();
        return instance;
    }
}
