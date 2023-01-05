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
package com.amazonaws.services.guardduty.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.guardduty.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * DataSourcesFreeTrial JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DataSourcesFreeTrialJsonUnmarshaller implements Unmarshaller<DataSourcesFreeTrial, JsonUnmarshallerContext> {

    public DataSourcesFreeTrial unmarshall(JsonUnmarshallerContext context) throws Exception {
        DataSourcesFreeTrial dataSourcesFreeTrial = new DataSourcesFreeTrial();

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
                if (context.testExpression("cloudTrail", targetDepth)) {
                    context.nextToken();
                    dataSourcesFreeTrial.setCloudTrail(DataSourceFreeTrialJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("dnsLogs", targetDepth)) {
                    context.nextToken();
                    dataSourcesFreeTrial.setDnsLogs(DataSourceFreeTrialJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("flowLogs", targetDepth)) {
                    context.nextToken();
                    dataSourcesFreeTrial.setFlowLogs(DataSourceFreeTrialJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("s3Logs", targetDepth)) {
                    context.nextToken();
                    dataSourcesFreeTrial.setS3Logs(DataSourceFreeTrialJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("kubernetes", targetDepth)) {
                    context.nextToken();
                    dataSourcesFreeTrial.setKubernetes(KubernetesDataSourceFreeTrialJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("malwareProtection", targetDepth)) {
                    context.nextToken();
                    dataSourcesFreeTrial.setMalwareProtection(MalwareProtectionDataSourceFreeTrialJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return dataSourcesFreeTrial;
    }

    private static DataSourcesFreeTrialJsonUnmarshaller instance;

    public static DataSourcesFreeTrialJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DataSourcesFreeTrialJsonUnmarshaller();
        return instance;
    }
}
