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
package com.amazonaws.services.dynamodbv2.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.dynamodbv2.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * PointInTimeRecoveryDescriptionMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class PointInTimeRecoveryDescriptionMarshaller {

    private static final MarshallingInfo<String> POINTINTIMERECOVERYSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PointInTimeRecoveryStatus").build();
    private static final MarshallingInfo<java.util.Date> EARLIESTRESTORABLEDATETIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EarliestRestorableDateTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> LATESTRESTORABLEDATETIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LatestRestorableDateTime").timestampFormat("unixTimestamp").build();

    private static final PointInTimeRecoveryDescriptionMarshaller instance = new PointInTimeRecoveryDescriptionMarshaller();

    public static PointInTimeRecoveryDescriptionMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(PointInTimeRecoveryDescription pointInTimeRecoveryDescription, ProtocolMarshaller protocolMarshaller) {

        if (pointInTimeRecoveryDescription == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(pointInTimeRecoveryDescription.getPointInTimeRecoveryStatus(), POINTINTIMERECOVERYSTATUS_BINDING);
            protocolMarshaller.marshall(pointInTimeRecoveryDescription.getEarliestRestorableDateTime(), EARLIESTRESTORABLEDATETIME_BINDING);
            protocolMarshaller.marshall(pointInTimeRecoveryDescription.getLatestRestorableDateTime(), LATESTRESTORABLEDATETIME_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
