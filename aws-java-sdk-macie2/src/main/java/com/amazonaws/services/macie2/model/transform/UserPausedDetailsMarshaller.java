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
package com.amazonaws.services.macie2.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.macie2.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * UserPausedDetailsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UserPausedDetailsMarshaller {

    private static final MarshallingInfo<java.util.Date> JOBEXPIRESAT_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("jobExpiresAt").timestampFormat("iso8601").build();
    private static final MarshallingInfo<String> JOBIMMINENTEXPIRATIONHEALTHEVENTARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("jobImminentExpirationHealthEventArn").build();
    private static final MarshallingInfo<java.util.Date> JOBPAUSEDAT_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("jobPausedAt").timestampFormat("iso8601").build();

    private static final UserPausedDetailsMarshaller instance = new UserPausedDetailsMarshaller();

    public static UserPausedDetailsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UserPausedDetails userPausedDetails, ProtocolMarshaller protocolMarshaller) {

        if (userPausedDetails == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(userPausedDetails.getJobExpiresAt(), JOBEXPIRESAT_BINDING);
            protocolMarshaller.marshall(userPausedDetails.getJobImminentExpirationHealthEventArn(), JOBIMMINENTEXPIRATIONHEALTHEVENTARN_BINDING);
            protocolMarshaller.marshall(userPausedDetails.getJobPausedAt(), JOBPAUSEDAT_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
