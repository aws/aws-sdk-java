/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.lookoutmetrics.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.lookoutmetrics.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * RDSSourceConfig JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RDSSourceConfigJsonUnmarshaller implements Unmarshaller<RDSSourceConfig, JsonUnmarshallerContext> {

    public RDSSourceConfig unmarshall(JsonUnmarshallerContext context) throws Exception {
        RDSSourceConfig rDSSourceConfig = new RDSSourceConfig();

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
                if (context.testExpression("DBInstanceIdentifier", targetDepth)) {
                    context.nextToken();
                    rDSSourceConfig.setDBInstanceIdentifier(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DatabaseHost", targetDepth)) {
                    context.nextToken();
                    rDSSourceConfig.setDatabaseHost(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DatabasePort", targetDepth)) {
                    context.nextToken();
                    rDSSourceConfig.setDatabasePort(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("SecretManagerArn", targetDepth)) {
                    context.nextToken();
                    rDSSourceConfig.setSecretManagerArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DatabaseName", targetDepth)) {
                    context.nextToken();
                    rDSSourceConfig.setDatabaseName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("TableName", targetDepth)) {
                    context.nextToken();
                    rDSSourceConfig.setTableName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("RoleArn", targetDepth)) {
                    context.nextToken();
                    rDSSourceConfig.setRoleArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("VpcConfiguration", targetDepth)) {
                    context.nextToken();
                    rDSSourceConfig.setVpcConfiguration(VpcConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return rDSSourceConfig;
    }

    private static RDSSourceConfigJsonUnmarshaller instance;

    public static RDSSourceConfigJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new RDSSourceConfigJsonUnmarshaller();
        return instance;
    }
}
