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
package com.amazonaws.services.workspacesweb.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.workspacesweb.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * UserAccessLoggingSettingsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UserAccessLoggingSettingsMarshaller {

    private static final MarshallingInfo<List> ASSOCIATEDPORTALARNS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("associatedPortalArns").build();
    private static final MarshallingInfo<String> KINESISSTREAMARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("kinesisStreamArn").build();
    private static final MarshallingInfo<String> USERACCESSLOGGINGSETTINGSARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("userAccessLoggingSettingsArn").build();

    private static final UserAccessLoggingSettingsMarshaller instance = new UserAccessLoggingSettingsMarshaller();

    public static UserAccessLoggingSettingsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UserAccessLoggingSettings userAccessLoggingSettings, ProtocolMarshaller protocolMarshaller) {

        if (userAccessLoggingSettings == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(userAccessLoggingSettings.getAssociatedPortalArns(), ASSOCIATEDPORTALARNS_BINDING);
            protocolMarshaller.marshall(userAccessLoggingSettings.getKinesisStreamArn(), KINESISSTREAMARN_BINDING);
            protocolMarshaller.marshall(userAccessLoggingSettings.getUserAccessLoggingSettingsArn(), USERACCESSLOGGINGSETTINGSARN_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
