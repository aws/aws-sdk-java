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
package com.amazonaws.services.appflow.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.appflow.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * ConnectorOperator JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ConnectorOperatorJsonUnmarshaller implements Unmarshaller<ConnectorOperator, JsonUnmarshallerContext> {

    public ConnectorOperator unmarshall(JsonUnmarshallerContext context) throws Exception {
        ConnectorOperator connectorOperator = new ConnectorOperator();

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
                if (context.testExpression("Amplitude", targetDepth)) {
                    context.nextToken();
                    connectorOperator.setAmplitude(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Datadog", targetDepth)) {
                    context.nextToken();
                    connectorOperator.setDatadog(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Dynatrace", targetDepth)) {
                    context.nextToken();
                    connectorOperator.setDynatrace(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("GoogleAnalytics", targetDepth)) {
                    context.nextToken();
                    connectorOperator.setGoogleAnalytics(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("InforNexus", targetDepth)) {
                    context.nextToken();
                    connectorOperator.setInforNexus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Marketo", targetDepth)) {
                    context.nextToken();
                    connectorOperator.setMarketo(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("S3", targetDepth)) {
                    context.nextToken();
                    connectorOperator.setS3(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Salesforce", targetDepth)) {
                    context.nextToken();
                    connectorOperator.setSalesforce(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ServiceNow", targetDepth)) {
                    context.nextToken();
                    connectorOperator.setServiceNow(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Singular", targetDepth)) {
                    context.nextToken();
                    connectorOperator.setSingular(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Slack", targetDepth)) {
                    context.nextToken();
                    connectorOperator.setSlack(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Trendmicro", targetDepth)) {
                    context.nextToken();
                    connectorOperator.setTrendmicro(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Veeva", targetDepth)) {
                    context.nextToken();
                    connectorOperator.setVeeva(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Zendesk", targetDepth)) {
                    context.nextToken();
                    connectorOperator.setZendesk(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return connectorOperator;
    }

    private static ConnectorOperatorJsonUnmarshaller instance;

    public static ConnectorOperatorJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ConnectorOperatorJsonUnmarshaller();
        return instance;
    }
}
