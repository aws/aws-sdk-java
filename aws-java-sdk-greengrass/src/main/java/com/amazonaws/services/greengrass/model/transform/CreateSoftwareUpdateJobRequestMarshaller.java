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
package com.amazonaws.services.greengrass.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.greengrass.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CreateSoftwareUpdateJobRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreateSoftwareUpdateJobRequestMarshaller {

    private static final MarshallingInfo<String> AMZNCLIENTTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.HEADER).marshallLocationName("X-Amzn-Client-Token").build();
    private static final MarshallingInfo<String> S3URLSIGNERROLE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("S3UrlSignerRole").build();
    private static final MarshallingInfo<String> SOFTWARETOUPDATE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SoftwareToUpdate").build();
    private static final MarshallingInfo<String> UPDATEAGENTLOGLEVEL_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("UpdateAgentLogLevel").build();
    private static final MarshallingInfo<List> UPDATETARGETS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("UpdateTargets").build();
    private static final MarshallingInfo<String> UPDATETARGETSARCHITECTURE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("UpdateTargetsArchitecture").build();
    private static final MarshallingInfo<String> UPDATETARGETSOPERATINGSYSTEM_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("UpdateTargetsOperatingSystem").build();

    private static final CreateSoftwareUpdateJobRequestMarshaller instance = new CreateSoftwareUpdateJobRequestMarshaller();

    public static CreateSoftwareUpdateJobRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreateSoftwareUpdateJobRequest createSoftwareUpdateJobRequest, ProtocolMarshaller protocolMarshaller) {

        if (createSoftwareUpdateJobRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createSoftwareUpdateJobRequest.getAmznClientToken(), AMZNCLIENTTOKEN_BINDING);
            protocolMarshaller.marshall(createSoftwareUpdateJobRequest.getS3UrlSignerRole(), S3URLSIGNERROLE_BINDING);
            protocolMarshaller.marshall(createSoftwareUpdateJobRequest.getSoftwareToUpdate(), SOFTWARETOUPDATE_BINDING);
            protocolMarshaller.marshall(createSoftwareUpdateJobRequest.getUpdateAgentLogLevel(), UPDATEAGENTLOGLEVEL_BINDING);
            protocolMarshaller.marshall(createSoftwareUpdateJobRequest.getUpdateTargets(), UPDATETARGETS_BINDING);
            protocolMarshaller.marshall(createSoftwareUpdateJobRequest.getUpdateTargetsArchitecture(), UPDATETARGETSARCHITECTURE_BINDING);
            protocolMarshaller.marshall(createSoftwareUpdateJobRequest.getUpdateTargetsOperatingSystem(), UPDATETARGETSOPERATINGSYSTEM_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
