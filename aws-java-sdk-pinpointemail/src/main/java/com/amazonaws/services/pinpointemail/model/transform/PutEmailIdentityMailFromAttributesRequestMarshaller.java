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
package com.amazonaws.services.pinpointemail.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.pinpointemail.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * PutEmailIdentityMailFromAttributesRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class PutEmailIdentityMailFromAttributesRequestMarshaller {

    private static final MarshallingInfo<String> EMAILIDENTITY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PATH).marshallLocationName("EmailIdentity").build();
    private static final MarshallingInfo<String> MAILFROMDOMAIN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MailFromDomain").build();
    private static final MarshallingInfo<String> BEHAVIORONMXFAILURE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("BehaviorOnMxFailure").build();

    private static final PutEmailIdentityMailFromAttributesRequestMarshaller instance = new PutEmailIdentityMailFromAttributesRequestMarshaller();

    public static PutEmailIdentityMailFromAttributesRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(PutEmailIdentityMailFromAttributesRequest putEmailIdentityMailFromAttributesRequest, ProtocolMarshaller protocolMarshaller) {

        if (putEmailIdentityMailFromAttributesRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(putEmailIdentityMailFromAttributesRequest.getEmailIdentity(), EMAILIDENTITY_BINDING);
            protocolMarshaller.marshall(putEmailIdentityMailFromAttributesRequest.getMailFromDomain(), MAILFROMDOMAIN_BINDING);
            protocolMarshaller.marshall(putEmailIdentityMailFromAttributesRequest.getBehaviorOnMxFailure(), BEHAVIORONMXFAILURE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
