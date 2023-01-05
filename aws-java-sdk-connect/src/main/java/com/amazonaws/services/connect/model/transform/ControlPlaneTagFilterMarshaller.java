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
package com.amazonaws.services.connect.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.connect.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ControlPlaneTagFilterMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ControlPlaneTagFilterMarshaller {

    private static final MarshallingInfo<List> ORCONDITIONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("OrConditions").build();
    private static final MarshallingInfo<List> ANDCONDITIONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("AndConditions").build();
    private static final MarshallingInfo<StructuredPojo> TAGCONDITION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TagCondition").build();

    private static final ControlPlaneTagFilterMarshaller instance = new ControlPlaneTagFilterMarshaller();

    public static ControlPlaneTagFilterMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ControlPlaneTagFilter controlPlaneTagFilter, ProtocolMarshaller protocolMarshaller) {

        if (controlPlaneTagFilter == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(controlPlaneTagFilter.getOrConditions(), ORCONDITIONS_BINDING);
            protocolMarshaller.marshall(controlPlaneTagFilter.getAndConditions(), ANDCONDITIONS_BINDING);
            protocolMarshaller.marshall(controlPlaneTagFilter.getTagCondition(), TAGCONDITION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
