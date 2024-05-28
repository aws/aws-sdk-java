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
package com.amazonaws.services.inspector2.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.inspector2.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * StopCisMessageProgressMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class StopCisMessageProgressMarshaller {

    private static final MarshallingInfo<Integer> ERRORCHECKS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("errorChecks").build();
    private static final MarshallingInfo<Integer> FAILEDCHECKS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("failedChecks").build();
    private static final MarshallingInfo<Integer> INFORMATIONALCHECKS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("informationalChecks").build();
    private static final MarshallingInfo<Integer> NOTAPPLICABLECHECKS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("notApplicableChecks").build();
    private static final MarshallingInfo<Integer> NOTEVALUATEDCHECKS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("notEvaluatedChecks").build();
    private static final MarshallingInfo<Integer> SUCCESSFULCHECKS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("successfulChecks").build();
    private static final MarshallingInfo<Integer> TOTALCHECKS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("totalChecks").build();
    private static final MarshallingInfo<Integer> UNKNOWNCHECKS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("unknownChecks").build();

    private static final StopCisMessageProgressMarshaller instance = new StopCisMessageProgressMarshaller();

    public static StopCisMessageProgressMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(StopCisMessageProgress stopCisMessageProgress, ProtocolMarshaller protocolMarshaller) {

        if (stopCisMessageProgress == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(stopCisMessageProgress.getErrorChecks(), ERRORCHECKS_BINDING);
            protocolMarshaller.marshall(stopCisMessageProgress.getFailedChecks(), FAILEDCHECKS_BINDING);
            protocolMarshaller.marshall(stopCisMessageProgress.getInformationalChecks(), INFORMATIONALCHECKS_BINDING);
            protocolMarshaller.marshall(stopCisMessageProgress.getNotApplicableChecks(), NOTAPPLICABLECHECKS_BINDING);
            protocolMarshaller.marshall(stopCisMessageProgress.getNotEvaluatedChecks(), NOTEVALUATEDCHECKS_BINDING);
            protocolMarshaller.marshall(stopCisMessageProgress.getSuccessfulChecks(), SUCCESSFULCHECKS_BINDING);
            protocolMarshaller.marshall(stopCisMessageProgress.getTotalChecks(), TOTALCHECKS_BINDING);
            protocolMarshaller.marshall(stopCisMessageProgress.getUnknownChecks(), UNKNOWNCHECKS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
