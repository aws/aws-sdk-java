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
 * DatabaseInstanceSoftwareDetailsResponse JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DatabaseInstanceSoftwareDetailsResponseJsonUnmarshaller implements Unmarshaller<DatabaseInstanceSoftwareDetailsResponse, JsonUnmarshallerContext> {

    public DatabaseInstanceSoftwareDetailsResponse unmarshall(JsonUnmarshallerContext context) throws Exception {
        DatabaseInstanceSoftwareDetailsResponse databaseInstanceSoftwareDetailsResponse = new DatabaseInstanceSoftwareDetailsResponse();

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
                if (context.testExpression("Engine", targetDepth)) {
                    context.nextToken();
                    databaseInstanceSoftwareDetailsResponse.setEngine(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EngineVersion", targetDepth)) {
                    context.nextToken();
                    databaseInstanceSoftwareDetailsResponse.setEngineVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EngineEdition", targetDepth)) {
                    context.nextToken();
                    databaseInstanceSoftwareDetailsResponse.setEngineEdition(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ServicePack", targetDepth)) {
                    context.nextToken();
                    databaseInstanceSoftwareDetailsResponse.setServicePack(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SupportLevel", targetDepth)) {
                    context.nextToken();
                    databaseInstanceSoftwareDetailsResponse.setSupportLevel(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("OsArchitecture", targetDepth)) {
                    context.nextToken();
                    databaseInstanceSoftwareDetailsResponse.setOsArchitecture(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("Tooltip", targetDepth)) {
                    context.nextToken();
                    databaseInstanceSoftwareDetailsResponse.setTooltip(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return databaseInstanceSoftwareDetailsResponse;
    }

    private static DatabaseInstanceSoftwareDetailsResponseJsonUnmarshaller instance;

    public static DatabaseInstanceSoftwareDetailsResponseJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DatabaseInstanceSoftwareDetailsResponseJsonUnmarshaller();
        return instance;
    }
}
