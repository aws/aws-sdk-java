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
package com.amazonaws.services.databasemigrationservice.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.databasemigrationservice.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * MigrationProject JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MigrationProjectJsonUnmarshaller implements Unmarshaller<MigrationProject, JsonUnmarshallerContext> {

    public MigrationProject unmarshall(JsonUnmarshallerContext context) throws Exception {
        MigrationProject migrationProject = new MigrationProject();

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
                if (context.testExpression("MigrationProjectName", targetDepth)) {
                    context.nextToken();
                    migrationProject.setMigrationProjectName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("MigrationProjectArn", targetDepth)) {
                    context.nextToken();
                    migrationProject.setMigrationProjectArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("MigrationProjectCreationTime", targetDepth)) {
                    context.nextToken();
                    migrationProject.setMigrationProjectCreationTime(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("SourceDataProviderDescriptors", targetDepth)) {
                    context.nextToken();
                    migrationProject.setSourceDataProviderDescriptors(new ListUnmarshaller<DataProviderDescriptor>(DataProviderDescriptorJsonUnmarshaller
                            .getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("TargetDataProviderDescriptors", targetDepth)) {
                    context.nextToken();
                    migrationProject.setTargetDataProviderDescriptors(new ListUnmarshaller<DataProviderDescriptor>(DataProviderDescriptorJsonUnmarshaller
                            .getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("InstanceProfileArn", targetDepth)) {
                    context.nextToken();
                    migrationProject.setInstanceProfileArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("InstanceProfileName", targetDepth)) {
                    context.nextToken();
                    migrationProject.setInstanceProfileName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("TransformationRules", targetDepth)) {
                    context.nextToken();
                    migrationProject.setTransformationRules(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Description", targetDepth)) {
                    context.nextToken();
                    migrationProject.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SchemaConversionApplicationAttributes", targetDepth)) {
                    context.nextToken();
                    migrationProject.setSchemaConversionApplicationAttributes(SCApplicationAttributesJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return migrationProject;
    }

    private static MigrationProjectJsonUnmarshaller instance;

    public static MigrationProjectJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new MigrationProjectJsonUnmarshaller();
        return instance;
    }
}
