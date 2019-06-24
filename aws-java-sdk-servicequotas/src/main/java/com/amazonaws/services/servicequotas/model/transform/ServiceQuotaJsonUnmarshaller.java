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
package com.amazonaws.services.servicequotas.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.servicequotas.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * ServiceQuota JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ServiceQuotaJsonUnmarshaller implements Unmarshaller<ServiceQuota, JsonUnmarshallerContext> {

    public ServiceQuota unmarshall(JsonUnmarshallerContext context) throws Exception {
        ServiceQuota serviceQuota = new ServiceQuota();

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
                    serviceQuota.setServiceCode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ServiceName", targetDepth)) {
                    context.nextToken();
                    serviceQuota.setServiceName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("QuotaArn", targetDepth)) {
                    context.nextToken();
                    serviceQuota.setQuotaArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("QuotaCode", targetDepth)) {
                    context.nextToken();
                    serviceQuota.setQuotaCode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("QuotaName", targetDepth)) {
                    context.nextToken();
                    serviceQuota.setQuotaName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Value", targetDepth)) {
                    context.nextToken();
                    serviceQuota.setValue(context.getUnmarshaller(Double.class).unmarshall(context));
                }
                if (context.testExpression("Unit", targetDepth)) {
                    context.nextToken();
                    serviceQuota.setUnit(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Adjustable", targetDepth)) {
                    context.nextToken();
                    serviceQuota.setAdjustable(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("GlobalQuota", targetDepth)) {
                    context.nextToken();
                    serviceQuota.setGlobalQuota(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("UsageMetric", targetDepth)) {
                    context.nextToken();
                    serviceQuota.setUsageMetric(MetricInfoJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Period", targetDepth)) {
                    context.nextToken();
                    serviceQuota.setPeriod(QuotaPeriodJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ErrorReason", targetDepth)) {
                    context.nextToken();
                    serviceQuota.setErrorReason(ErrorReasonJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return serviceQuota;
    }

    private static ServiceQuotaJsonUnmarshaller instance;

    public static ServiceQuotaJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ServiceQuotaJsonUnmarshaller();
        return instance;
    }
}
