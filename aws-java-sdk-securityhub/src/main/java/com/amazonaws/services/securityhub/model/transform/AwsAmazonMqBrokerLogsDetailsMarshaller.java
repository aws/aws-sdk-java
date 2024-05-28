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
package com.amazonaws.services.securityhub.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.securityhub.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * AwsAmazonMqBrokerLogsDetailsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AwsAmazonMqBrokerLogsDetailsMarshaller {

    private static final MarshallingInfo<Boolean> AUDIT_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Audit").build();
    private static final MarshallingInfo<Boolean> GENERAL_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("General").build();
    private static final MarshallingInfo<String> AUDITLOGGROUP_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AuditLogGroup").build();
    private static final MarshallingInfo<String> GENERALLOGGROUP_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("GeneralLogGroup").build();
    private static final MarshallingInfo<StructuredPojo> PENDING_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Pending").build();

    private static final AwsAmazonMqBrokerLogsDetailsMarshaller instance = new AwsAmazonMqBrokerLogsDetailsMarshaller();

    public static AwsAmazonMqBrokerLogsDetailsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AwsAmazonMqBrokerLogsDetails awsAmazonMqBrokerLogsDetails, ProtocolMarshaller protocolMarshaller) {

        if (awsAmazonMqBrokerLogsDetails == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(awsAmazonMqBrokerLogsDetails.getAudit(), AUDIT_BINDING);
            protocolMarshaller.marshall(awsAmazonMqBrokerLogsDetails.getGeneral(), GENERAL_BINDING);
            protocolMarshaller.marshall(awsAmazonMqBrokerLogsDetails.getAuditLogGroup(), AUDITLOGGROUP_BINDING);
            protocolMarshaller.marshall(awsAmazonMqBrokerLogsDetails.getGeneralLogGroup(), GENERALLOGGROUP_BINDING);
            protocolMarshaller.marshall(awsAmazonMqBrokerLogsDetails.getPending(), PENDING_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
