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
 * RDSDataSpec JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RDSDataSpecJsonUnmarshaller implements Unmarshaller<RDSDataSpec, JsonUnmarshallerContext> {

    public RDSDataSpec unmarshall(JsonUnmarshallerContext context) throws Exception {
        RDSDataSpec rDSDataSpec = new RDSDataSpec();

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
                    rDSDataSpec.setDatabaseInformation(RDSDatabaseJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("SelectSqlQuery", targetDepth)) {
                    context.nextToken();
                    rDSDataSpec.setSelectSqlQuery(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DatabaseCredentials", targetDepth)) {
                    context.nextToken();
                    rDSDataSpec.setDatabaseCredentials(RDSDatabaseCredentialsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("S3StagingLocation", targetDepth)) {
                    context.nextToken();
                    rDSDataSpec.setS3StagingLocation(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DataRearrangement", targetDepth)) {
                    context.nextToken();
                    rDSDataSpec.setDataRearrangement(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DataSchema", targetDepth)) {
                    context.nextToken();
                    rDSDataSpec.setDataSchema(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DataSchemaUri", targetDepth)) {
                    context.nextToken();
                    rDSDataSpec.setDataSchemaUri(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ResourceRole", targetDepth)) {
                    context.nextToken();
                    rDSDataSpec.setResourceRole(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ServiceRole", targetDepth)) {
                    context.nextToken();
                    rDSDataSpec.setServiceRole(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SubnetId", targetDepth)) {
                    context.nextToken();
                    rDSDataSpec.setSubnetId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SecurityGroupIds", targetDepth)) {
                    context.nextToken();
                    rDSDataSpec.setSecurityGroupIds(new ListUnmarshaller<String>(context.getUnmarshaller(String.class)).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return rDSDataSpec;
    }

    private static RDSDataSpecJsonUnmarshaller instance;

    public static RDSDataSpecJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new RDSDataSpecJsonUnmarshaller();
        return instance;
    }
}
