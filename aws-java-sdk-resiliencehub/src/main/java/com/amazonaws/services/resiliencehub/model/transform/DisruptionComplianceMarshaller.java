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
package com.amazonaws.services.resiliencehub.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.resiliencehub.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * DisruptionComplianceMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class DisruptionComplianceMarshaller {

    private static final MarshallingInfo<Integer> ACHIEVABLERPOINSECS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("achievableRpoInSecs").build();
    private static final MarshallingInfo<Integer> ACHIEVABLERTOINSECS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("achievableRtoInSecs").build();
    private static final MarshallingInfo<String> COMPLIANCESTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("complianceStatus").build();
    private static final MarshallingInfo<Integer> CURRENTRPOINSECS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("currentRpoInSecs").build();
    private static final MarshallingInfo<Integer> CURRENTRTOINSECS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("currentRtoInSecs").build();
    private static final MarshallingInfo<String> MESSAGE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("message").build();
    private static final MarshallingInfo<String> RPODESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("rpoDescription").build();
    private static final MarshallingInfo<String> RPOREFERENCEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("rpoReferenceId").build();
    private static final MarshallingInfo<String> RTODESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("rtoDescription").build();
    private static final MarshallingInfo<String> RTOREFERENCEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("rtoReferenceId").build();

    private static final DisruptionComplianceMarshaller instance = new DisruptionComplianceMarshaller();

    public static DisruptionComplianceMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(DisruptionCompliance disruptionCompliance, ProtocolMarshaller protocolMarshaller) {

        if (disruptionCompliance == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(disruptionCompliance.getAchievableRpoInSecs(), ACHIEVABLERPOINSECS_BINDING);
            protocolMarshaller.marshall(disruptionCompliance.getAchievableRtoInSecs(), ACHIEVABLERTOINSECS_BINDING);
            protocolMarshaller.marshall(disruptionCompliance.getComplianceStatus(), COMPLIANCESTATUS_BINDING);
            protocolMarshaller.marshall(disruptionCompliance.getCurrentRpoInSecs(), CURRENTRPOINSECS_BINDING);
            protocolMarshaller.marshall(disruptionCompliance.getCurrentRtoInSecs(), CURRENTRTOINSECS_BINDING);
            protocolMarshaller.marshall(disruptionCompliance.getMessage(), MESSAGE_BINDING);
            protocolMarshaller.marshall(disruptionCompliance.getRpoDescription(), RPODESCRIPTION_BINDING);
            protocolMarshaller.marshall(disruptionCompliance.getRpoReferenceId(), RPOREFERENCEID_BINDING);
            protocolMarshaller.marshall(disruptionCompliance.getRtoDescription(), RTODESCRIPTION_BINDING);
            protocolMarshaller.marshall(disruptionCompliance.getRtoReferenceId(), RTOREFERENCEID_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
