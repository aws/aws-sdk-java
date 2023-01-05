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
package com.amazonaws.services.kendra.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.kendra.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * UpdateAccessControlConfigurationRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UpdateAccessControlConfigurationRequestMarshaller {

    private static final MarshallingInfo<String> INDEXID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("IndexId").build();
    private static final MarshallingInfo<String> ID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Id").build();
    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Name").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Description").build();
    private static final MarshallingInfo<List> ACCESSCONTROLLIST_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AccessControlList").build();
    private static final MarshallingInfo<List> HIERARCHICALACCESSCONTROLLIST_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("HierarchicalAccessControlList").build();

    private static final UpdateAccessControlConfigurationRequestMarshaller instance = new UpdateAccessControlConfigurationRequestMarshaller();

    public static UpdateAccessControlConfigurationRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UpdateAccessControlConfigurationRequest updateAccessControlConfigurationRequest, ProtocolMarshaller protocolMarshaller) {

        if (updateAccessControlConfigurationRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(updateAccessControlConfigurationRequest.getIndexId(), INDEXID_BINDING);
            protocolMarshaller.marshall(updateAccessControlConfigurationRequest.getId(), ID_BINDING);
            protocolMarshaller.marshall(updateAccessControlConfigurationRequest.getName(), NAME_BINDING);
            protocolMarshaller.marshall(updateAccessControlConfigurationRequest.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(updateAccessControlConfigurationRequest.getAccessControlList(), ACCESSCONTROLLIST_BINDING);
            protocolMarshaller.marshall(updateAccessControlConfigurationRequest.getHierarchicalAccessControlList(), HIERARCHICALACCESSCONTROLLIST_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
