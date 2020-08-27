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

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.appflow.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ConnectorMetadataMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ConnectorMetadataMarshaller {

    private static final MarshallingInfo<StructuredPojo> AMPLITUDE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Amplitude").build();
    private static final MarshallingInfo<StructuredPojo> DATADOG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Datadog").build();
    private static final MarshallingInfo<StructuredPojo> DYNATRACE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Dynatrace").build();
    private static final MarshallingInfo<StructuredPojo> GOOGLEANALYTICS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("GoogleAnalytics").build();
    private static final MarshallingInfo<StructuredPojo> INFORNEXUS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("InforNexus").build();
    private static final MarshallingInfo<StructuredPojo> MARKETO_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Marketo").build();
    private static final MarshallingInfo<StructuredPojo> REDSHIFT_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Redshift").build();
    private static final MarshallingInfo<StructuredPojo> S3_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("S3").build();
    private static final MarshallingInfo<StructuredPojo> SALESFORCE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Salesforce").build();
    private static final MarshallingInfo<StructuredPojo> SERVICENOW_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ServiceNow").build();
    private static final MarshallingInfo<StructuredPojo> SINGULAR_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Singular").build();
    private static final MarshallingInfo<StructuredPojo> SLACK_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Slack").build();
    private static final MarshallingInfo<StructuredPojo> SNOWFLAKE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Snowflake").build();
    private static final MarshallingInfo<StructuredPojo> TRENDMICRO_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Trendmicro").build();
    private static final MarshallingInfo<StructuredPojo> VEEVA_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Veeva").build();
    private static final MarshallingInfo<StructuredPojo> ZENDESK_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Zendesk").build();
    private static final MarshallingInfo<StructuredPojo> EVENTBRIDGE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EventBridge").build();

    private static final ConnectorMetadataMarshaller instance = new ConnectorMetadataMarshaller();

    public static ConnectorMetadataMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ConnectorMetadata connectorMetadata, ProtocolMarshaller protocolMarshaller) {

        if (connectorMetadata == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(connectorMetadata.getAmplitude(), AMPLITUDE_BINDING);
            protocolMarshaller.marshall(connectorMetadata.getDatadog(), DATADOG_BINDING);
            protocolMarshaller.marshall(connectorMetadata.getDynatrace(), DYNATRACE_BINDING);
            protocolMarshaller.marshall(connectorMetadata.getGoogleAnalytics(), GOOGLEANALYTICS_BINDING);
            protocolMarshaller.marshall(connectorMetadata.getInforNexus(), INFORNEXUS_BINDING);
            protocolMarshaller.marshall(connectorMetadata.getMarketo(), MARKETO_BINDING);
            protocolMarshaller.marshall(connectorMetadata.getRedshift(), REDSHIFT_BINDING);
            protocolMarshaller.marshall(connectorMetadata.getS3(), S3_BINDING);
            protocolMarshaller.marshall(connectorMetadata.getSalesforce(), SALESFORCE_BINDING);
            protocolMarshaller.marshall(connectorMetadata.getServiceNow(), SERVICENOW_BINDING);
            protocolMarshaller.marshall(connectorMetadata.getSingular(), SINGULAR_BINDING);
            protocolMarshaller.marshall(connectorMetadata.getSlack(), SLACK_BINDING);
            protocolMarshaller.marshall(connectorMetadata.getSnowflake(), SNOWFLAKE_BINDING);
            protocolMarshaller.marshall(connectorMetadata.getTrendmicro(), TRENDMICRO_BINDING);
            protocolMarshaller.marshall(connectorMetadata.getVeeva(), VEEVA_BINDING);
            protocolMarshaller.marshall(connectorMetadata.getZendesk(), ZENDESK_BINDING);
            protocolMarshaller.marshall(connectorMetadata.getEventBridge(), EVENTBRIDGE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
