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
package com.amazonaws.services.kinesisanalyticsv2.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.kinesisanalyticsv2.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * ApplicationConfigurationDescription JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ApplicationConfigurationDescriptionJsonUnmarshaller implements Unmarshaller<ApplicationConfigurationDescription, JsonUnmarshallerContext> {

    public ApplicationConfigurationDescription unmarshall(JsonUnmarshallerContext context) throws Exception {
        ApplicationConfigurationDescription applicationConfigurationDescription = new ApplicationConfigurationDescription();

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
                if (context.testExpression("SqlApplicationConfigurationDescription", targetDepth)) {
                    context.nextToken();
                    applicationConfigurationDescription.setSqlApplicationConfigurationDescription(SqlApplicationConfigurationDescriptionJsonUnmarshaller
                            .getInstance().unmarshall(context));
                }
                if (context.testExpression("ApplicationCodeConfigurationDescription", targetDepth)) {
                    context.nextToken();
                    applicationConfigurationDescription.setApplicationCodeConfigurationDescription(ApplicationCodeConfigurationDescriptionJsonUnmarshaller
                            .getInstance().unmarshall(context));
                }
                if (context.testExpression("RunConfigurationDescription", targetDepth)) {
                    context.nextToken();
                    applicationConfigurationDescription.setRunConfigurationDescription(RunConfigurationDescriptionJsonUnmarshaller.getInstance().unmarshall(
                            context));
                }
                if (context.testExpression("FlinkApplicationConfigurationDescription", targetDepth)) {
                    context.nextToken();
                    applicationConfigurationDescription.setFlinkApplicationConfigurationDescription(FlinkApplicationConfigurationDescriptionJsonUnmarshaller
                            .getInstance().unmarshall(context));
                }
                if (context.testExpression("EnvironmentPropertyDescriptions", targetDepth)) {
                    context.nextToken();
                    applicationConfigurationDescription.setEnvironmentPropertyDescriptions(EnvironmentPropertyDescriptionsJsonUnmarshaller.getInstance()
                            .unmarshall(context));
                }
                if (context.testExpression("ApplicationSnapshotConfigurationDescription", targetDepth)) {
                    context.nextToken();
                    applicationConfigurationDescription
                            .setApplicationSnapshotConfigurationDescription(ApplicationSnapshotConfigurationDescriptionJsonUnmarshaller.getInstance()
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

        return applicationConfigurationDescription;
    }

    private static ApplicationConfigurationDescriptionJsonUnmarshaller instance;

    public static ApplicationConfigurationDescriptionJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ApplicationConfigurationDescriptionJsonUnmarshaller();
        return instance;
    }
}
