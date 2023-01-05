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
package com.amazonaws.services.cloudtrail.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.cloudtrail.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CreateEventDataStoreRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreateEventDataStoreRequestMarshaller {

    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Name").build();
    private static final MarshallingInfo<List> ADVANCEDEVENTSELECTORS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AdvancedEventSelectors").build();
    private static final MarshallingInfo<Boolean> MULTIREGIONENABLED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MultiRegionEnabled").build();
    private static final MarshallingInfo<Boolean> ORGANIZATIONENABLED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("OrganizationEnabled").build();
    private static final MarshallingInfo<Integer> RETENTIONPERIOD_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RetentionPeriod").build();
    private static final MarshallingInfo<Boolean> TERMINATIONPROTECTIONENABLED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TerminationProtectionEnabled").build();
    private static final MarshallingInfo<List> TAGSLIST_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("TagsList").build();
    private static final MarshallingInfo<String> KMSKEYID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("KmsKeyId").build();

    private static final CreateEventDataStoreRequestMarshaller instance = new CreateEventDataStoreRequestMarshaller();

    public static CreateEventDataStoreRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreateEventDataStoreRequest createEventDataStoreRequest, ProtocolMarshaller protocolMarshaller) {

        if (createEventDataStoreRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createEventDataStoreRequest.getName(), NAME_BINDING);
            protocolMarshaller.marshall(createEventDataStoreRequest.getAdvancedEventSelectors(), ADVANCEDEVENTSELECTORS_BINDING);
            protocolMarshaller.marshall(createEventDataStoreRequest.getMultiRegionEnabled(), MULTIREGIONENABLED_BINDING);
            protocolMarshaller.marshall(createEventDataStoreRequest.getOrganizationEnabled(), ORGANIZATIONENABLED_BINDING);
            protocolMarshaller.marshall(createEventDataStoreRequest.getRetentionPeriod(), RETENTIONPERIOD_BINDING);
            protocolMarshaller.marshall(createEventDataStoreRequest.getTerminationProtectionEnabled(), TERMINATIONPROTECTIONENABLED_BINDING);
            protocolMarshaller.marshall(createEventDataStoreRequest.getTagsList(), TAGSLIST_BINDING);
            protocolMarshaller.marshall(createEventDataStoreRequest.getKmsKeyId(), KMSKEYID_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
