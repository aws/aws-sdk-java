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
package com.amazonaws.services.gluedatabrew.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.gluedatabrew.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * ProfileConfiguration JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ProfileConfigurationJsonUnmarshaller implements Unmarshaller<ProfileConfiguration, JsonUnmarshallerContext> {

    public ProfileConfiguration unmarshall(JsonUnmarshallerContext context) throws Exception {
        ProfileConfiguration profileConfiguration = new ProfileConfiguration();

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
                if (context.testExpression("DatasetStatisticsConfiguration", targetDepth)) {
                    context.nextToken();
                    profileConfiguration.setDatasetStatisticsConfiguration(StatisticsConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ProfileColumns", targetDepth)) {
                    context.nextToken();
                    profileConfiguration.setProfileColumns(new ListUnmarshaller<ColumnSelector>(ColumnSelectorJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("ColumnStatisticsConfigurations", targetDepth)) {
                    context.nextToken();
                    profileConfiguration.setColumnStatisticsConfigurations(new ListUnmarshaller<ColumnStatisticsConfiguration>(
                            ColumnStatisticsConfigurationJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("EntityDetectorConfiguration", targetDepth)) {
                    context.nextToken();
                    profileConfiguration.setEntityDetectorConfiguration(EntityDetectorConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return profileConfiguration;
    }

    private static ProfileConfigurationJsonUnmarshaller instance;

    public static ProfileConfigurationJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ProfileConfigurationJsonUnmarshaller();
        return instance;
    }
}
