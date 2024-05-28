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

import java.util.Map;
import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.appstream.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CreateAppBlockBuilderRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreateAppBlockBuilderRequestMarshaller {

    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Name").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Description").build();
    private static final MarshallingInfo<String> DISPLAYNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DisplayName").build();
    private static final MarshallingInfo<Map> TAGS_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Tags").build();
    private static final MarshallingInfo<String> PLATFORM_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Platform").build();
    private static final MarshallingInfo<String> INSTANCETYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("InstanceType").build();
    private static final MarshallingInfo<StructuredPojo> VPCCONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("VpcConfig").build();
    private static final MarshallingInfo<Boolean> ENABLEDEFAULTINTERNETACCESS_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EnableDefaultInternetAccess").build();
    private static final MarshallingInfo<String> IAMROLEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("IamRoleArn").build();
    private static final MarshallingInfo<List> ACCESSENDPOINTS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AccessEndpoints").build();

    private static final CreateAppBlockBuilderRequestMarshaller instance = new CreateAppBlockBuilderRequestMarshaller();

    public static CreateAppBlockBuilderRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreateAppBlockBuilderRequest createAppBlockBuilderRequest, ProtocolMarshaller protocolMarshaller) {

        if (createAppBlockBuilderRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createAppBlockBuilderRequest.getName(), NAME_BINDING);
            protocolMarshaller.marshall(createAppBlockBuilderRequest.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(createAppBlockBuilderRequest.getDisplayName(), DISPLAYNAME_BINDING);
            protocolMarshaller.marshall(createAppBlockBuilderRequest.getTags(), TAGS_BINDING);
            protocolMarshaller.marshall(createAppBlockBuilderRequest.getPlatform(), PLATFORM_BINDING);
            protocolMarshaller.marshall(createAppBlockBuilderRequest.getInstanceType(), INSTANCETYPE_BINDING);
            protocolMarshaller.marshall(createAppBlockBuilderRequest.getVpcConfig(), VPCCONFIG_BINDING);
            protocolMarshaller.marshall(createAppBlockBuilderRequest.getEnableDefaultInternetAccess(), ENABLEDEFAULTINTERNETACCESS_BINDING);
            protocolMarshaller.marshall(createAppBlockBuilderRequest.getIamRoleArn(), IAMROLEARN_BINDING);
            protocolMarshaller.marshall(createAppBlockBuilderRequest.getAccessEndpoints(), ACCESSENDPOINTS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
