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
 * ConnectorMetadata JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ConnectorMetadataJsonUnmarshaller implements Unmarshaller<ConnectorMetadata, JsonUnmarshallerContext> {

    public ConnectorMetadata unmarshall(JsonUnmarshallerContext context) throws Exception {
        ConnectorMetadata connectorMetadata = new ConnectorMetadata();

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
                    connectorMetadata.setAmplitude(AmplitudeMetadataJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Datadog", targetDepth)) {
                    context.nextToken();
                    connectorMetadata.setDatadog(DatadogMetadataJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Dynatrace", targetDepth)) {
                    context.nextToken();
                    connectorMetadata.setDynatrace(DynatraceMetadataJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("GoogleAnalytics", targetDepth)) {
                    context.nextToken();
                    connectorMetadata.setGoogleAnalytics(GoogleAnalyticsMetadataJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("InforNexus", targetDepth)) {
                    context.nextToken();
                    connectorMetadata.setInforNexus(InforNexusMetadataJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Marketo", targetDepth)) {
                    context.nextToken();
                    connectorMetadata.setMarketo(MarketoMetadataJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Redshift", targetDepth)) {
                    context.nextToken();
                    connectorMetadata.setRedshift(RedshiftMetadataJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("S3", targetDepth)) {
                    context.nextToken();
                    connectorMetadata.setS3(S3MetadataJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Salesforce", targetDepth)) {
                    context.nextToken();
                    connectorMetadata.setSalesforce(SalesforceMetadataJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ServiceNow", targetDepth)) {
                    context.nextToken();
                    connectorMetadata.setServiceNow(ServiceNowMetadataJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Singular", targetDepth)) {
                    context.nextToken();
                    connectorMetadata.setSingular(SingularMetadataJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Slack", targetDepth)) {
                    context.nextToken();
                    connectorMetadata.setSlack(SlackMetadataJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Snowflake", targetDepth)) {
                    context.nextToken();
                    connectorMetadata.setSnowflake(SnowflakeMetadataJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Trendmicro", targetDepth)) {
                    context.nextToken();
                    connectorMetadata.setTrendmicro(TrendmicroMetadataJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Veeva", targetDepth)) {
                    context.nextToken();
                    connectorMetadata.setVeeva(VeevaMetadataJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Zendesk", targetDepth)) {
                    context.nextToken();
                    connectorMetadata.setZendesk(ZendeskMetadataJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("EventBridge", targetDepth)) {
                    context.nextToken();
                    connectorMetadata.setEventBridge(EventBridgeMetadataJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Upsolver", targetDepth)) {
                    context.nextToken();
                    connectorMetadata.setUpsolver(UpsolverMetadataJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("CustomerProfiles", targetDepth)) {
                    context.nextToken();
                    connectorMetadata.setCustomerProfiles(CustomerProfilesMetadataJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Honeycode", targetDepth)) {
                    context.nextToken();
                    connectorMetadata.setHoneycode(HoneycodeMetadataJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return connectorMetadata;
    }

    private static ConnectorMetadataJsonUnmarshaller instance;

    public static ConnectorMetadataJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ConnectorMetadataJsonUnmarshaller();
        return instance;
    }
}
