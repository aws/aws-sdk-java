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
 * DestinationConnectorProperties JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DestinationConnectorPropertiesJsonUnmarshaller implements Unmarshaller<DestinationConnectorProperties, JsonUnmarshallerContext> {

    public DestinationConnectorProperties unmarshall(JsonUnmarshallerContext context) throws Exception {
        DestinationConnectorProperties destinationConnectorProperties = new DestinationConnectorProperties();

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
                if (context.testExpression("Redshift", targetDepth)) {
                    context.nextToken();
                    destinationConnectorProperties.setRedshift(RedshiftDestinationPropertiesJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("S3", targetDepth)) {
                    context.nextToken();
                    destinationConnectorProperties.setS3(S3DestinationPropertiesJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Salesforce", targetDepth)) {
                    context.nextToken();
                    destinationConnectorProperties.setSalesforce(SalesforceDestinationPropertiesJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Snowflake", targetDepth)) {
                    context.nextToken();
                    destinationConnectorProperties.setSnowflake(SnowflakeDestinationPropertiesJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("EventBridge", targetDepth)) {
                    context.nextToken();
                    destinationConnectorProperties.setEventBridge(EventBridgeDestinationPropertiesJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("LookoutMetrics", targetDepth)) {
                    context.nextToken();
                    destinationConnectorProperties.setLookoutMetrics(LookoutMetricsDestinationPropertiesJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Upsolver", targetDepth)) {
                    context.nextToken();
                    destinationConnectorProperties.setUpsolver(UpsolverDestinationPropertiesJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Honeycode", targetDepth)) {
                    context.nextToken();
                    destinationConnectorProperties.setHoneycode(HoneycodeDestinationPropertiesJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("CustomerProfiles", targetDepth)) {
                    context.nextToken();
                    destinationConnectorProperties.setCustomerProfiles(CustomerProfilesDestinationPropertiesJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Zendesk", targetDepth)) {
                    context.nextToken();
                    destinationConnectorProperties.setZendesk(ZendeskDestinationPropertiesJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return destinationConnectorProperties;
    }

    private static DestinationConnectorPropertiesJsonUnmarshaller instance;

    public static DestinationConnectorPropertiesJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DestinationConnectorPropertiesJsonUnmarshaller();
        return instance;
    }
}
