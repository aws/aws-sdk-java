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
package com.amazonaws.services.backupgateway.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.backupgateway.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * HypervisorDetails JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class HypervisorDetailsJsonUnmarshaller implements Unmarshaller<HypervisorDetails, JsonUnmarshallerContext> {

    public HypervisorDetails unmarshall(JsonUnmarshallerContext context) throws Exception {
        HypervisorDetails hypervisorDetails = new HypervisorDetails();

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
                if (context.testExpression("Host", targetDepth)) {
                    context.nextToken();
                    hypervisorDetails.setHost(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("HypervisorArn", targetDepth)) {
                    context.nextToken();
                    hypervisorDetails.setHypervisorArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("KmsKeyArn", targetDepth)) {
                    context.nextToken();
                    hypervisorDetails.setKmsKeyArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LastSuccessfulMetadataSyncTime", targetDepth)) {
                    context.nextToken();
                    hypervisorDetails.setLastSuccessfulMetadataSyncTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("LatestMetadataSyncStatus", targetDepth)) {
                    context.nextToken();
                    hypervisorDetails.setLatestMetadataSyncStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LatestMetadataSyncStatusMessage", targetDepth)) {
                    context.nextToken();
                    hypervisorDetails.setLatestMetadataSyncStatusMessage(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LogGroupArn", targetDepth)) {
                    context.nextToken();
                    hypervisorDetails.setLogGroupArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Name", targetDepth)) {
                    context.nextToken();
                    hypervisorDetails.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("State", targetDepth)) {
                    context.nextToken();
                    hypervisorDetails.setState(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return hypervisorDetails;
    }

    private static HypervisorDetailsJsonUnmarshaller instance;

    public static HypervisorDetailsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new HypervisorDetailsJsonUnmarshaller();
        return instance;
    }
}
