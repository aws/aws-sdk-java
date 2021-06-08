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
package com.amazonaws.services.guardduty.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.guardduty.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * DataSourceConfigurationsResultMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class DataSourceConfigurationsResultMarshaller {

    private static final MarshallingInfo<StructuredPojo> CLOUDTRAIL_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("cloudTrail").build();
    private static final MarshallingInfo<StructuredPojo> DNSLOGS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("dnsLogs").build();
    private static final MarshallingInfo<StructuredPojo> FLOWLOGS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("flowLogs").build();
    private static final MarshallingInfo<StructuredPojo> S3LOGS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("s3Logs").build();

    private static final DataSourceConfigurationsResultMarshaller instance = new DataSourceConfigurationsResultMarshaller();

    public static DataSourceConfigurationsResultMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(DataSourceConfigurationsResult dataSourceConfigurationsResult, ProtocolMarshaller protocolMarshaller) {

        if (dataSourceConfigurationsResult == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(dataSourceConfigurationsResult.getCloudTrail(), CLOUDTRAIL_BINDING);
            protocolMarshaller.marshall(dataSourceConfigurationsResult.getDNSLogs(), DNSLOGS_BINDING);
            protocolMarshaller.marshall(dataSourceConfigurationsResult.getFlowLogs(), FLOWLOGS_BINDING);
            protocolMarshaller.marshall(dataSourceConfigurationsResult.getS3Logs(), S3LOGS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
