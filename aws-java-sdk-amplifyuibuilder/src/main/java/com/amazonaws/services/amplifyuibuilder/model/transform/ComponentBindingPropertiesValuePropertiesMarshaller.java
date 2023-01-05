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

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.amplifyuibuilder.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ComponentBindingPropertiesValuePropertiesMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ComponentBindingPropertiesValuePropertiesMarshaller {

    private static final MarshallingInfo<String> BUCKET_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("bucket").build();
    private static final MarshallingInfo<String> DEFAULTVALUE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("defaultValue").build();
    private static final MarshallingInfo<String> FIELD_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("field").build();
    private static final MarshallingInfo<String> KEY_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("key").build();
    private static final MarshallingInfo<String> MODEL_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("model").build();
    private static final MarshallingInfo<List> PREDICATES_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("predicates").build();
    private static final MarshallingInfo<String> SLOTNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("slotName").build();
    private static final MarshallingInfo<String> USERATTRIBUTE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("userAttribute").build();

    private static final ComponentBindingPropertiesValuePropertiesMarshaller instance = new ComponentBindingPropertiesValuePropertiesMarshaller();

    public static ComponentBindingPropertiesValuePropertiesMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ComponentBindingPropertiesValueProperties componentBindingPropertiesValueProperties, ProtocolMarshaller protocolMarshaller) {

        if (componentBindingPropertiesValueProperties == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(componentBindingPropertiesValueProperties.getBucket(), BUCKET_BINDING);
            protocolMarshaller.marshall(componentBindingPropertiesValueProperties.getDefaultValue(), DEFAULTVALUE_BINDING);
            protocolMarshaller.marshall(componentBindingPropertiesValueProperties.getField(), FIELD_BINDING);
            protocolMarshaller.marshall(componentBindingPropertiesValueProperties.getKey(), KEY_BINDING);
            protocolMarshaller.marshall(componentBindingPropertiesValueProperties.getModel(), MODEL_BINDING);
            protocolMarshaller.marshall(componentBindingPropertiesValueProperties.getPredicates(), PREDICATES_BINDING);
            protocolMarshaller.marshall(componentBindingPropertiesValueProperties.getSlotName(), SLOTNAME_BINDING);
            protocolMarshaller.marshall(componentBindingPropertiesValueProperties.getUserAttribute(), USERATTRIBUTE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
