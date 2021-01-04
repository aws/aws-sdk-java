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
 * ConnectorProfileCredentials JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ConnectorProfileCredentialsJsonUnmarshaller implements Unmarshaller<ConnectorProfileCredentials, JsonUnmarshallerContext> {

    public ConnectorProfileCredentials unmarshall(JsonUnmarshallerContext context) throws Exception {
        ConnectorProfileCredentials connectorProfileCredentials = new ConnectorProfileCredentials();

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
                    connectorProfileCredentials.setAmplitude(AmplitudeConnectorProfileCredentialsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Datadog", targetDepth)) {
                    context.nextToken();
                    connectorProfileCredentials.setDatadog(DatadogConnectorProfileCredentialsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Dynatrace", targetDepth)) {
                    context.nextToken();
                    connectorProfileCredentials.setDynatrace(DynatraceConnectorProfileCredentialsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("GoogleAnalytics", targetDepth)) {
                    context.nextToken();
                    connectorProfileCredentials
                            .setGoogleAnalytics(GoogleAnalyticsConnectorProfileCredentialsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("InforNexus", targetDepth)) {
                    context.nextToken();
                    connectorProfileCredentials.setInforNexus(InforNexusConnectorProfileCredentialsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Marketo", targetDepth)) {
                    context.nextToken();
                    connectorProfileCredentials.setMarketo(MarketoConnectorProfileCredentialsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Redshift", targetDepth)) {
                    context.nextToken();
                    connectorProfileCredentials.setRedshift(RedshiftConnectorProfileCredentialsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Salesforce", targetDepth)) {
                    context.nextToken();
                    connectorProfileCredentials.setSalesforce(SalesforceConnectorProfileCredentialsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ServiceNow", targetDepth)) {
                    context.nextToken();
                    connectorProfileCredentials.setServiceNow(ServiceNowConnectorProfileCredentialsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Singular", targetDepth)) {
                    context.nextToken();
                    connectorProfileCredentials.setSingular(SingularConnectorProfileCredentialsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Slack", targetDepth)) {
                    context.nextToken();
                    connectorProfileCredentials.setSlack(SlackConnectorProfileCredentialsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Snowflake", targetDepth)) {
                    context.nextToken();
                    connectorProfileCredentials.setSnowflake(SnowflakeConnectorProfileCredentialsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Trendmicro", targetDepth)) {
                    context.nextToken();
                    connectorProfileCredentials.setTrendmicro(TrendmicroConnectorProfileCredentialsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Veeva", targetDepth)) {
                    context.nextToken();
                    connectorProfileCredentials.setVeeva(VeevaConnectorProfileCredentialsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Zendesk", targetDepth)) {
                    context.nextToken();
                    connectorProfileCredentials.setZendesk(ZendeskConnectorProfileCredentialsJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return connectorProfileCredentials;
    }

    private static ConnectorProfileCredentialsJsonUnmarshaller instance;

    public static ConnectorProfileCredentialsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ConnectorProfileCredentialsJsonUnmarshaller();
        return instance;
    }
}
