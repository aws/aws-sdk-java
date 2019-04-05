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
package com.amazonaws.services.lightsail.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.lightsail.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * RelationalDatabaseSnapshot JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RelationalDatabaseSnapshotJsonUnmarshaller implements Unmarshaller<RelationalDatabaseSnapshot, JsonUnmarshallerContext> {

    public RelationalDatabaseSnapshot unmarshall(JsonUnmarshallerContext context) throws Exception {
        RelationalDatabaseSnapshot relationalDatabaseSnapshot = new RelationalDatabaseSnapshot();

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
                if (context.testExpression("name", targetDepth)) {
                    context.nextToken();
                    relationalDatabaseSnapshot.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("arn", targetDepth)) {
                    context.nextToken();
                    relationalDatabaseSnapshot.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("supportCode", targetDepth)) {
                    context.nextToken();
                    relationalDatabaseSnapshot.setSupportCode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("createdAt", targetDepth)) {
                    context.nextToken();
                    relationalDatabaseSnapshot.setCreatedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("location", targetDepth)) {
                    context.nextToken();
                    relationalDatabaseSnapshot.setLocation(ResourceLocationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("resourceType", targetDepth)) {
                    context.nextToken();
                    relationalDatabaseSnapshot.setResourceType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("tags", targetDepth)) {
                    context.nextToken();
                    relationalDatabaseSnapshot.setTags(new ListUnmarshaller<Tag>(TagJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("engine", targetDepth)) {
                    context.nextToken();
                    relationalDatabaseSnapshot.setEngine(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("engineVersion", targetDepth)) {
                    context.nextToken();
                    relationalDatabaseSnapshot.setEngineVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("sizeInGb", targetDepth)) {
                    context.nextToken();
                    relationalDatabaseSnapshot.setSizeInGb(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("state", targetDepth)) {
                    context.nextToken();
                    relationalDatabaseSnapshot.setState(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("fromRelationalDatabaseName", targetDepth)) {
                    context.nextToken();
                    relationalDatabaseSnapshot.setFromRelationalDatabaseName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("fromRelationalDatabaseArn", targetDepth)) {
                    context.nextToken();
                    relationalDatabaseSnapshot.setFromRelationalDatabaseArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("fromRelationalDatabaseBundleId", targetDepth)) {
                    context.nextToken();
                    relationalDatabaseSnapshot.setFromRelationalDatabaseBundleId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("fromRelationalDatabaseBlueprintId", targetDepth)) {
                    context.nextToken();
                    relationalDatabaseSnapshot.setFromRelationalDatabaseBlueprintId(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return relationalDatabaseSnapshot;
    }

    private static RelationalDatabaseSnapshotJsonUnmarshaller instance;

    public static RelationalDatabaseSnapshotJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new RelationalDatabaseSnapshotJsonUnmarshaller();
        return instance;
    }
}
