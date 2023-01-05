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
 * AwsEc2LaunchTemplateDetailsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AwsEc2LaunchTemplateDetailsMarshaller {

    private static final MarshallingInfo<String> LAUNCHTEMPLATENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LaunchTemplateName").build();
    private static final MarshallingInfo<String> ID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Id").build();
    private static final MarshallingInfo<StructuredPojo> LAUNCHTEMPLATEDATA_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LaunchTemplateData").build();
    private static final MarshallingInfo<Long> DEFAULTVERSIONNUMBER_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DefaultVersionNumber").build();
    private static final MarshallingInfo<Long> LATESTVERSIONNUMBER_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LatestVersionNumber").build();

    private static final AwsEc2LaunchTemplateDetailsMarshaller instance = new AwsEc2LaunchTemplateDetailsMarshaller();

    public static AwsEc2LaunchTemplateDetailsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AwsEc2LaunchTemplateDetails awsEc2LaunchTemplateDetails, ProtocolMarshaller protocolMarshaller) {

        if (awsEc2LaunchTemplateDetails == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(awsEc2LaunchTemplateDetails.getLaunchTemplateName(), LAUNCHTEMPLATENAME_BINDING);
            protocolMarshaller.marshall(awsEc2LaunchTemplateDetails.getId(), ID_BINDING);
            protocolMarshaller.marshall(awsEc2LaunchTemplateDetails.getLaunchTemplateData(), LAUNCHTEMPLATEDATA_BINDING);
            protocolMarshaller.marshall(awsEc2LaunchTemplateDetails.getDefaultVersionNumber(), DEFAULTVERSIONNUMBER_BINDING);
            protocolMarshaller.marshall(awsEc2LaunchTemplateDetails.getLatestVersionNumber(), LATESTVERSIONNUMBER_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
