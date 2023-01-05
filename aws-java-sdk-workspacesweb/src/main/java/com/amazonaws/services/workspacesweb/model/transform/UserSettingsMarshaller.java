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
 * UserSettingsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UserSettingsMarshaller {

    private static final MarshallingInfo<List> ASSOCIATEDPORTALARNS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("associatedPortalArns").build();
    private static final MarshallingInfo<String> COPYALLOWED_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("copyAllowed").build();
    private static final MarshallingInfo<Integer> DISCONNECTTIMEOUTINMINUTES_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("disconnectTimeoutInMinutes").build();
    private static final MarshallingInfo<String> DOWNLOADALLOWED_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("downloadAllowed").build();
    private static final MarshallingInfo<Integer> IDLEDISCONNECTTIMEOUTINMINUTES_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("idleDisconnectTimeoutInMinutes").build();
    private static final MarshallingInfo<String> PASTEALLOWED_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("pasteAllowed").build();
    private static final MarshallingInfo<String> PRINTALLOWED_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("printAllowed").build();
    private static final MarshallingInfo<String> UPLOADALLOWED_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("uploadAllowed").build();
    private static final MarshallingInfo<String> USERSETTINGSARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("userSettingsArn").build();

    private static final UserSettingsMarshaller instance = new UserSettingsMarshaller();

    public static UserSettingsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UserSettings userSettings, ProtocolMarshaller protocolMarshaller) {

        if (userSettings == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(userSettings.getAssociatedPortalArns(), ASSOCIATEDPORTALARNS_BINDING);
            protocolMarshaller.marshall(userSettings.getCopyAllowed(), COPYALLOWED_BINDING);
            protocolMarshaller.marshall(userSettings.getDisconnectTimeoutInMinutes(), DISCONNECTTIMEOUTINMINUTES_BINDING);
            protocolMarshaller.marshall(userSettings.getDownloadAllowed(), DOWNLOADALLOWED_BINDING);
            protocolMarshaller.marshall(userSettings.getIdleDisconnectTimeoutInMinutes(), IDLEDISCONNECTTIMEOUTINMINUTES_BINDING);
            protocolMarshaller.marshall(userSettings.getPasteAllowed(), PASTEALLOWED_BINDING);
            protocolMarshaller.marshall(userSettings.getPrintAllowed(), PRINTALLOWED_BINDING);
            protocolMarshaller.marshall(userSettings.getUploadAllowed(), UPLOADALLOWED_BINDING);
            protocolMarshaller.marshall(userSettings.getUserSettingsArn(), USERSETTINGSARN_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
