/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.cloudtrail.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.cloudtrail.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * UpdateTrailRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UpdateTrailRequestMarshaller {

    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Name").build();
    private static final MarshallingInfo<String> S3BUCKETNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("S3BucketName").build();
    private static final MarshallingInfo<String> S3KEYPREFIX_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("S3KeyPrefix").build();
    private static final MarshallingInfo<String> SNSTOPICNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SnsTopicName").build();
    private static final MarshallingInfo<Boolean> INCLUDEGLOBALSERVICEEVENTS_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("IncludeGlobalServiceEvents").build();
    private static final MarshallingInfo<Boolean> ISMULTIREGIONTRAIL_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("IsMultiRegionTrail").build();
    private static final MarshallingInfo<Boolean> ENABLELOGFILEVALIDATION_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EnableLogFileValidation").build();
    private static final MarshallingInfo<String> CLOUDWATCHLOGSLOGGROUPARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CloudWatchLogsLogGroupArn").build();
    private static final MarshallingInfo<String> CLOUDWATCHLOGSROLEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CloudWatchLogsRoleArn").build();
    private static final MarshallingInfo<String> KMSKEYID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("KmsKeyId").build();
    private static final MarshallingInfo<Boolean> ISORGANIZATIONTRAIL_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("IsOrganizationTrail").build();

    private static final UpdateTrailRequestMarshaller instance = new UpdateTrailRequestMarshaller();

    public static UpdateTrailRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UpdateTrailRequest updateTrailRequest, ProtocolMarshaller protocolMarshaller) {

        if (updateTrailRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(updateTrailRequest.getName(), NAME_BINDING);
            protocolMarshaller.marshall(updateTrailRequest.getS3BucketName(), S3BUCKETNAME_BINDING);
            protocolMarshaller.marshall(updateTrailRequest.getS3KeyPrefix(), S3KEYPREFIX_BINDING);
            protocolMarshaller.marshall(updateTrailRequest.getSnsTopicName(), SNSTOPICNAME_BINDING);
            protocolMarshaller.marshall(updateTrailRequest.getIncludeGlobalServiceEvents(), INCLUDEGLOBALSERVICEEVENTS_BINDING);
            protocolMarshaller.marshall(updateTrailRequest.getIsMultiRegionTrail(), ISMULTIREGIONTRAIL_BINDING);
            protocolMarshaller.marshall(updateTrailRequest.getEnableLogFileValidation(), ENABLELOGFILEVALIDATION_BINDING);
            protocolMarshaller.marshall(updateTrailRequest.getCloudWatchLogsLogGroupArn(), CLOUDWATCHLOGSLOGGROUPARN_BINDING);
            protocolMarshaller.marshall(updateTrailRequest.getCloudWatchLogsRoleArn(), CLOUDWATCHLOGSROLEARN_BINDING);
            protocolMarshaller.marshall(updateTrailRequest.getKmsKeyId(), KMSKEYID_BINDING);
            protocolMarshaller.marshall(updateTrailRequest.getIsOrganizationTrail(), ISORGANIZATIONTRAIL_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
