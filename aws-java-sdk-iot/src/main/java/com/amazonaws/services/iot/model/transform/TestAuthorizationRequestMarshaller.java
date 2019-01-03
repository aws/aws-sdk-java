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
package com.amazonaws.services.iot.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.iot.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * TestAuthorizationRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class TestAuthorizationRequestMarshaller {

    private static final MarshallingInfo<String> PRINCIPAL_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("principal").build();
    private static final MarshallingInfo<String> COGNITOIDENTITYPOOLID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("cognitoIdentityPoolId").build();
    private static final MarshallingInfo<List> AUTHINFOS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("authInfos").build();
    private static final MarshallingInfo<String> CLIENTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("clientId").build();
    private static final MarshallingInfo<List> POLICYNAMESTOADD_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("policyNamesToAdd").build();
    private static final MarshallingInfo<List> POLICYNAMESTOSKIP_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("policyNamesToSkip").build();

    private static final TestAuthorizationRequestMarshaller instance = new TestAuthorizationRequestMarshaller();

    public static TestAuthorizationRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(TestAuthorizationRequest testAuthorizationRequest, ProtocolMarshaller protocolMarshaller) {

        if (testAuthorizationRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(testAuthorizationRequest.getPrincipal(), PRINCIPAL_BINDING);
            protocolMarshaller.marshall(testAuthorizationRequest.getCognitoIdentityPoolId(), COGNITOIDENTITYPOOLID_BINDING);
            protocolMarshaller.marshall(testAuthorizationRequest.getAuthInfos(), AUTHINFOS_BINDING);
            protocolMarshaller.marshall(testAuthorizationRequest.getClientId(), CLIENTID_BINDING);
            protocolMarshaller.marshall(testAuthorizationRequest.getPolicyNamesToAdd(), POLICYNAMESTOADD_BINDING);
            protocolMarshaller.marshall(testAuthorizationRequest.getPolicyNamesToSkip(), POLICYNAMESTOSKIP_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
