/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.servicequotas.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.servicequotas.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * ServiceQuotaIncreaseRequestInTemplate JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ServiceQuotaIncreaseRequestInTemplateJsonUnmarshaller implements Unmarshaller<ServiceQuotaIncreaseRequestInTemplate, JsonUnmarshallerContext> {

    public ServiceQuotaIncreaseRequestInTemplate unmarshall(JsonUnmarshallerContext context) throws Exception {
        ServiceQuotaIncreaseRequestInTemplate serviceQuotaIncreaseRequestInTemplate = new ServiceQuotaIncreaseRequestInTemplate();

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
                if (context.testExpression("ServiceCode", targetDepth)) {
                    context.nextToken();
                    serviceQuotaIncreaseRequestInTemplate.setServiceCode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ServiceName", targetDepth)) {
                    context.nextToken();
                    serviceQuotaIncreaseRequestInTemplate.setServiceName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("QuotaCode", targetDepth)) {
                    context.nextToken();
                    serviceQuotaIncreaseRequestInTemplate.setQuotaCode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("QuotaName", targetDepth)) {
                    context.nextToken();
                    serviceQuotaIncreaseRequestInTemplate.setQuotaName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DesiredValue", targetDepth)) {
                    context.nextToken();
                    serviceQuotaIncreaseRequestInTemplate.setDesiredValue(context.getUnmarshaller(Double.class).unmarshall(context));
                }
                if (context.testExpression("AwsRegion", targetDepth)) {
                    context.nextToken();
                    serviceQuotaIncreaseRequestInTemplate.setAwsRegion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Unit", targetDepth)) {
                    context.nextToken();
                    serviceQuotaIncreaseRequestInTemplate.setUnit(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("GlobalQuota", targetDepth)) {
                    context.nextToken();
                    serviceQuotaIncreaseRequestInTemplate.setGlobalQuota(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return serviceQuotaIncreaseRequestInTemplate;
    }

    private static ServiceQuotaIncreaseRequestInTemplateJsonUnmarshaller instance;

    public static ServiceQuotaIncreaseRequestInTemplateJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ServiceQuotaIncreaseRequestInTemplateJsonUnmarshaller();
        return instance;
    }
}
