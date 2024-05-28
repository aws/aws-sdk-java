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
package com.amazonaws.services.codestarconnections.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.codestarconnections.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * UpdateSyncConfigurationRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UpdateSyncConfigurationRequestMarshaller {

    private static final MarshallingInfo<String> BRANCH_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Branch").build();
    private static final MarshallingInfo<String> CONFIGFILE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ConfigFile").build();
    private static final MarshallingInfo<String> REPOSITORYLINKID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RepositoryLinkId").build();
    private static final MarshallingInfo<String> RESOURCENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ResourceName").build();
    private static final MarshallingInfo<String> ROLEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("RoleArn").build();
    private static final MarshallingInfo<String> SYNCTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("SyncType").build();
    private static final MarshallingInfo<String> PUBLISHDEPLOYMENTSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PublishDeploymentStatus").build();
    private static final MarshallingInfo<String> TRIGGERRESOURCEUPDATEON_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TriggerResourceUpdateOn").build();

    private static final UpdateSyncConfigurationRequestMarshaller instance = new UpdateSyncConfigurationRequestMarshaller();

    public static UpdateSyncConfigurationRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UpdateSyncConfigurationRequest updateSyncConfigurationRequest, ProtocolMarshaller protocolMarshaller) {

        if (updateSyncConfigurationRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(updateSyncConfigurationRequest.getBranch(), BRANCH_BINDING);
            protocolMarshaller.marshall(updateSyncConfigurationRequest.getConfigFile(), CONFIGFILE_BINDING);
            protocolMarshaller.marshall(updateSyncConfigurationRequest.getRepositoryLinkId(), REPOSITORYLINKID_BINDING);
            protocolMarshaller.marshall(updateSyncConfigurationRequest.getResourceName(), RESOURCENAME_BINDING);
            protocolMarshaller.marshall(updateSyncConfigurationRequest.getRoleArn(), ROLEARN_BINDING);
            protocolMarshaller.marshall(updateSyncConfigurationRequest.getSyncType(), SYNCTYPE_BINDING);
            protocolMarshaller.marshall(updateSyncConfigurationRequest.getPublishDeploymentStatus(), PUBLISHDEPLOYMENTSTATUS_BINDING);
            protocolMarshaller.marshall(updateSyncConfigurationRequest.getTriggerResourceUpdateOn(), TRIGGERRESOURCEUPDATEON_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
