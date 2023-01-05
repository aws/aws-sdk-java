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

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.appflow.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * SAPODataDestinationPropertiesMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class SAPODataDestinationPropertiesMarshaller {

    private static final MarshallingInfo<String> OBJECTPATH_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("objectPath").build();
    private static final MarshallingInfo<StructuredPojo> SUCCESSRESPONSEHANDLINGCONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("successResponseHandlingConfig").build();
    private static final MarshallingInfo<List> IDFIELDNAMES_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("idFieldNames").build();
    private static final MarshallingInfo<StructuredPojo> ERRORHANDLINGCONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("errorHandlingConfig").build();
    private static final MarshallingInfo<String> WRITEOPERATIONTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("writeOperationType").build();

    private static final SAPODataDestinationPropertiesMarshaller instance = new SAPODataDestinationPropertiesMarshaller();

    public static SAPODataDestinationPropertiesMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(SAPODataDestinationProperties sAPODataDestinationProperties, ProtocolMarshaller protocolMarshaller) {

        if (sAPODataDestinationProperties == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(sAPODataDestinationProperties.getObjectPath(), OBJECTPATH_BINDING);
            protocolMarshaller.marshall(sAPODataDestinationProperties.getSuccessResponseHandlingConfig(), SUCCESSRESPONSEHANDLINGCONFIG_BINDING);
            protocolMarshaller.marshall(sAPODataDestinationProperties.getIdFieldNames(), IDFIELDNAMES_BINDING);
            protocolMarshaller.marshall(sAPODataDestinationProperties.getErrorHandlingConfig(), ERRORHANDLINGCONFIG_BINDING);
            protocolMarshaller.marshall(sAPODataDestinationProperties.getWriteOperationType(), WRITEOPERATIONTYPE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
