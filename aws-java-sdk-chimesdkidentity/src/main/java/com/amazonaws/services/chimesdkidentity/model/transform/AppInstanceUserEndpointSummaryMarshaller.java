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
package com.amazonaws.services.chimesdkidentity.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.chimesdkidentity.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * AppInstanceUserEndpointSummaryMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AppInstanceUserEndpointSummaryMarshaller {

    private static final MarshallingInfo<String> APPINSTANCEUSERARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AppInstanceUserArn").build();
    private static final MarshallingInfo<String> ENDPOINTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EndpointId").build();
    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Name").build();
    private static final MarshallingInfo<String> TYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Type").build();
    private static final MarshallingInfo<String> ALLOWMESSAGES_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AllowMessages").build();
    private static final MarshallingInfo<StructuredPojo> ENDPOINTSTATE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EndpointState").build();

    private static final AppInstanceUserEndpointSummaryMarshaller instance = new AppInstanceUserEndpointSummaryMarshaller();

    public static AppInstanceUserEndpointSummaryMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AppInstanceUserEndpointSummary appInstanceUserEndpointSummary, ProtocolMarshaller protocolMarshaller) {

        if (appInstanceUserEndpointSummary == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(appInstanceUserEndpointSummary.getAppInstanceUserArn(), APPINSTANCEUSERARN_BINDING);
            protocolMarshaller.marshall(appInstanceUserEndpointSummary.getEndpointId(), ENDPOINTID_BINDING);
            protocolMarshaller.marshall(appInstanceUserEndpointSummary.getName(), NAME_BINDING);
            protocolMarshaller.marshall(appInstanceUserEndpointSummary.getType(), TYPE_BINDING);
            protocolMarshaller.marshall(appInstanceUserEndpointSummary.getAllowMessages(), ALLOWMESSAGES_BINDING);
            protocolMarshaller.marshall(appInstanceUserEndpointSummary.getEndpointState(), ENDPOINTSTATE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
