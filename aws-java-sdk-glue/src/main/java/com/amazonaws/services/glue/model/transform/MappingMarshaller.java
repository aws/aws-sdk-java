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
package com.amazonaws.services.glue.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.glue.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * MappingMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class MappingMarshaller {

    private static final MarshallingInfo<String> TOKEY_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("ToKey").build();
    private static final MarshallingInfo<List> FROMPATH_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("FromPath").build();
    private static final MarshallingInfo<String> FROMTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("FromType").build();
    private static final MarshallingInfo<String> TOTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("ToType").build();
    private static final MarshallingInfo<Boolean> DROPPED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Dropped").build();
    private static final MarshallingInfo<List> CHILDREN_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Children").build();

    private static final MappingMarshaller instance = new MappingMarshaller();

    public static MappingMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(Mapping mapping, ProtocolMarshaller protocolMarshaller) {

        if (mapping == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(mapping.getToKey(), TOKEY_BINDING);
            protocolMarshaller.marshall(mapping.getFromPath(), FROMPATH_BINDING);
            protocolMarshaller.marshall(mapping.getFromType(), FROMTYPE_BINDING);
            protocolMarshaller.marshall(mapping.getToType(), TOTYPE_BINDING);
            protocolMarshaller.marshall(mapping.getDropped(), DROPPED_BINDING);
            protocolMarshaller.marshall(mapping.getChildren(), CHILDREN_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
