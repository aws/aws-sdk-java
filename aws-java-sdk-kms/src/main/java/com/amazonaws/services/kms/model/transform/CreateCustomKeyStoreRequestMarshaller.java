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
 * CreateCustomKeyStoreRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreateCustomKeyStoreRequestMarshaller {

    private static final MarshallingInfo<String> CUSTOMKEYSTORENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CustomKeyStoreName").build();
    private static final MarshallingInfo<String> CLOUDHSMCLUSTERID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CloudHsmClusterId").build();
    private static final MarshallingInfo<String> TRUSTANCHORCERTIFICATE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TrustAnchorCertificate").build();
    private static final MarshallingInfo<String> KEYSTOREPASSWORD_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("KeyStorePassword").build();
    private static final MarshallingInfo<String> CUSTOMKEYSTORETYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CustomKeyStoreType").build();
    private static final MarshallingInfo<String> XKSPROXYURIENDPOINT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("XksProxyUriEndpoint").build();
    private static final MarshallingInfo<String> XKSPROXYURIPATH_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("XksProxyUriPath").build();
    private static final MarshallingInfo<String> XKSPROXYVPCENDPOINTSERVICENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("XksProxyVpcEndpointServiceName").build();
    private static final MarshallingInfo<StructuredPojo> XKSPROXYAUTHENTICATIONCREDENTIAL_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("XksProxyAuthenticationCredential").build();
    private static final MarshallingInfo<String> XKSPROXYCONNECTIVITY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("XksProxyConnectivity").build();

    private static final CreateCustomKeyStoreRequestMarshaller instance = new CreateCustomKeyStoreRequestMarshaller();

    public static CreateCustomKeyStoreRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreateCustomKeyStoreRequest createCustomKeyStoreRequest, ProtocolMarshaller protocolMarshaller) {

        if (createCustomKeyStoreRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createCustomKeyStoreRequest.getCustomKeyStoreName(), CUSTOMKEYSTORENAME_BINDING);
            protocolMarshaller.marshall(createCustomKeyStoreRequest.getCloudHsmClusterId(), CLOUDHSMCLUSTERID_BINDING);
            protocolMarshaller.marshall(createCustomKeyStoreRequest.getTrustAnchorCertificate(), TRUSTANCHORCERTIFICATE_BINDING);
            protocolMarshaller.marshall(createCustomKeyStoreRequest.getKeyStorePassword(), KEYSTOREPASSWORD_BINDING);
            protocolMarshaller.marshall(createCustomKeyStoreRequest.getCustomKeyStoreType(), CUSTOMKEYSTORETYPE_BINDING);
            protocolMarshaller.marshall(createCustomKeyStoreRequest.getXksProxyUriEndpoint(), XKSPROXYURIENDPOINT_BINDING);
            protocolMarshaller.marshall(createCustomKeyStoreRequest.getXksProxyUriPath(), XKSPROXYURIPATH_BINDING);
            protocolMarshaller.marshall(createCustomKeyStoreRequest.getXksProxyVpcEndpointServiceName(), XKSPROXYVPCENDPOINTSERVICENAME_BINDING);
            protocolMarshaller.marshall(createCustomKeyStoreRequest.getXksProxyAuthenticationCredential(), XKSPROXYAUTHENTICATIONCREDENTIAL_BINDING);
            protocolMarshaller.marshall(createCustomKeyStoreRequest.getXksProxyConnectivity(), XKSPROXYCONNECTIVITY_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
