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
 * AwsRedshiftClusterLoggingStatusMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AwsRedshiftClusterLoggingStatusMarshaller {

    private static final MarshallingInfo<String> BUCKETNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("BucketName").build();
    private static final MarshallingInfo<String> LASTFAILUREMESSAGE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LastFailureMessage").build();
    private static final MarshallingInfo<String> LASTFAILURETIME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LastFailureTime").build();
    private static final MarshallingInfo<String> LASTSUCCESSFULDELIVERYTIME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LastSuccessfulDeliveryTime").build();
    private static final MarshallingInfo<Boolean> LOGGINGENABLED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LoggingEnabled").build();
    private static final MarshallingInfo<String> S3KEYPREFIX_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("S3KeyPrefix").build();

    private static final AwsRedshiftClusterLoggingStatusMarshaller instance = new AwsRedshiftClusterLoggingStatusMarshaller();

    public static AwsRedshiftClusterLoggingStatusMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AwsRedshiftClusterLoggingStatus awsRedshiftClusterLoggingStatus, ProtocolMarshaller protocolMarshaller) {

        if (awsRedshiftClusterLoggingStatus == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(awsRedshiftClusterLoggingStatus.getBucketName(), BUCKETNAME_BINDING);
            protocolMarshaller.marshall(awsRedshiftClusterLoggingStatus.getLastFailureMessage(), LASTFAILUREMESSAGE_BINDING);
            protocolMarshaller.marshall(awsRedshiftClusterLoggingStatus.getLastFailureTime(), LASTFAILURETIME_BINDING);
            protocolMarshaller.marshall(awsRedshiftClusterLoggingStatus.getLastSuccessfulDeliveryTime(), LASTSUCCESSFULDELIVERYTIME_BINDING);
            protocolMarshaller.marshall(awsRedshiftClusterLoggingStatus.getLoggingEnabled(), LOGGINGENABLED_BINDING);
            protocolMarshaller.marshall(awsRedshiftClusterLoggingStatus.getS3KeyPrefix(), S3KEYPREFIX_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
