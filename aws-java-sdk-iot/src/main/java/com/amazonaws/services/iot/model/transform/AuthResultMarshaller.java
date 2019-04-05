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
 * AuthResultMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AuthResultMarshaller {

    private static final MarshallingInfo<StructuredPojo> AUTHINFO_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("authInfo").build();
    private static final MarshallingInfo<StructuredPojo> ALLOWED_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("allowed").build();
    private static final MarshallingInfo<StructuredPojo> DENIED_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("denied").build();
    private static final MarshallingInfo<String> AUTHDECISION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("authDecision").build();
    private static final MarshallingInfo<List> MISSINGCONTEXTVALUES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("missingContextValues").build();

    private static final AuthResultMarshaller instance = new AuthResultMarshaller();

    public static AuthResultMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AuthResult authResult, ProtocolMarshaller protocolMarshaller) {

        if (authResult == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(authResult.getAuthInfo(), AUTHINFO_BINDING);
            protocolMarshaller.marshall(authResult.getAllowed(), ALLOWED_BINDING);
            protocolMarshaller.marshall(authResult.getDenied(), DENIED_BINDING);
            protocolMarshaller.marshall(authResult.getAuthDecision(), AUTHDECISION_BINDING);
            protocolMarshaller.marshall(authResult.getMissingContextValues(), MISSINGCONTEXTVALUES_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
