/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * AwsOpenSearchServiceDomainLogPublishingOptionsDetailsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AwsOpenSearchServiceDomainLogPublishingOptionsDetailsMarshaller {

    private static final MarshallingInfo<StructuredPojo> INDEXSLOWLOGS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("IndexSlowLogs").build();
    private static final MarshallingInfo<StructuredPojo> SEARCHSLOWLOGS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SearchSlowLogs").build();
    private static final MarshallingInfo<StructuredPojo> AUDITLOGS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AuditLogs").build();

    private static final AwsOpenSearchServiceDomainLogPublishingOptionsDetailsMarshaller instance = new AwsOpenSearchServiceDomainLogPublishingOptionsDetailsMarshaller();

    public static AwsOpenSearchServiceDomainLogPublishingOptionsDetailsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AwsOpenSearchServiceDomainLogPublishingOptionsDetails awsOpenSearchServiceDomainLogPublishingOptionsDetails,
            ProtocolMarshaller protocolMarshaller) {

        if (awsOpenSearchServiceDomainLogPublishingOptionsDetails == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(awsOpenSearchServiceDomainLogPublishingOptionsDetails.getIndexSlowLogs(), INDEXSLOWLOGS_BINDING);
            protocolMarshaller.marshall(awsOpenSearchServiceDomainLogPublishingOptionsDetails.getSearchSlowLogs(), SEARCHSLOWLOGS_BINDING);
            protocolMarshaller.marshall(awsOpenSearchServiceDomainLogPublishingOptionsDetails.getAuditLogs(), AUDITLOGS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
