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

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.datazone.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * UpdateSubscriptionTargetRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UpdateSubscriptionTargetRequestMarshaller {

    private static final MarshallingInfo<List> APPLICABLEASSETTYPES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("applicableAssetTypes").build();
    private static final MarshallingInfo<List> AUTHORIZEDPRINCIPALS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("authorizedPrincipals").build();
    private static final MarshallingInfo<String> DOMAINIDENTIFIER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PATH).marshallLocationName("domainIdentifier").build();
    private static final MarshallingInfo<String> ENVIRONMENTIDENTIFIER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PATH).marshallLocationName("environmentIdentifier").build();
    private static final MarshallingInfo<String> IDENTIFIER_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("identifier").build();
    private static final MarshallingInfo<String> MANAGEACCESSROLE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("manageAccessRole").build();
    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("name").build();
    private static final MarshallingInfo<String> PROVIDER_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("provider").build();
    private static final MarshallingInfo<List> SUBSCRIPTIONTARGETCONFIG_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("subscriptionTargetConfig").build();

    private static final UpdateSubscriptionTargetRequestMarshaller instance = new UpdateSubscriptionTargetRequestMarshaller();

    public static UpdateSubscriptionTargetRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UpdateSubscriptionTargetRequest updateSubscriptionTargetRequest, ProtocolMarshaller protocolMarshaller) {

        if (updateSubscriptionTargetRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(updateSubscriptionTargetRequest.getApplicableAssetTypes(), APPLICABLEASSETTYPES_BINDING);
            protocolMarshaller.marshall(updateSubscriptionTargetRequest.getAuthorizedPrincipals(), AUTHORIZEDPRINCIPALS_BINDING);
            protocolMarshaller.marshall(updateSubscriptionTargetRequest.getDomainIdentifier(), DOMAINIDENTIFIER_BINDING);
            protocolMarshaller.marshall(updateSubscriptionTargetRequest.getEnvironmentIdentifier(), ENVIRONMENTIDENTIFIER_BINDING);
            protocolMarshaller.marshall(updateSubscriptionTargetRequest.getIdentifier(), IDENTIFIER_BINDING);
            protocolMarshaller.marshall(updateSubscriptionTargetRequest.getManageAccessRole(), MANAGEACCESSROLE_BINDING);
            protocolMarshaller.marshall(updateSubscriptionTargetRequest.getName(), NAME_BINDING);
            protocolMarshaller.marshall(updateSubscriptionTargetRequest.getProvider(), PROVIDER_BINDING);
            protocolMarshaller.marshall(updateSubscriptionTargetRequest.getSubscriptionTargetConfig(), SUBSCRIPTIONTARGETCONFIG_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
