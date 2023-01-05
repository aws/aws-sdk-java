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
 * UpdateAccountSettingsRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UpdateAccountSettingsRequestMarshaller {

    private static final MarshallingInfo<Boolean> DELETEPIPELINEPROVISIONINGREPOSITORY_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("deletePipelineProvisioningRepository").build();
    private static final MarshallingInfo<String> PIPELINECODEBUILDROLEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("pipelineCodebuildRoleArn").build();
    private static final MarshallingInfo<StructuredPojo> PIPELINEPROVISIONINGREPOSITORY_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("pipelineProvisioningRepository").build();
    private static final MarshallingInfo<String> PIPELINESERVICEROLEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("pipelineServiceRoleArn").build();

    private static final UpdateAccountSettingsRequestMarshaller instance = new UpdateAccountSettingsRequestMarshaller();

    public static UpdateAccountSettingsRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UpdateAccountSettingsRequest updateAccountSettingsRequest, ProtocolMarshaller protocolMarshaller) {

        if (updateAccountSettingsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(updateAccountSettingsRequest.getDeletePipelineProvisioningRepository(), DELETEPIPELINEPROVISIONINGREPOSITORY_BINDING);
            protocolMarshaller.marshall(updateAccountSettingsRequest.getPipelineCodebuildRoleArn(), PIPELINECODEBUILDROLEARN_BINDING);
            protocolMarshaller.marshall(updateAccountSettingsRequest.getPipelineProvisioningRepository(), PIPELINEPROVISIONINGREPOSITORY_BINDING);
            protocolMarshaller.marshall(updateAccountSettingsRequest.getPipelineServiceRoleArn(), PIPELINESERVICEROLEARN_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
