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
package com.amazonaws.services.devicefarm.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.devicefarm.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * ScheduleRunConfiguration JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ScheduleRunConfigurationJsonUnmarshaller implements Unmarshaller<ScheduleRunConfiguration, JsonUnmarshallerContext> {

    public ScheduleRunConfiguration unmarshall(JsonUnmarshallerContext context) throws Exception {
        ScheduleRunConfiguration scheduleRunConfiguration = new ScheduleRunConfiguration();

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
                if (context.testExpression("extraDataPackageArn", targetDepth)) {
                    context.nextToken();
                    scheduleRunConfiguration.setExtraDataPackageArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("networkProfileArn", targetDepth)) {
                    context.nextToken();
                    scheduleRunConfiguration.setNetworkProfileArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("locale", targetDepth)) {
                    context.nextToken();
                    scheduleRunConfiguration.setLocale(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("location", targetDepth)) {
                    context.nextToken();
                    scheduleRunConfiguration.setLocation(LocationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("vpceConfigurationArns", targetDepth)) {
                    context.nextToken();
                    scheduleRunConfiguration.setVpceConfigurationArns(new ListUnmarshaller<String>(context.getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("customerArtifactPaths", targetDepth)) {
                    context.nextToken();
                    scheduleRunConfiguration.setCustomerArtifactPaths(CustomerArtifactPathsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("radios", targetDepth)) {
                    context.nextToken();
                    scheduleRunConfiguration.setRadios(RadiosJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("auxiliaryApps", targetDepth)) {
                    context.nextToken();
                    scheduleRunConfiguration.setAuxiliaryApps(new ListUnmarshaller<String>(context.getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("billingMethod", targetDepth)) {
                    context.nextToken();
                    scheduleRunConfiguration.setBillingMethod(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return scheduleRunConfiguration;
    }

    private static ScheduleRunConfigurationJsonUnmarshaller instance;

    public static ScheduleRunConfigurationJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ScheduleRunConfigurationJsonUnmarshaller();
        return instance;
    }
}
