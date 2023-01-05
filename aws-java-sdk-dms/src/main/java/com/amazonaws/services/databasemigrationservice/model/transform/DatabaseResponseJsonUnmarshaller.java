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
package com.amazonaws.services.databasemigrationservice.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.databasemigrationservice.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * DatabaseResponse JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DatabaseResponseJsonUnmarshaller implements Unmarshaller<DatabaseResponse, JsonUnmarshallerContext> {

    public DatabaseResponse unmarshall(JsonUnmarshallerContext context) throws Exception {
        DatabaseResponse databaseResponse = new DatabaseResponse();

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
                if (context.testExpression("DatabaseId", targetDepth)) {
                    context.nextToken();
                    databaseResponse.setDatabaseId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DatabaseName", targetDepth)) {
                    context.nextToken();
                    databaseResponse.setDatabaseName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("IpAddress", targetDepth)) {
                    context.nextToken();
                    databaseResponse.setIpAddress(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("NumberOfSchemas", targetDepth)) {
                    context.nextToken();
                    databaseResponse.setNumberOfSchemas(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("Server", targetDepth)) {
                    context.nextToken();
                    databaseResponse.setServer(ServerShortInfoResponseJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("SoftwareDetails", targetDepth)) {
                    context.nextToken();
                    databaseResponse.setSoftwareDetails(DatabaseInstanceSoftwareDetailsResponseJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Collectors", targetDepth)) {
                    context.nextToken();
                    databaseResponse.setCollectors(new ListUnmarshaller<CollectorShortInfoResponse>(CollectorShortInfoResponseJsonUnmarshaller.getInstance())

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

        return databaseResponse;
    }

    private static DatabaseResponseJsonUnmarshaller instance;

    public static DatabaseResponseJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DatabaseResponseJsonUnmarshaller();
        return instance;
    }
}
