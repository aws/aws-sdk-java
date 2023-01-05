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
 * ComponentPropertyMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ComponentPropertyMarshaller {

    private static final MarshallingInfo<StructuredPojo> BINDINGPROPERTIES_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("bindingProperties").build();
    private static final MarshallingInfo<Map> BINDINGS_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("bindings").build();
    private static final MarshallingInfo<StructuredPojo> COLLECTIONBINDINGPROPERTIES_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("collectionBindingProperties").build();
    private static final MarshallingInfo<String> COMPONENTNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("componentName").build();
    private static final MarshallingInfo<List> CONCAT_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("concat").build();
    private static final MarshallingInfo<StructuredPojo> CONDITION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("condition").build();
    private static final MarshallingInfo<Boolean> CONFIGURED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("configured").build();
    private static final MarshallingInfo<String> DEFAULTVALUE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("defaultValue").build();
    private static final MarshallingInfo<String> EVENT_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("event").build();
    private static final MarshallingInfo<String> IMPORTEDVALUE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("importedValue").build();
    private static final MarshallingInfo<String> MODEL_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("model").build();
    private static final MarshallingInfo<String> PROPERTY_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("property").build();
    private static final MarshallingInfo<String> TYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("type").build();
    private static final MarshallingInfo<String> USERATTRIBUTE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("userAttribute").build();
    private static final MarshallingInfo<String> VALUE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("value").build();

    private static final ComponentPropertyMarshaller instance = new ComponentPropertyMarshaller();

    public static ComponentPropertyMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ComponentProperty componentProperty, ProtocolMarshaller protocolMarshaller) {

        if (componentProperty == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(componentProperty.getBindingProperties(), BINDINGPROPERTIES_BINDING);
            protocolMarshaller.marshall(componentProperty.getBindings(), BINDINGS_BINDING);
            protocolMarshaller.marshall(componentProperty.getCollectionBindingProperties(), COLLECTIONBINDINGPROPERTIES_BINDING);
            protocolMarshaller.marshall(componentProperty.getComponentName(), COMPONENTNAME_BINDING);
            protocolMarshaller.marshall(componentProperty.getConcat(), CONCAT_BINDING);
            protocolMarshaller.marshall(componentProperty.getCondition(), CONDITION_BINDING);
            protocolMarshaller.marshall(componentProperty.getConfigured(), CONFIGURED_BINDING);
            protocolMarshaller.marshall(componentProperty.getDefaultValue(), DEFAULTVALUE_BINDING);
            protocolMarshaller.marshall(componentProperty.getEvent(), EVENT_BINDING);
            protocolMarshaller.marshall(componentProperty.getImportedValue(), IMPORTEDVALUE_BINDING);
            protocolMarshaller.marshall(componentProperty.getModel(), MODEL_BINDING);
            protocolMarshaller.marshall(componentProperty.getProperty(), PROPERTY_BINDING);
            protocolMarshaller.marshall(componentProperty.getType(), TYPE_BINDING);
            protocolMarshaller.marshall(componentProperty.getUserAttribute(), USERATTRIBUTE_BINDING);
            protocolMarshaller.marshall(componentProperty.getValue(), VALUE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
