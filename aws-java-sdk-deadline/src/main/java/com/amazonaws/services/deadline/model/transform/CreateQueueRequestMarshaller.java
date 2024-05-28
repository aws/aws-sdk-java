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

import java.util.Map;
import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.deadline.model.*;

import com.amazonaws.util.IdempotentUtils;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CreateQueueRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreateQueueRequestMarshaller {

    private static final MarshallingInfo<List> ALLOWEDSTORAGEPROFILEIDS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("allowedStorageProfileIds").build();
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
    private static final MarshallingInfo<List> REQUIREDFILESYSTEMLOCATIONNAMES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("requiredFileSystemLocationNames").build();
    private static final MarshallingInfo<String> ROLEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("roleArn").build();
    private static final MarshallingInfo<Map> TAGS_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("tags").build();

    private static final CreateQueueRequestMarshaller instance = new CreateQueueRequestMarshaller();

    public static CreateQueueRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreateQueueRequest createQueueRequest, ProtocolMarshaller protocolMarshaller) {

        if (createQueueRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createQueueRequest.getAllowedStorageProfileIds(), ALLOWEDSTORAGEPROFILEIDS_BINDING);
            protocolMarshaller.marshall(createQueueRequest.getClientToken(), CLIENTTOKEN_BINDING);
            protocolMarshaller.marshall(createQueueRequest.getDefaultBudgetAction(), DEFAULTBUDGETACTION_BINDING);
            protocolMarshaller.marshall(createQueueRequest.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(createQueueRequest.getDisplayName(), DISPLAYNAME_BINDING);
            protocolMarshaller.marshall(createQueueRequest.getFarmId(), FARMID_BINDING);
            protocolMarshaller.marshall(createQueueRequest.getJobAttachmentSettings(), JOBATTACHMENTSETTINGS_BINDING);
            protocolMarshaller.marshall(createQueueRequest.getJobRunAsUser(), JOBRUNASUSER_BINDING);
            protocolMarshaller.marshall(createQueueRequest.getRequiredFileSystemLocationNames(), REQUIREDFILESYSTEMLOCATIONNAMES_BINDING);
            protocolMarshaller.marshall(createQueueRequest.getRoleArn(), ROLEARN_BINDING);
            protocolMarshaller.marshall(createQueueRequest.getTags(), TAGS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
