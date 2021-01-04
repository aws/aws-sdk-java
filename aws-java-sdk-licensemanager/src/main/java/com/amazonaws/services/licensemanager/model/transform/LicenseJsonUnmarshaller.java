/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * License JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LicenseJsonUnmarshaller implements Unmarshaller<License, JsonUnmarshallerContext> {

    public License unmarshall(JsonUnmarshallerContext context) throws Exception {
        License license = new License();

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
                if (context.testExpression("LicenseArn", targetDepth)) {
                    context.nextToken();
                    license.setLicenseArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LicenseName", targetDepth)) {
                    context.nextToken();
                    license.setLicenseName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ProductName", targetDepth)) {
                    context.nextToken();
                    license.setProductName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ProductSKU", targetDepth)) {
                    context.nextToken();
                    license.setProductSKU(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Issuer", targetDepth)) {
                    context.nextToken();
                    license.setIssuer(IssuerDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("HomeRegion", targetDepth)) {
                    context.nextToken();
                    license.setHomeRegion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    context.nextToken();
                    license.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Validity", targetDepth)) {
                    context.nextToken();
                    license.setValidity(DatetimeRangeJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Beneficiary", targetDepth)) {
                    context.nextToken();
                    license.setBeneficiary(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Entitlements", targetDepth)) {
                    context.nextToken();
                    license.setEntitlements(new ListUnmarshaller<Entitlement>(EntitlementJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("ConsumptionConfiguration", targetDepth)) {
                    context.nextToken();
                    license.setConsumptionConfiguration(ConsumptionConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("LicenseMetadata", targetDepth)) {
                    context.nextToken();
                    license.setLicenseMetadata(new ListUnmarshaller<Metadata>(MetadataJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("CreateTime", targetDepth)) {
                    context.nextToken();
                    license.setCreateTime(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Version", targetDepth)) {
                    context.nextToken();
                    license.setVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return license;
    }

    private static LicenseJsonUnmarshaller instance;

    public static LicenseJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new LicenseJsonUnmarshaller();
        return instance;
    }
}
