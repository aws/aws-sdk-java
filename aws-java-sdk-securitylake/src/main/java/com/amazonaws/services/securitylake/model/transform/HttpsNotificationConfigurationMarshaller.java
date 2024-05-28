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
package com.amazonaws.services.securitylake.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.securitylake.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * HttpsNotificationConfigurationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class HttpsNotificationConfigurationMarshaller {

    private static final MarshallingInfo<String> AUTHORIZATIONAPIKEYNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("authorizationApiKeyName").build();
    private static final MarshallingInfo<String> AUTHORIZATIONAPIKEYVALUE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("authorizationApiKeyValue").build();
    private static final MarshallingInfo<String> ENDPOINT_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("endpoint").build();
    private static final MarshallingInfo<String> HTTPMETHOD_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("httpMethod").build();
    private static final MarshallingInfo<String> TARGETROLEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("targetRoleArn").build();

    private static final HttpsNotificationConfigurationMarshaller instance = new HttpsNotificationConfigurationMarshaller();

    public static HttpsNotificationConfigurationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(HttpsNotificationConfiguration httpsNotificationConfiguration, ProtocolMarshaller protocolMarshaller) {

        if (httpsNotificationConfiguration == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(httpsNotificationConfiguration.getAuthorizationApiKeyName(), AUTHORIZATIONAPIKEYNAME_BINDING);
            protocolMarshaller.marshall(httpsNotificationConfiguration.getAuthorizationApiKeyValue(), AUTHORIZATIONAPIKEYVALUE_BINDING);
            protocolMarshaller.marshall(httpsNotificationConfiguration.getEndpoint(), ENDPOINT_BINDING);
            protocolMarshaller.marshall(httpsNotificationConfiguration.getHttpMethod(), HTTPMETHOD_BINDING);
            protocolMarshaller.marshall(httpsNotificationConfiguration.getTargetRoleArn(), TARGETROLEARN_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
