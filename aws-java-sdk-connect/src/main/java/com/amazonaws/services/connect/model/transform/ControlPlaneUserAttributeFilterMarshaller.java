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
package com.amazonaws.services.connect.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.connect.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ControlPlaneUserAttributeFilterMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ControlPlaneUserAttributeFilterMarshaller {

    private static final MarshallingInfo<List> ORCONDITIONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("OrConditions").build();
    private static final MarshallingInfo<StructuredPojo> ANDCONDITION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AndCondition").build();
    private static final MarshallingInfo<StructuredPojo> TAGCONDITION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TagCondition").build();
    private static final MarshallingInfo<StructuredPojo> HIERARCHYGROUPCONDITION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("HierarchyGroupCondition").build();

    private static final ControlPlaneUserAttributeFilterMarshaller instance = new ControlPlaneUserAttributeFilterMarshaller();

    public static ControlPlaneUserAttributeFilterMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ControlPlaneUserAttributeFilter controlPlaneUserAttributeFilter, ProtocolMarshaller protocolMarshaller) {

        if (controlPlaneUserAttributeFilter == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(controlPlaneUserAttributeFilter.getOrConditions(), ORCONDITIONS_BINDING);
            protocolMarshaller.marshall(controlPlaneUserAttributeFilter.getAndCondition(), ANDCONDITION_BINDING);
            protocolMarshaller.marshall(controlPlaneUserAttributeFilter.getTagCondition(), TAGCONDITION_BINDING);
            protocolMarshaller.marshall(controlPlaneUserAttributeFilter.getHierarchyGroupCondition(), HIERARCHYGROUPCONDITION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
