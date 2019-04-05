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
package com.amazonaws.services.workspaces.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.workspaces.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * DefaultWorkspaceCreationPropertiesMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class DefaultWorkspaceCreationPropertiesMarshaller {

    private static final MarshallingInfo<Boolean> ENABLEWORKDOCS_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EnableWorkDocs").build();
    private static final MarshallingInfo<Boolean> ENABLEINTERNETACCESS_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EnableInternetAccess").build();
    private static final MarshallingInfo<String> DEFAULTOU_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("DefaultOu").build();
    private static final MarshallingInfo<String> CUSTOMSECURITYGROUPID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CustomSecurityGroupId").build();
    private static final MarshallingInfo<Boolean> USERENABLEDASLOCALADMINISTRATOR_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("UserEnabledAsLocalAdministrator").build();

    private static final DefaultWorkspaceCreationPropertiesMarshaller instance = new DefaultWorkspaceCreationPropertiesMarshaller();

    public static DefaultWorkspaceCreationPropertiesMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(DefaultWorkspaceCreationProperties defaultWorkspaceCreationProperties, ProtocolMarshaller protocolMarshaller) {

        if (defaultWorkspaceCreationProperties == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(defaultWorkspaceCreationProperties.getEnableWorkDocs(), ENABLEWORKDOCS_BINDING);
            protocolMarshaller.marshall(defaultWorkspaceCreationProperties.getEnableInternetAccess(), ENABLEINTERNETACCESS_BINDING);
            protocolMarshaller.marshall(defaultWorkspaceCreationProperties.getDefaultOu(), DEFAULTOU_BINDING);
            protocolMarshaller.marshall(defaultWorkspaceCreationProperties.getCustomSecurityGroupId(), CUSTOMSECURITYGROUPID_BINDING);
            protocolMarshaller.marshall(defaultWorkspaceCreationProperties.getUserEnabledAsLocalAdministrator(), USERENABLEDASLOCALADMINISTRATOR_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
