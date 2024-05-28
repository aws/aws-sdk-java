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
package com.amazonaws.services.applicationdiscovery.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.applicationdiscovery.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * Ec2RecommendationsExportPreferences JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Ec2RecommendationsExportPreferencesJsonUnmarshaller implements Unmarshaller<Ec2RecommendationsExportPreferences, JsonUnmarshallerContext> {

    public Ec2RecommendationsExportPreferences unmarshall(JsonUnmarshallerContext context) throws Exception {
        Ec2RecommendationsExportPreferences ec2RecommendationsExportPreferences = new Ec2RecommendationsExportPreferences();

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
                if (context.testExpression("enabled", targetDepth)) {
                    context.nextToken();
                    ec2RecommendationsExportPreferences.setEnabled(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("cpuPerformanceMetricBasis", targetDepth)) {
                    context.nextToken();
                    ec2RecommendationsExportPreferences.setCpuPerformanceMetricBasis(UsageMetricBasisJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ramPerformanceMetricBasis", targetDepth)) {
                    context.nextToken();
                    ec2RecommendationsExportPreferences.setRamPerformanceMetricBasis(UsageMetricBasisJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("tenancy", targetDepth)) {
                    context.nextToken();
                    ec2RecommendationsExportPreferences.setTenancy(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("excludedInstanceTypes", targetDepth)) {
                    context.nextToken();
                    ec2RecommendationsExportPreferences.setExcludedInstanceTypes(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("preferredRegion", targetDepth)) {
                    context.nextToken();
                    ec2RecommendationsExportPreferences.setPreferredRegion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("reservedInstanceOptions", targetDepth)) {
                    context.nextToken();
                    ec2RecommendationsExportPreferences.setReservedInstanceOptions(ReservedInstanceOptionsJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return ec2RecommendationsExportPreferences;
    }

    private static Ec2RecommendationsExportPreferencesJsonUnmarshaller instance;

    public static Ec2RecommendationsExportPreferencesJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new Ec2RecommendationsExportPreferencesJsonUnmarshaller();
        return instance;
    }
}
