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
package com.amazonaws.services.customerprofiles.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.customerprofiles.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * SourceConnectorPropertiesMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class SourceConnectorPropertiesMarshaller {

    private static final MarshallingInfo<StructuredPojo> MARKETO_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Marketo").build();
    private static final MarshallingInfo<StructuredPojo> S3_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("S3").build();
    private static final MarshallingInfo<StructuredPojo> SALESFORCE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Salesforce").build();
    private static final MarshallingInfo<StructuredPojo> SERVICENOW_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ServiceNow").build();
    private static final MarshallingInfo<StructuredPojo> ZENDESK_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Zendesk").build();

    private static final SourceConnectorPropertiesMarshaller instance = new SourceConnectorPropertiesMarshaller();

    public static SourceConnectorPropertiesMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(SourceConnectorProperties sourceConnectorProperties, ProtocolMarshaller protocolMarshaller) {

        if (sourceConnectorProperties == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(sourceConnectorProperties.getMarketo(), MARKETO_BINDING);
            protocolMarshaller.marshall(sourceConnectorProperties.getS3(), S3_BINDING);
            protocolMarshaller.marshall(sourceConnectorProperties.getSalesforce(), SALESFORCE_BINDING);
            protocolMarshaller.marshall(sourceConnectorProperties.getServiceNow(), SERVICENOW_BINDING);
            protocolMarshaller.marshall(sourceConnectorProperties.getZendesk(), ZENDESK_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
