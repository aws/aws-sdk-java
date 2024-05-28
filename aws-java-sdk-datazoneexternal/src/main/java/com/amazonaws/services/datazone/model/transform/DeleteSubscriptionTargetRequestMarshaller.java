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
package com.amazonaws.services.datazone.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.datazone.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * DeleteSubscriptionTargetRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class DeleteSubscriptionTargetRequestMarshaller {

    private static final MarshallingInfo<String> DOMAINIDENTIFIER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PATH).marshallLocationName("domainIdentifier").build();
    private static final MarshallingInfo<String> ENVIRONMENTIDENTIFIER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PATH).marshallLocationName("environmentIdentifier").build();
    private static final MarshallingInfo<String> IDENTIFIER_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("identifier").build();

    private static final DeleteSubscriptionTargetRequestMarshaller instance = new DeleteSubscriptionTargetRequestMarshaller();

    public static DeleteSubscriptionTargetRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(DeleteSubscriptionTargetRequest deleteSubscriptionTargetRequest, ProtocolMarshaller protocolMarshaller) {

        if (deleteSubscriptionTargetRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(deleteSubscriptionTargetRequest.getDomainIdentifier(), DOMAINIDENTIFIER_BINDING);
            protocolMarshaller.marshall(deleteSubscriptionTargetRequest.getEnvironmentIdentifier(), ENVIRONMENTIDENTIFIER_BINDING);
            protocolMarshaller.marshall(deleteSubscriptionTargetRequest.getIdentifier(), IDENTIFIER_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
