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
 * RequestedServiceQuotaChange JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RequestedServiceQuotaChangeJsonUnmarshaller implements Unmarshaller<RequestedServiceQuotaChange, JsonUnmarshallerContext> {

    public RequestedServiceQuotaChange unmarshall(JsonUnmarshallerContext context) throws Exception {
        RequestedServiceQuotaChange requestedServiceQuotaChange = new RequestedServiceQuotaChange();

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
                if (context.testExpression("Id", targetDepth)) {
                    context.nextToken();
                    requestedServiceQuotaChange.setId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CaseId", targetDepth)) {
                    context.nextToken();
                    requestedServiceQuotaChange.setCaseId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ServiceCode", targetDepth)) {
                    context.nextToken();
                    requestedServiceQuotaChange.setServiceCode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ServiceName", targetDepth)) {
                    context.nextToken();
                    requestedServiceQuotaChange.setServiceName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("QuotaCode", targetDepth)) {
                    context.nextToken();
                    requestedServiceQuotaChange.setQuotaCode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("QuotaName", targetDepth)) {
                    context.nextToken();
                    requestedServiceQuotaChange.setQuotaName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DesiredValue", targetDepth)) {
                    context.nextToken();
                    requestedServiceQuotaChange.setDesiredValue(context.getUnmarshaller(Double.class).unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    context.nextToken();
                    requestedServiceQuotaChange.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Created", targetDepth)) {
                    context.nextToken();
                    requestedServiceQuotaChange.setCreated(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("LastUpdated", targetDepth)) {
                    context.nextToken();
                    requestedServiceQuotaChange.setLastUpdated(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("Requester", targetDepth)) {
                    context.nextToken();
                    requestedServiceQuotaChange.setRequester(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("QuotaArn", targetDepth)) {
                    context.nextToken();
                    requestedServiceQuotaChange.setQuotaArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("GlobalQuota", targetDepth)) {
                    context.nextToken();
                    requestedServiceQuotaChange.setGlobalQuota(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("Unit", targetDepth)) {
                    context.nextToken();
                    requestedServiceQuotaChange.setUnit(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return requestedServiceQuotaChange;
    }

    private static RequestedServiceQuotaChangeJsonUnmarshaller instance;

    public static RequestedServiceQuotaChangeJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new RequestedServiceQuotaChangeJsonUnmarshaller();
        return instance;
    }
}
