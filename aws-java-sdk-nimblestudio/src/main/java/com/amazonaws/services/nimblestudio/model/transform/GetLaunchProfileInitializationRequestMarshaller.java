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
package com.amazonaws.services.nimblestudio.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.nimblestudio.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * GetLaunchProfileInitializationRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class GetLaunchProfileInitializationRequestMarshaller {

    private static final MarshallingInfo<String> LAUNCHPROFILEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PATH).marshallLocationName("launchProfileId").build();
    private static final MarshallingInfo<List> LAUNCHPROFILEPROTOCOLVERSIONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("launchProfileProtocolVersions").build();
    private static final MarshallingInfo<String> LAUNCHPURPOSE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("launchPurpose").build();
    private static final MarshallingInfo<String> PLATFORM_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("platform").build();
    private static final MarshallingInfo<String> STUDIOID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("studioId").build();

    private static final GetLaunchProfileInitializationRequestMarshaller instance = new GetLaunchProfileInitializationRequestMarshaller();

    public static GetLaunchProfileInitializationRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(GetLaunchProfileInitializationRequest getLaunchProfileInitializationRequest, ProtocolMarshaller protocolMarshaller) {

        if (getLaunchProfileInitializationRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(getLaunchProfileInitializationRequest.getLaunchProfileId(), LAUNCHPROFILEID_BINDING);
            protocolMarshaller.marshall(getLaunchProfileInitializationRequest.getLaunchProfileProtocolVersions(), LAUNCHPROFILEPROTOCOLVERSIONS_BINDING);
            protocolMarshaller.marshall(getLaunchProfileInitializationRequest.getLaunchPurpose(), LAUNCHPURPOSE_BINDING);
            protocolMarshaller.marshall(getLaunchProfileInitializationRequest.getPlatform(), PLATFORM_BINDING);
            protocolMarshaller.marshall(getLaunchProfileInitializationRequest.getStudioId(), STUDIOID_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
