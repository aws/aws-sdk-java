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
package com.amazonaws.services.verifiedpermissions.model.transform;

import java.util.Map;
import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.verifiedpermissions.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * AttributeValueMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AttributeValueMarshaller {

    private static final MarshallingInfo<Boolean> BOOLEAN_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("boolean").build();
    private static final MarshallingInfo<StructuredPojo> ENTITYIDENTIFIER_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("entityIdentifier").build();
    private static final MarshallingInfo<Long> LONG_BINDING = MarshallingInfo.builder(MarshallingType.LONG).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("long").build();
    private static final MarshallingInfo<String> STRING_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("string").build();
    private static final MarshallingInfo<List> SET_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("set").build();
    private static final MarshallingInfo<Map> RECORD_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("record").build();

    private static final AttributeValueMarshaller instance = new AttributeValueMarshaller();

    public static AttributeValueMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AttributeValue attributeValue, ProtocolMarshaller protocolMarshaller) {

        if (attributeValue == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(attributeValue.getBoolean(), BOOLEAN_BINDING);
            protocolMarshaller.marshall(attributeValue.getEntityIdentifier(), ENTITYIDENTIFIER_BINDING);
            protocolMarshaller.marshall(attributeValue.getLong(), LONG_BINDING);
            protocolMarshaller.marshall(attributeValue.getString(), STRING_BINDING);
            protocolMarshaller.marshall(attributeValue.getSet(), SET_BINDING);
            protocolMarshaller.marshall(attributeValue.getRecord(), RECORD_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
