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
package com.amazonaws.services.appflow.model.transform;

import java.util.Map;
import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.appflow.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CustomConnectorDestinationPropertiesMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CustomConnectorDestinationPropertiesMarshaller {

    private static final MarshallingInfo<String> ENTITYNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("entityName").build();
    private static final MarshallingInfo<StructuredPojo> ERRORHANDLINGCONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("errorHandlingConfig").build();
    private static final MarshallingInfo<String> WRITEOPERATIONTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("writeOperationType").build();
    private static final MarshallingInfo<List> IDFIELDNAMES_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("idFieldNames").build();
    private static final MarshallingInfo<Map> CUSTOMPROPERTIES_BINDING = MarshallingInfo.builder(MarshallingType.MAP)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("customProperties").build();

    private static final CustomConnectorDestinationPropertiesMarshaller instance = new CustomConnectorDestinationPropertiesMarshaller();

    public static CustomConnectorDestinationPropertiesMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CustomConnectorDestinationProperties customConnectorDestinationProperties, ProtocolMarshaller protocolMarshaller) {

        if (customConnectorDestinationProperties == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(customConnectorDestinationProperties.getEntityName(), ENTITYNAME_BINDING);
            protocolMarshaller.marshall(customConnectorDestinationProperties.getErrorHandlingConfig(), ERRORHANDLINGCONFIG_BINDING);
            protocolMarshaller.marshall(customConnectorDestinationProperties.getWriteOperationType(), WRITEOPERATIONTYPE_BINDING);
            protocolMarshaller.marshall(customConnectorDestinationProperties.getIdFieldNames(), IDFIELDNAMES_BINDING);
            protocolMarshaller.marshall(customConnectorDestinationProperties.getCustomProperties(), CUSTOMPROPERTIES_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
