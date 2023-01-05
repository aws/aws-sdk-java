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
package com.amazonaws.services.securitylake.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.securitylake.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CreateCustomLogSourceRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreateCustomLogSourceRequestMarshaller {

    private static final MarshallingInfo<String> CUSTOMSOURCENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("customSourceName").build();
    private static final MarshallingInfo<String> EVENTCLASS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("eventClass").build();
    private static final MarshallingInfo<String> GLUEINVOCATIONROLEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("glueInvocationRoleArn").build();
    private static final MarshallingInfo<String> LOGPROVIDERACCOUNTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("logProviderAccountId").build();

    private static final CreateCustomLogSourceRequestMarshaller instance = new CreateCustomLogSourceRequestMarshaller();

    public static CreateCustomLogSourceRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreateCustomLogSourceRequest createCustomLogSourceRequest, ProtocolMarshaller protocolMarshaller) {

        if (createCustomLogSourceRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createCustomLogSourceRequest.getCustomSourceName(), CUSTOMSOURCENAME_BINDING);
            protocolMarshaller.marshall(createCustomLogSourceRequest.getEventClass(), EVENTCLASS_BINDING);
            protocolMarshaller.marshall(createCustomLogSourceRequest.getGlueInvocationRoleArn(), GLUEINVOCATIONROLEARN_BINDING);
            protocolMarshaller.marshall(createCustomLogSourceRequest.getLogProviderAccountId(), LOGPROVIDERACCOUNTID_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
