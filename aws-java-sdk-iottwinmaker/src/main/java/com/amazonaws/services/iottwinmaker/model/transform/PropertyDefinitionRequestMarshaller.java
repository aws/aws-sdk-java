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
 * PropertyDefinitionRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class PropertyDefinitionRequestMarshaller {

    private static final MarshallingInfo<StructuredPojo> DATATYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("dataType").build();
    private static final MarshallingInfo<Boolean> ISREQUIREDINENTITY_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("isRequiredInEntity").build();
    private static final MarshallingInfo<Boolean> ISEXTERNALID_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("isExternalId").build();
    private static final MarshallingInfo<Boolean> ISSTOREDEXTERNALLY_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("isStoredExternally").build();
    private static final MarshallingInfo<Boolean> ISTIMESERIES_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("isTimeSeries").build();
    private static final MarshallingInfo<StructuredPojo> DEFAULTVALUE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("defaultValue").build();
    private static final MarshallingInfo<Map> CONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("configuration").build();
    private static final MarshallingInfo<String> DISPLAYNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("displayName").build();

    private static final PropertyDefinitionRequestMarshaller instance = new PropertyDefinitionRequestMarshaller();

    public static PropertyDefinitionRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(PropertyDefinitionRequest propertyDefinitionRequest, ProtocolMarshaller protocolMarshaller) {

        if (propertyDefinitionRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(propertyDefinitionRequest.getDataType(), DATATYPE_BINDING);
            protocolMarshaller.marshall(propertyDefinitionRequest.getIsRequiredInEntity(), ISREQUIREDINENTITY_BINDING);
            protocolMarshaller.marshall(propertyDefinitionRequest.getIsExternalId(), ISEXTERNALID_BINDING);
            protocolMarshaller.marshall(propertyDefinitionRequest.getIsStoredExternally(), ISSTOREDEXTERNALLY_BINDING);
            protocolMarshaller.marshall(propertyDefinitionRequest.getIsTimeSeries(), ISTIMESERIES_BINDING);
            protocolMarshaller.marshall(propertyDefinitionRequest.getDefaultValue(), DEFAULTVALUE_BINDING);
            protocolMarshaller.marshall(propertyDefinitionRequest.getConfiguration(), CONFIGURATION_BINDING);
            protocolMarshaller.marshall(propertyDefinitionRequest.getDisplayName(), DISPLAYNAME_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
