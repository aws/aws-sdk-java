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
package com.amazonaws.services.greengrass.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.greengrass.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CreateGroupVersionRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreateGroupVersionRequestMarshaller {

    private static final MarshallingInfo<String> AMZNCLIENTTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.HEADER).marshallLocationName("X-Amzn-Client-Token").build();
    private static final MarshallingInfo<String> CONNECTORDEFINITIONVERSIONARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ConnectorDefinitionVersionArn").build();
    private static final MarshallingInfo<String> COREDEFINITIONVERSIONARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CoreDefinitionVersionArn").build();
    private static final MarshallingInfo<String> DEVICEDEFINITIONVERSIONARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DeviceDefinitionVersionArn").build();
    private static final MarshallingInfo<String> FUNCTIONDEFINITIONVERSIONARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FunctionDefinitionVersionArn").build();
    private static final MarshallingInfo<String> GROUPID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("GroupId").build();
    private static final MarshallingInfo<String> LOGGERDEFINITIONVERSIONARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LoggerDefinitionVersionArn").build();
    private static final MarshallingInfo<String> RESOURCEDEFINITIONVERSIONARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ResourceDefinitionVersionArn").build();
    private static final MarshallingInfo<String> SUBSCRIPTIONDEFINITIONVERSIONARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SubscriptionDefinitionVersionArn").build();

    private static final CreateGroupVersionRequestMarshaller instance = new CreateGroupVersionRequestMarshaller();

    public static CreateGroupVersionRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreateGroupVersionRequest createGroupVersionRequest, ProtocolMarshaller protocolMarshaller) {

        if (createGroupVersionRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createGroupVersionRequest.getAmznClientToken(), AMZNCLIENTTOKEN_BINDING);
            protocolMarshaller.marshall(createGroupVersionRequest.getConnectorDefinitionVersionArn(), CONNECTORDEFINITIONVERSIONARN_BINDING);
            protocolMarshaller.marshall(createGroupVersionRequest.getCoreDefinitionVersionArn(), COREDEFINITIONVERSIONARN_BINDING);
            protocolMarshaller.marshall(createGroupVersionRequest.getDeviceDefinitionVersionArn(), DEVICEDEFINITIONVERSIONARN_BINDING);
            protocolMarshaller.marshall(createGroupVersionRequest.getFunctionDefinitionVersionArn(), FUNCTIONDEFINITIONVERSIONARN_BINDING);
            protocolMarshaller.marshall(createGroupVersionRequest.getGroupId(), GROUPID_BINDING);
            protocolMarshaller.marshall(createGroupVersionRequest.getLoggerDefinitionVersionArn(), LOGGERDEFINITIONVERSIONARN_BINDING);
            protocolMarshaller.marshall(createGroupVersionRequest.getResourceDefinitionVersionArn(), RESOURCEDEFINITIONVERSIONARN_BINDING);
            protocolMarshaller.marshall(createGroupVersionRequest.getSubscriptionDefinitionVersionArn(), SUBSCRIPTIONDEFINITIONVERSIONARN_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
