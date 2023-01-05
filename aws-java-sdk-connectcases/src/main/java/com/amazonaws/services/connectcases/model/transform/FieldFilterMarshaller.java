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
package com.amazonaws.services.connectcases.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.connectcases.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * FieldFilterMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class FieldFilterMarshaller {

    private static final MarshallingInfo<StructuredPojo> CONTAINS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("contains").build();
    private static final MarshallingInfo<StructuredPojo> EQUALTO_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("equalTo").build();
    private static final MarshallingInfo<StructuredPojo> GREATERTHAN_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("greaterThan").build();
    private static final MarshallingInfo<StructuredPojo> GREATERTHANOREQUALTO_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("greaterThanOrEqualTo").build();
    private static final MarshallingInfo<StructuredPojo> LESSTHAN_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("lessThan").build();
    private static final MarshallingInfo<StructuredPojo> LESSTHANOREQUALTO_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("lessThanOrEqualTo").build();

    private static final FieldFilterMarshaller instance = new FieldFilterMarshaller();

    public static FieldFilterMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(FieldFilter fieldFilter, ProtocolMarshaller protocolMarshaller) {

        if (fieldFilter == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(fieldFilter.getContains(), CONTAINS_BINDING);
            protocolMarshaller.marshall(fieldFilter.getEqualTo(), EQUALTO_BINDING);
            protocolMarshaller.marshall(fieldFilter.getGreaterThan(), GREATERTHAN_BINDING);
            protocolMarshaller.marshall(fieldFilter.getGreaterThanOrEqualTo(), GREATERTHANOREQUALTO_BINDING);
            protocolMarshaller.marshall(fieldFilter.getLessThan(), LESSTHAN_BINDING);
            protocolMarshaller.marshall(fieldFilter.getLessThanOrEqualTo(), LESSTHANOREQUALTO_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
