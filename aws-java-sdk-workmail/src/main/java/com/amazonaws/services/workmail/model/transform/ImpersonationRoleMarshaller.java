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
package com.amazonaws.services.workmail.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.workmail.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ImpersonationRoleMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ImpersonationRoleMarshaller {

    private static final MarshallingInfo<String> IMPERSONATIONROLEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ImpersonationRoleId").build();
    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Name").build();
    private static final MarshallingInfo<String> TYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Type").build();
    private static final MarshallingInfo<java.util.Date> DATECREATED_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DateCreated").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> DATEMODIFIED_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DateModified").timestampFormat("unixTimestamp").build();

    private static final ImpersonationRoleMarshaller instance = new ImpersonationRoleMarshaller();

    public static ImpersonationRoleMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ImpersonationRole impersonationRole, ProtocolMarshaller protocolMarshaller) {

        if (impersonationRole == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(impersonationRole.getImpersonationRoleId(), IMPERSONATIONROLEID_BINDING);
            protocolMarshaller.marshall(impersonationRole.getName(), NAME_BINDING);
            protocolMarshaller.marshall(impersonationRole.getType(), TYPE_BINDING);
            protocolMarshaller.marshall(impersonationRole.getDateCreated(), DATECREATED_BINDING);
            protocolMarshaller.marshall(impersonationRole.getDateModified(), DATEMODIFIED_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
