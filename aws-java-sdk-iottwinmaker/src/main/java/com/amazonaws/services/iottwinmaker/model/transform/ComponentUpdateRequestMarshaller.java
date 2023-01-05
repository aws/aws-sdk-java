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

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.iottwinmaker.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ComponentUpdateRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ComponentUpdateRequestMarshaller {

    private static final MarshallingInfo<String> UPDATETYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("updateType").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("description").build();
    private static final MarshallingInfo<String> COMPONENTTYPEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("componentTypeId").build();
    private static final MarshallingInfo<Map> PROPERTYUPDATES_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("propertyUpdates").build();
    private static final MarshallingInfo<Map> PROPERTYGROUPUPDATES_BINDING = MarshallingInfo.builder(MarshallingType.MAP)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("propertyGroupUpdates").build();

    private static final ComponentUpdateRequestMarshaller instance = new ComponentUpdateRequestMarshaller();

    public static ComponentUpdateRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ComponentUpdateRequest componentUpdateRequest, ProtocolMarshaller protocolMarshaller) {

        if (componentUpdateRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(componentUpdateRequest.getUpdateType(), UPDATETYPE_BINDING);
            protocolMarshaller.marshall(componentUpdateRequest.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(componentUpdateRequest.getComponentTypeId(), COMPONENTTYPEID_BINDING);
            protocolMarshaller.marshall(componentUpdateRequest.getPropertyUpdates(), PROPERTYUPDATES_BINDING);
            protocolMarshaller.marshall(componentUpdateRequest.getPropertyGroupUpdates(), PROPERTYGROUPUPDATES_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
