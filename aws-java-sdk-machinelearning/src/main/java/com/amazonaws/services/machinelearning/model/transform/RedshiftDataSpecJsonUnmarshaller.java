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
package com.amazonaws.services.machinelearning.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.machinelearning.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * RedshiftDataSpec JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RedshiftDataSpecJsonUnmarshaller implements Unmarshaller<RedshiftDataSpec, JsonUnmarshallerContext> {

    public RedshiftDataSpec unmarshall(JsonUnmarshallerContext context) throws Exception {
        RedshiftDataSpec redshiftDataSpec = new RedshiftDataSpec();

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
                if (context.testExpression("DatabaseInformation", targetDepth)) {
                    context.nextToken();
                    redshiftDataSpec.setDatabaseInformation(RedshiftDatabaseJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("SelectSqlQuery", targetDepth)) {
                    context.nextToken();
                    redshiftDataSpec.setSelectSqlQuery(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DatabaseCredentials", targetDepth)) {
                    context.nextToken();
                    redshiftDataSpec.setDatabaseCredentials(RedshiftDatabaseCredentialsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("S3StagingLocation", targetDepth)) {
                    context.nextToken();
                    redshiftDataSpec.setS3StagingLocation(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DataRearrangement", targetDepth)) {
                    context.nextToken();
                    redshiftDataSpec.setDataRearrangement(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DataSchema", targetDepth)) {
                    context.nextToken();
                    redshiftDataSpec.setDataSchema(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DataSchemaUri", targetDepth)) {
                    context.nextToken();
                    redshiftDataSpec.setDataSchemaUri(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return redshiftDataSpec;
    }

    private static RedshiftDataSpecJsonUnmarshaller instance;

    public static RedshiftDataSpecJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new RedshiftDataSpecJsonUnmarshaller();
        return instance;
    }
}
