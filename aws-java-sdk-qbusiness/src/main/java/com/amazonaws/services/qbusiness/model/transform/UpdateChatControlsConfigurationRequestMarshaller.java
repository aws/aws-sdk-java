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
package com.amazonaws.services.qbusiness.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.qbusiness.model.*;

import com.amazonaws.util.IdempotentUtils;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * UpdateChatControlsConfigurationRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UpdateChatControlsConfigurationRequestMarshaller {

    private static final MarshallingInfo<String> APPLICATIONID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PATH).marshallLocationName("applicationId").build();
    private static final MarshallingInfo<String> CLIENTTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("clientToken")
            .defaultValueSupplier(com.amazonaws.util.IdempotentUtils.getGenerator()).build();
    private static final MarshallingInfo<String> RESPONSESCOPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("responseScope").build();
    private static final MarshallingInfo<StructuredPojo> BLOCKEDPHRASESCONFIGURATIONUPDATE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("blockedPhrasesConfigurationUpdate").build();
    private static final MarshallingInfo<List> TOPICCONFIGURATIONSTOCREATEORUPDATE_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("topicConfigurationsToCreateOrUpdate").build();
    private static final MarshallingInfo<List> TOPICCONFIGURATIONSTODELETE_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("topicConfigurationsToDelete").build();
    private static final MarshallingInfo<StructuredPojo> CREATORMODECONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("creatorModeConfiguration").build();

    private static final UpdateChatControlsConfigurationRequestMarshaller instance = new UpdateChatControlsConfigurationRequestMarshaller();

    public static UpdateChatControlsConfigurationRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UpdateChatControlsConfigurationRequest updateChatControlsConfigurationRequest, ProtocolMarshaller protocolMarshaller) {

        if (updateChatControlsConfigurationRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(updateChatControlsConfigurationRequest.getApplicationId(), APPLICATIONID_BINDING);
            protocolMarshaller.marshall(updateChatControlsConfigurationRequest.getClientToken(), CLIENTTOKEN_BINDING);
            protocolMarshaller.marshall(updateChatControlsConfigurationRequest.getResponseScope(), RESPONSESCOPE_BINDING);
            protocolMarshaller.marshall(updateChatControlsConfigurationRequest.getBlockedPhrasesConfigurationUpdate(),
                    BLOCKEDPHRASESCONFIGURATIONUPDATE_BINDING);
            protocolMarshaller.marshall(updateChatControlsConfigurationRequest.getTopicConfigurationsToCreateOrUpdate(),
                    TOPICCONFIGURATIONSTOCREATEORUPDATE_BINDING);
            protocolMarshaller.marshall(updateChatControlsConfigurationRequest.getTopicConfigurationsToDelete(), TOPICCONFIGURATIONSTODELETE_BINDING);
            protocolMarshaller.marshall(updateChatControlsConfigurationRequest.getCreatorModeConfiguration(), CREATORMODECONFIGURATION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
