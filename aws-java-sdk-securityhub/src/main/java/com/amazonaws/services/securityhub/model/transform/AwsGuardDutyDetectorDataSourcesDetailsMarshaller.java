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
 * AwsGuardDutyDetectorDataSourcesDetailsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AwsGuardDutyDetectorDataSourcesDetailsMarshaller {

    private static final MarshallingInfo<StructuredPojo> CLOUDTRAIL_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CloudTrail").build();
    private static final MarshallingInfo<StructuredPojo> DNSLOGS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DnsLogs").build();
    private static final MarshallingInfo<StructuredPojo> FLOWLOGS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FlowLogs").build();
    private static final MarshallingInfo<StructuredPojo> KUBERNETES_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Kubernetes").build();
    private static final MarshallingInfo<StructuredPojo> MALWAREPROTECTION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MalwareProtection").build();
    private static final MarshallingInfo<StructuredPojo> S3LOGS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("S3Logs").build();

    private static final AwsGuardDutyDetectorDataSourcesDetailsMarshaller instance = new AwsGuardDutyDetectorDataSourcesDetailsMarshaller();

    public static AwsGuardDutyDetectorDataSourcesDetailsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AwsGuardDutyDetectorDataSourcesDetails awsGuardDutyDetectorDataSourcesDetails, ProtocolMarshaller protocolMarshaller) {

        if (awsGuardDutyDetectorDataSourcesDetails == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(awsGuardDutyDetectorDataSourcesDetails.getCloudTrail(), CLOUDTRAIL_BINDING);
            protocolMarshaller.marshall(awsGuardDutyDetectorDataSourcesDetails.getDnsLogs(), DNSLOGS_BINDING);
            protocolMarshaller.marshall(awsGuardDutyDetectorDataSourcesDetails.getFlowLogs(), FLOWLOGS_BINDING);
            protocolMarshaller.marshall(awsGuardDutyDetectorDataSourcesDetails.getKubernetes(), KUBERNETES_BINDING);
            protocolMarshaller.marshall(awsGuardDutyDetectorDataSourcesDetails.getMalwareProtection(), MALWAREPROTECTION_BINDING);
            protocolMarshaller.marshall(awsGuardDutyDetectorDataSourcesDetails.getS3Logs(), S3LOGS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
