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
package com.amazonaws.services.eks.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.eks.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * EksAnywhereSubscription JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EksAnywhereSubscriptionJsonUnmarshaller implements Unmarshaller<EksAnywhereSubscription, JsonUnmarshallerContext> {

    public EksAnywhereSubscription unmarshall(JsonUnmarshallerContext context) throws Exception {
        EksAnywhereSubscription eksAnywhereSubscription = new EksAnywhereSubscription();

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
                if (context.testExpression("id", targetDepth)) {
                    context.nextToken();
                    eksAnywhereSubscription.setId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("arn", targetDepth)) {
                    context.nextToken();
                    eksAnywhereSubscription.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("createdAt", targetDepth)) {
                    context.nextToken();
                    eksAnywhereSubscription.setCreatedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("effectiveDate", targetDepth)) {
                    context.nextToken();
                    eksAnywhereSubscription.setEffectiveDate(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("expirationDate", targetDepth)) {
                    context.nextToken();
                    eksAnywhereSubscription.setExpirationDate(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("licenseQuantity", targetDepth)) {
                    context.nextToken();
                    eksAnywhereSubscription.setLicenseQuantity(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("licenseType", targetDepth)) {
                    context.nextToken();
                    eksAnywhereSubscription.setLicenseType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("term", targetDepth)) {
                    context.nextToken();
                    eksAnywhereSubscription.setTerm(EksAnywhereSubscriptionTermJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("status", targetDepth)) {
                    context.nextToken();
                    eksAnywhereSubscription.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("autoRenew", targetDepth)) {
                    context.nextToken();
                    eksAnywhereSubscription.setAutoRenew(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("licenseArns", targetDepth)) {
                    context.nextToken();
                    eksAnywhereSubscription.setLicenseArns(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("tags", targetDepth)) {
                    context.nextToken();
                    eksAnywhereSubscription.setTags(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context
                            .getUnmarshaller(String.class)).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return eksAnywhereSubscription;
    }

    private static EksAnywhereSubscriptionJsonUnmarshaller instance;

    public static EksAnywhereSubscriptionJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new EksAnywhereSubscriptionJsonUnmarshaller();
        return instance;
    }
}
