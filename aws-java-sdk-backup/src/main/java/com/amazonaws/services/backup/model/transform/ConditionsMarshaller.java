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
package com.amazonaws.services.backup.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.backup.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ConditionsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ConditionsMarshaller {

    private static final MarshallingInfo<List> STRINGEQUALS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("StringEquals").build();
    private static final MarshallingInfo<List> STRINGNOTEQUALS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StringNotEquals").build();
    private static final MarshallingInfo<List> STRINGLIKE_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("StringLike").build();
    private static final MarshallingInfo<List> STRINGNOTLIKE_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("StringNotLike").build();

    private static final ConditionsMarshaller instance = new ConditionsMarshaller();

    public static ConditionsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(Conditions conditions, ProtocolMarshaller protocolMarshaller) {

        if (conditions == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(conditions.getStringEquals(), STRINGEQUALS_BINDING);
            protocolMarshaller.marshall(conditions.getStringNotEquals(), STRINGNOTEQUALS_BINDING);
            protocolMarshaller.marshall(conditions.getStringLike(), STRINGLIKE_BINDING);
            protocolMarshaller.marshall(conditions.getStringNotLike(), STRINGNOTLIKE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
