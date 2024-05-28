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
package com.amazonaws.services.appstream.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.appstream.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * AppBlockBuilderMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AppBlockBuilderMarshaller {

    private static final MarshallingInfo<String> ARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Arn").build();
    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Name").build();
    private static final MarshallingInfo<String> DISPLAYNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DisplayName").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Description").build();
    private static final MarshallingInfo<String> PLATFORM_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Platform").build();
    private static final MarshallingInfo<String> INSTANCETYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("InstanceType").build();
    private static final MarshallingInfo<Boolean> ENABLEDEFAULTINTERNETACCESS_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EnableDefaultInternetAccess").build();
    private static final MarshallingInfo<String> IAMROLEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("IamRoleArn").build();
    private static final MarshallingInfo<StructuredPojo> VPCCONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("VpcConfig").build();
    private static final MarshallingInfo<String> STATE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("State").build();
    private static final MarshallingInfo<java.util.Date> CREATEDTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CreatedTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<List> APPBLOCKBUILDERERRORS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AppBlockBuilderErrors").build();
    private static final MarshallingInfo<StructuredPojo> STATECHANGEREASON_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StateChangeReason").build();
    private static final MarshallingInfo<List> ACCESSENDPOINTS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AccessEndpoints").build();

    private static final AppBlockBuilderMarshaller instance = new AppBlockBuilderMarshaller();

    public static AppBlockBuilderMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AppBlockBuilder appBlockBuilder, ProtocolMarshaller protocolMarshaller) {

        if (appBlockBuilder == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(appBlockBuilder.getArn(), ARN_BINDING);
            protocolMarshaller.marshall(appBlockBuilder.getName(), NAME_BINDING);
            protocolMarshaller.marshall(appBlockBuilder.getDisplayName(), DISPLAYNAME_BINDING);
            protocolMarshaller.marshall(appBlockBuilder.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(appBlockBuilder.getPlatform(), PLATFORM_BINDING);
            protocolMarshaller.marshall(appBlockBuilder.getInstanceType(), INSTANCETYPE_BINDING);
            protocolMarshaller.marshall(appBlockBuilder.getEnableDefaultInternetAccess(), ENABLEDEFAULTINTERNETACCESS_BINDING);
            protocolMarshaller.marshall(appBlockBuilder.getIamRoleArn(), IAMROLEARN_BINDING);
            protocolMarshaller.marshall(appBlockBuilder.getVpcConfig(), VPCCONFIG_BINDING);
            protocolMarshaller.marshall(appBlockBuilder.getState(), STATE_BINDING);
            protocolMarshaller.marshall(appBlockBuilder.getCreatedTime(), CREATEDTIME_BINDING);
            protocolMarshaller.marshall(appBlockBuilder.getAppBlockBuilderErrors(), APPBLOCKBUILDERERRORS_BINDING);
            protocolMarshaller.marshall(appBlockBuilder.getStateChangeReason(), STATECHANGEREASON_BINDING);
            protocolMarshaller.marshall(appBlockBuilder.getAccessEndpoints(), ACCESSENDPOINTS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
