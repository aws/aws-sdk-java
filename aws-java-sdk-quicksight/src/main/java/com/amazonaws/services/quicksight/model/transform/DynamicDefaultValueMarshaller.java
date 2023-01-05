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
package com.amazonaws.services.quicksight.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.quicksight.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * DynamicDefaultValueMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class DynamicDefaultValueMarshaller {

    private static final MarshallingInfo<StructuredPojo> USERNAMECOLUMN_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("UserNameColumn").build();
    private static final MarshallingInfo<StructuredPojo> GROUPNAMECOLUMN_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("GroupNameColumn").build();
    private static final MarshallingInfo<StructuredPojo> DEFAULTVALUECOLUMN_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DefaultValueColumn").build();

    private static final DynamicDefaultValueMarshaller instance = new DynamicDefaultValueMarshaller();

    public static DynamicDefaultValueMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(DynamicDefaultValue dynamicDefaultValue, ProtocolMarshaller protocolMarshaller) {

        if (dynamicDefaultValue == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(dynamicDefaultValue.getUserNameColumn(), USERNAMECOLUMN_BINDING);
            protocolMarshaller.marshall(dynamicDefaultValue.getGroupNameColumn(), GROUPNAMECOLUMN_BINDING);
            protocolMarshaller.marshall(dynamicDefaultValue.getDefaultValueColumn(), DEFAULTVALUECOLUMN_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
