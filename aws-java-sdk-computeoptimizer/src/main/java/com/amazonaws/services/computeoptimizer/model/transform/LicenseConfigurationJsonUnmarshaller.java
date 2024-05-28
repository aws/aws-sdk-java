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
package com.amazonaws.services.computeoptimizer.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.computeoptimizer.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * LicenseConfiguration JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LicenseConfigurationJsonUnmarshaller implements Unmarshaller<LicenseConfiguration, JsonUnmarshallerContext> {

    public LicenseConfiguration unmarshall(JsonUnmarshallerContext context) throws Exception {
        LicenseConfiguration licenseConfiguration = new LicenseConfiguration();

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
                if (context.testExpression("numberOfCores", targetDepth)) {
                    context.nextToken();
                    licenseConfiguration.setNumberOfCores(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("instanceType", targetDepth)) {
                    context.nextToken();
                    licenseConfiguration.setInstanceType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("operatingSystem", targetDepth)) {
                    context.nextToken();
                    licenseConfiguration.setOperatingSystem(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("licenseEdition", targetDepth)) {
                    context.nextToken();
                    licenseConfiguration.setLicenseEdition(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("licenseName", targetDepth)) {
                    context.nextToken();
                    licenseConfiguration.setLicenseName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("licenseModel", targetDepth)) {
                    context.nextToken();
                    licenseConfiguration.setLicenseModel(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("licenseVersion", targetDepth)) {
                    context.nextToken();
                    licenseConfiguration.setLicenseVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("metricsSource", targetDepth)) {
                    context.nextToken();
                    licenseConfiguration.setMetricsSource(new ListUnmarshaller<MetricSource>(MetricSourceJsonUnmarshaller.getInstance())

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

        return licenseConfiguration;
    }

    private static LicenseConfigurationJsonUnmarshaller instance;

    public static LicenseConfigurationJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new LicenseConfigurationJsonUnmarshaller();
        return instance;
    }
}
