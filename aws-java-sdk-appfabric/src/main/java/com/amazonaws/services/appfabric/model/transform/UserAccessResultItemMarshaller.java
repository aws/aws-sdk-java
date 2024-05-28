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
package com.amazonaws.services.appfabric.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.appfabric.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * UserAccessResultItemMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UserAccessResultItemMarshaller {

    private static final MarshallingInfo<String> APP_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("app").build();
    private static final MarshallingInfo<String> TENANTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("tenantId").build();
    private static final MarshallingInfo<String> TENANTDISPLAYNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("tenantDisplayName").build();
    private static final MarshallingInfo<String> TASKID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("taskId").build();
    private static final MarshallingInfo<String> RESULTSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("resultStatus").build();
    private static final MarshallingInfo<String> EMAIL_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("email").build();
    private static final MarshallingInfo<String> USERID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("userId").build();
    private static final MarshallingInfo<String> USERFULLNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("userFullName").build();
    private static final MarshallingInfo<String> USERFIRSTNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("userFirstName").build();
    private static final MarshallingInfo<String> USERLASTNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("userLastName").build();
    private static final MarshallingInfo<String> USERSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("userStatus").build();
    private static final MarshallingInfo<StructuredPojo> TASKERROR_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("taskError").build();

    private static final UserAccessResultItemMarshaller instance = new UserAccessResultItemMarshaller();

    public static UserAccessResultItemMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UserAccessResultItem userAccessResultItem, ProtocolMarshaller protocolMarshaller) {

        if (userAccessResultItem == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(userAccessResultItem.getApp(), APP_BINDING);
            protocolMarshaller.marshall(userAccessResultItem.getTenantId(), TENANTID_BINDING);
            protocolMarshaller.marshall(userAccessResultItem.getTenantDisplayName(), TENANTDISPLAYNAME_BINDING);
            protocolMarshaller.marshall(userAccessResultItem.getTaskId(), TASKID_BINDING);
            protocolMarshaller.marshall(userAccessResultItem.getResultStatus(), RESULTSTATUS_BINDING);
            protocolMarshaller.marshall(userAccessResultItem.getEmail(), EMAIL_BINDING);
            protocolMarshaller.marshall(userAccessResultItem.getUserId(), USERID_BINDING);
            protocolMarshaller.marshall(userAccessResultItem.getUserFullName(), USERFULLNAME_BINDING);
            protocolMarshaller.marshall(userAccessResultItem.getUserFirstName(), USERFIRSTNAME_BINDING);
            protocolMarshaller.marshall(userAccessResultItem.getUserLastName(), USERLASTNAME_BINDING);
            protocolMarshaller.marshall(userAccessResultItem.getUserStatus(), USERSTATUS_BINDING);
            protocolMarshaller.marshall(userAccessResultItem.getTaskError(), TASKERROR_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
