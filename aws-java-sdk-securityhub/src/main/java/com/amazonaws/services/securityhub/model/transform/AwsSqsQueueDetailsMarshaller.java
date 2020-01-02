/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * AwsSqsQueueDetailsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AwsSqsQueueDetailsMarshaller {

    private static final MarshallingInfo<Integer> KMSDATAKEYREUSEPERIODSECONDS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("KmsDataKeyReusePeriodSeconds").build();
    private static final MarshallingInfo<String> KMSMASTERKEYID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("KmsMasterKeyId").build();
    private static final MarshallingInfo<String> QUEUENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("QueueName").build();
    private static final MarshallingInfo<String> DEADLETTERTARGETARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DeadLetterTargetArn").build();

    private static final AwsSqsQueueDetailsMarshaller instance = new AwsSqsQueueDetailsMarshaller();

    public static AwsSqsQueueDetailsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AwsSqsQueueDetails awsSqsQueueDetails, ProtocolMarshaller protocolMarshaller) {

        if (awsSqsQueueDetails == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(awsSqsQueueDetails.getKmsDataKeyReusePeriodSeconds(), KMSDATAKEYREUSEPERIODSECONDS_BINDING);
            protocolMarshaller.marshall(awsSqsQueueDetails.getKmsMasterKeyId(), KMSMASTERKEYID_BINDING);
            protocolMarshaller.marshall(awsSqsQueueDetails.getQueueName(), QUEUENAME_BINDING);
            protocolMarshaller.marshall(awsSqsQueueDetails.getDeadLetterTargetArn(), DEADLETTERTARGETARN_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
