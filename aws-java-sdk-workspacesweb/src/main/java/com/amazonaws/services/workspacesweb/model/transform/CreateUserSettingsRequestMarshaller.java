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

import com.amazonaws.util.IdempotentUtils;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CreateUserSettingsRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreateUserSettingsRequestMarshaller {

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
    private static final MarshallingInfo<List> TAGS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("tags").build();
    private static final MarshallingInfo<String> UPLOADALLOWED_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("uploadAllowed").build();

    private static final CreateUserSettingsRequestMarshaller instance = new CreateUserSettingsRequestMarshaller();

    public static CreateUserSettingsRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreateUserSettingsRequest createUserSettingsRequest, ProtocolMarshaller protocolMarshaller) {

        if (createUserSettingsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createUserSettingsRequest.getClientToken(), CLIENTTOKEN_BINDING);
            protocolMarshaller.marshall(createUserSettingsRequest.getCopyAllowed(), COPYALLOWED_BINDING);
            protocolMarshaller.marshall(createUserSettingsRequest.getDisconnectTimeoutInMinutes(), DISCONNECTTIMEOUTINMINUTES_BINDING);
            protocolMarshaller.marshall(createUserSettingsRequest.getDownloadAllowed(), DOWNLOADALLOWED_BINDING);
            protocolMarshaller.marshall(createUserSettingsRequest.getIdleDisconnectTimeoutInMinutes(), IDLEDISCONNECTTIMEOUTINMINUTES_BINDING);
            protocolMarshaller.marshall(createUserSettingsRequest.getPasteAllowed(), PASTEALLOWED_BINDING);
            protocolMarshaller.marshall(createUserSettingsRequest.getPrintAllowed(), PRINTALLOWED_BINDING);
            protocolMarshaller.marshall(createUserSettingsRequest.getTags(), TAGS_BINDING);
            protocolMarshaller.marshall(createUserSettingsRequest.getUploadAllowed(), UPLOADALLOWED_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
