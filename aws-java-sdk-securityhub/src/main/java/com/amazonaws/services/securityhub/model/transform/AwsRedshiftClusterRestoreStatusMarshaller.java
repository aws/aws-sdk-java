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
package com.amazonaws.services.securityhub.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.securityhub.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * AwsRedshiftClusterRestoreStatusMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AwsRedshiftClusterRestoreStatusMarshaller {

    private static final MarshallingInfo<Double> CURRENTRESTORERATEINMEGABYTESPERSECOND_BINDING = MarshallingInfo.builder(MarshallingType.DOUBLE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CurrentRestoreRateInMegaBytesPerSecond").build();
    private static final MarshallingInfo<Long> ELAPSEDTIMEINSECONDS_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ElapsedTimeInSeconds").build();
    private static final MarshallingInfo<Long> ESTIMATEDTIMETOCOMPLETIONINSECONDS_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EstimatedTimeToCompletionInSeconds").build();
    private static final MarshallingInfo<Long> PROGRESSINMEGABYTES_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ProgressInMegaBytes").build();
    private static final MarshallingInfo<Long> SNAPSHOTSIZEINMEGABYTES_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SnapshotSizeInMegaBytes").build();
    private static final MarshallingInfo<String> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Status").build();

    private static final AwsRedshiftClusterRestoreStatusMarshaller instance = new AwsRedshiftClusterRestoreStatusMarshaller();

    public static AwsRedshiftClusterRestoreStatusMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AwsRedshiftClusterRestoreStatus awsRedshiftClusterRestoreStatus, ProtocolMarshaller protocolMarshaller) {

        if (awsRedshiftClusterRestoreStatus == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(awsRedshiftClusterRestoreStatus.getCurrentRestoreRateInMegaBytesPerSecond(),
                    CURRENTRESTORERATEINMEGABYTESPERSECOND_BINDING);
            protocolMarshaller.marshall(awsRedshiftClusterRestoreStatus.getElapsedTimeInSeconds(), ELAPSEDTIMEINSECONDS_BINDING);
            protocolMarshaller.marshall(awsRedshiftClusterRestoreStatus.getEstimatedTimeToCompletionInSeconds(), ESTIMATEDTIMETOCOMPLETIONINSECONDS_BINDING);
            protocolMarshaller.marshall(awsRedshiftClusterRestoreStatus.getProgressInMegaBytes(), PROGRESSINMEGABYTES_BINDING);
            protocolMarshaller.marshall(awsRedshiftClusterRestoreStatus.getSnapshotSizeInMegaBytes(), SNAPSHOTSIZEINMEGABYTES_BINDING);
            protocolMarshaller.marshall(awsRedshiftClusterRestoreStatus.getStatus(), STATUS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
