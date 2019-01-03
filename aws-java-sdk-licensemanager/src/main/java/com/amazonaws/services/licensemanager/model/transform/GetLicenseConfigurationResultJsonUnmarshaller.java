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
package com.amazonaws.services.licensemanager.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.licensemanager.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * GetLicenseConfigurationResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetLicenseConfigurationResultJsonUnmarshaller implements Unmarshaller<GetLicenseConfigurationResult, JsonUnmarshallerContext> {

    public GetLicenseConfigurationResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetLicenseConfigurationResult getLicenseConfigurationResult = new GetLicenseConfigurationResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return getLicenseConfigurationResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("LicenseConfigurationId", targetDepth)) {
                    context.nextToken();
                    getLicenseConfigurationResult.setLicenseConfigurationId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LicenseConfigurationArn", targetDepth)) {
                    context.nextToken();
                    getLicenseConfigurationResult.setLicenseConfigurationArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Name", targetDepth)) {
                    context.nextToken();
                    getLicenseConfigurationResult.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Description", targetDepth)) {
                    context.nextToken();
                    getLicenseConfigurationResult.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LicenseCountingType", targetDepth)) {
                    context.nextToken();
                    getLicenseConfigurationResult.setLicenseCountingType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LicenseRules", targetDepth)) {
                    context.nextToken();
                    getLicenseConfigurationResult.setLicenseRules(new ListUnmarshaller<String>(context.getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("LicenseCount", targetDepth)) {
                    context.nextToken();
                    getLicenseConfigurationResult.setLicenseCount(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("LicenseCountHardLimit", targetDepth)) {
                    context.nextToken();
                    getLicenseConfigurationResult.setLicenseCountHardLimit(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("ConsumedLicenses", targetDepth)) {
                    context.nextToken();
                    getLicenseConfigurationResult.setConsumedLicenses(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    context.nextToken();
                    getLicenseConfigurationResult.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("OwnerAccountId", targetDepth)) {
                    context.nextToken();
                    getLicenseConfigurationResult.setOwnerAccountId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ConsumedLicenseSummaryList", targetDepth)) {
                    context.nextToken();
                    getLicenseConfigurationResult.setConsumedLicenseSummaryList(new ListUnmarshaller<ConsumedLicenseSummary>(
                            ConsumedLicenseSummaryJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("ManagedResourceSummaryList", targetDepth)) {
                    context.nextToken();
                    getLicenseConfigurationResult.setManagedResourceSummaryList(new ListUnmarshaller<ManagedResourceSummary>(
                            ManagedResourceSummaryJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("Tags", targetDepth)) {
                    context.nextToken();
                    getLicenseConfigurationResult.setTags(new ListUnmarshaller<Tag>(TagJsonUnmarshaller.getInstance()).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return getLicenseConfigurationResult;
    }

    private static GetLicenseConfigurationResultJsonUnmarshaller instance;

    public static GetLicenseConfigurationResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetLicenseConfigurationResultJsonUnmarshaller();
        return instance;
    }
}
