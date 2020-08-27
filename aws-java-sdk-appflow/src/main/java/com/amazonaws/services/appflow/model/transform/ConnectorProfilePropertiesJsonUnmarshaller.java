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
package com.amazonaws.services.appflow.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.appflow.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * ConnectorProfileProperties JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ConnectorProfilePropertiesJsonUnmarshaller implements Unmarshaller<ConnectorProfileProperties, JsonUnmarshallerContext> {

    public ConnectorProfileProperties unmarshall(JsonUnmarshallerContext context) throws Exception {
        ConnectorProfileProperties connectorProfileProperties = new ConnectorProfileProperties();

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
                    connectorProfileProperties.setAmplitude(AmplitudeConnectorProfilePropertiesJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Datadog", targetDepth)) {
                    context.nextToken();
                    connectorProfileProperties.setDatadog(DatadogConnectorProfilePropertiesJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Dynatrace", targetDepth)) {
                    context.nextToken();
                    connectorProfileProperties.setDynatrace(DynatraceConnectorProfilePropertiesJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("GoogleAnalytics", targetDepth)) {
                    context.nextToken();
                    connectorProfileProperties.setGoogleAnalytics(GoogleAnalyticsConnectorProfilePropertiesJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("InforNexus", targetDepth)) {
                    context.nextToken();
                    connectorProfileProperties.setInforNexus(InforNexusConnectorProfilePropertiesJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Marketo", targetDepth)) {
                    context.nextToken();
                    connectorProfileProperties.setMarketo(MarketoConnectorProfilePropertiesJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Redshift", targetDepth)) {
                    context.nextToken();
                    connectorProfileProperties.setRedshift(RedshiftConnectorProfilePropertiesJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Salesforce", targetDepth)) {
                    context.nextToken();
                    connectorProfileProperties.setSalesforce(SalesforceConnectorProfilePropertiesJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ServiceNow", targetDepth)) {
                    context.nextToken();
                    connectorProfileProperties.setServiceNow(ServiceNowConnectorProfilePropertiesJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Singular", targetDepth)) {
                    context.nextToken();
                    connectorProfileProperties.setSingular(SingularConnectorProfilePropertiesJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Slack", targetDepth)) {
                    context.nextToken();
                    connectorProfileProperties.setSlack(SlackConnectorProfilePropertiesJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Snowflake", targetDepth)) {
                    context.nextToken();
                    connectorProfileProperties.setSnowflake(SnowflakeConnectorProfilePropertiesJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Trendmicro", targetDepth)) {
                    context.nextToken();
                    connectorProfileProperties.setTrendmicro(TrendmicroConnectorProfilePropertiesJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Veeva", targetDepth)) {
                    context.nextToken();
                    connectorProfileProperties.setVeeva(VeevaConnectorProfilePropertiesJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Zendesk", targetDepth)) {
                    context.nextToken();
                    connectorProfileProperties.setZendesk(ZendeskConnectorProfilePropertiesJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return connectorProfileProperties;
    }

    private static ConnectorProfilePropertiesJsonUnmarshaller instance;

    public static ConnectorProfilePropertiesJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ConnectorProfilePropertiesJsonUnmarshaller();
        return instance;
    }
}
