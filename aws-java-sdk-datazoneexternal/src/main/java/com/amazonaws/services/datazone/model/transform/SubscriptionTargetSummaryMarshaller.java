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
 * SubscriptionTargetSummaryMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class SubscriptionTargetSummaryMarshaller {

    private static final MarshallingInfo<List> APPLICABLEASSETTYPES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("applicableAssetTypes").build();
    private static final MarshallingInfo<List> AUTHORIZEDPRINCIPALS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("authorizedPrincipals").build();
    private static final MarshallingInfo<java.util.Date> CREATEDAT_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("createdAt").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> CREATEDBY_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("createdBy").build();
    private static final MarshallingInfo<String> DOMAINID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("domainId").build();
    private static final MarshallingInfo<String> ENVIRONMENTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("environmentId").build();
    private static final MarshallingInfo<String> ID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("id").build();
    private static final MarshallingInfo<String> MANAGEACCESSROLE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("manageAccessRole").build();
    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("name").build();
    private static final MarshallingInfo<String> PROJECTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("projectId").build();
    private static final MarshallingInfo<String> PROVIDER_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("provider").build();
    private static final MarshallingInfo<List> SUBSCRIPTIONTARGETCONFIG_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("subscriptionTargetConfig").build();
    private static final MarshallingInfo<String> TYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("type").build();
    private static final MarshallingInfo<java.util.Date> UPDATEDAT_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("updatedAt").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> UPDATEDBY_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("updatedBy").build();

    private static final SubscriptionTargetSummaryMarshaller instance = new SubscriptionTargetSummaryMarshaller();

    public static SubscriptionTargetSummaryMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(SubscriptionTargetSummary subscriptionTargetSummary, ProtocolMarshaller protocolMarshaller) {

        if (subscriptionTargetSummary == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(subscriptionTargetSummary.getApplicableAssetTypes(), APPLICABLEASSETTYPES_BINDING);
            protocolMarshaller.marshall(subscriptionTargetSummary.getAuthorizedPrincipals(), AUTHORIZEDPRINCIPALS_BINDING);
            protocolMarshaller.marshall(subscriptionTargetSummary.getCreatedAt(), CREATEDAT_BINDING);
            protocolMarshaller.marshall(subscriptionTargetSummary.getCreatedBy(), CREATEDBY_BINDING);
            protocolMarshaller.marshall(subscriptionTargetSummary.getDomainId(), DOMAINID_BINDING);
            protocolMarshaller.marshall(subscriptionTargetSummary.getEnvironmentId(), ENVIRONMENTID_BINDING);
            protocolMarshaller.marshall(subscriptionTargetSummary.getId(), ID_BINDING);
            protocolMarshaller.marshall(subscriptionTargetSummary.getManageAccessRole(), MANAGEACCESSROLE_BINDING);
            protocolMarshaller.marshall(subscriptionTargetSummary.getName(), NAME_BINDING);
            protocolMarshaller.marshall(subscriptionTargetSummary.getProjectId(), PROJECTID_BINDING);
            protocolMarshaller.marshall(subscriptionTargetSummary.getProvider(), PROVIDER_BINDING);
            protocolMarshaller.marshall(subscriptionTargetSummary.getSubscriptionTargetConfig(), SUBSCRIPTIONTARGETCONFIG_BINDING);
            protocolMarshaller.marshall(subscriptionTargetSummary.getType(), TYPE_BINDING);
            protocolMarshaller.marshall(subscriptionTargetSummary.getUpdatedAt(), UPDATEDAT_BINDING);
            protocolMarshaller.marshall(subscriptionTargetSummary.getUpdatedBy(), UPDATEDBY_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
