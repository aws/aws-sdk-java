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
 * UserSearchCriteriaMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UserSearchCriteriaMarshaller {

    private static final MarshallingInfo<List> ORCONDITIONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("OrConditions").build();
    private static final MarshallingInfo<List> ANDCONDITIONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("AndConditions").build();
    private static final MarshallingInfo<StructuredPojo> STRINGCONDITION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StringCondition").build();
    private static final MarshallingInfo<StructuredPojo> HIERARCHYGROUPCONDITION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("HierarchyGroupCondition").build();

    private static final UserSearchCriteriaMarshaller instance = new UserSearchCriteriaMarshaller();

    public static UserSearchCriteriaMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UserSearchCriteria userSearchCriteria, ProtocolMarshaller protocolMarshaller) {

        if (userSearchCriteria == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(userSearchCriteria.getOrConditions(), ORCONDITIONS_BINDING);
            protocolMarshaller.marshall(userSearchCriteria.getAndConditions(), ANDCONDITIONS_BINDING);
            protocolMarshaller.marshall(userSearchCriteria.getStringCondition(), STRINGCONDITION_BINDING);
            protocolMarshaller.marshall(userSearchCriteria.getHierarchyGroupCondition(), HIERARCHYGROUPCONDITION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
