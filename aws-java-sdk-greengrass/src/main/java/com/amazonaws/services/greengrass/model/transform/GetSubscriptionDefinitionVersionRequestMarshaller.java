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
package com.amazonaws.services.greengrass.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.greengrass.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * GetSubscriptionDefinitionVersionRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class GetSubscriptionDefinitionVersionRequestMarshaller {

    private static final MarshallingInfo<String> NEXTTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("NextToken").build();
    private static final MarshallingInfo<String> SUBSCRIPTIONDEFINITIONID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PATH).marshallLocationName("SubscriptionDefinitionId").build();
    private static final MarshallingInfo<String> SUBSCRIPTIONDEFINITIONVERSIONID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PATH).marshallLocationName("SubscriptionDefinitionVersionId").build();

    private static final GetSubscriptionDefinitionVersionRequestMarshaller instance = new GetSubscriptionDefinitionVersionRequestMarshaller();

    public static GetSubscriptionDefinitionVersionRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(GetSubscriptionDefinitionVersionRequest getSubscriptionDefinitionVersionRequest, ProtocolMarshaller protocolMarshaller) {

        if (getSubscriptionDefinitionVersionRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(getSubscriptionDefinitionVersionRequest.getNextToken(), NEXTTOKEN_BINDING);
            protocolMarshaller.marshall(getSubscriptionDefinitionVersionRequest.getSubscriptionDefinitionId(), SUBSCRIPTIONDEFINITIONID_BINDING);
            protocolMarshaller.marshall(getSubscriptionDefinitionVersionRequest.getSubscriptionDefinitionVersionId(), SUBSCRIPTIONDEFINITIONVERSIONID_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
