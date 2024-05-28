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
package com.amazonaws.services.gamelift.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.gamelift.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ContainerGroupsAttributesMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ContainerGroupsAttributesMarshaller {

    private static final MarshallingInfo<List> CONTAINERGROUPDEFINITIONPROPERTIES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ContainerGroupDefinitionProperties").build();
    private static final MarshallingInfo<StructuredPojo> CONNECTIONPORTRANGE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ConnectionPortRange").build();
    private static final MarshallingInfo<StructuredPojo> CONTAINERGROUPSPERINSTANCE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ContainerGroupsPerInstance").build();

    private static final ContainerGroupsAttributesMarshaller instance = new ContainerGroupsAttributesMarshaller();

    public static ContainerGroupsAttributesMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ContainerGroupsAttributes containerGroupsAttributes, ProtocolMarshaller protocolMarshaller) {

        if (containerGroupsAttributes == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(containerGroupsAttributes.getContainerGroupDefinitionProperties(), CONTAINERGROUPDEFINITIONPROPERTIES_BINDING);
            protocolMarshaller.marshall(containerGroupsAttributes.getConnectionPortRange(), CONNECTIONPORTRANGE_BINDING);
            protocolMarshaller.marshall(containerGroupsAttributes.getContainerGroupsPerInstance(), CONTAINERGROUPSPERINSTANCE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
