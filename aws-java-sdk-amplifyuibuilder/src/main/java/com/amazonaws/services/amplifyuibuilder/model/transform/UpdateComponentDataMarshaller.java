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
package com.amazonaws.services.amplifyuibuilder.model.transform;

import java.util.Map;
import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.amplifyuibuilder.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * UpdateComponentDataMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UpdateComponentDataMarshaller {

    private static final MarshallingInfo<Map> BINDINGPROPERTIES_BINDING = MarshallingInfo.builder(MarshallingType.MAP)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("bindingProperties").build();
    private static final MarshallingInfo<List> CHILDREN_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("children").build();
    private static final MarshallingInfo<Map> COLLECTIONPROPERTIES_BINDING = MarshallingInfo.builder(MarshallingType.MAP)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("collectionProperties").build();
    private static final MarshallingInfo<String> COMPONENTTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("componentType").build();
    private static final MarshallingInfo<Map> EVENTS_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("events").build();
    private static final MarshallingInfo<String> ID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("id").build();
    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("name").build();
    private static final MarshallingInfo<Map> OVERRIDES_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("overrides").build();
    private static final MarshallingInfo<Map> PROPERTIES_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("properties").build();
    private static final MarshallingInfo<String> SCHEMAVERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("schemaVersion").build();
    private static final MarshallingInfo<String> SOURCEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("sourceId").build();
    private static final MarshallingInfo<List> VARIANTS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("variants").build();

    private static final UpdateComponentDataMarshaller instance = new UpdateComponentDataMarshaller();

    public static UpdateComponentDataMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UpdateComponentData updateComponentData, ProtocolMarshaller protocolMarshaller) {

        if (updateComponentData == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(updateComponentData.getBindingProperties(), BINDINGPROPERTIES_BINDING);
            protocolMarshaller.marshall(updateComponentData.getChildren(), CHILDREN_BINDING);
            protocolMarshaller.marshall(updateComponentData.getCollectionProperties(), COLLECTIONPROPERTIES_BINDING);
            protocolMarshaller.marshall(updateComponentData.getComponentType(), COMPONENTTYPE_BINDING);
            protocolMarshaller.marshall(updateComponentData.getEvents(), EVENTS_BINDING);
            protocolMarshaller.marshall(updateComponentData.getId(), ID_BINDING);
            protocolMarshaller.marshall(updateComponentData.getName(), NAME_BINDING);
            protocolMarshaller.marshall(updateComponentData.getOverrides(), OVERRIDES_BINDING);
            protocolMarshaller.marshall(updateComponentData.getProperties(), PROPERTIES_BINDING);
            protocolMarshaller.marshall(updateComponentData.getSchemaVersion(), SCHEMAVERSION_BINDING);
            protocolMarshaller.marshall(updateComponentData.getSourceId(), SOURCEID_BINDING);
            protocolMarshaller.marshall(updateComponentData.getVariants(), VARIANTS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
