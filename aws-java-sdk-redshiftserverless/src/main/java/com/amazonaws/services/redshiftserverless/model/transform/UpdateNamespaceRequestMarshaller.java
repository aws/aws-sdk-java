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
package com.amazonaws.services.redshiftserverless.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.redshiftserverless.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * UpdateNamespaceRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UpdateNamespaceRequestMarshaller {

    private static final MarshallingInfo<String> ADMINUSERPASSWORD_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("adminUserPassword").build();
    private static final MarshallingInfo<String> ADMINUSERNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("adminUsername").build();
    private static final MarshallingInfo<String> DEFAULTIAMROLEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("defaultIamRoleArn").build();
    private static final MarshallingInfo<List> IAMROLES_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("iamRoles").build();
    private static final MarshallingInfo<String> KMSKEYID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("kmsKeyId").build();
    private static final MarshallingInfo<List> LOGEXPORTS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("logExports").build();
    private static final MarshallingInfo<String> NAMESPACENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("namespaceName").build();

    private static final UpdateNamespaceRequestMarshaller instance = new UpdateNamespaceRequestMarshaller();

    public static UpdateNamespaceRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UpdateNamespaceRequest updateNamespaceRequest, ProtocolMarshaller protocolMarshaller) {

        if (updateNamespaceRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(updateNamespaceRequest.getAdminUserPassword(), ADMINUSERPASSWORD_BINDING);
            protocolMarshaller.marshall(updateNamespaceRequest.getAdminUsername(), ADMINUSERNAME_BINDING);
            protocolMarshaller.marshall(updateNamespaceRequest.getDefaultIamRoleArn(), DEFAULTIAMROLEARN_BINDING);
            protocolMarshaller.marshall(updateNamespaceRequest.getIamRoles(), IAMROLES_BINDING);
            protocolMarshaller.marshall(updateNamespaceRequest.getKmsKeyId(), KMSKEYID_BINDING);
            protocolMarshaller.marshall(updateNamespaceRequest.getLogExports(), LOGEXPORTS_BINDING);
            protocolMarshaller.marshall(updateNamespaceRequest.getNamespaceName(), NAMESPACENAME_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
