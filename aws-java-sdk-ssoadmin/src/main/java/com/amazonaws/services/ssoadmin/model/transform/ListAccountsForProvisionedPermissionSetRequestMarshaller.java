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
package com.amazonaws.services.ssoadmin.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.ssoadmin.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ListAccountsForProvisionedPermissionSetRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ListAccountsForProvisionedPermissionSetRequestMarshaller {

    private static final MarshallingInfo<String> INSTANCEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("InstanceArn").build();
    private static final MarshallingInfo<String> PERMISSIONSETARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PermissionSetArn").build();
    private static final MarshallingInfo<String> PROVISIONINGSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ProvisioningStatus").build();
    private static final MarshallingInfo<Integer> MAXRESULTS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MaxResults").build();
    private static final MarshallingInfo<String> NEXTTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("NextToken").build();

    private static final ListAccountsForProvisionedPermissionSetRequestMarshaller instance = new ListAccountsForProvisionedPermissionSetRequestMarshaller();

    public static ListAccountsForProvisionedPermissionSetRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ListAccountsForProvisionedPermissionSetRequest listAccountsForProvisionedPermissionSetRequest, ProtocolMarshaller protocolMarshaller) {

        if (listAccountsForProvisionedPermissionSetRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(listAccountsForProvisionedPermissionSetRequest.getInstanceArn(), INSTANCEARN_BINDING);
            protocolMarshaller.marshall(listAccountsForProvisionedPermissionSetRequest.getPermissionSetArn(), PERMISSIONSETARN_BINDING);
            protocolMarshaller.marshall(listAccountsForProvisionedPermissionSetRequest.getProvisioningStatus(), PROVISIONINGSTATUS_BINDING);
            protocolMarshaller.marshall(listAccountsForProvisionedPermissionSetRequest.getMaxResults(), MAXRESULTS_BINDING);
            protocolMarshaller.marshall(listAccountsForProvisionedPermissionSetRequest.getNextToken(), NEXTTOKEN_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
