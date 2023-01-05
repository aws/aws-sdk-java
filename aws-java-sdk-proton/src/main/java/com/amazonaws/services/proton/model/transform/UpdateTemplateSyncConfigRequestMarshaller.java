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
package com.amazonaws.services.proton.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.proton.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * UpdateTemplateSyncConfigRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UpdateTemplateSyncConfigRequestMarshaller {

    private static final MarshallingInfo<String> BRANCH_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("branch").build();
    private static final MarshallingInfo<String> REPOSITORYNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("repositoryName").build();
    private static final MarshallingInfo<String> REPOSITORYPROVIDER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("repositoryProvider").build();
    private static final MarshallingInfo<String> SUBDIRECTORY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("subdirectory").build();
    private static final MarshallingInfo<String> TEMPLATENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("templateName").build();
    private static final MarshallingInfo<String> TEMPLATETYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("templateType").build();

    private static final UpdateTemplateSyncConfigRequestMarshaller instance = new UpdateTemplateSyncConfigRequestMarshaller();

    public static UpdateTemplateSyncConfigRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UpdateTemplateSyncConfigRequest updateTemplateSyncConfigRequest, ProtocolMarshaller protocolMarshaller) {

        if (updateTemplateSyncConfigRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(updateTemplateSyncConfigRequest.getBranch(), BRANCH_BINDING);
            protocolMarshaller.marshall(updateTemplateSyncConfigRequest.getRepositoryName(), REPOSITORYNAME_BINDING);
            protocolMarshaller.marshall(updateTemplateSyncConfigRequest.getRepositoryProvider(), REPOSITORYPROVIDER_BINDING);
            protocolMarshaller.marshall(updateTemplateSyncConfigRequest.getSubdirectory(), SUBDIRECTORY_BINDING);
            protocolMarshaller.marshall(updateTemplateSyncConfigRequest.getTemplateName(), TEMPLATENAME_BINDING);
            protocolMarshaller.marshall(updateTemplateSyncConfigRequest.getTemplateType(), TEMPLATETYPE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
