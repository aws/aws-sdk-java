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

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.securityhub.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * AwsGuardDutyDetectorDetailsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AwsGuardDutyDetectorDetailsMarshaller {

    private static final MarshallingInfo<StructuredPojo> DATASOURCES_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DataSources").build();
    private static final MarshallingInfo<List> FEATURES_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Features").build();
    private static final MarshallingInfo<String> FINDINGPUBLISHINGFREQUENCY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FindingPublishingFrequency").build();
    private static final MarshallingInfo<String> SERVICEROLE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ServiceRole").build();
    private static final MarshallingInfo<String> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Status").build();

    private static final AwsGuardDutyDetectorDetailsMarshaller instance = new AwsGuardDutyDetectorDetailsMarshaller();

    public static AwsGuardDutyDetectorDetailsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AwsGuardDutyDetectorDetails awsGuardDutyDetectorDetails, ProtocolMarshaller protocolMarshaller) {

        if (awsGuardDutyDetectorDetails == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(awsGuardDutyDetectorDetails.getDataSources(), DATASOURCES_BINDING);
            protocolMarshaller.marshall(awsGuardDutyDetectorDetails.getFeatures(), FEATURES_BINDING);
            protocolMarshaller.marshall(awsGuardDutyDetectorDetails.getFindingPublishingFrequency(), FINDINGPUBLISHINGFREQUENCY_BINDING);
            protocolMarshaller.marshall(awsGuardDutyDetectorDetails.getServiceRole(), SERVICEROLE_BINDING);
            protocolMarshaller.marshall(awsGuardDutyDetectorDetails.getStatus(), STATUS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
