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

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.appflow.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * DestinationConnectorPropertiesMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class DestinationConnectorPropertiesMarshaller {

    private static final MarshallingInfo<StructuredPojo> REDSHIFT_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Redshift").build();
    private static final MarshallingInfo<StructuredPojo> S3_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("S3").build();
    private static final MarshallingInfo<StructuredPojo> SALESFORCE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Salesforce").build();
    private static final MarshallingInfo<StructuredPojo> SNOWFLAKE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Snowflake").build();
    private static final MarshallingInfo<StructuredPojo> EVENTBRIDGE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EventBridge").build();
    private static final MarshallingInfo<StructuredPojo> LOOKOUTMETRICS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LookoutMetrics").build();
    private static final MarshallingInfo<StructuredPojo> UPSOLVER_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Upsolver").build();
    private static final MarshallingInfo<StructuredPojo> HONEYCODE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Honeycode").build();
    private static final MarshallingInfo<StructuredPojo> CUSTOMERPROFILES_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CustomerProfiles").build();
    private static final MarshallingInfo<StructuredPojo> ZENDESK_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Zendesk").build();

    private static final DestinationConnectorPropertiesMarshaller instance = new DestinationConnectorPropertiesMarshaller();

    public static DestinationConnectorPropertiesMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(DestinationConnectorProperties destinationConnectorProperties, ProtocolMarshaller protocolMarshaller) {

        if (destinationConnectorProperties == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(destinationConnectorProperties.getRedshift(), REDSHIFT_BINDING);
            protocolMarshaller.marshall(destinationConnectorProperties.getS3(), S3_BINDING);
            protocolMarshaller.marshall(destinationConnectorProperties.getSalesforce(), SALESFORCE_BINDING);
            protocolMarshaller.marshall(destinationConnectorProperties.getSnowflake(), SNOWFLAKE_BINDING);
            protocolMarshaller.marshall(destinationConnectorProperties.getEventBridge(), EVENTBRIDGE_BINDING);
            protocolMarshaller.marshall(destinationConnectorProperties.getLookoutMetrics(), LOOKOUTMETRICS_BINDING);
            protocolMarshaller.marshall(destinationConnectorProperties.getUpsolver(), UPSOLVER_BINDING);
            protocolMarshaller.marshall(destinationConnectorProperties.getHoneycode(), HONEYCODE_BINDING);
            protocolMarshaller.marshall(destinationConnectorProperties.getCustomerProfiles(), CUSTOMERPROFILES_BINDING);
            protocolMarshaller.marshall(destinationConnectorProperties.getZendesk(), ZENDESK_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
