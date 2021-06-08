/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * DestinationFieldPropertiesMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class DestinationFieldPropertiesMarshaller {

    private static final MarshallingInfo<Boolean> ISCREATABLE_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("isCreatable").build();
    private static final MarshallingInfo<Boolean> ISNULLABLE_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("isNullable").build();
    private static final MarshallingInfo<Boolean> ISUPSERTABLE_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("isUpsertable").build();
    private static final MarshallingInfo<Boolean> ISUPDATABLE_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("isUpdatable").build();
    private static final MarshallingInfo<List> SUPPORTEDWRITEOPERATIONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("supportedWriteOperations").build();

    private static final DestinationFieldPropertiesMarshaller instance = new DestinationFieldPropertiesMarshaller();

    public static DestinationFieldPropertiesMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(DestinationFieldProperties destinationFieldProperties, ProtocolMarshaller protocolMarshaller) {

        if (destinationFieldProperties == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(destinationFieldProperties.getIsCreatable(), ISCREATABLE_BINDING);
            protocolMarshaller.marshall(destinationFieldProperties.getIsNullable(), ISNULLABLE_BINDING);
            protocolMarshaller.marshall(destinationFieldProperties.getIsUpsertable(), ISUPSERTABLE_BINDING);
            protocolMarshaller.marshall(destinationFieldProperties.getIsUpdatable(), ISUPDATABLE_BINDING);
            protocolMarshaller.marshall(destinationFieldProperties.getSupportedWriteOperations(), SUPPORTEDWRITEOPERATIONS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
