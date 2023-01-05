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
package com.amazonaws.services.kms.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.kms.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * XksProxyConfigurationTypeMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class XksProxyConfigurationTypeMarshaller {

    private static final MarshallingInfo<String> CONNECTIVITY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Connectivity").build();
    private static final MarshallingInfo<String> ACCESSKEYID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AccessKeyId").build();
    private static final MarshallingInfo<String> URIENDPOINT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("UriEndpoint").build();
    private static final MarshallingInfo<String> URIPATH_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("UriPath").build();
    private static final MarshallingInfo<String> VPCENDPOINTSERVICENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("VpcEndpointServiceName").build();

    private static final XksProxyConfigurationTypeMarshaller instance = new XksProxyConfigurationTypeMarshaller();

    public static XksProxyConfigurationTypeMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(XksProxyConfigurationType xksProxyConfigurationType, ProtocolMarshaller protocolMarshaller) {

        if (xksProxyConfigurationType == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(xksProxyConfigurationType.getConnectivity(), CONNECTIVITY_BINDING);
            protocolMarshaller.marshall(xksProxyConfigurationType.getAccessKeyId(), ACCESSKEYID_BINDING);
            protocolMarshaller.marshall(xksProxyConfigurationType.getUriEndpoint(), URIENDPOINT_BINDING);
            protocolMarshaller.marshall(xksProxyConfigurationType.getUriPath(), URIPATH_BINDING);
            protocolMarshaller.marshall(xksProxyConfigurationType.getVpcEndpointServiceName(), VPCENDPOINTSERVICENAME_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
