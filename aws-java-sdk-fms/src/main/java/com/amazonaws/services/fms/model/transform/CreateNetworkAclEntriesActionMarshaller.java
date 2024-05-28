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
package com.amazonaws.services.fms.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.fms.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CreateNetworkAclEntriesActionMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreateNetworkAclEntriesActionMarshaller {

    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Description").build();
    private static final MarshallingInfo<StructuredPojo> NETWORKACLID_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("NetworkAclId").build();
    private static final MarshallingInfo<List> NETWORKACLENTRIESTOBECREATED_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("NetworkAclEntriesToBeCreated").build();
    private static final MarshallingInfo<Boolean> FMSCANREMEDIATE_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FMSCanRemediate").build();

    private static final CreateNetworkAclEntriesActionMarshaller instance = new CreateNetworkAclEntriesActionMarshaller();

    public static CreateNetworkAclEntriesActionMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreateNetworkAclEntriesAction createNetworkAclEntriesAction, ProtocolMarshaller protocolMarshaller) {

        if (createNetworkAclEntriesAction == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createNetworkAclEntriesAction.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(createNetworkAclEntriesAction.getNetworkAclId(), NETWORKACLID_BINDING);
            protocolMarshaller.marshall(createNetworkAclEntriesAction.getNetworkAclEntriesToBeCreated(), NETWORKACLENTRIESTOBECREATED_BINDING);
            protocolMarshaller.marshall(createNetworkAclEntriesAction.getFMSCanRemediate(), FMSCANREMEDIATE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
