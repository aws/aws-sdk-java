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
 * TrailMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class TrailMarshaller {

    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Name").build();
    private static final MarshallingInfo<String> S3BUCKETNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("S3BucketName").build();
    private static final MarshallingInfo<String> S3KEYPREFIX_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("S3KeyPrefix").build();
    private static final MarshallingInfo<String> SNSTOPICNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SnsTopicName").build();
    private static final MarshallingInfo<String> SNSTOPICARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SnsTopicARN").build();
    private static final MarshallingInfo<Boolean> INCLUDEGLOBALSERVICEEVENTS_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("IncludeGlobalServiceEvents").build();
    private static final MarshallingInfo<Boolean> ISMULTIREGIONTRAIL_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("IsMultiRegionTrail").build();
    private static final MarshallingInfo<String> HOMEREGION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("HomeRegion").build();
    private static final MarshallingInfo<String> TRAILARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("TrailARN").build();
    private static final MarshallingInfo<Boolean> LOGFILEVALIDATIONENABLED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LogFileValidationEnabled").build();
    private static final MarshallingInfo<String> CLOUDWATCHLOGSLOGGROUPARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CloudWatchLogsLogGroupArn").build();
    private static final MarshallingInfo<String> CLOUDWATCHLOGSROLEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CloudWatchLogsRoleArn").build();
    private static final MarshallingInfo<String> KMSKEYID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("KmsKeyId").build();
    private static final MarshallingInfo<Boolean> HASCUSTOMEVENTSELECTORS_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("HasCustomEventSelectors").build();
    private static final MarshallingInfo<Boolean> ISORGANIZATIONTRAIL_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("IsOrganizationTrail").build();

    private static final TrailMarshaller instance = new TrailMarshaller();

    public static TrailMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(Trail trail, ProtocolMarshaller protocolMarshaller) {

        if (trail == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(trail.getName(), NAME_BINDING);
            protocolMarshaller.marshall(trail.getS3BucketName(), S3BUCKETNAME_BINDING);
            protocolMarshaller.marshall(trail.getS3KeyPrefix(), S3KEYPREFIX_BINDING);
            protocolMarshaller.marshall(trail.getSnsTopicName(), SNSTOPICNAME_BINDING);
            protocolMarshaller.marshall(trail.getSnsTopicARN(), SNSTOPICARN_BINDING);
            protocolMarshaller.marshall(trail.getIncludeGlobalServiceEvents(), INCLUDEGLOBALSERVICEEVENTS_BINDING);
            protocolMarshaller.marshall(trail.getIsMultiRegionTrail(), ISMULTIREGIONTRAIL_BINDING);
            protocolMarshaller.marshall(trail.getHomeRegion(), HOMEREGION_BINDING);
            protocolMarshaller.marshall(trail.getTrailARN(), TRAILARN_BINDING);
            protocolMarshaller.marshall(trail.getLogFileValidationEnabled(), LOGFILEVALIDATIONENABLED_BINDING);
            protocolMarshaller.marshall(trail.getCloudWatchLogsLogGroupArn(), CLOUDWATCHLOGSLOGGROUPARN_BINDING);
            protocolMarshaller.marshall(trail.getCloudWatchLogsRoleArn(), CLOUDWATCHLOGSROLEARN_BINDING);
            protocolMarshaller.marshall(trail.getKmsKeyId(), KMSKEYID_BINDING);
            protocolMarshaller.marshall(trail.getHasCustomEventSelectors(), HASCUSTOMEVENTSELECTORS_BINDING);
            protocolMarshaller.marshall(trail.getIsOrganizationTrail(), ISORGANIZATIONTRAIL_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
