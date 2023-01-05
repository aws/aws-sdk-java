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
package com.amazonaws.services.iottwinmaker.model.transform;

import java.util.Map;
import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.iottwinmaker.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CreateComponentTypeRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreateComponentTypeRequestMarshaller {

    private static final MarshallingInfo<String> WORKSPACEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("workspaceId").build();
    private static final MarshallingInfo<Boolean> ISSINGLETON_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("isSingleton").build();
    private static final MarshallingInfo<String> COMPONENTTYPEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PATH).marshallLocationName("componentTypeId").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("description").build();
    private static final MarshallingInfo<Map> PROPERTYDEFINITIONS_BINDING = MarshallingInfo.builder(MarshallingType.MAP)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("propertyDefinitions").build();
    private static final MarshallingInfo<List> EXTENDSFROM_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("extendsFrom").build();
    private static final MarshallingInfo<Map> FUNCTIONS_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("functions").build();
    private static final MarshallingInfo<Map> TAGS_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("tags").build();
    private static final MarshallingInfo<Map> PROPERTYGROUPS_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("propertyGroups").build();
    private static final MarshallingInfo<String> COMPONENTTYPENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("componentTypeName").build();

    private static final CreateComponentTypeRequestMarshaller instance = new CreateComponentTypeRequestMarshaller();

    public static CreateComponentTypeRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreateComponentTypeRequest createComponentTypeRequest, ProtocolMarshaller protocolMarshaller) {

        if (createComponentTypeRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createComponentTypeRequest.getWorkspaceId(), WORKSPACEID_BINDING);
            protocolMarshaller.marshall(createComponentTypeRequest.getIsSingleton(), ISSINGLETON_BINDING);
            protocolMarshaller.marshall(createComponentTypeRequest.getComponentTypeId(), COMPONENTTYPEID_BINDING);
            protocolMarshaller.marshall(createComponentTypeRequest.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(createComponentTypeRequest.getPropertyDefinitions(), PROPERTYDEFINITIONS_BINDING);
            protocolMarshaller.marshall(createComponentTypeRequest.getExtendsFrom(), EXTENDSFROM_BINDING);
            protocolMarshaller.marshall(createComponentTypeRequest.getFunctions(), FUNCTIONS_BINDING);
            protocolMarshaller.marshall(createComponentTypeRequest.getTags(), TAGS_BINDING);
            protocolMarshaller.marshall(createComponentTypeRequest.getPropertyGroups(), PROPERTYGROUPS_BINDING);
            protocolMarshaller.marshall(createComponentTypeRequest.getComponentTypeName(), COMPONENTTYPENAME_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
