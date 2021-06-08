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
 * ConnectorOperatorMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ConnectorOperatorMarshaller {

    private static final MarshallingInfo<String> MARKETO_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Marketo").build();
    private static final MarshallingInfo<String> S3_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("S3").build();
    private static final MarshallingInfo<String> SALESFORCE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Salesforce").build();
    private static final MarshallingInfo<String> SERVICENOW_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ServiceNow").build();
    private static final MarshallingInfo<String> ZENDESK_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Zendesk").build();

    private static final ConnectorOperatorMarshaller instance = new ConnectorOperatorMarshaller();

    public static ConnectorOperatorMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ConnectorOperator connectorOperator, ProtocolMarshaller protocolMarshaller) {

        if (connectorOperator == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(connectorOperator.getMarketo(), MARKETO_BINDING);
            protocolMarshaller.marshall(connectorOperator.getS3(), S3_BINDING);
            protocolMarshaller.marshall(connectorOperator.getSalesforce(), SALESFORCE_BINDING);
            protocolMarshaller.marshall(connectorOperator.getServiceNow(), SERVICENOW_BINDING);
            protocolMarshaller.marshall(connectorOperator.getZendesk(), ZENDESK_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
