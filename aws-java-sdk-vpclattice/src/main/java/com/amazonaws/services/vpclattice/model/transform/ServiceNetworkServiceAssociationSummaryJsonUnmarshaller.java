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
package com.amazonaws.services.vpclattice.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.vpclattice.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * ServiceNetworkServiceAssociationSummary JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ServiceNetworkServiceAssociationSummaryJsonUnmarshaller implements Unmarshaller<ServiceNetworkServiceAssociationSummary, JsonUnmarshallerContext> {

    public ServiceNetworkServiceAssociationSummary unmarshall(JsonUnmarshallerContext context) throws Exception {
        ServiceNetworkServiceAssociationSummary serviceNetworkServiceAssociationSummary = new ServiceNetworkServiceAssociationSummary();

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
                if (context.testExpression("arn", targetDepth)) {
                    context.nextToken();
                    serviceNetworkServiceAssociationSummary.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("createdAt", targetDepth)) {
                    context.nextToken();
                    serviceNetworkServiceAssociationSummary.setCreatedAt(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("createdBy", targetDepth)) {
                    context.nextToken();
                    serviceNetworkServiceAssociationSummary.setCreatedBy(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("customDomainName", targetDepth)) {
                    context.nextToken();
                    serviceNetworkServiceAssociationSummary.setCustomDomainName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("dnsEntry", targetDepth)) {
                    context.nextToken();
                    serviceNetworkServiceAssociationSummary.setDnsEntry(DnsEntryJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("id", targetDepth)) {
                    context.nextToken();
                    serviceNetworkServiceAssociationSummary.setId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("serviceArn", targetDepth)) {
                    context.nextToken();
                    serviceNetworkServiceAssociationSummary.setServiceArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("serviceId", targetDepth)) {
                    context.nextToken();
                    serviceNetworkServiceAssociationSummary.setServiceId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("serviceName", targetDepth)) {
                    context.nextToken();
                    serviceNetworkServiceAssociationSummary.setServiceName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("serviceNetworkArn", targetDepth)) {
                    context.nextToken();
                    serviceNetworkServiceAssociationSummary.setServiceNetworkArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("serviceNetworkId", targetDepth)) {
                    context.nextToken();
                    serviceNetworkServiceAssociationSummary.setServiceNetworkId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("serviceNetworkName", targetDepth)) {
                    context.nextToken();
                    serviceNetworkServiceAssociationSummary.setServiceNetworkName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("status", targetDepth)) {
                    context.nextToken();
                    serviceNetworkServiceAssociationSummary.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return serviceNetworkServiceAssociationSummary;
    }

    private static ServiceNetworkServiceAssociationSummaryJsonUnmarshaller instance;

    public static ServiceNetworkServiceAssociationSummaryJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ServiceNetworkServiceAssociationSummaryJsonUnmarshaller();
        return instance;
    }
}
