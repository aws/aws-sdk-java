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
 * AccountAssignmentOperationStatusMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AccountAssignmentOperationStatusMarshaller {

    private static final MarshallingInfo<String> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Status").build();
    private static final MarshallingInfo<String> REQUESTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("RequestId").build();
    private static final MarshallingInfo<String> FAILUREREASON_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FailureReason").build();
    private static final MarshallingInfo<String> TARGETID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("TargetId").build();
    private static final MarshallingInfo<String> TARGETTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TargetType").build();
    private static final MarshallingInfo<String> PERMISSIONSETARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PermissionSetArn").build();
    private static final MarshallingInfo<String> PRINCIPALTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PrincipalType").build();
    private static final MarshallingInfo<String> PRINCIPALID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PrincipalId").build();
    private static final MarshallingInfo<java.util.Date> CREATEDDATE_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CreatedDate").timestampFormat("unixTimestamp").build();

    private static final AccountAssignmentOperationStatusMarshaller instance = new AccountAssignmentOperationStatusMarshaller();

    public static AccountAssignmentOperationStatusMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AccountAssignmentOperationStatus accountAssignmentOperationStatus, ProtocolMarshaller protocolMarshaller) {

        if (accountAssignmentOperationStatus == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(accountAssignmentOperationStatus.getStatus(), STATUS_BINDING);
            protocolMarshaller.marshall(accountAssignmentOperationStatus.getRequestId(), REQUESTID_BINDING);
            protocolMarshaller.marshall(accountAssignmentOperationStatus.getFailureReason(), FAILUREREASON_BINDING);
            protocolMarshaller.marshall(accountAssignmentOperationStatus.getTargetId(), TARGETID_BINDING);
            protocolMarshaller.marshall(accountAssignmentOperationStatus.getTargetType(), TARGETTYPE_BINDING);
            protocolMarshaller.marshall(accountAssignmentOperationStatus.getPermissionSetArn(), PERMISSIONSETARN_BINDING);
            protocolMarshaller.marshall(accountAssignmentOperationStatus.getPrincipalType(), PRINCIPALTYPE_BINDING);
            protocolMarshaller.marshall(accountAssignmentOperationStatus.getPrincipalId(), PRINCIPALID_BINDING);
            protocolMarshaller.marshall(accountAssignmentOperationStatus.getCreatedDate(), CREATEDDATE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
