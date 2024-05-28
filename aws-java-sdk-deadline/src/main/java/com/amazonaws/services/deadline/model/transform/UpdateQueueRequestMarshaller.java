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
package com.amazonaws.services.deadline.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.deadline.model.*;

import com.amazonaws.util.IdempotentUtils;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * UpdateQueueRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UpdateQueueRequestMarshaller {

    private static final MarshallingInfo<List> ALLOWEDSTORAGEPROFILEIDSTOADD_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("allowedStorageProfileIdsToAdd").build();
    private static final MarshallingInfo<List> ALLOWEDSTORAGEPROFILEIDSTOREMOVE_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("allowedStorageProfileIdsToRemove").build();
    private static final MarshallingInfo<String> CLIENTTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.HEADER).marshallLocationName("X-Amz-Client-Token")
            .defaultValueSupplier(com.amazonaws.util.IdempotentUtils.getGenerator()).build();
    private static final MarshallingInfo<String> DEFAULTBUDGETACTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("defaultBudgetAction").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("description").build();
    private static final MarshallingInfo<String> DISPLAYNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("displayName").build();
    private static final MarshallingInfo<String> FARMID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("farmId").build();
    private static final MarshallingInfo<StructuredPojo> JOBATTACHMENTSETTINGS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("jobAttachmentSettings").build();
    private static final MarshallingInfo<StructuredPojo> JOBRUNASUSER_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("jobRunAsUser").build();
    private static final MarshallingInfo<String> QUEUEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("queueId").build();
    private static final MarshallingInfo<List> REQUIREDFILESYSTEMLOCATIONNAMESTOADD_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("requiredFileSystemLocationNamesToAdd").build();
    private static final MarshallingInfo<List> REQUIREDFILESYSTEMLOCATIONNAMESTOREMOVE_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("requiredFileSystemLocationNamesToRemove").build();
    private static final MarshallingInfo<String> ROLEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("roleArn").build();

    private static final UpdateQueueRequestMarshaller instance = new UpdateQueueRequestMarshaller();

    public static UpdateQueueRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UpdateQueueRequest updateQueueRequest, ProtocolMarshaller protocolMarshaller) {

        if (updateQueueRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(updateQueueRequest.getAllowedStorageProfileIdsToAdd(), ALLOWEDSTORAGEPROFILEIDSTOADD_BINDING);
            protocolMarshaller.marshall(updateQueueRequest.getAllowedStorageProfileIdsToRemove(), ALLOWEDSTORAGEPROFILEIDSTOREMOVE_BINDING);
            protocolMarshaller.marshall(updateQueueRequest.getClientToken(), CLIENTTOKEN_BINDING);
            protocolMarshaller.marshall(updateQueueRequest.getDefaultBudgetAction(), DEFAULTBUDGETACTION_BINDING);
            protocolMarshaller.marshall(updateQueueRequest.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(updateQueueRequest.getDisplayName(), DISPLAYNAME_BINDING);
            protocolMarshaller.marshall(updateQueueRequest.getFarmId(), FARMID_BINDING);
            protocolMarshaller.marshall(updateQueueRequest.getJobAttachmentSettings(), JOBATTACHMENTSETTINGS_BINDING);
            protocolMarshaller.marshall(updateQueueRequest.getJobRunAsUser(), JOBRUNASUSER_BINDING);
            protocolMarshaller.marshall(updateQueueRequest.getQueueId(), QUEUEID_BINDING);
            protocolMarshaller.marshall(updateQueueRequest.getRequiredFileSystemLocationNamesToAdd(), REQUIREDFILESYSTEMLOCATIONNAMESTOADD_BINDING);
            protocolMarshaller.marshall(updateQueueRequest.getRequiredFileSystemLocationNamesToRemove(), REQUIREDFILESYSTEMLOCATIONNAMESTOREMOVE_BINDING);
            protocolMarshaller.marshall(updateQueueRequest.getRoleArn(), ROLEARN_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
