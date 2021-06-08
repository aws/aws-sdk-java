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
package com.amazonaws.services.budgets.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.budgets.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * IamActionDefinitionMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class IamActionDefinitionMarshaller {

    private static final MarshallingInfo<String> POLICYARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("PolicyArn").build();
    private static final MarshallingInfo<List> ROLES_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Roles").build();
    private static final MarshallingInfo<List> GROUPS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Groups").build();
    private static final MarshallingInfo<List> USERS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Users").build();

    private static final IamActionDefinitionMarshaller instance = new IamActionDefinitionMarshaller();

    public static IamActionDefinitionMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(IamActionDefinition iamActionDefinition, ProtocolMarshaller protocolMarshaller) {

        if (iamActionDefinition == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(iamActionDefinition.getPolicyArn(), POLICYARN_BINDING);
            protocolMarshaller.marshall(iamActionDefinition.getRoles(), ROLES_BINDING);
            protocolMarshaller.marshall(iamActionDefinition.getGroups(), GROUPS_BINDING);
            protocolMarshaller.marshall(iamActionDefinition.getUsers(), USERS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
