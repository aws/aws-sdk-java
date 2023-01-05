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
package com.amazonaws.services.securityhub.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.securityhub.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * AwsOpenSearchServiceDomainServiceSoftwareOptionsDetails JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsOpenSearchServiceDomainServiceSoftwareOptionsDetailsJsonUnmarshaller implements
        Unmarshaller<AwsOpenSearchServiceDomainServiceSoftwareOptionsDetails, JsonUnmarshallerContext> {

    public AwsOpenSearchServiceDomainServiceSoftwareOptionsDetails unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsOpenSearchServiceDomainServiceSoftwareOptionsDetails awsOpenSearchServiceDomainServiceSoftwareOptionsDetails = new AwsOpenSearchServiceDomainServiceSoftwareOptionsDetails();

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
                if (context.testExpression("AutomatedUpdateDate", targetDepth)) {
                    context.nextToken();
                    awsOpenSearchServiceDomainServiceSoftwareOptionsDetails.setAutomatedUpdateDate(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Cancellable", targetDepth)) {
                    context.nextToken();
                    awsOpenSearchServiceDomainServiceSoftwareOptionsDetails.setCancellable(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("CurrentVersion", targetDepth)) {
                    context.nextToken();
                    awsOpenSearchServiceDomainServiceSoftwareOptionsDetails.setCurrentVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Description", targetDepth)) {
                    context.nextToken();
                    awsOpenSearchServiceDomainServiceSoftwareOptionsDetails.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("NewVersion", targetDepth)) {
                    context.nextToken();
                    awsOpenSearchServiceDomainServiceSoftwareOptionsDetails.setNewVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("UpdateAvailable", targetDepth)) {
                    context.nextToken();
                    awsOpenSearchServiceDomainServiceSoftwareOptionsDetails.setUpdateAvailable(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("UpdateStatus", targetDepth)) {
                    context.nextToken();
                    awsOpenSearchServiceDomainServiceSoftwareOptionsDetails.setUpdateStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("OptionalDeployment", targetDepth)) {
                    context.nextToken();
                    awsOpenSearchServiceDomainServiceSoftwareOptionsDetails.setOptionalDeployment(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return awsOpenSearchServiceDomainServiceSoftwareOptionsDetails;
    }

    private static AwsOpenSearchServiceDomainServiceSoftwareOptionsDetailsJsonUnmarshaller instance;

    public static AwsOpenSearchServiceDomainServiceSoftwareOptionsDetailsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AwsOpenSearchServiceDomainServiceSoftwareOptionsDetailsJsonUnmarshaller();
        return instance;
    }
}
