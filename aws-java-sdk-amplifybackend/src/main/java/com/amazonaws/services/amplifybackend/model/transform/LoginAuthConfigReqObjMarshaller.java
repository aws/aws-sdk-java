/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.amplifybackend.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.amplifybackend.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * LoginAuthConfigReqObjMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class LoginAuthConfigReqObjMarshaller {

    private static final MarshallingInfo<String> AWSCOGNITOIDENTITYPOOLID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("aws_cognito_identity_pool_id").build();
    private static final MarshallingInfo<String> AWSCOGNITOREGION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("aws_cognito_region").build();
    private static final MarshallingInfo<String> AWSUSERPOOLSID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("aws_user_pools_id").build();
    private static final MarshallingInfo<String> AWSUSERPOOLSWEBCLIENTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("aws_user_pools_web_client_id").build();

    private static final LoginAuthConfigReqObjMarshaller instance = new LoginAuthConfigReqObjMarshaller();

    public static LoginAuthConfigReqObjMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(LoginAuthConfigReqObj loginAuthConfigReqObj, ProtocolMarshaller protocolMarshaller) {

        if (loginAuthConfigReqObj == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(loginAuthConfigReqObj.getAwsCognitoIdentityPoolId(), AWSCOGNITOIDENTITYPOOLID_BINDING);
            protocolMarshaller.marshall(loginAuthConfigReqObj.getAwsCognitoRegion(), AWSCOGNITOREGION_BINDING);
            protocolMarshaller.marshall(loginAuthConfigReqObj.getAwsUserPoolsId(), AWSUSERPOOLSID_BINDING);
            protocolMarshaller.marshall(loginAuthConfigReqObj.getAwsUserPoolsWebClientId(), AWSUSERPOOLSWEBCLIENTID_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
