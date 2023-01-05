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

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.workspacesweb.model.*;

import com.amazonaws.util.IdempotentUtils;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * UpdateUserSettingsRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UpdateUserSettingsRequestMarshaller {

    private static final MarshallingInfo<String> CLIENTTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("clientToken")
            .defaultValueSupplier(com.amazonaws.util.IdempotentUtils.getGenerator()).build();
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
            .marshallLocation(MarshallLocation.GREEDY_PATH).marshallLocationName("userSettingsArn").build();

    private static final UpdateUserSettingsRequestMarshaller instance = new UpdateUserSettingsRequestMarshaller();

    public static UpdateUserSettingsRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UpdateUserSettingsRequest updateUserSettingsRequest, ProtocolMarshaller protocolMarshaller) {

        if (updateUserSettingsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(updateUserSettingsRequest.getClientToken(), CLIENTTOKEN_BINDING);
            protocolMarshaller.marshall(updateUserSettingsRequest.getCopyAllowed(), COPYALLOWED_BINDING);
            protocolMarshaller.marshall(updateUserSettingsRequest.getDisconnectTimeoutInMinutes(), DISCONNECTTIMEOUTINMINUTES_BINDING);
            protocolMarshaller.marshall(updateUserSettingsRequest.getDownloadAllowed(), DOWNLOADALLOWED_BINDING);
            protocolMarshaller.marshall(updateUserSettingsRequest.getIdleDisconnectTimeoutInMinutes(), IDLEDISCONNECTTIMEOUTINMINUTES_BINDING);
            protocolMarshaller.marshall(updateUserSettingsRequest.getPasteAllowed(), PASTEALLOWED_BINDING);
            protocolMarshaller.marshall(updateUserSettingsRequest.getPrintAllowed(), PRINTALLOWED_BINDING);
            protocolMarshaller.marshall(updateUserSettingsRequest.getUploadAllowed(), UPLOADALLOWED_BINDING);
            protocolMarshaller.marshall(updateUserSettingsRequest.getUserSettingsArn(), USERSETTINGSARN_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
