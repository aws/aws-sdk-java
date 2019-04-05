/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.cognitoidp.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.cognitoidp.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * AdminCreateUserConfigTypeMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AdminCreateUserConfigTypeMarshaller {

    private static final MarshallingInfo<Boolean> ALLOWADMINCREATEUSERONLY_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AllowAdminCreateUserOnly").build();
    private static final MarshallingInfo<Integer> UNUSEDACCOUNTVALIDITYDAYS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("UnusedAccountValidityDays").build();
    private static final MarshallingInfo<StructuredPojo> INVITEMESSAGETEMPLATE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("InviteMessageTemplate").build();

    private static final AdminCreateUserConfigTypeMarshaller instance = new AdminCreateUserConfigTypeMarshaller();

    public static AdminCreateUserConfigTypeMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AdminCreateUserConfigType adminCreateUserConfigType, ProtocolMarshaller protocolMarshaller) {

        if (adminCreateUserConfigType == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(adminCreateUserConfigType.getAllowAdminCreateUserOnly(), ALLOWADMINCREATEUSERONLY_BINDING);
            protocolMarshaller.marshall(adminCreateUserConfigType.getUnusedAccountValidityDays(), UNUSEDACCOUNTVALIDITYDAYS_BINDING);
            protocolMarshaller.marshall(adminCreateUserConfigType.getInviteMessageTemplate(), INVITEMESSAGETEMPLATE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
