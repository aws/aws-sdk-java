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
package com.amazonaws.services.appconfig.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.appconfig.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * GetHostedConfigurationVersionRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class GetHostedConfigurationVersionRequestMarshaller {

    private static final MarshallingInfo<String> APPLICATIONID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PATH).marshallLocationName("ApplicationId").build();
    private static final MarshallingInfo<String> CONFIGURATIONPROFILEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PATH).marshallLocationName("ConfigurationProfileId").build();
    private static final MarshallingInfo<Integer> VERSIONNUMBER_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PATH).marshallLocationName("VersionNumber").build();

    private static final GetHostedConfigurationVersionRequestMarshaller instance = new GetHostedConfigurationVersionRequestMarshaller();

    public static GetHostedConfigurationVersionRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(GetHostedConfigurationVersionRequest getHostedConfigurationVersionRequest, ProtocolMarshaller protocolMarshaller) {

        if (getHostedConfigurationVersionRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(getHostedConfigurationVersionRequest.getApplicationId(), APPLICATIONID_BINDING);
            protocolMarshaller.marshall(getHostedConfigurationVersionRequest.getConfigurationProfileId(), CONFIGURATIONPROFILEID_BINDING);
            protocolMarshaller.marshall(getHostedConfigurationVersionRequest.getVersionNumber(), VERSIONNUMBER_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
