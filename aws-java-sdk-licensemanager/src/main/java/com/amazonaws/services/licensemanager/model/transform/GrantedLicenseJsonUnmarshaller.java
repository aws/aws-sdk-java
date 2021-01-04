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
 * GrantedLicense JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GrantedLicenseJsonUnmarshaller implements Unmarshaller<GrantedLicense, JsonUnmarshallerContext> {

    public GrantedLicense unmarshall(JsonUnmarshallerContext context) throws Exception {
        GrantedLicense grantedLicense = new GrantedLicense();

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
                    grantedLicense.setLicenseArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LicenseName", targetDepth)) {
                    context.nextToken();
                    grantedLicense.setLicenseName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ProductName", targetDepth)) {
                    context.nextToken();
                    grantedLicense.setProductName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ProductSKU", targetDepth)) {
                    context.nextToken();
                    grantedLicense.setProductSKU(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Issuer", targetDepth)) {
                    context.nextToken();
                    grantedLicense.setIssuer(IssuerDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("HomeRegion", targetDepth)) {
                    context.nextToken();
                    grantedLicense.setHomeRegion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    context.nextToken();
                    grantedLicense.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Validity", targetDepth)) {
                    context.nextToken();
                    grantedLicense.setValidity(DatetimeRangeJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Beneficiary", targetDepth)) {
                    context.nextToken();
                    grantedLicense.setBeneficiary(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Entitlements", targetDepth)) {
                    context.nextToken();
                    grantedLicense.setEntitlements(new ListUnmarshaller<Entitlement>(EntitlementJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("ConsumptionConfiguration", targetDepth)) {
                    context.nextToken();
                    grantedLicense.setConsumptionConfiguration(ConsumptionConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("LicenseMetadata", targetDepth)) {
                    context.nextToken();
                    grantedLicense.setLicenseMetadata(new ListUnmarshaller<Metadata>(MetadataJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("CreateTime", targetDepth)) {
                    context.nextToken();
                    grantedLicense.setCreateTime(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Version", targetDepth)) {
                    context.nextToken();
                    grantedLicense.setVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ReceivedMetadata", targetDepth)) {
                    context.nextToken();
                    grantedLicense.setReceivedMetadata(ReceivedMetadataJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return grantedLicense;
    }

    private static GrantedLicenseJsonUnmarshaller instance;

    public static GrantedLicenseJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GrantedLicenseJsonUnmarshaller();
        return instance;
    }
}
